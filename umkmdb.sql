-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 09, 2024 at 04:25 AM
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
-- Database: `umkmdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `nama_user` varchar(255) DEFAULT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `nama_user`, `username`, `password`) VALUES
(1, 'Administrator', 'administrator', '21232f297a57a5a743894a0e4a801fc3'),
(2, 'Rifqi', 'rifqi', '72561baf6079c338cc2dd68e98d52055'),
(3, 'Isa', 'isa', '165a1761634db1e9bd304ea6f3ffcf2b'),
(4, 'Ryandi', 'ryandi', '12053544b8b6a940497f49204d43396e'),
(5, 'Adel', 'adel', '94c93d4f9686cfeae29e9cbc3230cbf9'),
(6, 'Alex', 'alex', '534b44a19bf18d20b71ecc4eb77c572f'),
(7, 'Fendi', 'fendi', 'e8d19ca781aa79f0ac206dcdfb632cb9'),
(8, 'Anwar', 'anwar', '46d923d9b44b8aaaf3179c5f6f7adf81');

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `id` bigint(20) NOT NULL,
  `kode` varchar(255) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `harga_jual` decimal(16,2) DEFAULT NULL,
  `kategori` varchar(255) DEFAULT NULL,
  `satuan_barang` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`id`, `kode`, `nama`, `harga_jual`, `kategori`, `satuan_barang`) VALUES
(1, 'BRG000', 'Kursi', 12000.00, 'Perabotan', 'pcs'),
(2, 'BRG001', 'Pensil HB', 1500.00, 'Alat Tulis', 'pcs'),
(3, 'BRG002', 'Buku Tulis 40 Lembar', 5000.00, 'Alat Tulis', 'pcs'),
(4, 'BRG003', 'Penggaris 30 cm', 2500.00, 'Alat Tulis', 'pcs'),
(5, 'BRG004', 'Penghapus', 1000.00, 'Alat Tulis', 'pcs'),
(6, 'BRG005', 'Spidol Hitam', 3500.00, 'Alat Tulis', 'pcs'),
(7, 'BRG006', 'Tipe-X', 4000.00, 'Alat Tulis', 'pcs'),
(8, 'BRG007', 'Stapler', 12000.00, 'Alat Kantor', 'pcs'),
(9, 'BRG008', 'Kertas A4 80gsm', 50000.00, 'Alat Kantor', 'rim'),
(10, 'BRG009', 'Klip Kertas', 1500.00, 'Alat Kantor', 'box'),
(11, 'BRG010', 'Map Plastik', 2000.00, 'Alat Kantor', 'pcs'),
(12, 'BRG011', 'Ballpoint', 2500.00, 'Alat Tulis', 'pcs'),
(13, 'BRG012', 'Amplop Coklat', 3000.00, 'Alat Kantor', 'pcs'),
(14, 'BRG013', 'Lem Kertas', 2000.00, 'Alat Tulis', 'pcs'),
(15, 'BRG014', 'Cutter', 5000.00, 'Alat Tulis', 'pcs'),
(16, 'BRG015', 'Sampul Buku', 1000.00, 'Alat Tulis', 'pcs'),
(17, 'BRG016', 'Binder Clip', 2500.00, 'Alat Kantor', 'box'),
(18, 'BRG017', 'Kertas HVS A4 70gsm', 45000.00, 'Alat Kantor', 'rim'),
(19, 'BRG018', 'Flashdisk 16GB', 75000.00, 'Elektronik', 'pcs'),
(20, 'BRG019', 'Kabel USB', 25000.00, 'Elektronik', 'pcs'),
(21, 'BRG020', 'Mouse Wireless', 120000.00, 'Elektronik', 'pcs'),
(22, 'BRG021', 'Keyboard', 80000.00, 'Elektronik', 'pcs'),
(23, 'BRG022', 'Monitor LED 21\"', 1500000.00, 'Elektronik', 'pcs'),
(24, 'BRG023', 'Printer Inkjet', 850000.00, 'Elektronik', 'pcs'),
(25, 'BRG024', 'Scanner', 900000.00, 'Elektronik', 'pcs'),
(26, 'BRG025', 'Harddisk Eksternal 1TB', 950000.00, 'Elektronik', 'pcs'),
(27, 'BRG026', 'Laptop', 7500000.00, 'Elektronik', 'pcs'),
(28, 'BRG027', 'Proyektor', 5000000.00, 'Elektronik', 'pcs'),
(29, 'BRG028', 'Speaker Bluetooth', 300000.00, 'Elektronik', 'pcs'),
(30, 'BRG029', 'Kalkulator', 15000.00, 'Alat Kantor', 'pcs'),
(31, 'BRG030', 'Stempel', 10000.00, 'Alat Kantor', 'pcs');

-- --------------------------------------------------------

--
-- Stand-in structure for view `inventory`
-- (See below for the actual view)
--
CREATE TABLE `inventory` (
`barang_id` bigint(20)
,`barang_masuk` decimal(32,0)
,`barang_terjual` decimal(32,0)
,`barang_tersedia` decimal(33,0)
);

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `id` bigint(20) NOT NULL,
  `kode` varchar(255) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `alamat` text NOT NULL,
  `nomor_telp` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`id`, `kode`, `nama`, `alamat`, `nomor_telp`, `email`) VALUES
(1, 'PLG001', 'Isa', 'Jl. Kenangan', '7655', 'isa@gmail.com'),
(3, 'PLG002', 'Adel', 'Jl. Merdeka Barat', '5810', 'adel@gmail.com'),
(7, 'PLG003', 'Rifqi', 'Jl. Swadaya', '6013', 'rifqi@gmail.com'),
(8, 'PLG004', 'Ryandi', 'Jl. Salihara', '7010', 'ryandi@gmail.com'),
(9, 'PLG005', 'Alex', 'Jl. Maritim', '8878', 'alex@gmail.com'),
(10, 'PLG006', 'Fendi', 'Jl. Pakar', '9004', 'fendi@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `pembelian`
--

CREATE TABLE `pembelian` (
  `id` bigint(20) NOT NULL,
  `nomor_transaksi` varchar(255) DEFAULT NULL,
  `tanggal_transaksi` datetime DEFAULT NULL,
  `suplier_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pembelian`
--

INSERT INTO `pembelian` (`id`, `nomor_transaksi`, `tanggal_transaksi`, `suplier_id`) VALUES
(4, 'TRXHUPC0001', '2024-06-08 00:00:00', 4),
(7, 'TRXWNQZ0003', '2024-06-20 00:00:00', 3),
(9, 'TRXKBIL0005', '2024-06-08 00:00:00', 4),
(11, 'TRXKKHN0007', '2024-06-15 00:00:00', 6),
(13, 'TRXCVMM0008', '2024-06-08 00:00:00', 3),
(14, 'TRXSQDH0009', '2024-06-15 00:00:00', 3),
(16, 'TRXOBWM0010', '2024-06-14 00:00:00', 4),
(17, 'TRXNMVR0011', '2024-06-03 00:00:00', 4),
(18, 'TRXSDHM0013', '2024-06-04 00:00:00', 6),
(19, 'TRXXTUV0008', '2024-06-23 00:00:00', 3);

-- --------------------------------------------------------

--
-- Table structure for table `pembelian_barang`
--

CREATE TABLE `pembelian_barang` (
  `id` bigint(20) NOT NULL,
  `pembelian_id` bigint(20) DEFAULT NULL,
  `barang_id` bigint(20) DEFAULT NULL,
  `jumlah_barang` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pembelian_barang`
