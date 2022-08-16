CREATE DATABASE ventas;

CREATE TABLE cliente (
    clienteId INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(255),
    apellido VARCHAR(255),
    dni INT,
    PRIMARY KEY (clienteId)
);


