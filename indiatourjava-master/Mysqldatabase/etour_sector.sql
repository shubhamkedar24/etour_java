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
-- Table structure for table `sector`
--

DROP TABLE IF EXISTS `sector`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sector` (
  `Sectormaster_Id` int NOT NULL AUTO_INCREMENT,
  `Sector_Id` varchar(10) DEFAULT NULL,
  `Subsector_Id` varchar(10) DEFAULT NULL,
  `Sectorname` varchar(50) NOT NULL,
  `Imgpath` varchar(250) NOT NULL,
  `Flag` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`Sectormaster_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sector`
--

LOCK TABLES `sector` WRITE;
/*!40000 ALTER TABLE `sector` DISABLE KEYS */;
INSERT INTO `sector` VALUES (1,'INT','','International Tour','/Images/International.jpg',0),(2,'DOM','','Domestic Tours','/Images/Domestic.jpg',0),(3,'CT','','Couple Tours','/Images/couple.jpg',0),(4,'SPT','','Sports Tours','/Images/sports.jpg',0),(5,'ADV','','Adventure Tours','/Images/Adventure.jpg',0),(6,'PIL','','Pilgrimage','/Images/pilgrimage.jpg',0),(7,'SCT','','Senior Citizen Tours','/Images/Senior.jpg',0),(8,'UAE','INT','UAE','/Images/duabi1.jpg',0),(9,'EUR','INT','Europe','/Images/Europ.jpg',0),(10,'AUS','INT','Australia','/Images/Aus.jpg',0),(11,'SA','INT','South Africa','/Images/SA.jpg',0),(12,'MAL','INT','Maldives','/Images/Andaman.jpg',0),(13,'USA','INT','USA','/Images/California.jpg',0),(14,'ASIA','INT','Asia','/Images/South1.jpg',0),(15,'NZ','INT','Newzealand','/Images/NZ1.jpg',0),(16,'SIN','INT','Singapore','/Images/Singapore.jpg',0),(17,'DUAB','UAE','Dubai & Abu Dhabi','/Images/Dubai_Ab.jpg',1),(18,'DUEX','UAE','Dubai Expo Special','/Images/Dubai_Exp.jpg',1),(19,'SWPA','EUR','Switzerland & PARIS','/Images/EU_SW.jpg',1),(20,'PER','AUS','Perth With Margaret River Region','/Images/Aus_two.jpg',1),(21,'SAS','SA','South Africa Splendour','/Images/SA_one.jpg',1),(22,'SM','MAL','Serene Maldives','/Images/Mal_one.jpg',1),(23,'WUS','USA','West USA for All','/Images/USA_one.jpg',1),(24,'JAP','ASIA','Japan','/Images/Asia_one.jpg',1),(25,'CNZ','NZ','Charming Newzealand','/Images/NZS.jpg',1),(26,'SWT','SIN','Singapore with Thailand','/Images/Singapore_one.jpg',1),(27,'NI','DOM','North India','/Images/North1.jpg',0),(28,'MAG','DOM','Maharashtra & Goa','/Images/MUM.jpg',0),(29,'GUJ','DOM','Gujrat','/Images/GJ1.jpg',0),(30,'HAS','DOM','Himachal & Surrounding','/Images/Manali.jpg',0),(31,'RAJ','DOM','Rajasthan','/Images/RAJ1.jpg',0),(32,'UTK','DOM','Uttarakhand','/Images/UK.jpg',0),(33,'SI','DOM','South India','/Images/South.jpg',0),(34,'AN','DOM','Andaman & Nicobar','/Images/Andaman.jpg',0),(35,'DEA','NI','Delhi & Agra','/Images/Delhi1.jpg',1),(36,'AAB','NI','Amritsar Attari Wagah Border','/Images/North.jpg',1),(37,'MNE','NEI','Mesmerising North East','/images/GAL_3.jpg',1),(38,'AWY','MAG','Ashtavinayak Yatra','/Images/AY.jpg',1),(39,'GWP','MAG','Goa with Whispering Palms','/Images/Goa.jpg',1),(40,'SOUA','GUJ','Statue of Unity with Ahmedabad','/Images/SOU2.jpg',1),(41,'SDRU','GUJ','Somnath Dwarka Runn Utsav','/Images/GJ1.jpg',1),(42,'SME','HAS','Shimla Manali Economy','/Images/Himachal.jpg',1),(43,'AOH','HAS','All of Himachal','/Images/Himachal1.jpg',1),(44,'RME','RAJ','Rajasthan Mewad Economy','/Images/Udipur.jpg',1),(45,'RM','RAJ','Rajasthan Marwad','/Images/Jodhpur.jpg',1),(46,'NAC','UTK','Nainital & Corbett','/Images/Nainital.jpg',1),(47,'MHR','UTK','Masoori & Haridwar & Rushikesh','/Images/Haridwar.jpg',1),(48,'KAK','SI','Kerala & Kanyakumari','/Images/Kerala.jpg',1),(49,'CCM','SI','Chennai & Chidambaram & Mahabalipuram','/Images/Chennai.jpg',1),(50,'PB','AN','Port Blair','/Images/Andaman1.jpg',1),(51,'DUAB','CT','Dubai & Abu Dhabi','/Images/duabi1.jpg',1),(52,'SWT','CT','Singapore with Thailand','/Images/Singapore.jpg',1),(53,'CNZ','SPT','Charming NewZealand','/Images/NZS.jpg',1),(54,'PER','SPT','Perth with Margert River Region','/Images/Cricket.jpg',1),(55,'SAP','ADV','Spain & Portugal','/Images/ADS.jpg',1),(56,'MALA','ADV','Marvelous Ladakh','/Images/ADL.jpg',1),(57,'SDRU','PIL','Somnath Dwarka Runn Utsav','/Images/GJ1.jpg',1),(58,'MHR','PIL','Masoori & Haridwar & Rushikesh','/Images/Haridwar.jpg',1),(59,'SOUA','SCT','Statue of Unity with Ahmedabad','/Images/SOU2.jpg',1),(60,'MHR','SCT','Masoori & Haridwar & Rushikesh','/Images/Haridwar.jpg',1);
/*!40000 ALTER TABLE `sector` ENABLE KEYS */;
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
