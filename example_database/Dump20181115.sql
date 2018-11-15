CREATE DATABASE  IF NOT EXISTS `medicalhistory` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `medicalhistory`;
-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: medicalhistory
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbl_analysisrequest`
--

DROP TABLE IF EXISTS `tbl_analysisrequest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_analysisrequest` (
  `analysisrequest_id` int(11) NOT NULL AUTO_INCREMENT,
  `analysisrequest_name` text NOT NULL,
  `analysisrequest_faculty` text NOT NULL,
  `analysisrequest_namepatient` text NOT NULL,
  `analysisrequest_sex` text NOT NULL,
  `analysisrequest_address` text NOT NULL,
  `analysisrequest_createddate` text NOT NULL,
  `analysisrequest_updateddate` text NOT NULL,
  PRIMARY KEY (`analysisrequest_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_analysisrequest`
--

LOCK TABLES `tbl_analysisrequest` WRITE;
/*!40000 ALTER TABLE `tbl_analysisrequest` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_analysisrequest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_doctor`
--

DROP TABLE IF EXISTS `tbl_doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_doctor` (
  `doctor_id` int(11) NOT NULL AUTO_INCREMENT,
  `doctor_jobTitle` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `doctor_faculty` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`doctor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_doctor`
--

LOCK TABLES `tbl_doctor` WRITE;
/*!40000 ALTER TABLE `tbl_doctor` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_laboratoryresultsblood`
--

DROP TABLE IF EXISTS `tbl_laboratoryresultsblood`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_laboratoryresultsblood` (
  `laboratoryresultsblood_id` int(11) NOT NULL AUTO_INCREMENT,
  `laboratoryresultsblood_namepatient` text NOT NULL,
  `laboratoryresultsblood_address` text NOT NULL,
  `laboratoryresultsblood_sex` text NOT NULL,
  `laboratoryresultsblood_faculty` text NOT NULL,
  `laboratoryresultsblood_diagnose` text NOT NULL,
  `laboratoryresultsblood_Urê` text NOT NULL,
  `laboratoryresultsblood_Glucose` text NOT NULL,
  `laboratoryresultsblood_Creatinin` text NOT NULL,
  `laboratoryresultsblood_AcidUric` text NOT NULL,
  `laboratoryresultsblood_BilirubinTP` text NOT NULL,
  `laboratoryresultsblood_BilirubinTT` text NOT NULL,
  `laboratoryresultsblood_BilirubinGT` text NOT NULL,
  `laboratoryresultsblood_ProteinTP` text NOT NULL,
  `laboratoryresultsblood_Albumin` text NOT NULL,
  `laboratoryresultsblood_Globulin` text NOT NULL,
  `laboratoryresultsblood_ratioAG` text NOT NULL,
  `laboratoryresultsblood_Fibrinogen` text NOT NULL,
  `laboratoryresultsblood_Cholesterol` text NOT NULL,
  `laboratoryresultsblood_Triglycerid` text NOT NULL,
  `laboratoryresultsblood_HDLcho` text NOT NULL,
  `laboratoryresultsblood_LDLcho` text NOT NULL,
  `laboratoryresultsblood_Na` text NOT NULL,
  `laboratoryresultsblood_K` text NOT NULL,
  `laboratoryresultsblood_Cl` text NOT NULL,
  `laboratoryresultsblood_Calci` text NOT NULL,
  `laboratoryresultsblood_CalciIonHoa` text NOT NULL,
  `laboratoryresultsblood_Fe` text NOT NULL,
  `laboratoryresultsblood_Magiê` text NOT NULL,
  `laboratoryresultsblood_AST` text NOT NULL,
  `laboratoryresultsblood_Amylase` text NOT NULL,
  `laboratoryresultsblood_CK` text NOT NULL,
  `laboratoryresultsblood_CKMB` text NOT NULL,
  `laboratoryresultsblood_LDH` text NOT NULL,
  `laboratoryresultsblood_GGT` text NOT NULL,
  `laboratoryresultsblood_Cholinesterase` text NOT NULL,
  `laboratoryresultsblood_Phosphatasekiem` text NOT NULL,
  `laboratoryresultsblood_pHartery` text NOT NULL,
  `laboratoryresultsblood_pCO2` text NOT NULL,
  `laboratoryresultsblood_pO2artery` text NOT NULL,
  `laboratoryresultsblood_HCO3standard` text NOT NULL,
  `laboratoryresultsblood_Kiemdu` text NOT NULL,
  `laboratoryresultsblood_createddate` text NOT NULL,
  `laboratoryresultsblood_attendingdoctor` text NOT NULL,
  `laboratoryresultsblood_analysisdepartmenthead` text NOT NULL,
  PRIMARY KEY (`laboratoryresultsblood_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_laboratoryresultsblood`
--

LOCK TABLES `tbl_laboratoryresultsblood` WRITE;
/*!40000 ALTER TABLE `tbl_laboratoryresultsblood` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_laboratoryresultsblood` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_medicalhistory`
--

DROP TABLE IF EXISTS `tbl_medicalhistory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_medicalhistory` (
  `medicalhistory_id` int(11) NOT NULL AUTO_INCREMENT,
  `medicalhistory_createddate` text NOT NULL,
  `medicalhistory_updateddate` text NOT NULL,
  `medicalhistory_reason` text NOT NULL,
  `medicalhistory_date` text NOT NULL,
  `medicalhistory_pathlogicalprocess` text NOT NULL,
  `medicalhistory_diseaseprofile` text NOT NULL,
  `medicalhistory_body_spiritofthesick` text NOT NULL,
  `medicalhistory_body_millionhemorrhage` text NOT NULL,
  `medicalhistory_body_style` text NOT NULL,
  `medicalhistory_body_systemhair` text NOT NULL,
  `medicalhistory_body_skin` text NOT NULL,
  `medicalhistory_body_Thyroid` text NOT NULL,
  `medicalhistory_organization_liver_location` text NOT NULL,
  `medicalhistory_organization_liver_size` text NOT NULL,
  `medicalhistory_organization_liver_density` text NOT NULL,
  `medicalhistory_organization_liver_bo` text NOT NULL,
  `medicalhistory_organization_liver_matgan` text NOT NULL,
  `medicalhistory_organization_liver_pain` text NOT NULL,
  `medicalhistory_organization_spleen_location` text NOT NULL,
  `medicalhistory_organization_spleen_size` text NOT NULL,
  `medicalhistory_organization_spleen_density` text NOT NULL,
  `medicalhistory_organization_spleen_edge` text NOT NULL,
  `medicalhistory_organization_spleen_spleen` text NOT NULL,
  `medicalhistory_organization_spleen_pain` text NOT NULL,
  `medicalhistory_organization_ganglion_location` text NOT NULL,
  `medicalhistory_organization_ganglion_size` text NOT NULL,
  `medicalhistory_organization_ganglion_density` text NOT NULL,
  `medicalhistory_organization_ganglion_edge` text NOT NULL,
  `medicalhistory_organization_ganglion_lymphnodes` text NOT NULL,
  `medicalhistory_organization_ganglion_pain` text NOT NULL,
  `medicalhistory_medicalsummary` text NOT NULL,
  `medicalhistory_maindisease` text NOT NULL,
  `medicalhistory_includingdiseases` text NOT NULL,
  `medicalhistory_discern` text NOT NULL,
  `medicalhistory_detail` text NOT NULL,
  `medicalhistory_treat` text NOT NULL,
  `medicalhistory_bloodtransfusion_redbloodcells` int(11) NOT NULL,
  `medicalhistory_bloodtransfusion_sphericalwash` int(11) NOT NULL,
  `medicalhistory_bloodtransfusion_platelets` int(11) NOT NULL,
  `medicalhistory_bloodtransfusion_Grainclusters` int(11) NOT NULL,
  `medicalhistory_bloodtransfusion_plasma` int(11) NOT NULL,
  `medicalhistory_bloodtransfusion_freshfrozenplasma` int(11) NOT NULL,
  `medicalhistory_bloodtransfusion_precipitateVIII` int(11) NOT NULL,
  `medicalhistory_bloodtransfusion_fullbloodtransfusion` int(11) NOT NULL,
  `medicalhistory_treatmentprocess` text NOT NULL,
  `medicalhistory_ummarizestheresults` text NOT NULL,
  `medicalhistory_treatments` text NOT NULL,
  `medicalhistory_dischargestatus` text NOT NULL,
  `medicalhistory_treatmentdirectionandregimen` text NOT NULL,
  PRIMARY KEY (`medicalhistory_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_medicalhistory`
--

LOCK TABLES `tbl_medicalhistory` WRITE;
/*!40000 ALTER TABLE `tbl_medicalhistory` DISABLE KEYS */;
INSERT INTO `tbl_medicalhistory` VALUES (1,'2017-02-14 23:38:12','2018-01-15 23:26:10','viêm họng','2018-01-15 23:26:10','3 năm','không có','on dinh','ho có đờm','bình thường','bình thường','bình thường','bình thường','bên trái','bình thường','bình thường','bình thường','bình thường','bình thường','bình thường','nằm ở ổ bụng góc phần thứ 4 bên trái','bình thường','bình thường','bình thường','bình thường','bình thường','nằm ở cổ','bình thường','bình thường','bình thường','bình thường','bình thường','ổn định, mạch máu bình thường','cúm','ho','không có','uống thuốc',1,2,3,4,5,6,7,8,'không có','không có','không có','không có','không có');
/*!40000 ALTER TABLE `tbl_medicalhistory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_medicament`
--

DROP TABLE IF EXISTS `tbl_medicament`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_medicament` (
  `medicament_id` int(11) NOT NULL AUTO_INCREMENT,
  `medicament_name` text NOT NULL,
  `medicament_createddate` text NOT NULL,
  `medicament_quantity` int(11) NOT NULL,
  `medicament_typeofmedicine` int(11) NOT NULL,
  PRIMARY KEY (`medicament_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_medicament`
--

LOCK TABLES `tbl_medicament` WRITE;
/*!40000 ALTER TABLE `tbl_medicament` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_medicament` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_patient`
--

DROP TABLE IF EXISTS `tbl_patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_patient` (
  `patient_id` int(11) NOT NULL AUTO_INCREMENT,
  `patient_name` text NOT NULL,
  `patient_birthday` text NOT NULL,
  `patient_phonenumber` text NOT NULL,
  `patient_nation` text NOT NULL,
  `patient_job` text NOT NULL,
  `patient_foreigners` text NOT NULL,
  `patient_workplace` text NOT NULL,
  `patient_numberofhealthinsurance` text NOT NULL,
  `patient_address_city` text NOT NULL,
  `patient_address_district` text NOT NULL,
  `patient_address_wards` text NOT NULL,
  `patient_address_apartmentnumber` text NOT NULL,
  `patient_relative_phonenumber` text NOT NULL,
  `patient_relative_address` text NOT NULL,
  PRIMARY KEY (`patient_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_patient`
--

LOCK TABLES `tbl_patient` WRITE;
/*!40000 ALTER TABLE `tbl_patient` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_registation`
--

DROP TABLE IF EXISTS `tbl_registation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_registation` (
  `registation_id` int(11) NOT NULL AUTO_INCREMENT,
  `registation_faculty` text NOT NULL,
  `registation_reason` text NOT NULL,
  `registation_date` text NOT NULL,
  `registation_pathologicalprocess` text NOT NULL,
  `registation_diseaseprofile` text NOT NULL,
  `registation_createddate` varchar(45) NOT NULL,
  `registation_updateddate` varchar(45) NOT NULL,
  PRIMARY KEY (`registation_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_registation`
--

LOCK TABLES `tbl_registation` WRITE;
/*!40000 ALTER TABLE `tbl_registation` DISABLE KEYS */;
INSERT INTO `tbl_registation` VALUES (1,'thần kinh','dau bung','2018-01-15 23:26:10','2 năm','3 tuổi bị chó cắn','2016-01-18 23:40:12','2017-02-30 23:39:12'),(2,'thần kinh','đau đầu','2018-01-15 23:26:10','5 năm','5 tuổi bị ngã','2015-03-18 23:40:12','2017-02-30 23:39:12'),(3,'xuong','dau chan','2018-10-14 23:40:32','7 nam','bi nga','2017-02-14 23:38:12','2018-09-14 23:60:22'),(4,'tai mũi họng','viêm xoang','2018-10-20 23:45:40','2 tháng','đau mũi','2015-09-14 23:28:26','2018-11-14 23:26:12'),(5,'tai mũi họng','viêm họng','2018-11-18 23:40:50','2 năm','uống nhiều nước đá và ăn kem','2017-08-14 23:50:12','2018-10-14 23:60:12'),(6,'khoa nội','đau tim','2018-06-18 23:23:35','13 năm','tim bẩm sinh','2017-05-14 23:28:12','2018-09-14 23:10:12'),(7,'tai mũi họng','viêm tai giữa','2018-06-18 23:23:30','4 năm','10 tuổi bị ngã','2016-03-29 23:10:12','2018-10-14 23:10:12'),(8,'khoa nội','đau dạ dày','2018-007-20 23:48:39','1 năm','ănnhiều đồ cay','2017-02-20 23:30:26','2018-08-26 23:10:12'),(9,'khoa nội','viêm gan','2017-08-18 23:40:30','1 năm','3 tuổi bị đau mắt','2018-01-14 23:28:12','2018-09-14 23:10:12'),(10,'khoa nội','viem dạ dày','2018-08-18 23:40:30','5 năm','3 đau dạ dày','2017-05-12 23:28:12','2018-09-25 23:30:30'),(11,'Thần kinh','đau nửa đầu','11/10/2018','4 năm','do bị ngã xe','2018/11/15 11:35:11','2018/11/15 11:35:11');
/*!40000 ALTER TABLE `tbl_registation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_user`
--

DROP TABLE IF EXISTS `tbl_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_userName` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `user_birthday` varchar(45) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `user_address` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `user_phoneNumber` varchar(15) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `user_createdDate` varchar(45) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `user_updatedDate` varchar(45) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `user_lastLogin` varchar(45) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `user_password` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `user_loginCount` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `user_role` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `user_firstname` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `user_lastname` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

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

-- Dump completed on 2018-11-15 11:36:48
