-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: employee
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `id` int DEFAULT NULL,
  `FirstName` varchar(50) DEFAULT NULL,
  `LastName` varchar(50) DEFAULT NULL,
  `StartDate` date DEFAULT NULL,
  `Designation` varchar(50) DEFAULT NULL,
  `Department` varchar(50) DEFAULT NULL,
  `EndDate` date DEFAULT NULL,
  `Status` varchar(50) DEFAULT NULL,
  `Dob` date DEFAULT NULL,
  `ReportingManager` varchar(50) DEFAULT NULL,
  `Gender` varchar(50) DEFAULT NULL,
  `BloodGroup` varchar(50) DEFAULT NULL,
  `Adress` varchar(150) DEFAULT NULL,
  `Pincod` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (11,'ajay rai','rai','1994-10-10','ER','me',NULL,'gingle','1994-10-10','vishal','male','0-','xyz','7728'),(12,'ajay rai','rai','1994-10-10','ER','me',NULL,'gingle','1994-10-10','vishal','male','0-','xyz','7728'),(28,'ajay rai','rai','1994-10-10','ER','me',NULL,'gingle','1994-10-10','vishal','male','0-','xyz','7728'),(32,'ajay rai','rai','1994-10-10','ER','me','2002-10-10','gingle','1994-10-10','vishal','male','0-','xyz','7728'),(33,'Amitabh','Bachchan','1994-10-10','ER','me','2002-10-10','gingle','1994-10-10','vishal','male','0-','xyz','7728'),(37,'ajay rai','rai','1994-10-10','ER','me',NULL,'gingle','1994-10-10','vishal','male','0-','xyz','7728'),(85,' slman','khan','1994-10-10','ER','me',NULL,'gingle','1994-10-10','vishal','male','0-','xyz','7728');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-17 19:25:53
