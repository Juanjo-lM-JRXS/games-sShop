-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 01, 2024 at 10:24 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gamesshop`
--

-- --------------------------------------------------------

--
-- Table structure for table `orden`
--

CREATE TABLE `orden` (
  `ordenesID` int(11) NOT NULL,
  `usuariosID` int(11) NOT NULL,
  `ordenDate` datetime NOT NULL,
  `ordenEstado` int(11) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `orden`
--

INSERT INTO `orden` (`ordenesID`, `usuariosID`, `ordenDate`, `ordenEstado`) VALUES
(1, 1, '0000-00-00 00:00:00', 1),
(2, 1, '2024-12-01 15:50:09', 1),
(3, 2, '2024-12-01 15:50:56', 1),
(4, 3, '2024-12-01 15:50:56', 1),
(5, 4, '2024-12-01 15:50:56', 1),
(6, 5, '2024-12-01 15:50:56', 1),
(7, 6, '2024-12-01 15:50:56', 1);

-- --------------------------------------------------------

--
-- Table structure for table `ordenesdetalles`
--

CREATE TABLE `ordenesdetalles` (
  `ordenesDetallesID` int(11) NOT NULL,
  `ordenID` int(11) NOT NULL,
  `ordenesDetallesCantidad` int(11) NOT NULL,
  `videojuegosplataformasID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ordenesdetalles`
--

INSERT INTO `ordenesdetalles` (`ordenesDetallesID`, `ordenID`, `ordenesDetallesCantidad`, `videojuegosplataformasID`) VALUES
(13, 1, 2, 1),
(14, 2, 1, 2),
(15, 3, 1, 3),
(16, 4, 1, 2),
(17, 5, 1, 2),
(18, 6, 1, 3);

-- --------------------------------------------------------

--
-- Table structure for table `plataformas`
--

CREATE TABLE `plataformas` (
  `plataformasID` int(11) NOT NULL,
  `plataformasNombre` varchar(45) NOT NULL,
  `plataformasDescripcion` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `plataformas`
--

INSERT INTO `plataformas` (`plataformasID`, `plataformasNombre`, `plataformasDescripcion`) VALUES
(1, 'PC', 'La plataforma más personalizable, con un catálogo inmenso \ny constante actualización. Ofrece la máxima libertad para configurar \ntu experiencia de juego.'),
(2, 'PlayStation', 'Consola de Sony, conocida por sus exclusivos y \nuna comunidad fiel. Prioriza la experiencia de juego en un solo \ndispositivo.'),
(3, 'Xbox', 'Consola de Microsoft, con un ecosistema integrado \na Windows y servicios como Game Pass. Destaca por su multijugador \nonline y juegos en la nube.'),
(4, 'Movile', 'Plataforma portátil y accesible, con juegos casuales \ny títulos más complejos. Permite jugar en cualquier lugar y momento.');

-- --------------------------------------------------------

--
-- Table structure for table `usuarios`
--

CREATE TABLE `usuarios` (
  `usuariosID` int(11) NOT NULL,
  `usuariosPrimerNombre` varchar(45) NOT NULL,
  `usuariosSegundoNombre` varchar(45) DEFAULT NULL,
  `usuariosPrimerApellido` varchar(45) NOT NULL,
  `usuariosSegundoApellido` varchar(45) NOT NULL,
  `usuariosNombreUsuario` varchar(45) NOT NULL,
  `usuariosCorreo` varchar(45) NOT NULL,
  `usuariosContraseña` varchar(45) NOT NULL,
  `usuariosEstado` int(11) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `usuarios`
--

INSERT INTO `usuarios` (`usuariosID`, `usuariosPrimerNombre`, `usuariosSegundoNombre`, `usuariosPrimerApellido`, `usuariosSegundoApellido`, `usuariosNombreUsuario`, `usuariosCorreo`, `usuariosContraseña`, `usuariosEstado`) VALUES
(1, 'Juan', 'José', 'Lastre', 'Meza', 'Jaxpro', 'juan@gmail.com', 'Contraseña', 1),
(2, 'Jose', 'Gregorio', 'Lastre', 'Vega', 'JoseGLV', 'jose@gmail.com', 'Contraseñajose85', 1),
(3, 'Veronica', '', 'Lastre', 'Meza', 'Vero10', 'vero@gmail.com', 'Contraseñavero10', 1),
(4, 'Camilo', 'Andres', 'Gutierrez', 'Velez', 'CamiloGamer', 'camilo@gmail.com', 'Contraseñacamilog', 1),
(5, 'Jorge', '', 'Pilates', 'Roma', 'Elcurioso', 'jorge@gmail.com', 'Contraseñaelcurioso', 1),
(6, 'Paula', 'Andrea', 'Lonvana', 'Barrios', 'paulixgamer', 'pau@gmail.com', 'Contraseña', 1);

-- --------------------------------------------------------

--
-- Table structure for table `videojuegosdetalles`
--

CREATE TABLE `videojuegosdetalles` (
  `videojuegosID` int(11) NOT NULL,
  `videojuegosNombre` varchar(45) NOT NULL,
  `videojuegosDescripcion` varchar(45) NOT NULL,
  `videojuegosPrecio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `videojuegosdetalles`
