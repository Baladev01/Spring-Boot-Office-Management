-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 28, 2026 at 12:21 PM
-- Server version: 8.0.43
-- PHP Version: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `officedb`
--

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `id` int NOT NULL,
  `department_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`id`, `department_name`) VALUES
(1, 'IT'),
(2, 'HR'),
(3, 'Finance'),
(4, 'Testing');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` int NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  `department_id` int DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `name`, `email`, `phone_number`, `department_id`, `status`) VALUES
(1, 'Balamurugan', 'bala@gmail.com', '9876543210', 1, 'ACTIVE'),
(2, 'Arun', 'arun@gmail.com', '9876543211', 1, 'ON_LEAVE'),
(3, 'Priya', 'priya@gmail.com', '9876543212', 2, 'INACTIVE'),
(4, 'Karthik', 'karthik@gmail.com', '9876543213', 3, 'ACTIVE'),
(5, 'Divya', 'divya@gmail.com', '9876543214', 2, 'ACTIVE'),
(6, 'Suresh', 'suresh@gmail.com', '9876543215', 1, 'ON_LEAVE'),
(7, 'Meena', 'meena@gmail.com', '9876543216', 4, 'ACTIVE'),
(8, 'Vignesh', 'vignesh@gmail.com', '9876543217', 3, 'INACTIVE'),
(9, 'Keerthana', 'keerthana@gmail.com', '9876543218', 2, 'ACTIVE'),
(10, 'Ajith', 'ajith@gmail.com', '9876543219', 4, 'ON_LEAVE'),
(11, 'Harish', 'harish@gmail.com', '9876543220', 1, 'ACTIVE'),
(12, 'Nandhini', 'nandhini@gmail.com', '9876543221', 3, 'INACTIVE'),
(13, 'Kavin', 'kavin@gmail.com', '9876543222', 2, 'ACTIVE'),
(14, 'Ramesh', 'ramesh@gmail.com', '9876543223', 4, 'ON_LEAVE'),
(15, 'Deepika', 'deepika@gmail.com', '9876543224', 1, 'ACTIVE'),
(46, 'string', 'string', 'string', 1, 'ACTIVE');

-- --------------------------------------------------------

--
-- Table structure for table `employee_project`
--

CREATE TABLE `employee_project` (
  `employee_id` int NOT NULL,
  `project_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `employee_project`
--

INSERT INTO `employee_project` (`employee_id`, `project_id`) VALUES
(1, 1),
(3, 1),
(5, 1),
(8, 1),
(11, 1),
(14, 1),
(1, 2),
(2, 2),
(6, 2),
(9, 2),
(12, 2),
(15, 2),
(4, 3),
(7, 3),
(10, 3),
(13, 3);

-- --------------------------------------------------------

--
-- Table structure for table `id_card`
--

CREATE TABLE `id_card` (
  `id` int NOT NULL,
  `card_number` varchar(255) DEFAULT NULL,
  `issue_date` varchar(255) DEFAULT NULL,
  `employee_id` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `id_card`
--

INSERT INTO `id_card` (`id`, `card_number`, `issue_date`, `employee_id`) VALUES
(1, 'EMP001', '2026-06-01', 1),
(2, 'EMP002', '2026-06-01', 2),
(3, 'EMP003', '2026-06-01', 3),
(4, 'EMP004', '2026-06-01', 4),
(5, 'EMP005', '2026-06-01', 5),
(6, 'EMP006', '2026-06-01', 6),
(7, 'EMP007', '2026-06-01', 7),
(8, 'EMP008', '2026-06-01', 8),
(9, 'EMP009', '2026-06-01', 9),
(10, 'EMP010', '2026-06-01', 10),
(11, 'EMP011', '2026-06-01', 11),
(12, 'EMP012', '2026-06-01', 12),
(13, 'EMP013', '2026-06-01', 13),
(14, 'EMP014', '2026-06-01', 14),
(15, 'EMP015', '2026-06-01', 15),
(16, '16', '28-06-2026', NULL),
(17, '16', '2026-06-01', NULL),
(18, 'EMP123', '2026-06-01', NULL),
(19, 'EMP123', '2026-06-29', NULL),
(21, 'EMP123456', '2026-06-30', 46);

-- --------------------------------------------------------

--
-- Table structure for table `project`
--

CREATE TABLE `project` (
  `id` int NOT NULL,
  `project_name` varchar(255) DEFAULT NULL,
  `client_name` varchar(255) DEFAULT NULL,
  `deadline` varchar(255) DEFAULT NULL,
  `project_status` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `project`
--

INSERT INTO `project` (`id`, `project_name`, `client_name`, `deadline`, `project_status`) VALUES
(1, 'bala', 'murugan', '', 'COMPLETED'),
(2, 'Banking App', 'HDFC', '2026-11-15', 'NOT_STARTED'),
(3, 'E-Commerce', 'Amazon', '2027-01-10', 'COMPLETED');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`),
  ADD KEY `department_id` (`department_id`);

--
-- Indexes for table `employee_project`
--
ALTER TABLE `employee_project`
  ADD PRIMARY KEY (`employee_id`,`project_id`),
  ADD KEY `project_id` (`project_id`);

--
-- Indexes for table `id_card`
--
ALTER TABLE `id_card`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `employee_id` (`employee_id`);

--
-- Indexes for table `project`
--
ALTER TABLE `project`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `department`
--
ALTER TABLE `department`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=47;

--
-- AUTO_INCREMENT for table `id_card`
--
ALTER TABLE `id_card`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `project`
--
ALTER TABLE `project`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `employee`
--
ALTER TABLE `employee`
  ADD CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`department_id`) REFERENCES `department` (`id`);

--
-- Constraints for table `employee_project`
--
ALTER TABLE `employee_project`
  ADD CONSTRAINT `employee_project_ibfk_1` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`),
  ADD CONSTRAINT `employee_project_ibfk_2` FOREIGN KEY (`project_id`) REFERENCES `project` (`id`);

--
-- Constraints for table `id_card`
--
ALTER TABLE `id_card`
  ADD CONSTRAINT `fk_employee` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
