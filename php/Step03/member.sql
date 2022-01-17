-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- 생성 시간: 22-01-17 01:54
-- 서버 버전: 10.4.22-MariaDB
-- PHP 버전: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 데이터베이스: `nam2626`
--

-- --------------------------------------------------------

--
-- 테이블 구조 `member`
--

CREATE TABLE `member` (
  `mid` varchar(30) NOT NULL,
  `passwd` varchar(50) NOT NULL,
  `name` varchar(30) NOT NULL,
  `birth` date NOT NULL,
  `tel` varchar(13) NOT NULL,
  `gender` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 테이블의 덤프 데이터 `member`
--

INSERT INTO `member` (`mid`, `passwd`, `name`, `birth`, `tel`, `gender`) VALUES
('A4549', '123456', '오마리 스펠맨', '1975-11-08', '010-5116-9317', 0),
('B6943', '123456', '변준형', '1966-03-12', '010-5113-8880', 0),
('C3950', '123456', '이정현', '1965-08-14', '010-1455-6638', 0),
('C4041', '123456', '이대성', '1975-10-15', '010-5989-4035', 1),
('G4641', '123456', '아이제아 힉스', '1971-09-11', '010-3926-8813', 1),
('G5602', '123456', '최준용', '1974-09-08', '010-6654-2430', 1),
('H9501', '123456', '두경민', '1975-10-22', '010-1113-4997', 0),
('J2282', '123456', '앤드류 니콜슨', '1972-07-28', '010-3357-8577', 1),
('J2961', '123456', '라건아', '1969-11-20', '010-2163-2624', 1),
('M8968', '123456', '허훈', '1955-08-08', '010-1467-2160', 0),
('N2264', '123456', '아셈 마레이', '1959-10-27', '010-8353-4099', 1),
('P1956', '123456', '캐디 라렌', '1967-05-17', '010-7735-9618', 0),
('U3967', '123456', '자밀 워니', '1954-01-22', '010-1059-4931', 1),
('W5147', '123456', '전성현', '1976-11-21', '010-6183-4909', 0),
('X1617', '123456', '토마스 로빈슨', '1960-06-04', '010-5074-9585', 0),
('Y5081', '123456', '허웅', '1971-11-15', '010-7077-5894', 0);

--
-- 덤프된 테이블의 인덱스
--

--
-- 테이블의 인덱스 `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`mid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
