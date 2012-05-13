-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 13-05-2012 a las 09:12:28
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

INSERT INTO `WAREHOUSE_ADDRESS` (`ID_ADDRESS`, `STATE`, `CITY`, `STREET`, `PHONE_NUMBER`) VALUES
(1000, 'Mexico', 'Mexico', 'Zaragoza', '55-89-76-54'),
(1001, 'Mexico', 'Nezahualcóyotl ', 'Av. Pantitlán', '57 38 90 52'),
(1002, 'Mexico', 'Iztapalapa', 'Calz. Ermita', '56 97 36 74'),
(1003, 'Michoacan', 'Morelia', 'Paseo de la República ', '4433597170'),
(1004, 'Chiapas', 'Tuxtla', '5TA AV', '01 961 6 02 43 '),
(1005, 'Baja California', 'La Paz', 'Paseo de la República Sur', '667- 715-84-93'),
(1006, 'Sinaloa', 'Culiacan', 'EPITACIO OSUNA 805', '667 - 715-84-94'),
(1007, 'Queretaro', 'Queretaro', 'Guanajuato No. 5', '0144 221 283'),
(1008, 'Veracruz', 'Veracruz', 'DIAZ MIRON NO. 4299', '229 922-1066'),
(1009, 'Guadalajara', 'Guadalajara', 'Gallo No. 2547', '01 33 36 -39 72');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `WAREHOUSE_AUTHORITIES`
--

INSERT INTO `WAREHOUSE_AUTHORITIES` (`ID_USER`, `AUTHORITY`) VALUES
(1, 'ROLE_USER'),
(2, 'ROLE_ADMIN');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `WAREHOUSE_BRANCHES`
--

INSERT INTO `WAREHOUSE_BRANCHES` (`ID_BRANCH`, `NAME`, `NETWORK_SEGMENT`, `ID_COMPANY`, `ID_ADDRESS`) VALUES
(3000, 'Merida', '192.168.2.1', 2000, 1000),
(3001, 'Chalco', '192.168.2.2', 2000, 1000),
(3002, 'Villada', '192.168.2.3', 2000, 1001),
(3003, 'Toluca', '192.168.2.4', 2000, 1000),
(3004, 'Puebla', '192.168.2.5', 2000, 1001),
(3005, 'Ecatepec', '192.168.2.5', 2000, 1000),
(3006, 'Aguascalientes', '192.168.2.6', 2000, 1001),
(3007, 'Leon', '192.168.2.6', 2000, 1000),
(3008, 'Tlalnepantla', '192.168.2.7', 2000, 1002),
(3009, 'Observatorio', '192.168.2.8', 2000, 1003);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `WAREHOUSE_COMPANIES`
--

