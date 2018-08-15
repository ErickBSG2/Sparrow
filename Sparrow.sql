DROP DATABASE IF EXISTS Sparrow;

CREATE DATABASE Sparrow;

USE Sparrow;

DROP TABLE IF EXISTS Producto;

CREATE TABLE Producto(
codigo VARCHAR(10) NOT NULL PRIMARY KEY,
nombre VARCHAR(30) NOT NULL,
descripcion VARCHAR(50) NOT NULL,
cveCategoria INT NOT NULL,
cantidad INT NOT NULL,
precioCompra DOUBLE NOT NULL,
precioVenta DOUBLE NOT NULL,
cveProveedor INT NOT NULL)
Engine = InnoDB;

DESC Producto;

DROP TABLE IF EXISTS Ventas;

CREATE TABLE Ventas(
codVenta INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
codigo VARCHAR(10) NOT NULL,
nombre VARCHAR(30) NOT NULL,
cantidad INT NOT NULL,
precio DOUBLE NOT NULL,
total DOUBLE NOT NULL)
Engine = InnoDB;

DESC Ventas;

SELECT * FROM Ventas;

INSERT INTO Producto VALUES (1,"MEMORIA USB","16GB",1,100,50.50,75.50,10);
INSERT INTO Producto VALUES (2,"ipod","COLOR ROSA",2,50,3000,3500,5);


SELECT * FROM Producto;