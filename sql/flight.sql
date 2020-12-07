-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 07, 2020 at 01:01 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `travel_agency`
--

-- --------------------------------------------------------

--
-- Table structure for table `flight`
--

CREATE TABLE `flight` (
  `flightid` text NOT NULL,
  `airline` text NOT NULL,
  `source` text NOT NULL,
  `destination` text NOT NULL,
  `departtime` text NOT NULL,
  `arrivaltime` text NOT NULL,
  `fare` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `flight`
--

INSERT INTO `flight` (`flightid`, `airline`, `source`, `destination`, `departtime`, `arrivaltime`, `fare`) VALUES
('JW 883', 'JET AIRWAYS', 'MUMBAI', 'BANGALORE', '10:20', '12:35', 2863),
('JW 123', 'JET AIRWAYS', 'MUMBAI', 'DELHI', '7:15 ', '9:00', 5500),
('JW 124', 'GO AIR', 'DELHI', 'MUMBAI', '11:45', '13:50', 6000),
('6E 914', 'INDIGO', 'DELHI', 'MUMBAI', '05:00', '06:45', 3911),
('6E 591', 'INDIGO', 'MUMBAI', 'DELHI', '14:00', '15:55', 4850),
('6E 914', 'INDIGO', 'DELHI', 'MUMBAI', '05:00', '06:45', 3911),
('JW 345', 'JET AIRWAYS', 'MUMBAI', 'KOLKATA', '14:25', '15:55', 4780),
('JW591', 'AIRASIA', 'KOCHI', 'HYDERABAD', '07:00', '08:20', 4580),
('JW 883', 'JET AIRWAYS', 'MUMBAI', 'BANGALORE', '8:20', '10:05', 2803),
('JW 123', 'INDIGO', 'MUMBAI', 'PUNE', '7:15 ', '9:00', 3400),
('JW 124', 'JET AIRWAYS', 'PUNE', 'MUMBAI', '11:45', '13:50', 5100),
('6E 914', 'INDIGO', 'DELHI', 'MUMBAI', '07:00', '10:45', 3800),
('6E 591', 'INDIGO', 'MUMBAI', 'DELHI', '16:00', '19:55', 5850),
('6E 914', 'INDIGO', 'DELHI', 'MUMBAI', '08:00', '11:45', 3415),
('JW 345', 'AIRASIA', 'KOLKATA', 'MUMBAI', '15:25', '20:55', 7580),
('JW591', 'GO AIR', 'KOCHI', 'HYDERABAD', '06:00', '8:20', 3580),
('JW 983', 'JET AIRWAYS', 'MUMBAI', 'PUNE', '2:20', '5:05', 3863),
('JE 223', 'INDIGO', 'MUMBAI', 'PUNE', '12:15 ', '14:00', 3760),
('JE 124', 'AIRASIA', 'PUNE', 'MUMBAI', '6:45', '8:50', 3500),
('6F 514', 'GO AIR', 'PUNE', 'MUMBAI', '07:00', '10:45', 4911),
('6F 891', 'SPICEJET', 'MUMBAI', 'PUNE', '14:00', '15:55', 3850),
('6F 924', 'INDIGO', 'KOLKATA', 'MUMBAI', '08:00', '13:45', 5900),
('GE 455', 'SPICEJET', 'MUMBAI', 'KOLKATA', '14:25', '15:55', 5580),
('GE 591', 'JET AIRWAYS', 'KOCHI', 'HYDERABAD', '10:00', '14:20', 5580);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
