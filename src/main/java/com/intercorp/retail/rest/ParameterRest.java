package com.intercorp.retail.rest;

import com.intercorp.retail.canonical.ParameterCanonical;
import com.intercorp.retail.facade.ApplicationFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Andrés Matos
 * @version 26/02/2018
 */
@RestController
@RequestMapping("parameters")
public class ParameterRest {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final ApplicationFacade applicationFacade;

    public ParameterRest(final ApplicationFacade applicationFacade) {
        this.applicationFacade = applicationFacade;
    }

    @GetMapping
    public List<ParameterCanonical> findAll() {
        try {
            logger.info("=== (GET) /parameters START ===");
            List<ParameterCanonical> canonicalList = applicationFacade.findAllParametersAsCanonical();
            logger.info(">> Total parameters found: {}", canonicalList.size());
            logger.debug(">> All parameters found: {}", canonicalList);
            return canonicalList;
        } finally {
            logger.info("=== (GET) /parameters END ===");
        }
    }
}
