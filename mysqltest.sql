-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 01, 2015 at 11:58 AM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `mysqltest`
--

-- --------------------------------------------------------

--
-- Table structure for table `lastreadlog`
--

CREATE TABLE IF NOT EXISTS `lastreadlog` (
`id` bigint(20) NOT NULL,
  `sender_username` varchar(300) NOT NULL,
  `receiver_username` varchar(300) NOT NULL,
  `last_read_date` datetime NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `lastreadlog`
--

INSERT INTO `lastreadlog` (`id`, `sender_username`, `receiver_username`, `last_read_date`) VALUES
(1, 'nandish', 'aaa', '2015-10-24 15:10:47'),
(2, 'nandish', 'abc', '2015-10-24 15:00:35'),
(3, 'aaa', 'nandish', '2015-10-24 15:28:22'),
(4, 'aaa', 'abc', '2015-10-24 15:28:23');

-- --------------------------------------------------------

--
-- Table structure for table `message`
--

CREATE TABLE IF NOT EXISTS `message` (
`id` bigint(20) NOT NULL,
  `sender_username` varchar(300) NOT NULL,
  `receiver_username` varchar(300) NOT NULL,
  `content` varchar(10000) NOT NULL,
  `pub_date` datetime NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=29 ;

--
-- Dumping data for table `message`
--

INSERT INTO `message` (`id`, `sender_username`, `receiver_username`, `content`, `pub_date`) VALUES
(1, 'a', 'b', 'zzzzz', '2015-10-17 11:15:06'),
(2, 'b', 'a', 'kem cho', '2015-10-17 11:15:36'),
(3, 'nandish', 'aaa', 'ggg', '2015-10-18 16:43:29'),
(4, 'nandish', 'aaa', 'zzz', '2015-10-18 17:43:58'),
(5, 'nandish', 'aaa', 'how are you', '2015-10-19 21:19:37'),
(6, 'nandish', 'aaa', 'hey', '2015-10-19 21:20:25'),
(7, 'nandish', 'aaa', 'hi', '2015-10-19 21:25:51'),
(8, 'nandish', 'aaa', 'qqq', '2015-10-19 21:27:43'),
(9, 'nandish', 'aaa', '1', '2015-10-19 22:18:17'),
(10, 'nandish', 'aaa', '2', '2015-10-19 22:19:10'),
(11, 'nandish', 'aaa', '3', '2015-10-19 22:22:11'),
(12, 'nandish', 'aaa', '4', '2015-10-19 22:27:33'),
(13, 'aaa', 'nandish', 'kem cho', '2015-10-19 22:27:52'),
(14, 'aaa', 'nandish', 'zzz', '2015-10-19 22:28:44'),
(15, 'aaa', 'nandish', 'bbb', '2015-10-19 22:31:26'),
(16, 'aaa', 'nandish', 'ccc', '2015-10-19 22:46:22'),
(17, 'aaa', 'nandish', 'ddd', '2015-10-19 22:49:26'),
(18, 'aaa', 'nandish', 'eee', '2015-10-19 22:49:59'),
(19, 'aaa', 'nandish', 'fff', '2015-10-19 22:50:43'),
(20, 'aaa', 'nandish', '1', '2015-10-19 22:53:24'),
(21, 'aaa', 'nandish', '2', '2015-10-19 22:54:36'),
(22, 'aaa', 'nandish', '111', '2015-10-19 22:59:33'),
(23, 'nandish', 'aaa', '222', '2015-10-19 23:00:12'),
(24, 'nandish', 'aaa', '333', '2015-10-19 23:00:26'),
(25, 'nandish', 'aaa', 'kem cho', '2015-10-24 12:02:38'),
(26, 'nandish', 'aaa', 'wassup', '2015-10-24 15:01:18'),
(27, 'aaa', 'nandish', 'aa', '2015-10-24 15:10:26'),
(28, 'nandish', 'aaa', 'kkk', '2015-10-24 15:11:21');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
`id` bigint(20) NOT NULL,
  `username` varchar(300) NOT NULL,
  `password` varchar(300) NOT NULL,
  `display_name` varchar(300) NOT NULL,
  `status` varchar(100) NOT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `display_name`, `status`, `create_date`, `update_date`) VALUES
(1, 'nandish', 'nandish', 'Nandish Kotadia', 'ONLINE', '2015-10-16 22:26:24', '2015-10-16 22:26:24'),
(2, 'abc', 'abc', 'Abc Def', 'OFFLINE', '2015-10-16 20:26:24', '2015-10-16 20:26:24'),
(3, 'aaa', 'aaa', 'Aaa', 'ONLINE', '2015-10-16 22:26:24', '2015-10-16 22:26:24');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `lastreadlog`
--
ALTER TABLE `lastreadlog`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `message`
--
ALTER TABLE `message`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `lastreadlog`
--
ALTER TABLE `lastreadlog`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `message`
--
ALTER TABLE `message`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=29;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
