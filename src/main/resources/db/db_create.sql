/*
MySQL Backup
Source Server Version: 5.5.8
Source Database: WAREHOUSE
Date: 10/04/2012 15:33:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
--  Table structure for `WAREHOUSE_address`
-- ----------------------------
DROP TABLE IF EXISTS `WAREHOUSE_ADDRESS`;
CREATE TABLE `WAREHOUSE_ADDRESS` (
  `ID_ADDRESS` int(11) NOT NULL AUTO_INCREMENT,
  `STATE` varchar(50) NOT NULL,
  `CITY` varchar(50) NOT NULL,
  `STREET` varchar(50) NOT NULL,
  `PHONE_NUMBER` varchar(15) NOT NULL,
  PRIMARY KEY (`ID_ADDRESS`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
--  Table structure for `WAREHOUSE_authorities`
-- ----------------------------

DROP TABLE IF EXISTS `WAREHOUSE_BRANCHES`;
CREATE TABLE `WAREHOUSE_BRANCHES` (
  `ID_BRANCH` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(50) NOT NULL,
  `NETWORK_SEGMENT` varchar(25) NOT NULL,
  `ID_COMPANY` int(11) NOT NULL,
  `ID_ADDRESS` int(11) NOT NULL,
  PRIMARY KEY (`ID_BRANCH`),
  KEY `Ref31` (`ID_COMPANY`),
  KEY `Ref12` (`ID_ADDRESS`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
--  Table structure for `WAREHOUSE_company`
-- ----------------------------
DROP TABLE IF EXISTS `WAREHOUSE_COMPANIES`;
CREATE TABLE `WAREHOUSE_COMPANIES` (
  `ID_COMPANY` int(11) NOT NULL,
  `NAME` varchar(50) NOT NULL,
  PRIMARY KEY (`ID_COMPANY`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
--  Table structure for `WAREHOUSE_components`
-- ----------------------------
DROP TABLE IF EXISTS `WAREHOUSE_COMPONENTS`;
CREATE TABLE `WAREHOUSE_COMPONENTS` (
  `ID_COMPONENT` char(10) NOT NULL,
  `NAME` varchar(50) NOT NULL,
  `SERIE` varchar(25) NOT NULL,
  `MODEL` varchar(25) NOT NULL,
  `DATE_BUY` date NOT NULL,
  `DATE_WARRANTY` date NOT NULL,
  `CODE` varchar(25) NOT NULL,
  `ID_MARK` int(11) NOT NULL,
  `ID_EQUIPMENT` int(11) NOT NULL,
  `ID_WAREHOUSE` int(11) NOT NULL,
  PRIMARY KEY (`ID_COMPONENT`),
  KEY `Ref73` (`ID_MARK`),
  KEY `Ref64` (`ID_EQUIPMENT`),
  KEY `Ref95` (`ID_WAREHOUSE`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
--  Table structure for `WAREHOUSE_departments`
-- ----------------------------
DROP TABLE IF EXISTS `WAREHOUSE_DEPARTMENTS`;
CREATE TABLE `WAREHOUSE_DEPARTMENTS` (
  `ID_DEPARTMENT` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(50) NOT NULL,
  `ID_BRANCH` int(11) NOT NULL,
  PRIMARY KEY (`ID_DEPARTMENT`),
  KEY `Ref213` (`ID_BRANCH`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
--  Table structure for `WAREHOUSE_employees`
-- ----------------------------
DROP TABLE IF EXISTS `WAREHOUSE_EMPLOYEES`;
CREATE TABLE `WAREHOUSE_EMPLOYEES` (
  `ID_EMPLOYEE` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(50) NOT NULL,
  PRIMARY KEY (`ID_EMPLOYEE`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
--  Table structure for `WAREHOUSE_equipments`
-- ----------------------------
DROP TABLE IF EXISTS `WAREHOUSE_EQUIPMENTS`;
CREATE TABLE `WAREHOUSE_EQUIPMENTS` (
  `ID_EQUIPMENT` int(11) NOT NULL AUTO_INCREMENT,
  `ID_DEPARTMENT` int(11) NOT NULL,
  `ID_BRANCH` int(11) NOT NULL,
  `ID_MARK` int(11) NOT NULL,
  PRIMARY KEY (`ID_EQUIPMENT`),
  KEY `Ref106` (`ID_DEPARTMENT`),
  KEY `Ref27` (`ID_BRANCH`),
  KEY `Ref78` (`ID_MARK`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
--  Table structure for `WAREHOUSE_marks`
-- ----------------------------
DROP TABLE IF EXISTS `WAREHOUSE_MARKS`;
CREATE TABLE `WAREHOUSE_MARKS` (
  `ID_MARK` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(50) NOT NULL,
  PRIMARY KEY (`ID_MARK`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
--  Table structure for `WAREHOUSE_properties`
-- ----------------------------
DROP TABLE IF EXISTS `WAREHOUSE_PROPERTIES`;
CREATE TABLE `WAREHOUSE_PROPERTIES` (
  `ID_PROPERTY` int(11) NOT NULL AUTO_INCREMENT,
  `CODE` varchar(25) NOT NULL,
  `DATE_BUY` date NOT NULL,
  `DATE_WARRANTY` date NOT NULL,
  `SERIE` varchar(25) NOT NULL,
  `ID_EQUIPMENT` int(11) NOT NULL,
  PRIMARY KEY (`ID_PROPERTY`),
  KEY `Ref69` (`ID_EQUIPMENT`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
--  Table structure for `WAREHOUSE_users`


-- ----------------------------
--  Table structure for `WAREHOUSE_WAREHOUSE`
-- ----------------------------
DROP TABLE IF EXISTS `WAREHOUSE_WAREHOUSE`;
CREATE TABLE `WAREHOUSE_WAREHOUSE` (
  `ID_WAREHOUSE` int(11) NOT NULL AUTO_INCREMENT,
  `STATUS` varchar(25) NOT NULL,
  `ID_COMPONENT` char(10) NOT NULL,
  `ID_EQUIPMENT` int(11) NOT NULL,
  `ID_ADDRESS` int(11) NOT NULL,
  PRIMARY KEY (`ID_WAREHOUSE`),
  KEY `Ref410` (`ID_COMPONENT`),
  KEY `Ref611` (`ID_EQUIPMENT`),
  KEY `Ref112` (`ID_ADDRESS`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records 
-- ----------------------------



CREATE TABLE IF NOT EXISTS `WAREHOUSE_AUTHORITIES` (
  `ID_USER` int(10)  NOT NULL,
  `AUTHORITY` varchar(50) NOT NULL,
  UNIQUE KEY `IX_AUTH_USER` (`ID_USER`,`AUTHORITY`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE IF NOT EXISTS `WAREHOUSE_USERS` (
  `ID_USER` int(10) NOT NULL AUTO_INCREMENT,
  `USERNAME` varchar(50) NOT NULL,
  `ENABLED` tinyint(1) NOT NULL,
  `EMAIL` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID_USER`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
  
-- --------------------------------------------------------

-- Estructura de tabla para la tabla `WAREHOUSE_USER_PASSWORD`
--

CREATE TABLE IF NOT EXISTS `WAREHOUSE_USER_PASSWORD` (
   `ID_USER` int(10) NOT NULL,
  `PASSWORD` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



-- Filtros para las tablas descargadas (dump)
--

--
-- Filtros para la tabla `WAREHOUSE_AUTHORITIES`
--
ALTER TABLE `WAREHOUSE_AUTHORITIES`
  ADD CONSTRAINT `FK_WAREHOUSE_AUTHORITIES_WAREHOUSE_USERS` FOREIGN KEY (`ID_USER`) REFERENCES `WAREHOUSE_USERS` (`ID_USER`);

--

  --
-- Filtros para la tabla `WAREHOUSE_USER_PASSWORD`
--
ALTER TABLE `WAREHOUSE_USER_PASSWORD`
  ADD CONSTRAINT `FK_WAREHOUSE_USER_PASSWORD_WAREHOUSE_USER` FOREIGN KEY (`ID_USER`) REFERENCES `WAREHOUSE_USERS` (`ID_USER`);
  
  
  INSERT INTO `WAREHOUSE_USERS` VALUES(2,'marco',1,'loquesea@gmail.com');
insert into `WAREHOUSE_USER_PASSWORD` values(2,'d865ad82340c48ecfa59fb4b6b35c7ec');
INSERT INTO `WAREHOUSE_AUTHORITIES` VALUES(2,'ROLE_ADMIN');


INSERT INTO `WAREHOUSE_USERS` VALUES(1,'juan',1,'loquesea@gmail.com');
insert into `WAREHOUSE_USER_PASSWORD` values(1,'a94652aa97c7211ba8954dd15a3cf838');
INSERT INTO `WAREHOUSE_AUTHORITIES` VALUES(1,'ROLE_USER');
