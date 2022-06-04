-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`domicilio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`domicilio` (
  `iddomicilio` INT NOT NULL,
  `calle` VARCHAR(45) NULL,
  `barrio` VARCHAR(45) NULL,
  `localidad` VARCHAR(45) NULL,
  `provincia` VARCHAR(45) NULL,
  `pais` VARCHAR(45) NULL,
  PRIMARY KEY (`iddomicilio`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`usuarios` (
  `idusuarios` INT NOT NULL,
  `usuario` VARCHAR(45) NULL,
  `contraseña` VARCHAR(45) NULL,
  PRIMARY KEY (`idusuarios`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`persona`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`persona` (
  `idpersona` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `edad` INT NULL,
  `correo` VARCHAR(45) NULL,
  `domicilio_iddomicilio` INT NOT NULL,
  `usuarios_idusuarios` INT NOT NULL,
  PRIMARY KEY (`idpersona`, `domicilio_iddomicilio`, `usuarios_idusuarios`),
  INDEX `fk_persona_domicilio1_idx` (`domicilio_iddomicilio` ASC) VISIBLE,
  INDEX `fk_persona_usuarios1_idx` (`usuarios_idusuarios` ASC) VISIBLE,
  CONSTRAINT `fk_persona_domicilio1`
    FOREIGN KEY (`domicilio_iddomicilio`)
    REFERENCES `mydb`.`domicilio` (`iddomicilio`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_persona_usuarios1`
    FOREIGN KEY (`usuarios_idusuarios`)
    REFERENCES `mydb`.`usuarios` (`idusuarios`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`educacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`educacion` (
  `ideducacion` INT NOT NULL,
  `institucion` VARCHAR(45) NULL,
  `titulo` VARCHAR(45) NULL,
  `fechaComienzo` DATETIME NULL,
  `fechaFinalizacion` DATETIME NULL,
  `enlace` VARCHAR(100) NULL,
  `persona_idpersona` INT NOT NULL,
  `persona_domicilio_iddomicilio` INT NOT NULL,
  PRIMARY KEY (`ideducacion`, `persona_idpersona`, `persona_domicilio_iddomicilio`),
  INDEX `fk_educacion_persona1_idx` (`persona_idpersona` ASC, `persona_domicilio_iddomicilio` ASC) VISIBLE,
  CONSTRAINT `fk_educacion_persona1`
    FOREIGN KEY (`persona_idpersona` , `persona_domicilio_iddomicilio`)
    REFERENCES `mydb`.`persona` (`idpersona` , `domicilio_iddomicilio`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`proyectos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`proyectos` (
  `idproyectos` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `fechaComienzo` DATE NULL,
  `fechaFinalizacion` DATE NULL,
  `descripcion` TEXT NULL,
  `urlGitHub` VARCHAR(45) NULL,
  `persona_idpersona` INT NOT NULL,
  `persona_domicilio_iddomicilio` INT NOT NULL,
  PRIMARY KEY (`idproyectos`, `persona_idpersona`, `persona_domicilio_iddomicilio`),
  INDEX `fk_proyectos_persona1_idx` (`persona_idpersona` ASC, `persona_domicilio_iddomicilio` ASC) VISIBLE,
  CONSTRAINT `fk_proyectos_persona1`
    FOREIGN KEY (`persona_idpersona` , `persona_domicilio_iddomicilio`)
    REFERENCES `mydb`.`persona` (`idpersona` , `domicilio_iddomicilio`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
