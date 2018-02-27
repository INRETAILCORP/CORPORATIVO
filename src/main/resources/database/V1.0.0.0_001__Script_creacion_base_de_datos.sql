-- ----------------------------------------------------------------------------
-- APPLICATION PARAMETER
-- ----------------------------------------------------------------------------
CREATE TABLE application_parameter (
  code VARCHAR(30) NOT NULL PRIMARY KEY,
  description VARCHAR(100) DEFAULT NULL,
  value VARCHAR(500) DEFAULT NULL
);

INSERT INTO application_parameter (code, description, value) VALUES ('ORDER_LAST_EVALUATED_DATE', 'La fecha de la última Orden procesada', '2017-01-25 00:00:00');
INSERT INTO application_parameter (code, description, value) VALUES ('ORDERS_WITH_ERROR', 'Lista de Ordenes con errores', NULL);
INSERT INTO application_parameter (code, description, value) VALUES ('ORDER_MAX_DELIVERY_TIME', 'Tiempo de entrega máximo (en minutos)', '90');