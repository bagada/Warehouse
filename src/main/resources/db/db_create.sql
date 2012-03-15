-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 15-03-2012 a las 08:30:57
-- Versión del servidor: 5.5.16
-- Versión de PHP: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `POLIFORMAS_WAREHOUSE`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `WAREHOUSE_ADDRESS`
--

CREATE TABLE IF NOT EXISTS `WAREHOUSE_ADDRESS` (
  `ID_Address` int(10) NOT NULL AUTO_INCREMENT,
  `State` varchar(20) NOT NULL,
  `City` varchar(20) NOT NULL,
  `Street` varchar(30) NOT NULL,
  `Phone_Number` int(15) NOT NULL,
  PRIMARY KEY (`ID_Address`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `WAREHOUSE_BRANCHES`
--

CREATE TABLE IF NOT EXISTS `WAREHOUSE_BRANCHES` (
  `ID_Branch` int(10) NOT NULL AUTO_INCREMENT,
  `ID_Company` int(10) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Network_Segment` varchar(20) NOT NULL,
  `ID_Address` int(30) NOT NULL,
  PRIMARY KEY (`ID_Branch`),
  KEY `WAREHOUSE_BRANCHES` (`ID_Address`),
  KEY `WAREHOUSE_BRANCHES_1` (`ID_Company`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `WAREHOUSE_COMPANY`
--

CREATE TABLE IF NOT EXISTS `WAREHOUSE_COMPANY` (
  `ID_Company` int(10) NOT NULL AUTO_INCREMENT,
  `Name` varchar(30) NOT NULL,
  UNIQUE KEY `ID_COMPANY` (`ID_Company`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `WAREHOUSE_COMPONENTS`
--

CREATE TABLE IF NOT EXISTS `WAREHOUSE_COMPONENTS` (
  `ID_Component` int(20) NOT NULL AUTO_INCREMENT,
  `ID_Mark` int(10) NOT NULL,
  `ID_Equipment` int(10) NOT NULL,
  `ID_Warehouse` int(10) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Serie` varchar(20) NOT NULL,
  `Model` varchar(20) NOT NULL,
  `Date_Buy` date NOT NULL,
  `Date_Warranty` date NOT NULL,
  `Code` varchar(20) NOT NULL,
  PRIMARY KEY (`ID_Component`),
  KEY `ID_Mark` (`ID_Mark`),
  KEY `ID_Equipment` (`ID_Equipment`),
  KEY `ID_Warehouse` (`ID_Warehouse`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `WAREHOUSE_DEPARTAMENTS`
--

CREATE TABLE IF NOT EXISTS `WAREHOUSE_DEPARTAMENTS` (
  `ID_Departament` int(10) NOT NULL AUTO_INCREMENT,
  `ID_Branch` int(10) NOT NULL,
  `Name` varchar(20) NOT NULL,
  PRIMARY KEY (`ID_Departament`),
  KEY `ID_BRANCH` (`ID_Branch`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `WAREHOUSE_EMPLOYEES`
--

CREATE TABLE IF NOT EXISTS `WAREHOUSE_EMPLOYEES` (
  `ID_User` int(10) NOT NULL AUTO_INCREMENT,
  `Name` varchar(30) NOT NULL,
  PRIMARY KEY (`ID_User`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `WAREHOUSE_EQUIPMENTS`
--

CREATE TABLE IF NOT EXISTS `WAREHOUSE_EQUIPMENTS` (
  `ID_Equipment` int(20) NOT NULL AUTO_INCREMENT,
  `ID_Departament` int(20) NOT NULL,
  `ID_Branch` int(20) NOT NULL,
  `ID_Mark` int(20) NOT NULL,
  PRIMARY KEY (`ID_Equipment`),
  KEY `ID_Departament` (`ID_Departament`),
  KEY `ID_Branch` (`ID_Branch`),
  KEY `ID_Mark` (`ID_Mark`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `WAREHOUSE_MARKS`
--

CREATE TABLE IF NOT EXISTS `WAREHOUSE_MARKS` (
  `ID_Mark` int(10) NOT NULL AUTO_INCREMENT,
  `Name` varchar(20) NOT NULL,
  PRIMARY KEY (`ID_Mark`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `WAREHOUSE_PROPERTIES`
--

CREATE TABLE IF NOT EXISTS `WAREHOUSE_PROPERTIES` (
  `ID_Property` int(20) NOT NULL AUTO_INCREMENT,
  `ID_Equipment` int(20) NOT NULL,
  `Code` varchar(20) NOT NULL,
  `Date_Buy` date NOT NULL,
  `Date_Warranty` text NOT NULL,
  `Serie` int(20) NOT NULL,
  PRIMARY KEY (`ID_Property`),
  KEY `ID_Equipment` (`ID_Equipment`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `WAREHOUSE_WAREHOUSE`
--

CREATE TABLE IF NOT EXISTS `WAREHOUSE_WAREHOUSE` (
  `ID_WAREHOUSE` int(20) NOT NULL AUTO_INCREMENT,
  `ID_Component` int(20) NOT NULL,
  `ID_Equipment` int(20) NOT NULL,
  `ID_Address` int(20) NOT NULL,
  `Status` varchar(20) NOT NULL,
  PRIMARY KEY (`ID_WAREHOUSE`),
  KEY `ID_Component` (`ID_Component`),
  KEY `ID_Equipment` (`ID_Equipment`),
  KEY `ID_Address` (`ID_Address`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `WAREHOUSE_BRANCHES`
--
ALTER TABLE `WAREHOUSE_BRANCHES`
  ADD CONSTRAINT `WAREHOUSE_BRANCHES` FOREIGN KEY (`ID_ADDRESS`) REFERENCES `WAREHOUSE_ADDRESS` (`ID_ADDRESS`) ON DELETE CASCADE,
  ADD CONSTRAINT `WAREHOUSE_BRANCHES_ibfk_1` FOREIGN KEY (`ID_COMPANY`) REFERENCES `WAREHOUSE_COMPANY` (`ID_COMPANY`) ON DELETE CASCADE;

--
-- Filtros para la tabla `WAREHOUSE_COMPONENTS`
--
ALTER TABLE `WAREHOUSE_COMPONENTS`
  ADD CONSTRAINT `WAREHOUSE_COMPONENTS_ibfk_3` FOREIGN KEY (`ID_Warehouse`) REFERENCES `WAREHOUSE_WAREHOUSE` (`ID_WAREHOUSE`) ON DELETE CASCADE,
  ADD CONSTRAINT `WAREHOUSE_COMPONENTS_ibfk_1` FOREIGN KEY (`ID_Mark`) REFERENCES `WAREHOUSE_MARKS` (`ID_Mark`) ON DELETE CASCADE,
  ADD CONSTRAINT `WAREHOUSE_COMPONENTS_ibfk_2` FOREIGN KEY (`ID_Equipment`) REFERENCES `WAREHOUSE_EQUIPMENTS` (`ID_Equipment`) ON DELETE CASCADE;

--
-- Filtros para la tabla `WAREHOUSE_DEPARTAMENTS`
--
ALTER TABLE `WAREHOUSE_DEPARTAMENTS`
  ADD CONSTRAINT `WAREHOUSE_DEPARTAMENTS_ibfk_1` FOREIGN KEY (`ID_BRANCH`) REFERENCES `WAREHOUSE_BRANCHES` (`ID_BRANCH`) ON DELETE CASCADE;

--
-- Filtros para la tabla `WAREHOUSE_EQUIPMENTS`
--
ALTER TABLE `WAREHOUSE_EQUIPMENTS`
  ADD CONSTRAINT `WAREHOUSE_EQUIPMENTS_ibfk_3` FOREIGN KEY (`ID_Mark`) REFERENCES `WAREHOUSE_MARKS` (`ID_Mark`) ON DELETE CASCADE,
  ADD CONSTRAINT `WAREHOUSE_EQUIPMENTS_ibfk_1` FOREIGN KEY (`ID_Departament`) REFERENCES `WAREHOUSE_DEPARTAMENTS` (`ID_DEPARTAMENT`) ON DELETE CASCADE,
  ADD CONSTRAINT `WAREHOUSE_EQUIPMENTS_ibfk_2` FOREIGN KEY (`ID_Branch`) REFERENCES `WAREHOUSE_BRANCHES` (`ID_BRANCH`) ON DELETE CASCADE;

--
-- Filtros para la tabla `WAREHOUSE_PROPERTIES`
--
ALTER TABLE `WAREHOUSE_PROPERTIES`
  ADD CONSTRAINT `WAREHOUSE_PROPERTIES_ibfk_1` FOREIGN KEY (`ID_Equipment`) REFERENCES `WAREHOUSE_EQUIPMENTS` (`ID_Equipment`) ON DELETE CASCADE;

--
-- Filtros para la tabla `WAREHOUSE_WAREHOUSE`
--
ALTER TABLE `WAREHOUSE_WAREHOUSE`
  ADD CONSTRAINT `WAREHOUSE_WAREHOUSE_ibfk_3` FOREIGN KEY (`ID_Address`) REFERENCES `WAREHOUSE_ADDRESS` (`ID_ADDRESS`) ON DELETE CASCADE,
  ADD CONSTRAINT `WAREHOUSE_WAREHOUSE_ibfk_1` FOREIGN KEY (`ID_Component`) REFERENCES `WAREHOUSE_COMPONENTS` (`ID_Component`) ON DELETE CASCADE,
  ADD CONSTRAINT `WAREHOUSE_WAREHOUSE_ibfk_2` FOREIGN KEY (`ID_Equipment`) REFERENCES `WAREHOUSE_EQUIPMENTS` (`ID_Equipment`) ON DELETE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;