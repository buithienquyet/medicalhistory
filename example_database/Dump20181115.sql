CREATE DATABASE  IF NOT EXISTS `medicalhistory` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `medicalhistory`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: medicalhistory
-- ------------------------------------------------------
-- Server version	5.7.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `tbl_analysisrequest`
--

LOCK TABLES `tbl_analysisrequest` WRITE;
/*!40000 ALTER TABLE `tbl_analysisrequest` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_analysisrequest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_doctor`
--

LOCK TABLES `tbl_doctor` WRITE;
/*!40000 ALTER TABLE `tbl_doctor` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_laboratoryresultsblood`
--

LOCK TABLES `tbl_laboratoryresultsblood` WRITE;
/*!40000 ALTER TABLE `tbl_laboratoryresultsblood` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_laboratoryresultsblood` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_medicalhistory`
--

LOCK TABLES `tbl_medicalhistory` WRITE;
/*!40000 ALTER TABLE `tbl_medicalhistory` DISABLE KEYS */;
INSERT INTO `tbl_medicalhistory` VALUES (1,'2017-02-14 23:38:12','2018-01-15 23:26:10','viêm họng','2018-01-15 23:26:10','3 năm','không có','on dinh','ho có đờm','bình thường','bình thường','bình thường','bình thường','bên trái','bình thường','bình thường','bình thường','bình thường','bình thường','bình thường','nằm ở ổ bụng góc phần thứ 4 bên trái','bình thường','bình thường','bình thường','bình thường','bình thường','nằm ở cổ','bình thường','bình thường','bình thường','bình thường','bình thường','ổn định, mạch máu bình thường','cúm','ho','không có','uống thuốc',1,2,3,4,5,6,7,8,'không có','không có','không có','không có','không có');
/*!40000 ALTER TABLE `tbl_medicalhistory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_medicament`
--

LOCK TABLES `tbl_medicament` WRITE;
/*!40000 ALTER TABLE `tbl_medicament` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_medicament` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_patient`
--

LOCK TABLES `tbl_patient` WRITE;
/*!40000 ALTER TABLE `tbl_patient` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_registation`
--

LOCK TABLES `tbl_registation` WRITE;
/*!40000 ALTER TABLE `tbl_registation` DISABLE KEYS */;
INSERT INTO `tbl_registation` VALUES (1,'thần kinh','dau bung','2018-01-15 23:26:10','2 năm','3 tuổi bị chó cắn','2016-01-18 23:40:12','2017-02-30 23:39:12'),(2,'thần kinh','đau đầu','2018-01-15 23:26:10','5 năm','5 tuổi bị ngã','2015-03-18 23:40:12','2017-02-30 23:39:12'),(3,'xuong','dau chan','2018-10-14 23:40:32','7 nam','bi nga','2017-02-14 23:38:12','2018-09-14 23:60:22'),(4,'tai mũi họng','viêm xoang','2018-10-20 23:45:40','2 tháng','đau mũi','2015-09-14 23:28:26','2018-11-14 23:26:12'),(5,'tai mũi họng','viêm họng','2018-11-18 23:40:50','2 năm','uống nhiều nước đá và ăn kem','2017-08-14 23:50:12','2018-10-14 23:60:12'),(6,'khoa nội','đau tim','2018-06-18 23:23:35','13 năm','tim bẩm sinh','2017-05-14 23:28:12','2018-09-14 23:10:12'),(7,'tai mũi họng','viêm tai giữa','2018-06-18 23:23:30','4 năm','10 tuổi bị ngã','2016-03-29 23:10:12','2018-10-14 23:10:12'),(8,'khoa nội','đau dạ dày','2018-007-20 23:48:39','1 năm','ănnhiều đồ cay','2017-02-20 23:30:26','2018-08-26 23:10:12'),(9,'khoa nội','viêm gan','2017-08-18 23:40:30','1 năm','3 tuổi bị đau mắt','2018-01-14 23:28:12','2018-09-14 23:10:12'),(10,'khoa nội','viem dạ dày','2018-08-18 23:40:30','5 năm','3 đau dạ dày','2017-05-12 23:28:12','2018-09-25 23:30:30');
/*!40000 ALTER TABLE `tbl_registation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tbl_user`
--

LOCK TABLES `tbl_user` WRITE;
/*!40000 ALTER TABLE `tbl_user` DISABLE KEYS */;
INSERT INTO `tbl_user` VALUES (1,'buiquyet','1992-11-11','Phú Thọ','039987304','2018-11-11','2018-11-11','2018-11-11','827ccb0eea8a706c4c34a16891f84e7b','0','DOCTOR','Duy','Bùi'),(2,'nguyenhoa','1992-11-11','Hà Nội','039987304','2018-11-11','2018-11-11','2018-11-11','827ccb0eea8a706c4c34a16891f84e7b','0','PATIENT','Hoà','Nguyễn');
/*!40000 ALTER TABLE `tbl_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-15 10:23:29
