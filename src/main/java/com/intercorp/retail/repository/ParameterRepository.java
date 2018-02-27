package com.intercorp.retail.repository;

import com.intercorp.retail.entities.ApplicationParameter;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Andrés Matos
 * @version 26/02/2018
 */
public interface ParameterRepository extends JpaRepository<ApplicationParameter, String> {
}
