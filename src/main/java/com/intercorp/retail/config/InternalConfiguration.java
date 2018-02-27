package com.intercorp.retail.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.client.RestTemplate;

/**
 * @author Andrés Matos
 * @version 26/02/2018
 */
@Configuration
@EnableJpaAuditing
public class InternalConfiguration {

    @Bean(name = "externalRestTemplate")
    public RestTemplate createExternalRestTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder.build();
    }
}
