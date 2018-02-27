package com.intercorp.retail.service;

import com.intercorp.retail.entities.ApplicationParameter;
import com.intercorp.retail.repository.ParameterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Andrés Matos
 * @version 26/02/2018
 */
@Service
public class ParameterService {

    private final ParameterRepository parameterRepository;

    public ParameterService(final ParameterRepository parameterRepository) {
        this.parameterRepository = parameterRepository;
    }

    public List<ApplicationParameter> findAllParameters() {
        return parameterRepository.findAll();
    }
}
