package com.intercorp.retail.facade;

import com.intercorp.retail.canonical.ParameterCanonical;
import com.intercorp.retail.entities.ApplicationParameter;
import com.intercorp.retail.service.ParameterService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrés Matos
 * @version 26/02/2018
 */
@Component
@Transactional(propagation = Propagation.REQUIRED, readOnly = true, rollbackFor = {Exception.class}, isolation = Isolation.READ_COMMITTED)
public class ApplicationFacade {

    private final ParameterService parameterService;

    public ApplicationFacade(final ParameterService parameterService) {
        this.parameterService = parameterService;
    }

    public List<ParameterCanonical> findAllParametersAsCanonical() {
        List<ApplicationParameter> parameterList = parameterService.findAllParameters();
        List<ParameterCanonical> canonicalList = new ArrayList<>();
        parameterList.forEach(parameter -> {
           ParameterCanonical canonical = new ParameterCanonical();
           canonical.setCode(parameter.getCode());
           canonical.setDescription(parameter.getDescription());
           canonical.setValue(parameter.getValue());
           canonicalList.add(canonical);
        });
        return canonicalList;
    }
}
