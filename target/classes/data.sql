-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: graduateemploymentinfo
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `area`
--

DROP TABLE IF EXISTS `area`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `area` (
  `area_id` int NOT NULL AUTO_INCREMENT,
  `area_name` varchar(100) NOT NULL,
  `parent_id` int DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`area_id`),
  KEY `tb_area_parent` (`parent_id`),
  CONSTRAINT `tb_area_parent` FOREIGN KEY (`parent_id`) REFERENCES `area` (`area_id`)
) ENGINE=InnoDB AUTO_INCREMENT=68 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `area`
--

LOCK TABLES `area` WRITE;
/*!40000 ALTER TABLE `area` DISABLE KEYS */;
INSERT INTO `area` VALUES (4,'四川',NULL,'2020-03-06 13:39:59'),(5,'重庆',NULL,'2020-03-06 13:40:14'),(6,'成都',4,'2020-03-06 13:46:34'),(8,'河北',NULL,'2020-03-06 23:35:56'),(9,'石家庄',8,'2020-03-06 23:36:40'),(10,'广东',NULL,'2020-03-06 23:36:51'),(11,'广州',10,'2020-03-06 23:36:59'),(12,'浙江',NULL,'2020-03-06 23:37:21'),(13,'杭州',12,'2020-03-06 23:37:38'),(14,'湖北',NULL,'2020-03-06 23:38:06'),(15,'武汉',14,'2020-03-06 23:38:17'),(16,'江苏',NULL,'2020-03-06 23:38:33'),(17,'南京',16,'2020-03-06 23:38:45'),(18,'辽宁',NULL,'2020-03-06 23:39:21'),(19,'沈阳',18,'2020-03-06 23:39:40'),(20,'湖南',NULL,'2020-03-06 23:39:55'),(21,'长沙',20,'2020-03-06 23:40:03'),(22,'河南',NULL,'2020-03-06 23:40:22'),(23,'郑州',22,'2020-03-06 23:40:38'),(24,'山东',NULL,'2020-03-06 23:40:48'),(25,'济南',24,'2020-03-06 23:41:01'),(26,'黑龙江',NULL,'2020-03-06 23:41:18'),(27,'哈尔滨',26,'2020-03-06 23:41:30'),(28,'吉林',NULL,'2020-03-06 23:41:39'),(29,'长春',28,'2020-03-06 23:41:51'),(30,'陕西',NULL,'2020-03-06 23:42:04'),(31,'西安',30,'2020-03-06 23:42:28'),(32,'福建',NULL,'2020-03-06 23:42:40'),(33,'福州',32,'2020-03-06 23:42:50'),(34,'安徽',NULL,'2020-03-06 23:43:04'),(35,'合肥',34,'2020-03-06 23:43:12'),(36,'江西',NULL,'2020-03-06 23:43:22'),(37,'南昌',36,'2020-03-06 23:43:38'),(38,'云南',NULL,'2020-03-06 23:43:56'),(39,'昆明',38,'2020-03-06 23:44:10'),(40,'内蒙古',NULL,'2020-03-06 23:44:22'),(41,'呼和浩特',40,'2020-03-06 23:44:50'),(42,'广西',NULL,'2020-03-06 23:45:00'),(43,'南宁',42,'2020-03-06 23:45:15'),(44,'山西',NULL,'2020-03-06 23:45:33'),(45,'太原',44,'2020-03-06 23:45:45'),(46,'新疆',NULL,'2020-03-06 23:45:54'),(47,'乌鲁木齐',46,'2020-03-06 23:46:07'),(48,'贵州',NULL,'2020-03-06 23:46:16'),(49,'贵阳',48,'2020-03-06 23:46:28'),(50,'甘肃',NULL,'2020-03-06 23:46:38'),(51,'兰州',50,'2020-03-06 23:46:53'),(52,'青海',NULL,'2020-03-06 23:47:04'),(53,'西宁',52,'2020-03-06 23:47:15'),(54,'海南',NULL,'2020-03-06 23:47:27'),(55,'海口',54,'2020-03-06 23:47:39'),(56,'宁夏',NULL,'2020-03-06 23:47:57'),(57,'银川',56,'2020-03-06 23:48:10'),(58,'西藏',NULL,'2020-03-06 23:48:36'),(59,'拉萨',58,'2020-03-06 23:48:46'),(60,'台湾',NULL,'2020-03-06 23:49:17'),(61,'台北',60,'2020-03-06 23:49:25'),(62,'北京市',NULL,'2020-03-06 23:50:22'),(63,'上海市',NULL,'2020-03-06 23:50:34'),(64,'天津市',NULL,'2020-03-06 23:50:49'),(65,'深圳',10,'2020-03-06 23:52:25'),(66,'香港',NULL,'2020-03-07 00:00:09'),(67,'澳门',NULL,'2020-03-07 00:00:16');
/*!40000 ALTER TABLE `area` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clazz`
--

DROP TABLE IF EXISTS `clazz`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clazz` (
  `class_id` int NOT NULL AUTO_INCREMENT,
  `class_name` varchar(100) NOT NULL,
  `specialty_id` int DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `admin_id` int DEFAULT NULL,
  PRIMARY KEY (`class_id`),
  KEY `tb_class_grade_tb_specialty` (`specialty_id`),
  KEY `tb_class_grade_tb_person_info` (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=160 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clazz`
--

LOCK TABLES `clazz` WRITE;
/*!40000 ALTER TABLE `clazz` DISABLE KEYS */;
INSERT INTO `clazz` VALUES (28,'计科19101',40,'2023-04-21 14:36:47',39),(29,'计科19102',40,'2023-04-21 14:36:44',39),(30,'计科19103',40,'2023-04-21 14:47:56',39),(31,'计科19101(软件开发方向)',40,'2023-04-21 14:36:50',39),(32,'计科19102(软件开发方向)',40,'2023-04-21 14:36:48',39),(37,'数媒19101',41,'2023-04-21 00:00:00',39),(38,'数媒19102',41,'2023-04-21 00:00:00',39),(39,'数媒19103',41,'2023-04-21 00:00:00',39),(40,'软工19101',42,'2023-04-21 00:00:00',39),(41,'软工19102',42,'2023-04-21 00:00:00',39),(42,'软工19103',42,'2023-04-21 00:00:00',39),(43,'大数据19101',43,'2023-04-21 00:00:00',39),(44,'大数据19102',43,'2023-04-21 00:00:00',39),(45,'大数据19103',43,'2023-04-21 00:00:00',39),(46,'网工19101',44,'2023-04-21 00:00:00',39),(47,'网工19102',44,'2023-04-21 00:00:00',39),(48,'网工19103',44,'2023-04-21 00:00:00',39),(49,'英语19101',46,'2023-04-21 00:00:00',40),(50,'英语19102',46,'2023-04-21 00:00:00',40),(51,'英语19103',46,'2023-04-21 00:00:00',40),(52,'日语19101',47,'2023-04-21 00:00:00',40),(53,'日语19102',47,'2023-04-21 00:00:00',40),(54,'日语19103',47,'2023-04-21 00:00:00',40),(55,'公共外语19101',48,'2023-04-21 00:00:00',40),(56,'公共外语19102',48,'2023-04-21 00:00:00',40),(57,'公共外语19103',48,'2023-04-21 00:00:00',40),(58,'空乘19101',49,'2023-04-21 00:00:00',40),(59,'空乘19102',49,'2023-04-21 00:00:00',40),(60,'空乘19103',49,'2023-04-21 00:00:00',40),(61,'航空19101',50,'2023-04-21 00:00:00',40),(62,'航空19102',50,'2023-04-21 00:00:00',40),(63,'航空19103',50,'2023-04-21 00:00:00',40),(64,'智控19101',51,'2023-04-21 00:00:00',41),(65,'智控19102',51,'2023-04-21 00:00:00',41),(66,'智控19103',51,'2023-04-21 00:00:00',41),(67,'电信19101',52,'2023-04-21 00:00:00',41),(68,'电信19102',52,'2023-04-21 00:00:00',41),(69,'电信19103',52,'2023-04-21 00:00:00',41),(70,'物联网19101',53,'2023-04-21 00:00:00',41),(71,'物联网19102',53,'2023-04-21 00:00:00',41),(72,'物联网19103',53,'2023-04-21 00:00:00',41),(73,'电气19101',54,'2023-04-21 00:00:00',41),(74,'电气19102',54,'2023-04-21 00:00:00',41),(75,'电气19103',54,'2023-04-21 00:00:00',41),(76,'电自19101',55,'2023-04-21 00:00:00',41),(77,'电自19102',55,'2023-04-21 00:00:00',41),(78,'电自19103',55,'2023-04-21 00:00:00',41),(79,'机器人19101',56,'2023-04-21 00:00:00',41),(80,'机器人19102',56,'2023-04-21 00:00:00',41),(81,'机器人19103',56,'2023-04-21 00:00:00',41),(82,'电力19101',57,'2023-04-21 00:00:00',41),(83,'电力19102',57,'2023-04-21 00:00:00',41),(84,'电力19103',57,'2023-04-21 00:00:00',41),(85,'安全19101',58,'2023-04-21 00:00:00',42),(86,'安全19102',58,'2023-04-21 00:00:00',42),(87,'安全19103',58,'2023-04-21 00:00:00',42),(88,'给排水19101',59,'2023-04-21 00:00:00',42),(89,'给排水19102',59,'2023-04-21 00:00:00',42),(90,'给排水19103',59,'2023-04-21 00:00:00',42),(91,'工程管理19101',60,'2023-04-21 00:00:00',42),(92,'工程管理19102',60,'2023-04-21 00:00:00',42),(93,'工程管理19103',60,'2023-04-21 00:00:00',42),(94,'土木19101',61,'2023-04-21 00:00:00',42),(95,'土木19102',61,'2023-04-21 00:00:00',42),(96,'土木19103',61,'2023-04-21 00:00:00',42),(97,'建筑工程19101',62,'2023-04-21 00:00:00',42),(98,'建筑工程19102',62,'2023-04-21 00:00:00',42),(99,'建筑工程19103',62,'2023-04-21 00:00:00',42),(100,'智能建造19101',63,'2023-04-21 00:00:00',42),(101,'智能建造19102',63,'2023-04-21 00:00:00',42),(102,'智能建造19103',63,'2023-04-21 00:00:00',42),(103,'环境工程19101',64,'2023-04-21 00:00:00',42),(104,'环境工程19102',64,'2023-04-21 00:00:00',42),(105,'环境工程19103',64,'2023-04-21 00:00:00',42),(106,'机械工程19101',65,'2023-04-21 00:00:00',44),(107,'机械工程19102',65,'2023-04-21 00:00:00',44),(108,'机械工程19103',65,'2023-04-21 00:00:00',44),(109,'能动19101',66,'2023-04-21 00:00:00',44),(110,'能动19102',66,'2023-04-21 00:00:00',44),(111,'能动19103',66,'2023-04-21 00:00:00',44),(112,'汽车服务19101',67,'2023-04-21 00:00:00',44),(113,'汽车服务19102',67,'2023-04-21 00:00:00',44),(114,'汽车服务19103',67,'2023-04-21 00:00:00',44),(115,'交通运输19101',68,'2023-04-21 00:00:00',44),(116,'交通运输19102',68,'2023-04-21 00:00:00',44),(117,'交通运输19103',68,'2023-04-21 00:00:00',44),(118,'材控19101',69,'2023-04-21 00:00:00',44),(119,'材控19102',69,'2023-04-21 00:00:00',44),(120,'材控19103',69,'2023-04-21 00:00:00',44),(121,'智能制造19101',70,'2023-04-21 00:00:00',44),(122,'智能制造19102',70,'2023-04-21 00:00:00',44),(123,'智能制造19103',70,'2023-04-21 00:00:00',44),(124,'工业设计19101',71,'2023-04-21 00:00:00',44),(125,'工业设计19102',71,'2023-04-21 00:00:00',44),(126,'工业设计19103',71,'2023-04-21 00:00:00',44),(127,'汽车制造19101',72,'2023-04-21 00:00:00',44),(128,'汽车制造19102',72,'2023-04-21 00:00:00',44),(129,'汽车制造19103',72,'2023-04-21 00:00:00',44),(130,'机电19101',73,'2023-04-21 00:00:00',44),(131,'机电19102',73,'2023-04-21 00:00:00',44),(132,'机电19103',73,'2023-04-21 00:00:00',44),(133,'会计19101',74,'2023-04-21 00:00:00',47),(134,'会计19102',74,'2023-04-21 00:00:00',47),(135,'会计19103',74,'2023-04-21 00:00:00',47),(136,'金融19101',75,'2023-04-21 00:00:00',47),(137,'金融19102',75,'2023-04-21 00:00:00',47),(138,'金融19103',75,'2023-04-21 00:00:00',47),(139,'金工19101',76,'2023-04-21 00:00:00',47),(140,'金工19102',76,'2023-04-21 00:00:00',47),(141,'金工19103',76,'2023-04-21 00:00:00',47),(142,'财政19101',77,'2023-04-21 00:00:00',47),(143,'财政19102',77,'2023-04-21 00:00:00',47),(144,'财政19103',77,'2023-04-21 00:00:00',47),(145,'保险19101',78,'2023-04-21 00:00:00',47),(146,'保险19102',78,'2023-04-21 00:00:00',47),(147,'保险19103',78,'2023-04-21 00:00:00',47),(148,'国贸19101',79,'2023-04-21 00:00:00',47),(149,'国贸19102',79,'2023-04-21 00:00:00',47),(150,'国贸19103',79,'2023-04-21 00:00:00',47),(151,'经济19101',80,'2023-04-21 00:00:00',47),(152,'经济19102',80,'2023-04-21 00:00:00',47),(153,'经济19103',80,'2023-04-21 00:00:00',47),(154,'工程管理19101',81,'2023-04-21 00:00:00',47),(155,'工程管理19102',81,'2023-04-21 00:00:00',47),(156,'工程管理19103',81,'2023-04-21 00:00:00',47),(157,'财管19101',82,'2023-04-21 00:00:00',47),(158,'财管19102',82,'2023-04-21 00:00:00',47),(159,'财管19103',82,'2023-04-21 00:00:00',47);
/*!40000 ALTER TABLE `clazz` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `college`
--

DROP TABLE IF EXISTS `college`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `college` (
  `college_id` int NOT NULL AUTO_INCREMENT,
  `college_name` varchar(100) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `admin_id` int DEFAULT NULL,
  PRIMARY KEY (`college_id`),
  KEY `tb_college_tb_person_info` (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `college`
--

LOCK TABLES `college` WRITE;
/*!40000 ALTER TABLE `college` DISABLE KEYS */;
INSERT INTO `college` VALUES (31,'计算机科学与工程学院','2023-04-14 02:03:35',39),(33,'外国语学院','2023-04-21 13:55:51',40),(34,'电气信息工程学院','2023-04-21 13:56:18',41),(35,'建筑与环境学院','2023-04-21 13:56:29',42),(36,'机械工程学院','2023-04-21 13:56:41',44),(37,'经济管理学院','2023-04-21 13:56:51',47),(39,'民航现代产业学院','2023-04-21 13:58:34',48);
/*!40000 ALTER TABLE `college` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employment_information`
--

DROP TABLE IF EXISTS `employment_information`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employment_information` (
  `information_id` int NOT NULL AUTO_INCREMENT,
  `student_num` int NOT NULL,
  `name` varchar(100) NOT NULL,
  `class_id` int NOT NULL,
  `area_id` int NOT NULL,
  `unit_id` int NOT NULL,
  `salary` varchar(10) NOT NULL,
  `employment_way_id` int NOT NULL,
  `msg` varchar(10000) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `gender` int NOT NULL,
  `college_id` int NOT NULL,
  `specialty_id` int NOT NULL,
  PRIMARY KEY (`information_id`),
  KEY `tb_employment_information_tb_class_grade` (`class_id`),
  KEY `tb_employment_information_tb_area` (`area_id`),
  KEY `tb_employment_information_tb_unit_kind` (`unit_id`),
  KEY `tb_employment_information_tb_employment_way` (`employment_way_id`),
  KEY `tb_employment_information_tb_college` (`college_id`) USING BTREE,
  KEY `tb_employment_information_tb_specialty` (`specialty_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1033 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employment_information`
--

LOCK TABLES `employment_information` WRITE;
/*!40000 ALTER TABLE `employment_information` DISABLE KEYS */;
INSERT INTO `employment_information` VALUES (1,4542211,'张三',28,19,1,'3850',3,NULL,NULL,1,31,40),(2,4542213,'刘华强',31,30,2,'4000',2,NULL,NULL,1,31,40),(3,4542841,'杨易浩',37,21,3,'3700',1,NULL,NULL,1,31,41),(4,4542213,'秦豪东',40,9,4,'4200',2,NULL,NULL,1,31,42),(5,4542760,'刘振宾',43,15,2,'4100',1,NULL,NULL,1,31,41),(6,4542318,'赵建业',46,35,2,'3700',3,NULL,NULL,1,31,44),(7,4542134,'冯浩组',29,38,4,'5200',3,NULL,NULL,1,31,40),(8,4542213,'梁保龙',29,46,1,'6100',2,NULL,NULL,1,31,40),(9,4542841,'刘明昊',32,59,2,'3500',1,NULL,NULL,1,31,40),(10,4542213,'冯浩李',32,85,1,'7200',3,NULL,NULL,1,31,40),(11,4542841,'张楠',39,35,2,'5100',3,NULL,NULL,1,31,41),(12,4542841,'赵磊',41,14,1,'3400',3,NULL,NULL,1,31,42),(13,4542213,'李楠',39,23,3,'3800',2,NULL,NULL,1,31,41),(14,4542760,'冯军',41,46,2,'4000',1,NULL,NULL,1,31,42),(15,4542318,'张伟',30,24,3,'5000',2,NULL,NULL,1,31,40),(16,4542134,'张强',30,32,3,'5200',4,NULL,NULL,1,31,40),(17,4542213,'刘强',47,34,4,'6100',2,NULL,NULL,1,31,44),(18,4542841,'冯浩',47,33,2,'3500',3,NULL,NULL,1,31,44),(19,4542213,'张良',42,23,1,'7200',1,NULL,NULL,1,31,42),(20,4542841,'马蓉',42,21,3,'5100',3,NULL,NULL,1,31,42),(21,4542841,'杜国',39,22,2,'3400',1,NULL,NULL,1,31,41),(22,4542213,'冯启',39,45,3,'3700',4,NULL,NULL,1,31,41),(23,4542760,'刘斌',28,56,3,'5200',4,NULL,NULL,1,31,40),(24,4542318,'秦斌',28,65,4,'6100',3,NULL,NULL,1,31,40);
/*!40000 ALTER TABLE `employment_information` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employment_way`
--

DROP TABLE IF EXISTS `employment_way`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employment_way` (
  `employment_way_id` int NOT NULL AUTO_INCREMENT,
  `vay_name` varchar(100) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`employment_way_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employment_way`
--

LOCK TABLES `employment_way` WRITE;
/*!40000 ALTER TABLE `employment_way` DISABLE KEYS */;
INSERT INTO `employment_way` VALUES (1,'学校双选会','2020-03-06 13:57:09'),(2,'互联网招聘平台','2020-03-06 13:57:27'),(3,'个人寻找','2020-03-06 13:57:45'),(4,'朋友推荐','2020-03-06 13:57:59');
/*!40000 ALTER TABLE `employment_way` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `organization_num`
--

DROP TABLE IF EXISTS `organization_num`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `organization_num` (
  `num_id` int NOT NULL AUTO_INCREMENT,
  `sum` int NOT NULL,
  `class_id` int DEFAULT NULL,
  `college_id` int DEFAULT NULL,
  `specialty_id` int DEFAULT NULL,
  PRIMARY KEY (`num_id`),
  KEY `tb_organization_num_tb_class_grade` (`class_id`),
  KEY `tb_organization_num_tb_college` (`college_id`),
  KEY `tb_organization_num_tb_specialty` (`specialty_id`)
) ENGINE=InnoDB AUTO_INCREMENT=124 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `organization_num`
--

LOCK TABLES `organization_num` WRITE;
/*!40000 ALTER TABLE `organization_num` DISABLE KEYS */;
INSERT INTO `organization_num` VALUES (72,0,NULL,31,NULL),(73,0,NULL,NULL,40),(74,0,NULL,NULL,41),(75,0,NULL,NULL,42),(76,0,NULL,NULL,43),(77,0,NULL,NULL,44),(78,0,NULL,NULL,45),(79,0,NULL,32,NULL),(80,0,NULL,33,NULL),(81,0,NULL,34,NULL),(82,0,NULL,35,NULL),(83,0,NULL,36,NULL),(84,0,NULL,37,NULL),(86,0,NULL,39,NULL),(87,0,NULL,NULL,46),(88,0,NULL,NULL,47),(89,0,NULL,NULL,48),(90,0,NULL,NULL,49),(91,0,NULL,NULL,50),(92,0,NULL,NULL,51),(93,0,NULL,NULL,52),(94,0,NULL,NULL,53),(95,0,NULL,NULL,54),(96,0,NULL,NULL,55),(97,0,NULL,NULL,56),(98,0,NULL,NULL,57),(99,0,NULL,NULL,58),(100,0,NULL,NULL,59),(101,0,NULL,NULL,60),(102,0,NULL,NULL,61),(103,0,NULL,NULL,62),(104,0,NULL,NULL,63),(105,0,NULL,NULL,64),(106,0,NULL,NULL,65),(107,0,NULL,NULL,66),(108,0,NULL,NULL,67),(109,0,NULL,NULL,68),(110,0,NULL,NULL,69),(111,0,NULL,NULL,70),(112,0,NULL,NULL,71),(113,0,NULL,NULL,72),(114,0,NULL,NULL,73),(115,0,NULL,NULL,74),(116,0,NULL,NULL,75),(117,0,NULL,NULL,76),(118,0,NULL,NULL,77),(119,0,NULL,NULL,78),(120,0,NULL,NULL,79),(121,0,NULL,NULL,80),(122,0,NULL,NULL,81),(123,0,NULL,NULL,82);
/*!40000 ALTER TABLE `organization_num` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `person_info`
--

DROP TABLE IF EXISTS `person_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `person_info` (
  `person_id` int NOT NULL AUTO_INCREMENT,
  `enable_Status` int DEFAULT '0',
  `person_name` varchar(100) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `password` varchar(20) NOT NULL,
  `username` varchar(20) NOT NULL,
  `college_id` int DEFAULT NULL,
  PRIMARY KEY (`person_id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person_info`
--

LOCK TABLES `person_info` WRITE;
/*!40000 ALTER TABLE `person_info` DISABLE KEYS */;
INSERT INTO `person_info` VALUES (1,2,'admin',NULL,'123','admin',NULL),(39,1,'计算机科学与工程学院管理员','2023-04-21 13:49:01','123','admin01',31),(40,1,'外国语学院管理员','2023-04-21 13:51:48','123','admin02',33),(41,1,'电气信息工程学院管理员','2023-04-21 13:52:08','123','admin03',34),(42,1,'建筑与环境学院管理员','2023-04-21 13:52:26','123','admin04',35),(44,1,'机械工程学院管理员','2023-04-21 13:53:40','123','admin05',36),(47,1,'经济管理学院管理员','2023-04-21 13:54:09','123','admin06',37),(48,1,'民航现代产业学院管理员','2023-04-21 13:54:33','123','admin07',39),(49,0,'计算机科学与工程学院辅导员01','2023-04-21 13:59:13','123','teacher01-31',31),(50,0,'计算机科学与工程学院辅导员02','2023-04-21 13:59:13','123','teacher02-31',31),(51,0,'计算机科学与工程学院辅导员03','2023-04-21 13:59:13','123','teacher03-31',31),(52,0,'外国语学院辅导员01','2023-04-21 13:59:13','123','teacher01-33',33),(53,0,'外国语学院辅导员02','2023-04-21 13:59:13','123','teacher02-33',33),(54,0,'外国语学院辅导员03','2023-04-21 13:59:13','123','teacher03-33',33),(55,0,'电气信息工程学院辅导员01','2023-04-21 13:59:13','123','teacher01-34',34),(56,0,'电气信息工程学院辅导员02','2023-04-21 13:59:13','123','teacher02-34',34),(57,0,'电气信息工程学院辅导员03','2023-04-21 13:59:13','123','teacher03-34',34),(58,0,'建筑与环境学院辅导员01','2023-04-21 13:59:13','123','teacher01-35',35),(59,0,'建筑与环境学院辅导员02','2023-04-21 13:59:13','123','teacher02-35',35),(60,0,'建筑与环境学院辅导员03','2023-04-21 13:59:13','123','teacher03-35',35),(61,0,'机械工程学院辅导员01','2023-04-21 13:59:13','123','teacher01-36',36),(62,0,'机械工程学院辅导员02','2023-04-21 13:59:13','123','teacher02-36',36),(63,0,'机械工程学院辅导员03','2023-04-21 13:59:13','123','teacher03-36',36),(64,0,'经济管理学院辅导员01','2023-04-21 13:59:13','123','teacher01-37',37),(65,0,'经济管理学院辅导员02','2023-04-21 13:59:13','123','teacher02-37',37),(66,0,'经济管理学院辅导员03','2023-04-21 13:59:13','123','teacher03-37',37),(70,0,'民航现代产业学院辅导员01','2023-04-21 13:59:13','123','teacher01-39',39),(71,0,'民航现代产业学院辅导员02','2023-04-21 13:59:13','123','teacher02-39',39),(72,0,'民航现代产业学院辅导员03','2023-04-21 13:59:13','123','teacher03-39',39);
/*!40000 ALTER TABLE `person_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `specialty`
--

DROP TABLE IF EXISTS `specialty`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `specialty` (
  `specialty_id` int NOT NULL AUTO_INCREMENT,
  `specialty_name` varchar(100) NOT NULL,
  `college_id` int NOT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`specialty_id`),
  KEY `tb_specialty_tb_college` (`college_id`)
) ENGINE=InnoDB AUTO_INCREMENT=83 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `specialty`
--

LOCK TABLES `specialty` WRITE;
/*!40000 ALTER TABLE `specialty` DISABLE KEYS */;
INSERT INTO `specialty` VALUES (40,'计算机科学与技术',31,'2023-04-14 02:04:18'),(41,'数字媒体与技术',31,'2023-04-14 02:04:34'),(42,'软件工程',31,'2023-04-14 02:04:43'),(43,'大数据技术与应用专业',31,'2023-04-14 02:05:38'),(44,'网络工程',31,'2023-04-14 02:05:51'),(46,'英语专业',33,'2023-04-21 14:16:20'),(47,'日语专业',33,'2023-04-21 14:16:34'),(48,'公共外语',33,'2023-04-21 14:16:44'),(49,'空中乘务专业',33,'2023-04-21 14:17:20'),(50,'航空服务艺术与管理专业',33,'2023-04-21 14:17:45'),(51,'智能控制系专业',34,'2023-04-21 14:19:01'),(52,'电子信息工程专业',34,'2023-04-21 14:19:11'),(53,' 物联网工程专业',34,'2023-04-21 14:19:21'),(54,'电气工程系专业',34,'2023-04-21 14:19:35'),(55,'电气工程及其自动化（智能电气）专业',34,'2023-04-21 14:19:45'),(56,'机器人工程专业',34,'2023-04-21 14:20:11'),(57,'电力系统自动化技术专业',34,'2023-04-21 14:20:50'),(58,'安全工程',35,'2023-04-21 14:21:28'),(59,' 给排水科学与工程',35,'2023-04-21 14:21:39'),(60,'工程管理',35,'2023-04-21 14:21:48'),(61,'土木工程',35,'2023-04-21 14:21:58'),(62,' 建筑工程技术（专科）',35,'2023-04-21 14:22:11'),(63,'智能建造',35,'2023-04-21 14:22:19'),(64,' 环境工程',35,'2023-04-21 14:22:27'),(65,'机械工程',36,'2023-04-21 14:23:09'),(66,'能源与动力工程',36,'2023-04-21 14:23:21'),(67,'汽车服务工程',36,'2023-04-21 14:23:48'),(68,'交通运输',36,'2023-04-21 14:23:58'),(69,'材料成型及控制工程',36,'2023-04-21 14:24:10'),(70,'智能制造工程',36,'2023-04-21 14:24:24'),(71,'工业设计',36,'2023-04-21 14:24:37'),(72,' 汽车制造与试验技术(专科)',36,'2023-04-21 14:25:56'),(73,'机电一体化（专科）',36,'2023-04-21 14:26:03'),(74,'会计学',37,'2023-04-21 14:28:12'),(75,'金融学',37,'2023-04-21 14:28:47'),(76,'金融工程',37,'2023-04-21 14:28:58'),(77,'财政学',37,'2023-04-21 14:29:07'),(78,'保险精算',37,'2023-04-21 14:29:16'),(79,'国际贸易',37,'2023-04-21 14:29:24'),(80,'经济学',37,'2023-04-21 14:29:33'),(81,'工程管理',37,'2023-04-21 14:29:40'),(82,'财务管理',37,'2023-04-21 14:29:47');
/*!40000 ALTER TABLE `specialty` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `unit_kind`
--

DROP TABLE IF EXISTS `unit_kind`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `unit_kind` (
  `unit_id` int NOT NULL AUTO_INCREMENT,
  `unit_name` varchar(100) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`unit_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unit_kind`
--

LOCK TABLES `unit_kind` WRITE;
/*!40000 ALTER TABLE `unit_kind` DISABLE KEYS */;
INSERT INTO `unit_kind` VALUES (1,'国企','2020-03-06 13:56:23'),(2,'私企','2020-03-06 13:56:29'),(3,'公务员','2020-03-06 13:56:36'),(4,'事业单位','2020-03-06 13:56:43');
/*!40000 ALTER TABLE `unit_kind` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-21 16:17:25
