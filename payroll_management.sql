-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 21, 2025 at 07:02 AM
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
-- Table structure for table `employees`
--

CREATE TABLE `employees` (
  `id` int(11) NOT NULL,
  `uid` int(11) NOT NULL,
  `position` varchar(100) NOT NULL,
  `department` varchar(100) DEFAULT NULL,
  `hire_date` date DEFAULT NULL,
  `salary` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employees`
--

INSERT INTO `employees` (`id`, `uid`, `position`, `department`, `hire_date`, `salary`) VALUES
(2, 29, 'Engineer', 'Engineering', '2025-05-21', 5200.00),
(3, 28, 'Foreman', 'Engineering', '2025-05-21', 4000.00),
(4, 30, 'Mason', 'Engineering', '2025-05-21', 3200.00),
(5, 31, 'Mason', 'Engineering', '2025-05-21', 3200.00),
(6, 32, 'Mason', 'Engineering', '2025-05-21', 3200.00),
(7, 33, 'Contractor', 'Engineering', '2025-05-21', 4800.00),
(8, 36, 'Manager', 'Engineering', '2025-05-21', 9000.00);

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
(326, 'User with ID 34 logged out', '2025-05-19 18:46:12', 34),
(327, 'User with ID 35 logged in', '2025-05-21 09:45:37', 35),
(328, 'User with ID 35 logged in', '2025-05-21 09:46:59', 35),
(329, 'User with ID 35 logged in', '2025-05-21 09:56:25', 35),
(330, 'User with ID 35 logged in', '2025-05-21 09:57:58', 35),
(331, 'User with ID 35 logged in', '2025-05-21 09:58:31', 35),
(332, 'User with ID 35 logged out', '2025-05-21 09:58:46', 35),
(333, 'User with ID 35 logged in', '2025-05-21 09:59:59', 35),
(334, 'User with ID 35 logged out', '2025-05-21 10:01:05', 35),
(335, 'User with ID 35 logged in', '2025-05-21 10:30:24', 35),
(336, 'User with ID 35 logged out', '2025-05-21 10:30:29', 35),
(337, 'User with ID 35 logged in', '2025-05-21 10:31:52', 35),
(338, 'User with ID 35 logged out', '2025-05-21 10:31:59', 35),
(339, 'User with ID 35 logged in', '2025-05-21 10:32:26', 35),
(340, 'User with ID 35 logged out', '2025-05-21 10:32:30', 35),
(341, 'User with ID 35 logged in', '2025-05-21 10:34:00', 35),
(342, 'User with ID 35 logged out', '2025-05-21 10:34:12', 35),
(343, 'User with ID 35 logged in', '2025-05-21 10:35:22', 35),
(344, 'User with ID 35 logged out', '2025-05-21 10:36:53', 35),
(345, 'User with ID 35 logged in', '2025-05-21 10:37:01', 35),
(346, 'User with ID 35 logged out', '2025-05-21 10:37:50', 35),
(347, 'User with ID 35 logged in', '2025-05-21 10:37:57', 35),
(348, 'User with ID 35 logged out', '2025-05-21 10:42:25', 35),
(349, 'User with ID 35 logged in', '2025-05-21 10:44:53', 35),
(350, 'User with ID 35 logged out', '2025-05-21 10:45:02', 35),
(351, 'User with ID 35 logged in', '2025-05-21 10:45:42', 35),
(352, 'User with ID 35 logged in', '2025-05-21 10:46:50', 35),
(353, 'User with ID 35 logged out', '2025-05-21 10:47:23', 35),
(354, 'User with ID 35 logged in', '2025-05-21 11:18:32', 35),
(355, 'User with ID 35 logged in', '2025-05-21 11:19:08', 35),
(356, 'User with ID 35 logged out', '2025-05-21 11:22:21', 35),
(357, 'User with ID 35 logged in', '2025-05-21 11:23:39', 35),
(358, 'User with ID 35 logged out', '2025-05-21 11:26:01', 35),
(359, 'User with ID 35 logged in', '2025-05-21 11:26:58', 35),
(360, 'User with ID 35 logged out', '2025-05-21 11:27:26', 35),
(361, 'User with ID 35 logged in', '2025-05-21 11:31:18', 35),
(362, 'User with ID 35 logged out', '2025-05-21 11:31:22', 35),
(363, 'User with ID 35 logged in', '2025-05-21 11:34:54', 35),
(364, 'User with ID 35 logged in', '2025-05-21 11:36:20', 35),
(365, 'User with ID 35 logged in', '2025-05-21 11:45:38', 35),
(366, 'User with ID 35 logged in', '2025-05-21 11:48:38', 35),
(367, 'User with ID 35 logged out', '2025-05-21 11:50:30', 35),
(368, 'User with ID 35 logged in', '2025-05-21 12:01:54', 35),
(369, 'User with ID 35 logged out', '2025-05-21 12:02:32', 35),
(370, 'User with ID 35 logged in', '2025-05-21 12:04:17', 35),
(371, 'User with ID 35 logged out', '2025-05-21 12:04:48', 35),
(372, 'User with ID 35 logged in', '2025-05-21 12:05:04', 35),
(373, 'User with ID 35 logged out', '2025-05-21 12:05:56', 35),
(374, 'User with ID 35 logged in', '2025-05-21 12:06:31', 35),
(375, 'User with ID 35 logged in', '2025-05-21 12:09:44', 35),
(376, 'User with ID 35 logged out', '2025-05-21 12:09:55', 35),
(377, 'User with ID 35 logged in', '2025-05-21 12:18:23', 35),
(378, 'User with ID 35 logged out', '2025-05-21 12:18:36', 35),
(379, 'User with ID 35 logged in', '2025-05-21 12:18:44', 35),
(380, 'User with ID 35 logged in', '2025-05-21 12:22:07', 35),
(381, 'User with ID 35 logged in', '2025-05-21 12:24:34', 35),
(382, 'User with ID 35 logged in', '2025-05-21 12:26:04', 35),
(383, 'User with ID 35 logged out', '2025-05-21 12:27:22', 35),
(384, 'User with ID 36 logged in', '2025-05-21 12:30:13', 36),
(385, 'User with ID 36 logged out', '2025-05-21 12:31:13', 36),
(386, 'User with ID 36 logged in', '2025-05-21 12:45:38', 36),
(387, 'User with ID 36 logged in', '2025-05-21 12:48:56', 36),
(388, 'User with ID 36 logged out', '2025-05-21 12:49:05', 36),
(389, 'User with ID 36 logged in', '2025-05-21 12:50:12', 36),
(390, 'User with ID 36 logged out', '2025-05-21 12:50:15', 36),
(391, 'User with ID 36 logged in', '2025-05-21 12:50:59', 36),
(392, 'User with ID 35 logged in', '2025-05-21 12:51:38', 35),
(393, 'User with ID 35 logged out', '2025-05-21 12:52:53', 35),
(394, 'User with ID 36 logged in', '2025-05-21 12:52:57', 36),
(395, 'User with ID 36 logged in', '2025-05-21 12:56:06', 36),
(396, 'User with ID 36 logged out', '2025-05-21 12:56:16', 36),
(397, 'User with ID 36 logged in', '2025-05-21 12:56:22', 36),
(398, 'User with ID 36 logged out', '2025-05-21 12:57:05', 36),
(399, 'User with ID 36 logged in', '2025-05-21 12:57:17', 36),
(400, 'User with ID 36 logged out', '2025-05-21 12:57:27', 36),
(401, 'User with ID 36 logged in', '2025-05-21 12:57:58', 36),
(402, 'User with ID 36 logged out', '2025-05-21 12:59:12', 36);

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
-- Table structure for table `payroll`
--

CREATE TABLE `payroll` (
  `payroll_id` int(11) NOT NULL,
  `employee_id` int(11) NOT NULL,
  `pay_period` varchar(255) NOT NULL,
  `gross_salary` decimal(10,2) NOT NULL,
  `deductions` decimal(10,2) DEFAULT 0.00,
  `net_salary` decimal(10,2) NOT NULL,
  `payment_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `payroll`
--

INSERT INTO `payroll` (`payroll_id`, `employee_id`, `pay_period`, `gross_salary`, `deductions`, `net_salary`, `payment_date`) VALUES
(4, 2, '2025-05-21 to 2025-05-25', 5200.00, 1786.00, 3414.00, '2025-05-21'),
(5, 3, '2025-05-21 to 2025-05-25', 4000.00, 1720.00, 2280.00, '2025-05-21'),
(6, 8, '2025-05-21 to 2025-05-25', 9000.00, 1995.00, 7005.00, '2025-05-21');

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
(34, 'ming', 'ming', 'ming', 'mi@gmail.com', 'male', 'User', '2004-12-19', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', 'Active', ' '),
(35, 'Admin', 'HR', 'administrator', 'admin@gmail.com', 'male', 'Admin', '2000-05-10', 'LINbqJZtkCEg+0UEA3+tNO/6S5Rh6YjkxNoHOtUNroI=', 'Active', ' '),
(36, 'User', 'HR', 'user', 'user@gmail.com', 'male', 'User', '2004-01-16', 'LINbqJZtkCEg+0UEA3+tNO/6S5Rh6YjkxNoHOtUNroI=', 'Active', ' ');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employees`
--
ALTER TABLE `employees`
  ADD PRIMARY KEY (`id`),
  ADD KEY `uid` (`uid`);

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
-- Indexes for table `payroll`
--
ALTER TABLE `payroll`
  ADD PRIMARY KEY (`payroll_id`),
  ADD KEY `employee_id` (`employee_id`);

--
-- Indexes for table `recovery`
--
ALTER TABLE `recovery`
  ADD PRIMARY KEY (`rid`),
  ADD KEY `userid` (`userid`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`uid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employees`
--
ALTER TABLE `employees`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `logged`
--
ALTER TABLE `logged`
  MODIFY `lid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=403;

--
-- AUTO_INCREMENT for table `logs`
--
ALTER TABLE `logs`
  MODIFY `lid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=218;

--
-- AUTO_INCREMENT for table `payroll`
--
ALTER TABLE `payroll`
  MODIFY `payroll_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `recovery`
--
ALTER TABLE `recovery`
  MODIFY `rid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `uid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `employees`
--
ALTER TABLE `employees`
  ADD CONSTRAINT `employees_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `users` (`uid`) ON DELETE CASCADE ON UPDATE CASCADE;

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
-- Constraints for table `payroll`
--
ALTER TABLE `payroll`
  ADD CONSTRAINT `payroll_ibfk_1` FOREIGN KEY (`employee_id`) REFERENCES `employees` (`id`);

--
-- Constraints for table `recovery`
--
ALTER TABLE `recovery`
  ADD CONSTRAINT `uid` FOREIGN KEY (`userid`) REFERENCES `users` (`uid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
