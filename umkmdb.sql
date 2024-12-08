-- MariaDB dump 10.19  Distrib 10.4.28-MariaDB, for osx10.10 (x86_64)
--
-- Host: 127.0.0.1    Database: umkmdb
-- ------------------------------------------------------
-- Server version	10.4.28-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama_user` varchar(255) DEFAULT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(300) NOT NULL,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` (`id`, `nama_user`, `username`, `password`, `role`) VALUES (1,'Owner App','owner','5f4dcc3b5aa765d61d8327deb882cf99','OWNER'),(9,'Admin Penjualan','admin','5f4dcc3b5aa765d61d8327deb882cf99','ADMIN');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `barang`
--

DROP TABLE IF EXISTS `barang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `barang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `kode` varchar(255) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `harga_jual` decimal(16,2) DEFAULT NULL,
  `kategori` varchar(255) DEFAULT NULL,
  `satuan_barang` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `barang_pk` (`kode`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `barang`
--

LOCK TABLES `barang` WRITE;
/*!40000 ALTER TABLE `barang` DISABLE KEYS */;
INSERT INTO `barang` (`id`, `kode`, `nama`, `harga_jual`, `kategori`, `satuan_barang`) VALUES (1,'BRG000','Kursi',12000.00,'Perabotan','pcs'),(2,'BRG001','Pensil HB',1500.00,'Alat Tulis','pcs'),(3,'BRG002','Buku Tulis 40 Lembar',5000.00,'Alat Tulis','pcs'),(4,'BRG003','Penggaris 30 cm',2500.00,'Alat Tulis','pcs'),(5,'BRG004','Penghapus',1000.00,'Alat Tulis','pcs'),(6,'BRG005','Spidol Hitam',3500.00,'Alat Tulis','pcs'),(7,'BRG006','Tipe-X',4000.00,'Alat Tulis','pcs'),(8,'BRG007','Stapler',12000.00,'Alat Kantor','pcs'),(9,'BRG008','Kertas A4 80gsm',50000.00,'Alat Kantor','rim'),(10,'BRG009','Klip Kertas',1500.00,'Alat Kantor','box'),(11,'BRG010','Map Plastik',2000.00,'Alat Kantor','pcs'),(12,'BRG011','Ballpoint',2500.00,'Alat Tulis','pcs'),(13,'BRG012','Amplop Coklat',3000.00,'Alat Kantor','pcs'),(14,'BRG013','Lem Kertas',2000.00,'Alat Tulis','pcs'),(15,'BRG014','Cutter',5000.00,'Alat Tulis','pcs'),(16,'BRG015','Sampul Buku',1000.00,'Alat Tulis','pcs'),(17,'BRG016','Binder Clip',2500.00,'Alat Kantor','box'),(18,'BRG017','Kertas HVS A4 70gsm',45000.00,'Alat Kantor','rim'),(19,'BRG018','Flashdisk 16GB',75000.00,'Elektronik','pcs'),(20,'BRG019','Kabel USB',25000.00,'Elektronik','pcs'),(21,'BRG020','Mouse Wireless',120000.00,'Elektronik','pcs'),(22,'BRG021','Keyboard',80000.00,'Elektronik','pcs'),(23,'BRG022','Monitor LED 21\"',1500000.00,'Elektronik','pcs'),(24,'BRG023','Printer Inkjet',850000.00,'Elektronik','pcs'),(25,'BRG024','Scanner',900000.00,'Elektronik','pcs'),(26,'BRG025','Harddisk Eksternal 1TB',950000.00,'Elektronik','pcs'),(27,'BRG026','Laptop',7500000.00,'Elektronik','pcs'),(28,'BRG027','Proyektor',5000000.00,'Elektronik','pcs'),(29,'BRG028','Speaker Bluetooth',300000.00,'Elektronik','pcs'),(30,'BRG029','Kalkulator',15000.00,'Alat Kantor','pcs'),(31,'BRG030','Stempel',10000.00,'Alat Kantor','pcs');
/*!40000 ALTER TABLE `barang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary table structure for view `inventory`
--

DROP TABLE IF EXISTS `inventory`;
/*!50001 DROP VIEW IF EXISTS `inventory`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `inventory` AS SELECT
 1 AS `barang_id`,
  1 AS `barang_masuk`,
  1 AS `barang_terjual`,
  1 AS `barang_tersedia` */;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `pelanggan`
--

DROP TABLE IF EXISTS `pelanggan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pelanggan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `kode` varchar(255) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `alamat` text NOT NULL,
  `nomor_telp` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `pelanggan_pk` (`kode`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pelanggan`
--

LOCK TABLES `pelanggan` WRITE;
/*!40000 ALTER TABLE `pelanggan` DISABLE KEYS */;
INSERT INTO `pelanggan` (`id`, `kode`, `nama`, `alamat`, `nomor_telp`, `email`) VALUES (7,'PLG003','Rifqi','Jl. Swadaya','6013','rifqi@gmail.com'),(8,'PLG004','Ryandi','Jl. Salihara','7010','ryandi@gmail.com'),(9,'PLG005','Alex','Jl. Maritim','8878','alex@gmail.com'),(10,'PLG006','Fendi','Jl. Pakar','9004','fendi@gmail.com');
/*!40000 ALTER TABLE `pelanggan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pembelian`
--

DROP TABLE IF EXISTS `pembelian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pembelian` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nomor_transaksi` varchar(255) DEFAULT NULL,
  `tanggal_transaksi` datetime DEFAULT NULL,
  `suplier_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `pembelian_pk` (`nomor_transaksi`),
  KEY `pembelian_suplier_id_fk` (`suplier_id`),
  CONSTRAINT `pembelian_suplier_id_fk` FOREIGN KEY (`suplier_id`) REFERENCES `suplier` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pembelian`
--

LOCK TABLES `pembelian` WRITE;
/*!40000 ALTER TABLE `pembelian` DISABLE KEYS */;
INSERT INTO `pembelian` (`id`, `nomor_transaksi`, `tanggal_transaksi`, `suplier_id`) VALUES (7,'TRXWNQZ0003','2024-06-20 00:00:00',3),(11,'TRXKKHN0007','2024-06-15 00:00:00',6),(13,'TRXCVMM0008','2024-06-08 00:00:00',3),(14,'TRXSQDH0009','2024-06-15 00:00:00',3);
/*!40000 ALTER TABLE `pembelian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pembelian_barang`
--

DROP TABLE IF EXISTS `pembelian_barang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pembelian_barang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `pembelian_id` bigint(20) DEFAULT NULL,
  `barang_id` bigint(20) DEFAULT NULL,
  `jumlah_barang` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `pembelian_barang___fk` (`barang_id`),
  KEY `pembelian_barang_pembelian_id_fk` (`pembelian_id`),
  CONSTRAINT `pembelian_barang___fk` FOREIGN KEY (`barang_id`) REFERENCES `barang` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `pembelian_barang_pembelian_id_fk` FOREIGN KEY (`pembelian_id`) REFERENCES `pembelian` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pembelian_barang`
--

LOCK TABLES `pembelian_barang` WRITE;
/*!40000 ALTER TABLE `pembelian_barang` DISABLE KEYS */;
INSERT INTO `pembelian_barang` (`id`, `pembelian_id`, `barang_id`, `jumlah_barang`) VALUES (5,7,4,9),(6,7,8,7),(9,11,5,12),(10,13,5,3),(11,14,4,2);
/*!40000 ALTER TABLE `pembelian_barang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `penjualan`
--

DROP TABLE IF EXISTS `penjualan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `penjualan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nomor_transaksi` varchar(255) DEFAULT NULL,
  `tanggal_transaksi` datetime DEFAULT NULL,
  `pelanggan_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `penjualan_pk` (`nomor_transaksi`),
  KEY `penjualan_pelanggan_id_fk` (`pelanggan_id`),
  CONSTRAINT `penjualan_pelanggan_id_fk` FOREIGN KEY (`pelanggan_id`) REFERENCES `pelanggan` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `penjualan`
--

LOCK TABLES `penjualan` WRITE;
/*!40000 ALTER TABLE `penjualan` DISABLE KEYS */;
INSERT INTO `penjualan` (`id`, `nomor_transaksi`, `tanggal_transaksi`, `pelanggan_id`) VALUES (9,'TRXRKKB0003','2024-11-11 00:00:00',9),(10,'TRXWUEX0003','2024-11-14 00:00:00',8);
/*!40000 ALTER TABLE `penjualan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `penjualan_barang`
--

DROP TABLE IF EXISTS `penjualan_barang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `penjualan_barang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `penjualan_id` bigint(20) DEFAULT NULL,
  `barang_id` bigint(20) DEFAULT NULL,
  `jumlah_barang` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `penjualan_barang_barang_id_fk` (`barang_id`),
  KEY `penjualan_barang_penjualan_id_fk` (`penjualan_id`),
  CONSTRAINT `penjualan_barang_barang_id_fk` FOREIGN KEY (`barang_id`) REFERENCES `barang` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `penjualan_barang_penjualan_id_fk` FOREIGN KEY (`penjualan_id`) REFERENCES `penjualan` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `penjualan_barang`
--

LOCK TABLES `penjualan_barang` WRITE;
/*!40000 ALTER TABLE `penjualan_barang` DISABLE KEYS */;
INSERT INTO `penjualan_barang` (`id`, `penjualan_id`, `barang_id`, `jumlah_barang`) VALUES (16,9,5,2),(17,9,28,1),(18,10,3,12);
/*!40000 ALTER TABLE `penjualan_barang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `suplier`
--

DROP TABLE IF EXISTS `suplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `suplier` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `kode` varchar(255) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `nomor_telp` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `suplier`
--

LOCK TABLES `suplier` WRITE;
/*!40000 ALTER TABLE `suplier` DISABLE KEYS */;
INSERT INTO `suplier` (`id`, `kode`, `nama`, `alamat`, `nomor_telp`, `email`) VALUES (1,'123ABC','PT GUNTUR MELEDUK','JL KENANGAN','123','DUAAARR@GMAIL.COM'),(2,'ASDFLJASDF2','PT SIDOMUNCUL','JL KUSUMA NEGARA','4321','SIDOMUNCUL@SIDOMUNCUL.ID'),(3,'SUP001','PT Sumber Rejeki','Jl. Merdeka No. 45, Jakarta','021-1234567','info@sumberrejeki.com'),(5,'SUP003','UD Sukses Selalu','Jl. Sudirman No. 89, Surabaya','031-9876543','sales@suksesselalu.com'),(6,'SUP004','PT Maju Bersama','Jl. Malioboro No. 30, Yogyakarta','0274-4567890','support@majubersama.com'),(7,'SUP005','CV Tumbuh Sejahtera','Jl. Diponegoro No. 25, Semarang','024-3344556','info@tumbuhsejahtera.com'),(8,'SUP006','PT Sentosa Abadi','Jl. Gatot Subroto No. 100, Medan','061-1239876','admin@sentosaabadi.com'),(9,'SUP007','UD Berkah Abadi','Jl. Ahmad Yani No. 67, Makassar','0411-7651234','contact@berkahabadi.co.id'),(10,'SUP008','PT Gemilang Jaya','Jl. Gajah Mada No. 5, Bali','0361-9871234','info@gemilangjaya.com'),(11,'SUP009','CV Lancar Terus','Jl. Pemuda No. 77, Malang','0341-4321987','support@lancarterus.com'),(12,'SUP010','UD Mandiri Sentosa','Jl. Dipatiukur No. 3, Bogor','0251-9876543','info@mandirisentosa.com'),(13,'SUP011','PT Cahaya Abadi','Jl. Diponegoro No. 101, Jakarta','021-1111222','info@cahayaabadi.com'),(14,'SUP012','CV Amanah Jaya','Jl. Sumatra No. 55, Bandung','022-3333444','contact@amanahjaya.co.id'),(15,'SUP013','UD Harmoni Sejahtera','Jl. Pahlawan No. 23, Surabaya','031-5555666','sales@harmonisejahtera.com'),(16,'SUP014','PT Unggul Prima','Jl. Kebon Sirih No. 60, Yogyakarta','0274-7777888','support@unggulprima.com'),(17,'SUP015','CV Rajawali Nusantara','Jl. Letjen Suprapto No. 18, Semarang','024-9999000','info@rajawalinusantara.com'),(18,'SUP016','PT Satria Mandiri','Jl. Dr. Sutomo No. 34, Medan','061-8888777','admin@satriamandiri.com'),(19,'SUP017','UD Bersama Maju','Jl. Ahmad Yani No. 98, Makassar','0411-6666555','contact@bersamamaju.co.id'),(20,'SUP018','PT Jaya Abadi','Jl. Teuku Umar No. 70, Bali','0361-4444333','info@jayaabadi.com'),(21,'SUP019','CV Anugerah Sejati','Jl. Diponegoro No. 12, Malang','0341-8888666','support@anugerahsejati.com'),(22,'SUP020','UD Mulia Bersama','Jl. Ir. H. Juanda No. 5, Bogor','0251-7777666','info@muliabersama.com'),(23,'SUP021','PT Sukses Bersama','Jl. Kartini No. 10, Jakarta','021-2222333','info@suksesbersama.com'),(24,'SUP022','CV Utama Sejahtera','Jl. Veteran No. 40, Bandung','022-4444555','contact@utamasejahtera.co.id'),(25,'SUP023','UD Sentosa Sejahtera','Jl. Kartini No. 80, Surabaya','031-6666777','sales@sentosasejahtera.com'),(26,'SUP024','PT Berkah Mandiri','Jl. Kenari No. 7, Yogyakarta','0274-9999111','support@berkahmandiri.com'),(27,'SUP025','CV Prima Sentosa','Jl. Letjend Sutoyo No. 22, Semarang','024-1111333','info@primasentosa.com');
/*!40000 ALTER TABLE `suplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `inventory`
--

/*!50001 DROP VIEW IF EXISTS `inventory`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `inventory` AS select `b`.`id` AS `barang_id`,ifnull((select sum(`pb`.`jumlah_barang`) AS `barang_masuk` from `pembelian_barang` `pb` where `pb`.`barang_id` = `b`.`id` group by `pb`.`barang_id`),0) AS `barang_masuk`,ifnull((select sum(`pm`.`jumlah_barang`) AS `barang_keluar` from `penjualan_barang` `pm` where `pm`.`barang_id` = `b`.`id` group by `pm`.`barang_id`),0) AS `barang_terjual`,ifnull((select sum(`pb`.`jumlah_barang`) AS `barang_masuk` from `pembelian_barang` `pb` where `pb`.`barang_id` = `b`.`id` group by `pb`.`barang_id`),0) - ifnull((select sum(`pm`.`jumlah_barang`) AS `barang_keluar` from `penjualan_barang` `pm` where `pm`.`barang_id` = `b`.`id` group by `pm`.`barang_id`),0) AS `barang_tersedia` from `barang` `b` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-12-08 14:36:23