INSERT INTO `WAREHOUSE_COMPANIES` (`ID_COMPANY`, `NAME`) VALUES
(2000, 'Poliformas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `WAREHOUSE_COMPONENTS`
--

INSERT INTO `WAREHOUSE_COMPONENTS` (`ID_COMPONENT`, `NAME`, `SERIE`, `MODEL`, `DATE_BUY`, `DATE_WARRANTY`, `CODE`, `ID_MARK`, `ID_EQUIPMENT`, `ID_WAREHOUSE`) VALUES
('300', 'Monitor', '2345678', 'M120511', '2012-05-01', '2012-07-01', '7000', 200, 4000, 8000),
('301', 'Mouse', '678932', 'M0512', '2012-05-08', '2012-08-08', '7001', 201, 4001, 8001),
('302', 'Impresora', '879321', 'hp3600', '2012-05-03', '2012-09-03', '7002', 200, 4000, 8002),
('303', 'Laptop', '234679', 'Acr 2045', '2012-01-03', '2012-07-03', '7003', 203, 4003, 8003),
('304', 'Laptop', '987654', 'LN0986', '2012-05-09', '2012-10-09', '7004', 204, 4004, 8004),
('305', 'PC', '679854', 'DX', '2012-05-16', '2012-11-16', '7005', 205, 4005, 8005),
('306', 'Tablet', '875624', 'AT200', '2012-03-18', '2012-08-18', '7006', 207, 4006, 8006),
('307', 'Diadema', '124375', 'DS2012', '2012-02-14', '2012-06-14', '7007', 206, 4007, 8007),
('308', 'Monitor', '976421', 'M9876', '2012-04-18', '2012-12-18', '7008', 208, 4008, 8008),
('309', 'Mouse', '867543', 'MOU7543', '2012-04-05', '2012-06-05', '7009', 209, 4009, 8009);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `WAREHOUSE_DEPARTMENTS`
--

INSERT INTO `WAREHOUSE_DEPARTMENTS` (`ID_DEPARTMENT`, `NAME`, `ID_BRANCH`) VALUES
(5001, 'Villada', 3001),
(5000, 'Yucatan', 3000),
(5002, 'Pantitlan', 3002),
(5003, 'Ermita', 3005),
(5004, 'MoreliaD', 3001),
(5005, 'Tuxtla', 3004),
(5006, ' Culiacan', 3006),
(5007, 'San Juan', 3005),
(5008, 'Jalapa', 3009),
(5009, 'Jalisco', 3008);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `WAREHOUSE_EMPLOYEES`
--

INSERT INTO `WAREHOUSE_EMPLOYEES` (`ID_EMPLOYEE`, `NAME`) VALUES
(100, ' Pedro  Morales '),
(101, 'Elena Mendoza'),
(102, 'Eduardo Valle'),
(103, 'Juan  Gomez'),
(104, 'Marco Lara'),
(105, 'Alberto Galindo'),
(106, 'Teresa Duarte'),
(107, 'Jonathan Ladin'),
(108, 'Angel Patiño'),
(109, 'Daniel Carmona');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `WAREHOUSE_EQUIPMENTS`
--

INSERT INTO `WAREHOUSE_EQUIPMENTS` (`ID_EQUIPMENT`, `ID_DEPARTMENT`, `ID_BRANCH`, `ID_MARK`) VALUES
(4000, 5000, 3000, 200),
(4001, 5001, 3001, 201),
(4002, 5000, 3000, 200),
(4003, 5002, 3003, 203),
(4004, 5003, 3004, 204),
(4005, 5004, 3005, 205),
(4006, 5005, 3006, 206),
(4007, 5006, 3007, 206),
(4008, 5007, 3008, 207),
(4009, 5008, 3009, 208);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `WAREHOUSE_MARKS`
--

INSERT INTO `WAREHOUSE_MARKS` (`ID_MARK`, `NAME`) VALUES
(200, 'hp'),
(201, 'Dell'),
(202, 'LG'),
(203, 'Acer'),
(204, 'Lenovo'),
(205, 'Gateway'),
(206, 'Sony'),
(207, 'Toshiba'),
(208, 'Samsung'),
(209, 'Panasonic');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `WAREHOUSE_PROPERTIES`
--


INSERT INTO `WAREHOUSE_PROPERTIES` (`ID_PROPERTY`, `CODE`, `DATE_BUY`, `DATE_WARRANTY`, `SERIE`, `ID_EQUIPMENT`) VALUES
(9000, '7000', '2012-05-01', '2012-07-01', '2345678', 4000),
(9001, '7001', '2012-05-08', '2012-05-08', '678932', 4001),
(9002, '7002', '2012-05-03', '2012-09-03', '879321', 4000),
(9003, '7003', '2012-01-03', '2012-07-03', '234679', 4003),
(9004, '7004', '2012-05-09', '2012-10-09', '987654', 4004),
(9005, '7005', '2012-05-16', '2012-05-16', '679854', 4005),
(9006, '7006', '2012-03-18', '2012-05-18', '875624', 4006),
(9007, '7007', '2012-02-14', '2012-06-14', '124375', 4007),
(9008, '7008', '2012-04-18', '2012-12-18', '976421', 4008),
(9009, '7009', '2012-04-05', '2012-07-05', '867543', 4009);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `WAREHOUSE_USERS`
--


INSERT INTO `WAREHOUSE_USERS` (`ID_USER`, `USERNAME`, `ENABLED`, `EMAIL`) VALUES
(1, 'juan', 1, 'loquesea@gmail.com'),
(2, 'marco', 1, 'loquesea@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `WAREHOUSE_USER_PASSWORD`
--



INSERT INTO `WAREHOUSE_USER_PASSWORD` (`ID_USER`, `PASSWORD`) VALUES
(2, 'd865ad82340c48ecfa59fb4b6b35c7ec'),
(1, 'a94652aa97c7211ba8954dd15a3cf838');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `WAREHOUSE_WAREHOUSE`
--


INSERT INTO `WAREHOUSE_WAREHOUSE` (`ID_WAREHOUSE`, `STATUS`, `ID_COMPONENT`, `ID_EQUIPMENT`, `ID_ADDRESS`) VALUES
(8001, 'Nuevo', '301', 4001, 1001),
(8000, 'Nuevo', '300', 4000, 1000),
(8002, 'Nuevo', '302', 4000, 1002),
(8003, 'Nuevo', '303', 4003, 1003),
(8004, 'Nuevo', '304', 4004, 1004),
(8005, 'Nuevo', '305', 4005, 1005),
(8006, 'Nuevo', '306', 4006, 1006),
(8007, 'Nuevo', '307', 4007, 1007),
(8008, 'Nuevo', '308', 4008, 1008),
(8009, 'Nuevo', '309', 4009, 1009);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `WAREHOUSE_AUTHORITIES`
--

--
-- Filtros para la tabla `WAREHOUSE_USER_PASSWORD`
--


/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
