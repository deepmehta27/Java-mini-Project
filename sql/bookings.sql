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
-- Table structure for table `bookings`
--

CREATE TABLE `bookings` (
  `BookingId` varchar(10) NOT NULL DEFAULT '1',
  `source` varchar(10) NOT NULL,
  `destination` varchar(10) NOT NULL,
  `departflightcode` varchar(10) NOT NULL,
  `returnflightcode` varchar(10) NOT NULL,
  `fare` double NOT NULL,
  `salutation` varchar(5) NOT NULL,
  `firstname` varchar(10) NOT NULL,
  `lastname` varchar(10) NOT NULL,
  `contact` varchar(20) NOT NULL,
  `Emailid` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bookings`
--

INSERT INTO `bookings` (`BookingId`, `source`, `destination`, `departflightcode`, `returnflightcode`, `fare`, `salutation`, `firstname`, `lastname`, `contact`, `Emailid`) VALUES
('1', 'Mumbai', 'Kolkata', '9W 319', '', 5500, 'Mr.', 'Ajay', 'Mehta', '9820134987', NULL),
('1', 'MUMBAI', 'DELHI', '6E 591', '6E 914', 11368.12, 'Mr.', 'ajay', 'sharma', '9821345678', NULL),
('1', 'MUMBAI', 'KOLKATA', 'JW 345', 'JW 345', 17997.952, 'Mr.', 'james', 'Bond', '9628178722', 'jamesbonds7@gmail.com'),
('1', 'MUMBAI', 'DELHI', '6E 591', '6E 914', 11368.12, 'Mr.', 'fdfdsfd', 'dsfdsfds', '3131232123', NULL),
('1', 'MUMBAI', 'DELHI', '6E 591', '6E 914', 11368.12, 'Mr.', 'ajay', 'mehta', '2345678', NULL),
('1', 'MUMBAI', 'DELHI', '6E 591', '6E 914', 11368.12, 'Mr.', 'Rajesh', 'Patil', '234567889', NULL),
('1', 'MUMBAI', 'DELHI', '6E 591', '6E 914', 11368.12, 'Mr.', 'Ajay', 'Sinha', '4354356666', NULL),
('1', 'MUMBAI', 'DELHI', 'JW 123', 'JW 124', 14738.2, 'Mr.', 'pankaj', 'singh', '234353453', NULL),
('1', 'MUMBAI', 'DELHI', '6E 591', '6E 914', 11368.12, 'Mr.', 'dsfsfdf', 'fxcvxvxz', '32432432', NULL),
('1', 'DELHI', 'MUMBAI', '6E 914', '6E 591', 10835.776, 'Mr.', 'Deep', 'Mehta', '9278288132', 'depmeht8@gmail.com'),
('1', 'MUMBAI', 'DELHI', '6E 591', '6E 914', 11368.12, 'Mr.', 'abc', 'def', '344342432324', NULL),
('1', 'MUMBAI', 'DELHI', 'JW 123', '6E 914', 12273.18, 'Mr.', 'abc', 'def', '34535353235', NULL),
('1', 'MUMBAI', 'DELHI', '6E 591', '6E 914', 11368.12, 'Mr.', 'abcdefd', 'dsdsfdf', '12345456', NULL),
('1', 'MUMBAI', 'DELHI', '6E 591', '6E 914', 11368.12, 'Mr.', 'fdgdff', 'dfdf', 'dfdsff', NULL),
('1', 'MUMBAI', 'DELHI', 'JW 123', 'JW 124', 14738.2, 'Mr.', 'dfsdfds', 'dfdfdf', 'ererre', NULL),
('1', 'MUMBAI', 'DELHI', '6E 591', '6E 914', 11163.04, 'Mr.', 'Deep', 'Mehta', '9712816281', 'deepmehta827@gmail.com'),
('1', 'PUNE', 'MUMBAI', 'JE 124', 'JE 223', 8601.6, 'Mr.', 'chandler', 'bing', '9628168681', 'chandlerbing9@gmail.com'),
('1', 'MUMBAI', 'DELHI', '6E 591', '6E 914', 11163.04, 'Mr.', 'Deep', 'Mehta', '967212718', 'deepmehta27@gmail.com'),
('1', 'MUMBAI', 'DELHI', '6E 591', '6E 914', 11163.04, 'Mr.', 'james ', 'bond', '9726162881', 'jamesbond@gmail.com'),
('1', 'MUMBAI', 'DELHI', '6E 591', '6E 914', 11163.04, 'Mr.', 'Deep', 'Mehta', '7187299981', 'deep@gmail.com'),
('1', 'MUMBAI', 'DELHI', '6E 591', '6E 914', 11163.04, 'Mr.', 'root', 'root', '7273682682', 'root@gmail.com'),
('1', 'MUMBAI', 'DELHI', '6E 591', '6E 914', 11163.04, 'Mr.', 'akshat', 'kachalia', '9786168183', 'ak7@gmail.com');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
