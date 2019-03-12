-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mar 12 Mars 2019 à 11:37
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET FOREIGN_KEY_CHECKS=0;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `poussin-production`
--

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequence`
--

CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(11),
(11),
(11),
(11),
(11);

-- --------------------------------------------------------

--
-- Structure de la table `pricing_oeuf`
--

CREATE TABLE IF NOT EXISTS `pricing_oeuf` (
  `id` bigint(20) NOT NULL,
  `date_max` date DEFAULT NULL,
  `date_min` date DEFAULT NULL,
  `prix` double NOT NULL,
  `reference` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `production`
--

CREATE TABLE IF NOT EXISTS `production` (
  `id` bigint(20) NOT NULL,
  `annee_production` int(11) DEFAULT NULL,
  `date_production` date DEFAULT NULL,
  `mois_production` int(11) DEFAULT NULL,
  `nbr_mort` int(11) NOT NULL,
  `nbr_oeuf` int(11) DEFAULT NULL,
  `nbr_poussin_female` int(11) NOT NULL,
  `nbr_poussin_male` int(11) NOT NULL,
  `poids` double NOT NULL,
  `ref_evolution` varchar(255) DEFAULT NULL,
  `ref_firme` varchar(255) DEFAULT NULL,
  `reference` varchar(255) DEFAULT NULL,
  `semaine_production` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `production`
--

INSERT INTO `production` (`id`, `annee_production`, `date_production`, `mois_production`, `nbr_mort`, `nbr_oeuf`, `nbr_poussin_female`, `nbr_poussin_male`, `poids`, `ref_evolution`, `ref_firme`, `reference`, `semaine_production`) VALUES
(6, 2019, '2019-02-07', 2, 3, 20, 120, 100, 3, 'E2', 'F3', 'P1', 6),
(7, 2019, '2019-02-07', 2, 3, 20, 120, 100, 3, 'E2', 'F3', 'P2', 6),
(8, 2019, '2019-02-07', 2, 3, 20, 120, 100, 3, 'E2', 'F3', 'P3', 6),
(9, 2019, '2019-02-07', 2, 3, 20, 120, 100, 3, 'E2', 'F6', 'P4', 6),
(10, 2019, '2019-03-07', 3, 3, 20, 120, 100, 3, 'E2', 'F6', 'P5', 10);

-- --------------------------------------------------------

--
-- Structure de la table `role`
--

CREATE TABLE IF NOT EXISTS `role` (
  `id` bigint(20) NOT NULL,
  `libelle` varchar(255) DEFAULT NULL,
  `reference` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `role`
--

INSERT INTO `role` (`id`, `libelle`, `reference`) VALUES
(1, 'Admin', 'U1');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` bigint(20) NOT NULL,
  `bloquer` int(11) NOT NULL,
  `gmail` varchar(255) DEFAULT NULL,
  `login` varchar(255) DEFAULT NULL,
  `nb_conexion` int(11) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `reference` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `user`
--

INSERT INTO `user` (`id`, `bloquer`, `gmail`, `login`, `nb_conexion`, `password`, `reference`) VALUES
(4, 0, 'aa@Gmail.com', 'ahmed', 3, '2130', 'U1');

-- --------------------------------------------------------

--
-- Structure de la table `user_role`
--

CREATE TABLE IF NOT EXISTS `user_role` (
  `id` bigint(20) NOT NULL,
  `date_affectation` date DEFAULT NULL,
  `role` bigint(20) DEFAULT NULL,
  `user` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK26f1qdx6r8j1ggkgras9nrc1d` (`role`),
  KEY `FKmow7bmkl6wduuutk26ypkgmm1` (`user`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `user_role`
--

INSERT INTO `user_role` (`id`, `date_affectation`, `role`, `user`) VALUES
(5, '2019-02-03', 1, 4);
SET FOREIGN_KEY_CHECKS=1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