--

INSERT INTO `pembelian_barang` (`id`, `pembelian_id`, `barang_id`, `jumlah_barang`) VALUES
(1, 4, 4, 4),
(2, 4, 7, 7),
(5, 7, 4, 9),
(6, 7, 8, 7),
(7, 9, 3, 9),
(8, 9, 8, 3),
(9, 11, 5, 12),
(10, 13, 5, 3),
(11, 14, 4, 2),
(12, 16, 4, 3),
(13, 17, 8, 3),
(14, 17, 18, 5),
(15, 18, 7, 2),
(16, 18, 8, 2),
(17, 19, 3, 6),
(18, 19, 5, 5);

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE `penjualan` (
  `id` bigint(20) NOT NULL,
  `nomor_transaksi` varchar(255) DEFAULT NULL,
  `tanggal_transaksi` datetime DEFAULT NULL,
  `pelanggan_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `penjualan`
--

INSERT INTO `penjualan` (`id`, `nomor_transaksi`, `tanggal_transaksi`, `pelanggan_id`) VALUES
(1, 'TRXBROM0001', '2024-06-08 00:00:00', 1),
(2, 'TRXIAVT0003', '2024-06-09 00:00:00', 3),
(5, 'TRXTIAW0004', '2024-06-03 00:00:00', 1),
(6, 'TRXXWFS0006', '2024-05-15 00:00:00', 3),
(7, 'TRXWRQH0008', '2024-06-23 00:00:00', 1);

-- --------------------------------------------------------

--
-- Table structure for table `penjualan_barang`
--

CREATE TABLE `penjualan_barang` (
  `id` bigint(20) NOT NULL,
  `penjualan_id` bigint(20) DEFAULT NULL,
  `barang_id` bigint(20) DEFAULT NULL,
  `jumlah_barang` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `penjualan_barang`
--

INSERT INTO `penjualan_barang` (`id`, `penjualan_id`, `barang_id`, `jumlah_barang`) VALUES
(1, 1, 4, 2),
(2, 1, 5, 2),
(3, 2, 5, 2),
(6, 5, 8, 5),
(7, 5, 7, 2),
(8, 6, 7, 1),
(9, 6, 8, 1),
(10, 7, 13, 3),
(11, 7, 29, 1);

-- --------------------------------------------------------

--
-- Table structure for table `suplier`
--

CREATE TABLE `suplier` (
  `id` bigint(20) NOT NULL,
  `kode` varchar(255) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `nomor_telp` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `suplier`
--

INSERT INTO `suplier` (`id`, `kode`, `nama`, `alamat`, `nomor_telp`, `email`) VALUES
(1, '123ABC', 'PT GUNTUR MELEDUK', 'JL KENANGAN', '123', 'DUAAARR@GMAIL.COM'),
(2, 'ASDFLJASDF2', 'PT SIDOMUNCUL', 'JL KUSUMA NEGARA', '4321', 'SIDOMUNCUL@SIDOMUNCUL.ID'),
(3, 'SUP001', 'PT Sumber Rejeki', 'Jl. Merdeka No. 45, Jakarta', '021-1234567', 'info@sumberrejeki.com'),
(4, 'SUP002', 'CV Makmur Jaya', 'Jl. Kebon Jeruk No. 12, Bandung', '022-7654321', 'contact@makmurjaya.co.id'),
(5, 'SUP003', 'UD Sukses Selalu', 'Jl. Sudirman No. 89, Surabaya', '031-9876543', 'sales@suksesselalu.com'),
(6, 'SUP004', 'PT Maju Bersama', 'Jl. Malioboro No. 30, Yogyakarta', '0274-4567890', 'support@majubersama.com'),
(7, 'SUP005', 'CV Tumbuh Sejahtera', 'Jl. Diponegoro No. 25, Semarang', '024-3344556', 'info@tumbuhsejahtera.com'),
(8, 'SUP006', 'PT Sentosa Abadi', 'Jl. Gatot Subroto No. 100, Medan', '061-1239876', 'admin@sentosaabadi.com'),
(9, 'SUP007', 'UD Berkah Abadi', 'Jl. Ahmad Yani No. 67, Makassar', '0411-7651234', 'contact@berkahabadi.co.id'),
(10, 'SUP008', 'PT Gemilang Jaya', 'Jl. Gajah Mada No. 5, Bali', '0361-9871234', 'info@gemilangjaya.com'),
(11, 'SUP009', 'CV Lancar Terus', 'Jl. Pemuda No. 77, Malang', '0341-4321987', 'support@lancarterus.com'),
(12, 'SUP010', 'UD Mandiri Sentosa', 'Jl. Dipatiukur No. 3, Bogor', '0251-9876543', 'info@mandirisentosa.com'),
(13, 'SUP011', 'PT Cahaya Abadi', 'Jl. Diponegoro No. 101, Jakarta', '021-1111222', 'info@cahayaabadi.com'),
(14, 'SUP012', 'CV Amanah Jaya', 'Jl. Sumatra No. 55, Bandung', '022-3333444', 'contact@amanahjaya.co.id'),
(15, 'SUP013', 'UD Harmoni Sejahtera', 'Jl. Pahlawan No. 23, Surabaya', '031-5555666', 'sales@harmonisejahtera.com'),
(16, 'SUP014', 'PT Unggul Prima', 'Jl. Kebon Sirih No. 60, Yogyakarta', '0274-7777888', 'support@unggulprima.com'),
(17, 'SUP015', 'CV Rajawali Nusantara', 'Jl. Letjen Suprapto No. 18, Semarang', '024-9999000', 'info@rajawalinusantara.com'),
(18, 'SUP016', 'PT Satria Mandiri', 'Jl. Dr. Sutomo No. 34, Medan', '061-8888777', 'admin@satriamandiri.com'),
(19, 'SUP017', 'UD Bersama Maju', 'Jl. Ahmad Yani No. 98, Makassar', '0411-6666555', 'contact@bersamamaju.co.id'),
(20, 'SUP018', 'PT Jaya Abadi', 'Jl. Teuku Umar No. 70, Bali', '0361-4444333', 'info@jayaabadi.com'),
(21, 'SUP019', 'CV Anugerah Sejati', 'Jl. Diponegoro No. 12, Malang', '0341-8888666', 'support@anugerahsejati.com'),
(22, 'SUP020', 'UD Mulia Bersama', 'Jl. Ir. H. Juanda No. 5, Bogor', '0251-7777666', 'info@muliabersama.com'),
(23, 'SUP021', 'PT Sukses Bersama', 'Jl. Kartini No. 10, Jakarta', '021-2222333', 'info@suksesbersama.com'),
(24, 'SUP022', 'CV Utama Sejahtera', 'Jl. Veteran No. 40, Bandung', '022-4444555', 'contact@utamasejahtera.co.id'),
(25, 'SUP023', 'UD Sentosa Sejahtera', 'Jl. Kartini No. 80, Surabaya', '031-6666777', 'sales@sentosasejahtera.com'),
(26, 'SUP024', 'PT Berkah Mandiri', 'Jl. Kenari No. 7, Yogyakarta', '0274-9999111', 'support@berkahmandiri.com'),
(27, 'SUP025', 'CV Prima Sentosa', 'Jl. Letjend Sutoyo No. 22, Semarang', '024-1111333', 'info@primasentosa.com');

-- --------------------------------------------------------

--
-- Structure for view `inventory`
--
DROP TABLE IF EXISTS `inventory`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `inventory`  AS SELECT `b`.`id` AS `barang_id`, ifnull((select sum(`pb`.`jumlah_barang`) AS `barang_masuk` from `pembelian_barang` `pb` where `pb`.`barang_id` = `b`.`id` group by `pb`.`barang_id`),0) AS `barang_masuk`, ifnull((select sum(`pm`.`jumlah_barang`) AS `barang_keluar` from `penjualan_barang` `pm` where `pm`.`barang_id` = `b`.`id` group by `pm`.`barang_id`),0) AS `barang_terjual`, ifnull((select sum(`pb`.`jumlah_barang`) AS `barang_masuk` from `pembelian_barang` `pb` where `pb`.`barang_id` = `b`.`id` group by `pb`.`barang_id`),0) - ifnull((select sum(`pm`.`jumlah_barang`) AS `barang_keluar` from `penjualan_barang` `pm` where `pm`.`barang_id` = `b`.`id` group by `pm`.`barang_id`),0) AS `barang_tersedia` FROM `barang` AS `b` ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `barang_pk` (`kode`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `pelanggan_pk` (`kode`);

--
-- Indexes for table `pembelian`
--
ALTER TABLE `pembelian`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `pembelian_pk` (`nomor_transaksi`),
  ADD KEY `pembelian_suplier_id_fk` (`suplier_id`);

--
-- Indexes for table `pembelian_barang`
--
ALTER TABLE `pembelian_barang`
  ADD PRIMARY KEY (`id`),
  ADD KEY `pembelian_barang___fk` (`barang_id`),
  ADD KEY `pembelian_barang_pembelian_id_fk` (`pembelian_id`);

--
-- Indexes for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `penjualan_pk` (`nomor_transaksi`),
  ADD KEY `penjualan_pelanggan_id_fk` (`pelanggan_id`);

--
-- Indexes for table `penjualan_barang`
--
ALTER TABLE `penjualan_barang`
  ADD PRIMARY KEY (`id`),
  ADD KEY `penjualan_barang_barang_id_fk` (`barang_id`),
  ADD KEY `penjualan_barang_penjualan_id_fk` (`penjualan_id`);

--
-- Indexes for table `suplier`
--
ALTER TABLE `suplier`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `barang`
--
ALTER TABLE `barang`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT for table `pelanggan`
--
ALTER TABLE `pelanggan`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `pembelian`
--
ALTER TABLE `pembelian`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `pembelian_barang`
--
ALTER TABLE `pembelian_barang`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `penjualan`
--
ALTER TABLE `penjualan`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `penjualan_barang`
--
ALTER TABLE `penjualan_barang`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `suplier`
--
ALTER TABLE `suplier`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `pembelian`
--
ALTER TABLE `pembelian`
  ADD CONSTRAINT `pembelian_suplier_id_fk` FOREIGN KEY (`suplier_id`) REFERENCES `suplier` (`id`);

--
-- Constraints for table `pembelian_barang`
--
ALTER TABLE `pembelian_barang`
  ADD CONSTRAINT `pembelian_barang___fk` FOREIGN KEY (`barang_id`) REFERENCES `barang` (`id`),
  ADD CONSTRAINT `pembelian_barang_pembelian_id_fk` FOREIGN KEY (`pembelian_id`) REFERENCES `pembelian` (`id`);

--
-- Constraints for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD CONSTRAINT `penjualan_pelanggan_id_fk` FOREIGN KEY (`pelanggan_id`) REFERENCES `pelanggan` (`id`);

--
-- Constraints for table `penjualan_barang`
--
ALTER TABLE `penjualan_barang`
  ADD CONSTRAINT `penjualan_barang_barang_id_fk` FOREIGN KEY (`barang_id`) REFERENCES `barang` (`id`),
  ADD CONSTRAINT `penjualan_barang_penjualan_id_fk` FOREIGN KEY (`penjualan_id`) REFERENCES `penjualan` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
