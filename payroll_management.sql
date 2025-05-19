-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 19, 2025 at 12:49 PM
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
-- Database: `payroll_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `logged`
--

CREATE TABLE `logged` (
  `lid` int(10) NOT NULL,
  `action` varchar(255) NOT NULL,
  `date` datetime NOT NULL,
  `userid` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `logged`
--

INSERT INTO `logged` (`lid`, `action`, `date`, `userid`) VALUES
(121, 'User with ID 29 logged in', '2025-05-18 12:32:09', 29),
(122, 'User with ID 29 logged out', '2025-05-18 12:33:08', 29),
(123, 'User with ID 29 logged in', '2025-05-18 12:33:14', 29),
(124, 'User with ID 29 logged in', '2025-05-18 12:35:24', 29),
(125, 'User with ID 29 logged out', '2025-05-18 12:39:23', 29),
(126, 'User with ID 29 logged in', '2025-05-18 12:41:52', 29),
(127, 'User with ID 29 logged out', '2025-05-18 12:42:27', 29),
(128, 'User with ID 29 logged in', '2025-05-18 12:43:34', 29),
(129, 'User with ID 29 logged in', '2025-05-18 12:46:46', 29),
(130, 'User with ID 29 logged out', '2025-05-18 12:47:43', 29),
(131, 'User with ID 29 logged out', '2025-05-18 13:03:18', 29),
(132, 'User with ID 29 logged in', '2025-05-18 13:03:31', 29),
(133, 'User with ID 29 logged out', '2025-05-18 13:05:34', 29),
(134, 'User with ID 29 logged in', '2025-05-18 13:05:44', 29),
(135, 'User with ID 29 logged in', '2025-05-18 13:06:22', 29),
(136, 'User with ID 29 logged in', '2025-05-18 13:08:58', 29),
(137, 'User with ID 29 logged out', '2025-05-18 13:09:06', 29),
(138, 'User with ID 29 logged in', '2025-05-18 13:09:42', 29),
(139, 'User with ID 29 logged out', '2025-05-18 13:09:48', 29),
(140, 'User with ID 29 logged in', '2025-05-18 13:11:23', 29),
(141, 'User with ID 29 logged out', '2025-05-18 13:11:27', 29),
(142, 'User with ID 29 logged in', '2025-05-18 13:12:39', 29),
(143, 'User with ID 29 logged out', '2025-05-18 13:12:50', 29),
(144, 'User with ID 29 logged in', '2025-05-18 13:15:58', 29),
(145, 'User with ID 29 logged in', '2025-05-18 13:17:17', 29),
(146, 'User with ID 29 logged in', '2025-05-18 13:18:19', 29),
(147, 'User with ID 29 logged out', '2025-05-18 13:18:31', 29),
(148, 'User with ID 29 logged in', '2025-05-18 13:19:08', 29),
(149, 'User with ID 29 logged out', '2025-05-18 13:19:32', 29),
(150, 'User with ID 29 logged in', '2025-05-18 13:19:39', 29),
(151, 'User with ID 29 logged in', '2025-05-18 13:20:32', 29),
(152, 'User with ID 29 logged out', '2025-05-18 13:20:55', 29),
(153, 'User with ID 29 logged in', '2025-05-18 13:21:07', 29),
(154, 'User with ID 29 logged in', '2025-05-18 13:21:43', 29),
(155, 'User with ID 29 logged out', '2025-05-18 13:22:05', 29),
(156, 'User with ID 29 logged in', '2025-05-18 13:22:12', 29),
(157, 'User with ID 29 logged out', '2025-05-18 13:22:31', 29),
(158, 'User with ID 29 logged in', '2025-05-18 13:22:57', 29),
(159, 'User with ID 29 logged out', '2025-05-18 13:27:10', 29),
(160, 'User with ID 29 logged in', '2025-05-18 13:27:22', 29),
(161, 'User with ID 29 logged in', '2025-05-18 13:29:05', 29),
(162, 'User with ID 29 logged in', '2025-05-18 13:30:47', 29),
(163, 'User with ID 29 logged out', '2025-05-18 13:31:29', 29),
(164, 'User with ID 29 logged in', '2025-05-18 13:31:51', 29),
(165, 'User with ID 29 logged out', '2025-05-18 13:33:07', 29),
(166, 'User with ID 29 logged in', '2025-05-18 13:33:22', 29),
(167, 'User with ID 29 logged in', '2025-05-18 13:35:10', 29),
(168, 'User with ID 29 logged out', '2025-05-18 13:35:24', 29),
(169, 'User with ID 29 logged in', '2025-05-18 13:35:30', 29),
(170, 'User with ID 29 logged in', '2025-05-18 13:38:45', 29),
(171, 'User with ID 29 logged out', '2025-05-18 13:39:00', 29),
(172, 'User with ID 29 logged in', '2025-05-18 13:40:52', 29),
(173, 'User with ID 29 logged out', '2025-05-18 13:40:58', 29),
(174, 'User with ID 29 logged in', '2025-05-18 13:42:56', 29),
(175, 'User with ID 29 logged out', '2025-05-18 13:43:02', 29),
(176, 'User with ID 29 logged in', '2025-05-18 13:44:19', 29),
(177, 'User with ID 29 logged in', '2025-05-18 13:46:31', 29),
(178, 'User with ID 30 logged in', '2025-05-18 13:48:39', 30),
(179, 'User with ID 30 logged in', '2025-05-18 13:50:16', 30),
(180, 'User with ID 30 logged out', '2025-05-18 13:51:19', 30),
(181, 'User with ID 30 logged in', '2025-05-18 13:51:54', 30),
(182, 'User with ID 30 logged out', '2025-05-18 13:52:13', 30),
(183, 'User with ID 30 logged in', '2025-05-18 13:57:20', 30),
(184, 'User with ID 30 logged out', '2025-05-18 13:57:29', 30),
(185, 'User with ID 30 logged in', '2025-05-18 13:59:33', 30),
(186, 'User with ID 30 logged out', '2025-05-18 13:59:51', 30),
(187, 'User with ID 30 logged in', '2025-05-18 14:01:37', 30),
(188, 'User with ID 30 logged out', '2025-05-18 14:01:48', 30),
(189, 'User with ID 30 logged in', '2025-05-18 14:02:25', 30),
(190, 'User with ID 30 logged out', '2025-05-18 14:02:53', 30),
(191, 'User with ID 30 logged in', '2025-05-18 14:03:57', 30),
(192, 'User with ID 30 logged out', '2025-05-18 14:05:30', 30),
(193, 'User with ID 30 logged in', '2025-05-18 14:07:39', 30),
(194, 'User with ID 30 logged out', '2025-05-18 14:08:01', 30),
(195, 'User with ID 29 logged in', '2025-05-18 14:08:28', 29),
(196, 'User with ID 29 logged in', '2025-05-18 14:17:36', 29),
(197, 'User with ID 29 logged in', '2025-05-18 14:19:23', 29),
(198, 'User with ID 29 logged in', '2025-05-18 14:21:12', 29),
(199, 'User with ID 29 logged in', '2025-05-19 05:08:51', 29),
(200, 'User with ID 29 logged in', '2025-05-19 05:10:17', 29),
(201, 'User with ID 29 logged out', '2025-05-19 05:11:29', 29),
(202, 'User with ID 29 logged in', '2025-05-19 05:12:04', 29),
(203, 'User with ID 29 logged out', '2025-05-19 05:14:01', 29),
(204, 'User with ID 29 logged in', '2025-05-19 05:14:56', 29),
(205, 'User with ID 29 logged in', '2025-05-19 05:17:48', 29),
(206, 'User with ID 29 logged out', '2025-05-19 05:29:08', 29),
(207, 'User with ID 30 logged in', '2025-05-19 05:29:16', 30),
(208, 'User with ID 29 logged in', '2025-05-19 05:31:40', 29),
(209, 'User with ID 29 logged in', '2025-05-19 05:46:54', 29),
(210, 'User with ID 29 logged out', '2025-05-19 05:53:47', 29),
(211, 'User with ID 29 logged in', '2025-05-19 05:53:54', 29),
(212, 'User with ID 29 logged out', '2025-05-19 05:54:25', 29),
(213, 'User with ID 29 logged in', '2025-05-19 06:17:08', 29),
(214, 'User with ID 29 logged out', '2025-05-19 06:17:41', 29),
(215, 'User with ID 29 logged in', '2025-05-19 06:22:56', 29),
(216, 'User with ID 29 logged out', '2025-05-19 06:23:23', 29),
(217, 'User with ID 32 logged in', '2025-05-19 06:23:29', 32),
(218, 'User with ID 32 logged out', '2025-05-19 06:24:15', 32),
(219, 'User with ID 32 logged in', '2025-05-19 06:25:10', 32),
(220, 'User with ID 32 logged out', '2025-05-19 06:25:31', 32),
(221, 'User with ID 29 logged in', '2025-05-19 06:38:10', 29),
(222, 'User with ID 29 logged in', '2025-05-19 06:40:58', 29),
(223, 'User with ID 29 logged out', '2025-05-19 06:43:18', 29),
(224, 'User with ID 29 logged in', '2025-05-19 07:30:48', 29),
(225, 'User with ID 29 logged in', '2025-05-19 10:41:49', 29),
(226, 'User with ID 30 logged in', '2025-05-19 10:53:41', 30),
(227, 'User with ID 30 logged in', '2025-05-19 10:57:16', 30),
(228, 'User with ID 30 logged out', '2025-05-19 10:57:47', 30),
(229, 'User with ID 30 logged in', '2025-05-19 10:58:26', 30),
(230, 'User with ID 29 logged in', '2025-05-19 10:59:22', 29),
(231, 'User with ID 29 logged out', '2025-05-19 11:00:44', 29),
(232, 'User with ID 33 logged in', '2025-05-19 11:00:51', 33),
(233, 'User with ID 33 logged out', '2025-05-19 11:00:56', 33),
(234, 'User with ID 29 logged in', '2025-05-19 11:03:39', 29),
(235, 'User with ID 29 logged out', '2025-05-19 11:03:49', 29),
(236, 'User with ID 30 logged out', '2025-05-19 11:04:25', 30),
(237, 'User with ID 29 logged in', '2025-05-19 11:04:35', 29),
(238, 'User with ID 29 logged in', '2025-05-19 11:06:08', 29),
(239, 'User with ID 29 logged out', '2025-05-19 11:06:20', 29),
(240, 'User with ID 29 logged in', '2025-05-19 11:07:01', 29),
(241, 'User with ID 29 logged out', '2025-05-19 11:08:00', 29),
(242, 'User with ID 30 logged in', '2025-05-19 11:10:58', 30),
(243, 'User with ID 30 logged out', '2025-05-19 11:11:03', 30),
(244, 'User with ID 30 logged in', '2025-05-19 11:11:39', 30),
(245, 'User with ID 30 logged in', '2025-05-19 11:12:50', 30),
(246, 'User with ID 30 logged out', '2025-05-19 11:12:55', 30),
(247, 'User with ID 29 logged in', '2025-05-19 11:28:44', 29),
(248, 'User with ID 29 logged out', '2025-05-19 11:28:52', 29),
(249, 'User with ID 29 logged in', '2025-05-19 11:44:46', 29),
(250, 'User with ID 29 logged out', '2025-05-19 11:45:08', 29),
(251, 'User with ID 29 logged in', '2025-05-19 12:01:33', 29),
(252, 'User with ID 29 logged in', '2025-05-19 12:03:14', 29),
(253, 'User with ID 29 logged in', '2025-05-19 12:04:59', 29),
(254, 'User with ID 29 logged in', '2025-05-19 12:05:36', 29),
(255, 'User with ID 29 logged in', '2025-05-19 12:08:08', 29),
(256, 'User with ID 29 logged in', '2025-05-19 12:08:57', 29),
(257, 'User with ID 29 logged out', '2025-05-19 12:09:01', 29),
(258, 'User with ID 29 logged in', '2025-05-19 12:10:27', 29),
(259, 'User with ID 29 logged in', '2025-05-19 12:11:56', 29),
(260, 'User with ID 29 logged in', '2025-05-19 12:19:10', 29),
(261, 'User with ID 29 logged in', '2025-05-19 12:20:47', 29),
(262, 'User with ID 29 logged in', '2025-05-19 12:23:34', 29),
(263, 'User with ID 29 logged in', '2025-05-19 12:30:42', 29),
(264, 'User with ID 29 logged in', '2025-05-19 12:37:24', 29),
(265, 'User with ID 29 logged in', '2025-05-19 12:50:40', 29),
(266, 'User with ID 29 logged in', '2025-05-19 12:55:25', 29),
(267, 'User with ID 29 logged in', '2025-05-19 12:58:04', 29),
(268, 'User with ID 29 logged in', '2025-05-19 12:59:34', 29),
(269, 'User with ID 29 logged in', '2025-05-19 13:01:17', 29),
(270, 'User with ID 29 logged in', '2025-05-19 13:05:01', 29),
(271, 'User with ID 29 logged in', '2025-05-19 13:06:21', 29),
(272, 'User with ID 29 logged in', '2025-05-19 13:08:55', 29),
(273, 'User with ID 29 logged in', '2025-05-19 13:09:48', 29),
(274, 'User with ID 29 logged in', '2025-05-19 13:11:08', 29),
(275, 'User with ID 29 logged out', '2025-05-19 13:11:59', 29),
(276, 'User with ID 29 logged in', '2025-05-19 13:17:10', 29),
(277, 'User with ID 29 logged in', '2025-05-19 13:19:31', 29),
(278, 'User with ID 29 logged in', '2025-05-19 13:20:11', 29),
(279, 'User with ID 29 logged in', '2025-05-19 13:25:10', 29),
(280, 'User with ID 29 logged out', '2025-05-19 13:28:21', 29),
(281, 'User with ID 29 logged in', '2025-05-19 13:28:49', 29),
(282, 'User with ID 29 logged in', '2025-05-19 13:30:57', 29),
(283, 'User with ID 29 logged in', '2025-05-19 13:32:23', 29),
(284, 'User with ID 29 logged in', '2025-05-19 13:33:01', 29),
(285, 'User with ID 29 logged in', '2025-05-19 13:34:08', 29),
(286, 'User with ID 29 logged in', '2025-05-19 13:40:08', 29),
(287, 'User with ID 29 logged in', '2025-05-19 13:41:53', 29),
(288, 'User with ID 29 logged in', '2025-05-19 13:44:11', 29),
(289, 'User with ID 29 logged in', '2025-05-19 13:46:17', 29),
(290, 'User with ID 29 logged in', '2025-05-19 13:47:24', 29),
(291, 'User with ID 29 logged in', '2025-05-19 13:49:21', 29),
(292, 'User with ID 29 logged in', '2025-05-19 14:13:31', 29),
(293, 'User with ID 29 logged out', '2025-05-19 14:14:41', 29),
(294, 'User with ID 29 logged in', '2025-05-19 14:18:30', 29),
(295, 'User with ID 29 logged in', '2025-05-19 14:21:27', 29),
(296, 'User with ID 29 logged in', '2025-05-19 14:23:34', 29),
(297, 'User with ID 30 logged in', '2025-05-19 14:38:31', 30),
(298, 'User with ID 30 logged in', '2025-05-19 14:38:59', 30),
(299, 'User with ID 30 logged out', '2025-05-19 14:39:29', 30),
(300, 'User with ID 29 logged in', '2025-05-19 14:40:43', 29),
(301, 'User with ID 29 logged in', '2025-05-19 16:41:02', 29),
(302, 'User with ID 29 logged out', '2025-05-19 16:41:15', 29),
(303, 'User with ID 30 logged in', '2025-05-19 16:41:20', 30),
(304, 'User with ID 30 logged out', '2025-05-19 16:41:33', 30),
(305, 'User with ID 29 logged in', '2025-05-19 17:23:46', 29),
(306, 'User with ID 29 logged out', '2025-05-19 17:24:07', 29),
(307, 'User with ID 30 logged in', '2025-05-19 17:24:16', 30),
(308, 'User with ID 29 logged in', '2025-05-19 17:41:20', 29),
(309, 'User with ID 29 logged in', '2025-05-19 17:41:45', 29),
(310, 'User with ID 29 logged out', '2025-05-19 17:42:57', 29),
(311, 'User with ID 29 logged out', '2025-05-19 17:50:12', 29),
(312, 'User with ID 30 logged in', '2025-05-19 17:50:27', 30),
(313, 'User with ID 30 logged out', '2025-05-19 18:00:46', 30),
(314, 'User with ID 29 logged in', '2025-05-19 18:18:21', 29),
(315, 'User with ID 29 logged out', '2025-05-19 18:18:24', 29),
(316, 'User with ID 29 logged in', '2025-05-19 18:28:49', 29),
(317, 'User with ID 29 logged in', '2025-05-19 18:42:45', 29),
(318, 'User with ID 29 logged in', '2025-05-19 18:43:42', 29),
(319, 'User with ID 29 logged out', '2025-05-19 18:43:51', 29),
(320, 'User with ID 29 logged in', '2025-05-19 18:44:13', 29),
(321, 'User with ID 29 logged out', '2025-05-19 18:44:24', 29),
(322, 'User with ID 29 logged in', '2025-05-19 18:45:04', 29),
(323, 'User with ID 29 logged in', '2025-05-19 18:45:27', 29),
(324, 'User with ID 29 logged out', '2025-05-19 18:45:55', 29),
(325, 'User with ID 34 logged in', '2025-05-19 18:45:59', 34),
(326, 'User with ID 34 logged out', '2025-05-19 18:46:12', 34);

-- --------------------------------------------------------

--
-- Table structure for table `logs`
--

CREATE TABLE `logs` (
  `lid` int(10) NOT NULL,
  `action` varchar(255) NOT NULL,
  `date` datetime NOT NULL,
  `user_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `logs`
