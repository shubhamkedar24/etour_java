-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: etour
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `passanger`
--

DROP TABLE IF EXISTS `passanger`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `passanger` (
  `Pass_Id` int NOT NULL,
  `Firstname` varchar(100) NOT NULL,
  `Lastname` varchar(45) NOT NULL,
  `Mobile` varchar(45) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Passport` varchar(100) DEFAULT NULL,
  `Aadharcard` varchar(100) DEFAULT NULL,
  `DOB` date NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `City` varchar(45) DEFAULT NULL,
  `State` varchar(45) NOT NULL,
  `Package_Id` int DEFAULT NULL,
  `Cust_Id` int DEFAULT NULL,
  `cost` decimal(10,0) DEFAULT NULL,
  `Pincode` int NOT NULL,
  `customer_cust_id` int DEFAULT NULL,
  `flag` tinyint DEFAULT NULL,
  PRIMARY KEY (`Pass_Id`),
  KEY `FKosrna59jiy8qgley4x8kle64j` (`customer_cust_id`),
  CONSTRAINT `FKosrna59jiy8qgley4x8kle64j` FOREIGN KEY (`customer_cust_id`) REFERENCES `customer` (`Cust_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passanger`
--

LOCK TABLES `passanger` WRITE;
/*!40000 ALTER TABLE `passanger` DISABLE KEYS */;
INSERT INTO `passanger` VALUES (134,'DARSHAN','RAUNDAL','9422841267','Aishwarya Vihar,Ramehswar Nagar Kamtawada,',NULL,'123456789753','2021-03-02','Male','Nashik','Maharashtra',1,6,97000,456789,NULL,1),(135,'DARSHAN','RAUNDAL','9422841267','Aishwarya Vihar,Ramehswar Nagar Kamtawada,',NULL,'123456789457','1991-06-04','Male','Nashik','Maharashtra',1,6,92000,422010,NULL,1),(136,'DARSHAN','RAUNDAL','9422841267','Aishwarya Vihar,Ramehswar Nagar Kamtawada,',NULL,'123456789124','1998-12-28','Male','Nashik','Maharashtra',61,6,26990,422010,NULL,1),(137,'DARSHAN','RAUNDAL','9422841267','Aishwarya Vihar,Ramehswar Nagar Kamtawada,',NULL,'123456789124','2021-03-23','Male','Nashik','Maharashtra',61,6,25200,422010,NULL,1);
/*!40000 ALTER TABLE `passanger` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-12  9:20:37
