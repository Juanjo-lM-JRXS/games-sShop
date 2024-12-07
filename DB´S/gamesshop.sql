
USE `gamesshop` ;

CREATE TABLE usuarios (
  `usuariosID` INT NOT NULL AUTO_INCREMENT,
  `usuariosPrimerNombre` VARCHAR(45) NOT NULL,
  `usuariosSegundoNombre` VARCHAR(45) NULL,
  `usuariosPrimerApellido` VARCHAR(45) NOT NULL,
  `usuariosSegundorApellido` VARCHAR(45) NOT NULL,
  `usuariosNombreUsuario` VARCHAR(45) NOT NULL,
  `usuariosCorreo` VARCHAR(45) NOT NULL,
  `usuariosContraseña` VARCHAR(45) NOT NULL,
  `usuariosEstado` INT NOT NULL,
  PRIMARY KEY (`usuariosID`)
  )  ;


CREATE TABLE plataformas (
  `plataformasID` INT NOT NULL AUTO_INCREMENT,
  `plataformasNombre` VARCHAR(45) NOT NULL,
  `plataformasDescripcion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`plataformasID`)
  );


CREATE TABLE videojuegos (
  `videojuegosID` INT NOT NULL AUTO_INCREMENT,
  `videojuegosNombre` VARCHAR(45) NOT NULL,
  `videojuegosDescripcion` VARCHAR(45) NOT NULL,
  `videojuegosPrecio` DOUBLE NOT NULL,
  `plataformas_plataformasID` INT NOT NULL,
  PRIMARY KEY (`videojuegosID`)
  );


CREATE TABLE IF NOT EXISTS ordenes (
  `ordenesID` INT NOT NULL AUTO_INCREMENT,
  `usuariosID` INT NOT NULL,
  `ordenDate` DATETIME NOT NULL,
  `ordenEstado` INT NOT NULL,
  PRIMARY KEY (`ordenesID`)
  );


CREATE TABLE ordenesDetalles (
  `ordenesDetallesID` INT NOT NULL AUTO_INCREMENT,
  `ordenesID` INT NOT NULL,
  `ordenesDetallesCantidad` INT NOT NULL,
  `videojuegosDetalles_videojuegosID` INT NOT NULL,
  PRIMARY KEY (`ordenesDetallesID`)
)