--

INSERT INTO `logs` (`lid`, `action`, `date`, `user_id`) VALUES
(193, 'Deleted users with ID No.: 11', '2025-05-18 14:22:21', 29),
(194, 'Deleted users with ID No.: 11', '2025-05-18 14:22:24', 29),
(195, 'Deleted users with ID No.: 11', '2025-05-18 14:22:30', 29),
(196, 'Deleted users with ID No.: 11', '2025-05-18 14:22:39', 29),
(197, 'Updated user with ID No.: 28', '2025-05-19 05:10:40', 29),
(198, 'Updated user with ID No.: 27', '2025-05-19 05:11:21', 29),
(199, 'Created user account ID: 31', '2025-05-19 05:13:24', 29),
(200, 'Deleted users with ID No.: 15', '2025-05-19 05:15:17', 29),
(201, 'Deleted users with ID No.: 15', '2025-05-19 05:15:18', 29),
(202, 'Deleted users with ID No.: 15', '2025-05-19 05:15:21', 29),
(203, 'Deleted users with ID No.: 5', '2025-05-19 05:18:03', 29),
(204, 'Deleted users with ID No.: 5', '2025-05-19 05:20:15', 29),
(205, 'Deleted users with ID No.: 5', '2025-05-19 05:26:30', 29),
(206, 'Deleted users with ID No.: 5', '2025-05-19 05:26:32', 29),
(207, 'Deleted users with ID No.: 12', '2025-05-19 05:27:00', 29),
(208, 'Deleted users with ID No.: 12', '2025-05-19 05:27:00', 29),
(209, 'Deleted users with ID No.: 5', '2025-05-19 05:31:54', 29),
(210, 'Deleted users with ID No.: 9', '2025-05-19 05:47:05', 29),
(211, 'Deleted users with ID No.: 10', '2025-05-19 05:47:15', 29),
(212, 'Deleted users with ID No.: 5', '2025-05-19 05:47:34', 29),
(213, 'Deleted users with ID No.: 5', '2025-05-19 05:47:38', 29),
(214, 'Deleted users with ID No.: 27', '2025-05-19 05:47:47', 29),
(215, 'Updated user with ID No.: 32', '2025-05-19 06:23:20', 29),
(216, 'Created user account ID: 33', '2025-05-19 11:00:10', 29),
(217, 'Updated user with ID No.: 28', '2025-05-19 11:07:46', 29);

