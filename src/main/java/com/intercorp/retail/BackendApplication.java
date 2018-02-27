package com.intercorp.retail;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Andrés Matos
 * @version 26/02/2018
 */
@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(BackendApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }
}