--

INSERT INTO `videojuegosdetalles` (`videojuegosID`, `videojuegosNombre`, `videojuegosDescripcion`, `videojuegosPrecio`) VALUES
(1, 'Fortine', 'Un popular juego de batalla real donde 100 ju', 0),
(2, 'God of war', 'Una serie de juegos de acción y aventura para', 25.6),
(3, 'Call of duty', 'Una franquicia de disparos en primera persona', 30.2),
(4, 'Barwls stars', 'Un juego multijugador móvil con batallas rápi', 0),
(5, 'Asento corsa', 'Un simulador de carreras realista que ofrece ', 10);

-- --------------------------------------------------------

--
-- Table structure for table `videojuegos_plataformas`
--

CREATE TABLE `videojuegos_plataformas` (
  `videojuegos_plataformasID` int(11) NOT NULL,
  `plataformasID` int(11) NOT NULL,
  `videojuegosID` int(11) NOT NULL,
  `videojuegos_plataformasEstado` int(11) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `videojuegos_plataformas`
--

INSERT INTO `videojuegos_plataformas` (`videojuegos_plataformasID`, `plataformasID`, `videojuegosID`, `videojuegos_plataformasEstado`) VALUES
(1, 1, 3, 1),
(2, 1, 1, 1),
(3, 1, 5, 1),
(4, 2, 1, 1),
(5, 2, 2, 1),
(6, 2, 3, 1),
(7, 3, 1, 1),
(8, 3, 3, 1),
(9, 4, 1, 1),
(10, 4, 4, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `orden`
--
ALTER TABLE `orden`
  ADD PRIMARY KEY (`ordenesID`),
  ADD KEY `usuariosID_idx` (`usuariosID`);

--
-- Indexes for table `ordenesdetalles`
--
ALTER TABLE `ordenesdetalles`
  ADD PRIMARY KEY (`ordenesDetallesID`),
  ADD KEY `ordenID_idx` (`ordenID`),
  ADD KEY `videojuego_idx` (`videojuegosplataformasID`);

--
-- Indexes for table `plataformas`
--
ALTER TABLE `plataformas`
  ADD PRIMARY KEY (`plataformasID`);

--
-- Indexes for table `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`usuariosID`);

--
-- Indexes for table `videojuegosdetalles`
--
ALTER TABLE `videojuegosdetalles`
  ADD PRIMARY KEY (`videojuegosID`);

--
-- Indexes for table `videojuegos_plataformas`
--
ALTER TABLE `videojuegos_plataformas`
  ADD PRIMARY KEY (`videojuegos_plataformasID`),
  ADD KEY `plataformas_idx` (`plataformasID`),
  ADD KEY `videojuegoID_idx` (`videojuegosID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `orden`
--
ALTER TABLE `orden`
  MODIFY `ordenesID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `ordenesdetalles`
--
ALTER TABLE `ordenesdetalles`
  MODIFY `ordenesDetallesID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `plataformas`
--
ALTER TABLE `plataformas`
  MODIFY `plataformasID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `usuariosID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `videojuegosdetalles`
--
ALTER TABLE `videojuegosdetalles`
  MODIFY `videojuegosID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `videojuegos_plataformas`
--
ALTER TABLE `videojuegos_plataformas`
  MODIFY `videojuegos_plataformasID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `orden`
--
ALTER TABLE `orden`
  ADD CONSTRAINT `usuariosID` FOREIGN KEY (`usuariosID`) REFERENCES `usuarios` (`usuariosID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `ordenesdetalles`
--
ALTER TABLE `ordenesdetalles`
  ADD CONSTRAINT `ordenID` FOREIGN KEY (`ordenID`) REFERENCES `orden` (`ordenesID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `videojuego` FOREIGN KEY (`videojuegosplataformasID`) REFERENCES `videojuegos_plataformas` (`videojuegos_plataformasID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `videojuegos_plataformas`
--
ALTER TABLE `videojuegos_plataformas`
  ADD CONSTRAINT `plataformas` FOREIGN KEY (`plataformasID`) REFERENCES `plataformas` (`plataformasID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `videojuegoID` FOREIGN KEY (`videojuegosID`) REFERENCES `videojuegosdetalles` (`videojuegosID`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
