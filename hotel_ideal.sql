-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-10-2023 a las 17:56:53
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotel_ideal`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitaciones`
--

CREATE TABLE `habitaciones` (
  `idHabitacion` int(30) NOT NULL,
  `codigo` int(30) NOT NULL,
  `numero_habitacion` int(30) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huesped`
--

CREATE TABLE `huesped` (
  `Idhuesped` int(20) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `dni` int(20) NOT NULL,
  `domicilio` varchar(30) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `celular` int(20) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `huesped`
--

INSERT INTO `huesped` (`Idhuesped`, `nombre`, `dni`, `domicilio`, `correo`, `celular`, `estado`) VALUES
(1, 'Juan Roberto', 27861436, 'Barrio Viejo', 'juancito.com', 297654, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `idReserva` int(30) NOT NULL,
  `idHuesped` int(30) NOT NULL,
  `codigo` int(30) NOT NULL,
  `cantPersonas` int(30) NOT NULL,
  `Fecha_entrada` date NOT NULL,
  `Fecha_salida` date NOT NULL,
  `ImporteTotal` double NOT NULL,
  `Estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipodehabitacion`
--

CREATE TABLE `tipodehabitacion` (
  `idTipoHabitacion` int(30) NOT NULL,
  `codigo` int(30) NOT NULL,
  `cantPersonas` int(30) NOT NULL,
  `cantCamas` int(30) NOT NULL,
  `tipoCamas` varchar(20) NOT NULL,
  `precioNoche` double NOT NULL,
  `Estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `habitaciones`
--
ALTER TABLE `habitaciones`
  ADD PRIMARY KEY (`idHabitacion`),
  ADD KEY `codigo` (`codigo`);

--
-- Indices de la tabla `huesped`
--
ALTER TABLE `huesped`
  ADD PRIMARY KEY (`Idhuesped`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`idReserva`),
  ADD KEY `idHuesped` (`idHuesped`),
  ADD KEY `codigo` (`codigo`);

--
-- Indices de la tabla `tipodehabitacion`
--
ALTER TABLE `tipodehabitacion`
  ADD PRIMARY KEY (`idTipoHabitacion`),
  ADD KEY `codigo` (`codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `habitaciones`
--
ALTER TABLE `habitaciones`
  MODIFY `idHabitacion` int(30) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `huesped`
--
ALTER TABLE `huesped`
  MODIFY `Idhuesped` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idReserva` int(30) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipodehabitacion`
--
ALTER TABLE `tipodehabitacion`
  MODIFY `idTipoHabitacion` int(30) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `habitaciones`
--
ALTER TABLE `habitaciones`
  ADD CONSTRAINT `habitaciones_ibfk_1` FOREIGN KEY (`codigo`) REFERENCES `tipodehabitacion` (`codigo`);

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`idHuesped`) REFERENCES `huesped` (`Idhuesped`),
  ADD CONSTRAINT `reserva_ibfk_2` FOREIGN KEY (`codigo`) REFERENCES `tipodehabitacion` (`codigo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
