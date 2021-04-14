-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 09, 2020 at 09:22 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 5.6.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quiz`
--

-- --------------------------------------------------------

--
-- Table structure for table `questions`
--

CREATE TABLE `questions` (
  `questionId` int(11) NOT NULL,
  `question` varchar(2000) DEFAULT NULL,
  `option1` varchar(255) DEFAULT NULL,
  `option2` varchar(255) DEFAULT NULL,
  `option3` varchar(255) DEFAULT NULL,
  `option4` varchar(255) DEFAULT NULL,
  `answer` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `questions`
--

INSERT INTO `questions` (`questionId`, `question`, `option1`, `option2`, `option3`, `option4`, `answer`) VALUES
(1, 'This is question1?', 'option1', 'option2', 'option3', 'option4', 1),
(2, 'This is question2?', 'option1', 'option2', 'option3', 'option4', 2),
(3, 'This is question3?', 'option1', 'option2', 'option3', 'option4', 3),
(4, 'This is question4?', 'option1', 'option2', 'option3', 'option4', 4),
(5, 'This is question 5?', 'Option-1', 'Option-2', 'Option-3', 'Option-4', 2),
(6, 'This is question 6?', 'Option - 1', 'Option - 2', 'Option - 3', 'Option - 4', 3),
(7, 'This is question 7?', 'Option-1', 'Option-2', 'Option-3', 'Option-4', 2),
(8, 'This is question 8?', 'Option - 1', 'Option - 2', 'Option - 3', 'Option - 4', 3),
(9, 'This is question 9?', 'Option-1', 'Option-2', 'Option-3', 'Option-4', 2),
(10, 'This is question 10?', 'Option - 1', 'Option - 2', 'Option - 3', 'Option - 4', 3);

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `ID` int(5) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `roll_no` varchar(10) DEFAULT NULL,
  `startTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`ID`, `name`, `roll_no`, `startTime`) VALUES
(2, 'Malkhan Singh', '716CS1047', '2020-02-03 09:28:03'),
(3, 'Hello', '12345', '2020-02-08 18:53:22'),
(4, 'Hello123', '123', '2020-02-08 18:55:28'),
(5, 'MalkhanSingh', '716CS1047', '2020-02-08 19:13:09'),
(6, 'Malkhan1', '12345', '2020-02-08 19:20:04'),
(7, 'Hello123', '123', '2020-02-08 19:22:34'),
(8, 'malkhan1', '1234', '2020-02-08 19:29:11'),
(9, 'hii', '123', '2020-02-08 20:19:37'),
(10, 'Hello2', '1234', '2020-02-08 20:20:55'),
(11, 'hEy', '123', '2020-02-08 20:22:22'),
(12, 'hello123', '1234', '2020-02-08 20:23:28'),
(13, '', '', '2020-02-08 21:50:31'),
(14, 'Malkh12', '1234', '2020-02-08 21:59:49'),
(15, 'malkhan123', '1234', '2020-02-08 22:01:55'),
(16, 'malkhan', '12', '2020-02-08 22:03:59'),
(17, 'hey12', '12345', '2020-02-08 22:30:02'),
(18, '1234', '1234', '2020-02-09 07:38:45'),
(19, 'helloji', '1234', '2020-02-09 07:49:37'),
(20, 'helloJi', '1234', '2020-02-09 07:50:16'),
(21, 'Hello', '1234', '2020-02-09 07:52:12'),
(22, 'Hii', '123', '2020-02-09 07:53:38'),
(23, 'Bib', '116CS0204', '2020-02-09 18:12:24');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `questions`
--
ALTER TABLE `questions`
  ADD PRIMARY KEY (`questionId`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `questions`
--
ALTER TABLE `questions`
  MODIFY `questionId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `ID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
