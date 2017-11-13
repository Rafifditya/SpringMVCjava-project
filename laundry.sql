-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 13, 2017 at 03:12 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `laundry`
--

-- --------------------------------------------------------

--
-- Table structure for table `detail_laundry`
--

CREATE TABLE `detail_laundry` (
  `id_detail_laundry` int(7) NOT NULL,
  `id_laundry` varchar(15) NOT NULL,
  `berat` int(5) NOT NULL,
  `waktu` int(5) NOT NULL,
  `total` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `jenis_jasa`
--

CREATE TABLE `jenis_jasa` (
  `id_jenis_jasa` int(5) NOT NULL,
  `nama` varchar(250) NOT NULL,
  `harga` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jenis_jasa`
--

INSERT INTO `jenis_jasa` (`id_jenis_jasa`, `nama`, `harga`) VALUES
(1, 'cuci strika express', 8000),
(2, 'cuci strika', 6000),
(3, 'cuci aja', 3500);

-- --------------------------------------------------------

--
-- Table structure for table `laundry`
--

CREATE TABLE `laundry` (
  `id_laundry` varchar(15) NOT NULL,
  `id_jenisjasa` int(5) NOT NULL,
  `id_pelanggan` varchar(15) NOT NULL,
  `id_petugas` int(11) NOT NULL,
  `tgl_laundry` datetime NOT NULL,
  `status` int(5) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `laundry`
--

INSERT INTO `laundry` (`id_laundry`, `id_jenisjasa`, `id_pelanggan`, `id_petugas`, `tgl_laundry`, `status`, `id`) VALUES
('2LL1', 2, 'LL1', 0, '2017-07-24 13:49:15', 1, 1),
('3LL2', 3, 'LL2', 0, '2017-07-24 14:07:42', 1, 2),
('1LL3', 1, 'LL3', 0, '2017-07-24 14:18:51', 1, 3),
('2LL3', 2, 'LL3', 0, '2017-07-24 14:21:18', 1, 4);

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `id` int(11) NOT NULL,
  `id_u` varchar(7) NOT NULL,
  `nama_u` varchar(50) NOT NULL,
  `alamat_u` varchar(150) NOT NULL,
  `username_u` varchar(50) NOT NULL,
  `nohp_u` int(13) NOT NULL,
  `email_u` varchar(50) NOT NULL,
  `password_u` varchar(50) NOT NULL,
  `active` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`id`, `id_u`, `nama_u`, `alamat_u`, `username_u`, `nohp_u`, `email_u`, `password_u`, `active`) VALUES
(1, 'LL1', 'rafif', 'dadad', 'rafifditya', 0, 'rafif@gmail.com', 'rafif', 1),
(2, 'LL2', 'maya', 'alamat ini', 'mayani', 0, 'example@dddd.com', 'maya', 1),
(3, 'LL3', 'adit', 'gggg', 'adit', 0, 'adit@email.com', 'ADIT', 1);

-- --------------------------------------------------------

--
-- Table structure for table `pembayaran`
--

CREATE TABLE `pembayaran` (
  `id_pembayaran` varchar(15) NOT NULL,
  `id_laundry` varchar(15) NOT NULL,
  `id_petugas` int(7) NOT NULL,
  `total_pembayaran` int(10) NOT NULL,
  `tgl_pembayaran` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE `petugas` (
  `id_p` int(11) NOT NULL,
  `nama_p` varchar(50) NOT NULL,
  `username_p` varchar(50) NOT NULL,
  `password_p` varchar(50) NOT NULL,
  `alamat_p` varchar(50) NOT NULL,
  `nohp_p` int(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `petugas`
--

INSERT INTO `petugas` (`id_p`, `nama_p`, `username_p`, `password_p`, `alamat_p`, `nohp_p`) VALUES
(1, 'henriyanto', 'henrito', 'henri', 'dadadada', 888338382),
(4, 'adi brototo', 'adibro', 'adi', 'ini alamat', 29299),
(5, 'ikbar toto', 'ikbar', 'ikbar', 'ini', 908088080);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `detail_laundry`
--
ALTER TABLE `detail_laundry`
  ADD PRIMARY KEY (`id_detail_laundry`),
  ADD KEY `id_laundry` (`id_laundry`);

--
-- Indexes for table `jenis_jasa`
--
ALTER TABLE `jenis_jasa`
  ADD PRIMARY KEY (`id_jenis_jasa`);

--
-- Indexes for table `laundry`
--
ALTER TABLE `laundry`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD PRIMARY KEY (`id_pembayaran`),
  ADD KEY `id_laundry` (`id_laundry`),
  ADD KEY `id_petugas` (`id_petugas`);

--
-- Indexes for table `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`id_p`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `laundry`
--
ALTER TABLE `laundry`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `pelanggan`
--
ALTER TABLE `pelanggan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `petugas`
--
ALTER TABLE `petugas`
  MODIFY `id_p` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