-- --------------------------------------------------------

--
-- Table structure for table `recovery`
--

CREATE TABLE `recovery` (
  `rid` int(10) NOT NULL,
  `userid` int(10) NOT NULL,
  `answer1` varchar(255) NOT NULL,
  `answer2` varchar(255) NOT NULL,
  `answer3` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `recovery`
--

INSERT INTO `recovery` (`rid`, `userid`, `answer1`, `answer2`, `answer3`) VALUES
(5, 29, 'matug', 'humba', 'blue'),
(6, 32, 'matug', 'm', 'b');

-- --------------------------------------------------------

--
-- Table structure for table `staff_information`
--

CREATE TABLE `staff_information` (
  `id` int(11) NOT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `surname` varchar(255) DEFAULT NULL,
  `Dob` int(11) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `Telephone` varchar(20) DEFAULT NULL,
  `Address` varchar(255) DEFAULT NULL,
  `Department` varchar(255) DEFAULT NULL,
  `Image` blob DEFAULT NULL,
  `Gender` char(1) DEFAULT NULL,
  `Salary` varchar(20) DEFAULT NULL,
  `Address2` varchar(255) DEFAULT NULL,
  `Apartment` varchar(255) DEFAULT NULL,
  `Post_code` varchar(20) DEFAULT NULL,
  `Designation` varchar(255) DEFAULT NULL,
  `Status` varchar(20) DEFAULT NULL,
  `Date_hired` varchar(20) DEFAULT NULL,
  `job_title` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `uid` int(10) NOT NULL,
  `fname` varchar(255) NOT NULL,
  `lname` varchar(255) NOT NULL,
  `ussername` varchar(255) NOT NULL,
  `useremail` varchar(255) NOT NULL,
  `sex` varchar(255) NOT NULL,
  `utype` varchar(50) NOT NULL,
  `birthdate` varchar(50) NOT NULL,
  `password` varchar(150) NOT NULL,
  `stats` varchar(50) NOT NULL,
  `Uimage` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`uid`, `fname`, `lname`, `ussername`, `useremail`, `sex`, `utype`, `birthdate`, `password`, `stats`, `Uimage`) VALUES
(28, 'jack', 'lol', 'lols', 'r@yahoo.com', 'male', 'User', '2004-12-23', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', 'Active', ' '),
(29, 'Andre', 'Estrera', 'Andre', 'andr@gmail.com', 'male', 'Admin', '2004-12-19', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', 'Active', 'src/images/Screenshot 2025-05-19 061352.png'),
(30, 'lolalll', 'lolo', 'lolo', 'laaa@gmail.com', 'male', 'User', '1995-12-18', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', 'Active', ' '),
(31, 'ka', 'kaka', 'ko', 'a@gmail.com', 'male', 'User', '2004-12-19', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', 'Active', 'src/images/22f94677-5769-4c10-9cb2-dffeebc6c054.jpg'),
(32, 'lola', 'lola', 'lola', 'lol@gmail.com', 'male', 'User', '1997-01-12', 'FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=', 'Active', ' '),
(33, 'tata', 'canoy', 'tata', 'tata@gmail.com', 'male', 'User', '2004-12-19', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', 'Active', ''),
(34, 'ming', 'ming', 'ming', 'mi@gmail.com', 'male', 'User', '2004-12-19', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', 'Active', ' ');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `logged`
--
ALTER TABLE `logged`
  ADD PRIMARY KEY (`lid`),
  ADD KEY `user_id` (`userid`);

--
-- Indexes for table `logs`
--
ALTER TABLE `logs`
  ADD PRIMARY KEY (`lid`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `recovery`
--
ALTER TABLE `recovery`
  ADD PRIMARY KEY (`rid`),
  ADD KEY `userid` (`userid`);

--
-- Indexes for table `staff_information`
--
ALTER TABLE `staff_information`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`uid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `logged`
--
ALTER TABLE `logged`
  MODIFY `lid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=327;

--
-- AUTO_INCREMENT for table `logs`
--
ALTER TABLE `logs`
  MODIFY `lid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=218;

--
-- AUTO_INCREMENT for table `recovery`
--
ALTER TABLE `recovery`
  MODIFY `rid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `staff_information`
--
ALTER TABLE `staff_information`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `uid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `logged`
--
ALTER TABLE `logged`
  ADD CONSTRAINT `userid` FOREIGN KEY (`userid`) REFERENCES `users` (`uid`);

--
-- Constraints for table `logs`
--
ALTER TABLE `logs`
  ADD CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `users` (`uid`);

--
-- Constraints for table `recovery`
--
ALTER TABLE `recovery`
  ADD CONSTRAINT `uid` FOREIGN KEY (`userid`) REFERENCES `users` (`uid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
