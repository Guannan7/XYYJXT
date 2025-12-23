-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: jspm7ayw6
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Current Database: `jspm7ayw6`
--

/*!40000 DROP DATABASE IF EXISTS `jspm7ayw6`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `jspm7ayw6` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `jspm7ayw6`;

--
-- Table structure for table `banjixinxi`
--

DROP TABLE IF EXISTS `banjixinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `banjixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `banjibianhao` varchar(200) DEFAULT NULL COMMENT '班级编号',
  `banjileixing` varchar(200) DEFAULT NULL COMMENT '班级类型',
  `banjiweizhi` varchar(200) DEFAULT NULL COMMENT '班级位置',
  `banjirenshu` varchar(200) DEFAULT NULL COMMENT '班级人数',
  `banzhuren` varchar(200) DEFAULT NULL COMMENT '班主任',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8 COMMENT='班级信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banjixinxi`
--

LOCK TABLES `banjixinxi` WRITE;
/*!40000 ALTER TABLE `banjixinxi` DISABLE KEYS */;
INSERT INTO `banjixinxi` VALUES (41,'2023-03-24 13:38:07','班级编号1','班级类型1','班级位置1','班级人数1','班主任1','13823888881'),(42,'2023-03-24 13:38:07','班级编号2','班级类型2','班级位置2','班级人数2','班主任2','13823888882'),(43,'2023-03-24 13:38:07','班级编号3','班级类型3','班级位置3','班级人数3','班主任3','13823888883'),(44,'2023-03-24 13:38:07','班级编号4','班级类型4','班级位置4','班级人数4','班主任4','13823888884'),(45,'2023-03-24 13:38:07','班级编号5','班级类型5','班级位置5','班级人数5','班主任5','13823888885'),(46,'2023-03-24 13:38:07','班级编号6','班级类型6','班级位置6','班级人数6','班主任6','13823888886'),(47,'2023-03-24 13:38:07','班级编号7','班级类型7','班级位置7','班级人数7','班主任7','13823888887'),(48,'2023-03-24 13:38:07','班级编号8','班级类型8','班级位置8','班级人数8','班主任8','13823888888');
/*!40000 ALTER TABLE `banjixinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bukaoyuyue`
--

DROP TABLE IF EXISTS `bukaoyuyue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bukaoyuyue` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `xueyuan` varchar(200) DEFAULT NULL COMMENT '学院',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `yuyueshijian` datetime DEFAULT NULL COMMENT '预约时间',
  `yuyueshuoming` longtext COMMENT '预约说明',
  `jiaoshigonghao` varchar(200) DEFAULT NULL COMMENT '教师工号',
  `jiaoshixingming` varchar(200) DEFAULT NULL COMMENT '教师姓名',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=89 DEFAULT CHARSET=utf8 COMMENT='补考预约';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bukaoyuyue`
--

LOCK TABLES `bukaoyuyue` WRITE;
/*!40000 ALTER TABLE `bukaoyuyue` DISABLE KEYS */;
INSERT INTO `bukaoyuyue` VALUES (81,'2023-03-24 13:38:07','学号1','姓名1','学院1','班级1','2023-03-24 21:38:07','预约说明1','教师工号1','教师姓名1','是',''),(82,'2023-03-24 13:38:07','学号2','姓名2','学院2','班级2','2023-03-24 21:38:07','预约说明2','教师工号2','教师姓名2','是',''),(83,'2023-03-24 13:38:07','学号3','姓名3','学院3','班级3','2023-03-24 21:38:07','预约说明3','教师工号3','教师姓名3','是',''),(84,'2023-03-24 13:38:07','学号4','姓名4','学院4','班级4','2023-03-24 21:38:07','预约说明4','教师工号4','教师姓名4','是',''),(85,'2023-03-24 13:38:07','学号5','姓名5','学院5','班级5','2023-03-24 21:38:07','预约说明5','教师工号5','教师姓名5','是',''),(86,'2023-03-24 13:38:07','学号6','姓名6','学院6','班级6','2023-03-24 21:38:07','预约说明6','教师工号6','教师姓名6','是',''),(87,'2023-03-24 13:38:07','学号7','姓名7','学院7','班级7','2023-03-24 21:38:07','预约说明7','教师工号7','教师姓名7','是',''),(88,'2023-03-24 13:38:07','学号8','姓名8','学院8','班级8','2023-03-24 21:38:07','预约说明8','教师工号8','教师姓名8','是','');
/*!40000 ALTER TABLE `bukaoyuyue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chengjixinxi`
--

DROP TABLE IF EXISTS `chengjixinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chengjixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `xueyuan` varchar(200) DEFAULT NULL COMMENT '学院',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `kemu` varchar(200) DEFAULT NULL COMMENT '科目',
  `fenshu` float DEFAULT NULL COMMENT '分数',
  `kaikexueqi` varchar(200) DEFAULT NULL COMMENT '开课学期',
  `jiaoshigonghao` varchar(200) DEFAULT NULL COMMENT '教师工号',
  `jiaoshixingming` varchar(200) DEFAULT NULL COMMENT '教师姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8 COMMENT='成绩信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chengjixinxi`
--

LOCK TABLES `chengjixinxi` WRITE;
/*!40000 ALTER TABLE `chengjixinxi` DISABLE KEYS */;
INSERT INTO `chengjixinxi` VALUES (61,'2023-03-24 13:38:07','学号1','姓名1','学院1','班级1','科目1',1,'开课学期1','教师工号1','教师姓名1'),(62,'2023-03-24 13:38:07','学号2','姓名2','学院2','班级2','科目2',2,'开课学期2','教师工号2','教师姓名2'),(63,'2023-03-24 13:38:07','学号3','姓名3','学院3','班级3','科目3',3,'开课学期3','教师工号3','教师姓名3'),(64,'2023-03-24 13:38:07','学号4','姓名4','学院4','班级4','科目4',4,'开课学期4','教师工号4','教师姓名4'),(65,'2023-03-24 13:38:07','学号5','姓名5','学院5','班级5','科目5',5,'开课学期5','教师工号5','教师姓名5'),(66,'2023-03-24 13:38:07','学号6','姓名6','学院6','班级6','科目6',6,'开课学期6','教师工号6','教师姓名6'),(67,'2023-03-24 13:38:07','学号7','姓名7','学院7','班级7','科目7',7,'开课学期7','教师工号7','教师姓名7'),(68,'2023-03-24 13:38:07','学号8','姓名8','学院8','班级8','科目8',8,'开课学期8','教师工号8','教师姓名8');
/*!40000 ALTER TABLE `chengjixinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gonggaoxinxi`
--

DROP TABLE IF EXISTS `gonggaoxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gonggaoxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `gonggaoneirong` longtext COMMENT '公告内容',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8 COMMENT='公告信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gonggaoxinxi`
--

LOCK TABLES `gonggaoxinxi` WRITE;
/*!40000 ALTER TABLE `gonggaoxinxi` DISABLE KEYS */;
INSERT INTO `gonggaoxinxi` VALUES (101,'2023-03-24 13:38:07','标题1','公告内容1','2023-03-24'),(102,'2023-03-24 13:38:07','标题2','公告内容2','2023-03-24'),(103,'2023-03-24 13:38:07','标题3','公告内容3','2023-03-24'),(104,'2023-03-24 13:38:07','标题4','公告内容4','2023-03-24'),(105,'2023-03-24 13:38:07','标题5','公告内容5','2023-03-24'),(106,'2023-03-24 13:38:07','标题6','公告内容6','2023-03-24'),(107,'2023-03-24 13:38:07','标题7','公告内容7','2023-03-24'),(108,'2023-03-24 13:38:07','标题8','公告内容8','2023-03-24');
/*!40000 ALTER TABLE `gonggaoxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `guaketongji`
--

DROP TABLE IF EXISTS `guaketongji`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `guaketongji` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kemumingcheng` varchar(200) DEFAULT NULL COMMENT '科目名称',
  `kaikexueqi` varchar(200) DEFAULT NULL COMMENT '开课学期',
  `guakerenshu` int(11) DEFAULT NULL COMMENT '挂科人数',
  `tongjishijian` date DEFAULT NULL COMMENT '统计时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=99 DEFAULT CHARSET=utf8 COMMENT='挂科统计';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guaketongji`
--

LOCK TABLES `guaketongji` WRITE;
/*!40000 ALTER TABLE `guaketongji` DISABLE KEYS */;
INSERT INTO `guaketongji` VALUES (91,'2023-03-24 13:38:07','科目名称1','开课学期1',1,'2023-03-24'),(92,'2023-03-24 13:38:07','科目名称2','开课学期2',2,'2023-03-24'),(93,'2023-03-24 13:38:07','科目名称3','开课学期3',3,'2023-03-24'),(94,'2023-03-24 13:38:07','科目名称4','开课学期4',4,'2023-03-24'),(95,'2023-03-24 13:38:07','科目名称5','开课学期5',5,'2023-03-24'),(96,'2023-03-24 13:38:07','科目名称6','开课学期6',6,'2023-03-24'),(97,'2023-03-24 13:38:07','科目名称7','开课学期7',7,'2023-03-24'),(98,'2023-03-24 13:38:07','科目名称8','开课学期8',8,'2023-03-24');
/*!40000 ALTER TABLE `guaketongji` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiaoshi`
--

DROP TABLE IF EXISTS `jiaoshi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiaoshi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiaoshigonghao` varchar(200) NOT NULL COMMENT '教师工号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `jiaoshixingming` varchar(200) NOT NULL COMMENT '教师姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `xueyuan` varchar(200) DEFAULT NULL COMMENT '学院',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`),
  UNIQUE KEY `jiaoshigonghao` (`jiaoshigonghao`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COMMENT='教师';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiaoshi`
--

LOCK TABLES `jiaoshi` WRITE;
/*!40000 ALTER TABLE `jiaoshi` DISABLE KEYS */;
INSERT INTO `jiaoshi` VALUES (21,'2023-03-24 13:38:07','教师工号1','123456','教师姓名1','男','学院1','班级1','13823888881','773890001@qq.com'),(22,'2023-03-24 13:38:07','教师工号2','123456','教师姓名2','男','学院2','班级2','13823888882','773890002@qq.com'),(23,'2023-03-24 13:38:07','教师工号3','123456','教师姓名3','男','学院3','班级3','13823888883','773890003@qq.com'),(24,'2023-03-24 13:38:07','教师工号4','123456','教师姓名4','男','学院4','班级4','13823888884','773890004@qq.com'),(25,'2023-03-24 13:38:07','教师工号5','123456','教师姓名5','男','学院5','班级5','13823888885','773890005@qq.com'),(26,'2023-03-24 13:38:07','教师工号6','123456','教师姓名6','男','学院6','班级6','13823888886','773890006@qq.com'),(27,'2023-03-24 13:38:07','教师工号7','123456','教师姓名7','男','学院7','班级7','13823888887','773890007@qq.com'),(28,'2023-03-24 13:38:07','教师工号8','123456','教师姓名8','男','学院8','班级8','13823888888','773890008@qq.com');
/*!40000 ALTER TABLE `jiaoshi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kemuxinxi`
--

DROP TABLE IF EXISTS `kemuxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kemuxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kemumingcheng` varchar(200) DEFAULT NULL COMMENT '科目名称',
  `kaikexueqi` varchar(200) DEFAULT NULL COMMENT '开课学期',
  `kemujianjie` longtext COMMENT '科目简介',
  `kaikeshijian` datetime DEFAULT NULL COMMENT '开课时间',
  `jiekeshijian` datetime DEFAULT NULL COMMENT '结课时间',
  `jiaoshigonghao` varchar(200) DEFAULT NULL COMMENT '教师工号',
  `jiaoshixingming` varchar(200) DEFAULT NULL COMMENT '教师姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8 COMMENT='科目信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kemuxinxi`
--

LOCK TABLES `kemuxinxi` WRITE;
/*!40000 ALTER TABLE `kemuxinxi` DISABLE KEYS */;
INSERT INTO `kemuxinxi` VALUES (51,'2023-03-24 13:38:07','科目名称1','开课学期1','科目简介1','2023-03-24 21:38:07','2023-03-24 21:38:07','教师工号1','教师姓名1'),(52,'2023-03-24 13:38:07','科目名称2','开课学期2','科目简介2','2023-03-24 21:38:07','2023-03-24 21:38:07','教师工号2','教师姓名2'),(53,'2023-03-24 13:38:07','科目名称3','开课学期3','科目简介3','2023-03-24 21:38:07','2023-03-24 21:38:07','教师工号3','教师姓名3'),(54,'2023-03-24 13:38:07','科目名称4','开课学期4','科目简介4','2023-03-24 21:38:07','2023-03-24 21:38:07','教师工号4','教师姓名4'),(55,'2023-03-24 13:38:07','科目名称5','开课学期5','科目简介5','2023-03-24 21:38:07','2023-03-24 21:38:07','教师工号5','教师姓名5'),(56,'2023-03-24 13:38:07','科目名称6','开课学期6','科目简介6','2023-03-24 21:38:07','2023-03-24 21:38:07','教师工号6','教师姓名6'),(57,'2023-03-24 13:38:07','科目名称7','开课学期7','科目简介7','2023-03-24 21:38:07','2023-03-24 21:38:07','教师工号7','教师姓名7'),(58,'2023-03-24 13:38:07','科目名称8','开课学期8','科目简介8','2023-03-24 21:38:07','2023-03-24 21:38:07','教师工号8','教师姓名8');
/*!40000 ALTER TABLE `kemuxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin','管理员','2023-03-24 13:38:08');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xuesheng`
--

DROP TABLE IF EXISTS `xuesheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xuesheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) NOT NULL COMMENT '学号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `xueyuan` varchar(200) DEFAULT NULL COMMENT '学院',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xuehao` (`xuehao`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='学生';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xuesheng`
--

LOCK TABLES `xuesheng` WRITE;
/*!40000 ALTER TABLE `xuesheng` DISABLE KEYS */;
INSERT INTO `xuesheng` VALUES (11,'2023-03-24 13:38:07','学号1','123456','姓名1','男','学院1','班级1','13823888881','773890001@qq.com'),(12,'2023-03-24 13:38:07','学号2','123456','姓名2','男','学院2','班级2','13823888882','773890002@qq.com'),(13,'2023-03-24 13:38:07','学号3','123456','姓名3','男','学院3','班级3','13823888883','773890003@qq.com'),(14,'2023-03-24 13:38:07','学号4','123456','姓名4','男','学院4','班级4','13823888884','773890004@qq.com'),(15,'2023-03-24 13:38:07','学号5','123456','姓名5','男','学院5','班级5','13823888885','773890005@qq.com'),(16,'2023-03-24 13:38:07','学号6','123456','姓名6','男','学院6','班级6','13823888886','773890006@qq.com'),(17,'2023-03-24 13:38:07','学号7','123456','姓名7','男','学院7','班级7','13823888887','773890007@qq.com'),(18,'2023-03-24 13:38:07','学号8','123456','姓名8','男','学院8','班级8','13823888888','773890008@qq.com');
/*!40000 ALTER TABLE `xuesheng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xueyuanxinxi`
--

DROP TABLE IF EXISTS `xueyuanxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xueyuanxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xueyuanmingcheng` varchar(200) DEFAULT NULL COMMENT '学院名称',
  `xueyuanleixing` varchar(200) DEFAULT NULL COMMENT '学院类型',
  `xueyuandizhi` varchar(200) DEFAULT NULL COMMENT '学院地址',
  `fuzeren` varchar(200) DEFAULT NULL COMMENT '负责人',
  `xueyuandianhua` varchar(200) DEFAULT NULL COMMENT '学院电话',
  `xueyuanjianjie` longtext COMMENT '学院简介',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8 COMMENT='学院信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xueyuanxinxi`
--

LOCK TABLES `xueyuanxinxi` WRITE;
/*!40000 ALTER TABLE `xueyuanxinxi` DISABLE KEYS */;
INSERT INTO `xueyuanxinxi` VALUES (31,'2023-03-24 13:38:07','学院名称1','学院类型1','学院地址1','负责人1','13823888881','学院简介1'),(32,'2023-03-24 13:38:07','学院名称2','学院类型2','学院地址2','负责人2','13823888882','学院简介2'),(33,'2023-03-24 13:38:07','学院名称3','学院类型3','学院地址3','负责人3','13823888883','学院简介3'),(34,'2023-03-24 13:38:07','学院名称4','学院类型4','学院地址4','负责人4','13823888884','学院简介4'),(35,'2023-03-24 13:38:07','学院名称5','学院类型5','学院地址5','负责人5','13823888885','学院简介5'),(36,'2023-03-24 13:38:07','学院名称6','学院类型6','学院地址6','负责人6','13823888886','学院简介6'),(37,'2023-03-24 13:38:07','学院名称7','学院类型7','学院地址7','负责人7','13823888887','学院简介7'),(38,'2023-03-24 13:38:07','学院名称8','学院类型8','学院地址8','负责人8','13823888888','学院简介8');
/*!40000 ALTER TABLE `xueyuanxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yujingxiaoxi`
--

DROP TABLE IF EXISTS `yujingxiaoxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yujingxiaoxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `xiaoxineirong` longtext COMMENT '消息内容',
  `fasongshijian` datetime DEFAULT NULL COMMENT '发送时间',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `jiaoshigonghao` varchar(200) DEFAULT NULL COMMENT '教师工号',
  `jiaoshixingming` varchar(200) DEFAULT NULL COMMENT '教师姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=utf8 COMMENT='预警消息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yujingxiaoxi`
--

LOCK TABLES `yujingxiaoxi` WRITE;
/*!40000 ALTER TABLE `yujingxiaoxi` DISABLE KEYS */;
INSERT INTO `yujingxiaoxi` VALUES (71,'2023-03-24 13:38:07','标题1','消息内容1','2023-03-24 21:38:07','学号1','教师工号1','教师姓名1'),(72,'2023-03-24 13:38:07','标题2','消息内容2','2023-03-24 21:38:07','学号2','教师工号2','教师姓名2'),(73,'2023-03-24 13:38:07','标题3','消息内容3','2023-03-24 21:38:07','学号3','教师工号3','教师姓名3'),(74,'2023-03-24 13:38:07','标题4','消息内容4','2023-03-24 21:38:07','学号4','教师工号4','教师姓名4'),(75,'2023-03-24 13:38:07','标题5','消息内容5','2023-03-24 21:38:07','学号5','教师工号5','教师姓名5'),(76,'2023-03-24 13:38:07','标题6','消息内容6','2023-03-24 21:38:07','学号6','教师工号6','教师姓名6'),(77,'2023-03-24 13:38:07','标题7','消息内容7','2023-03-24 21:38:07','学号7','教师工号7','教师姓名7'),(78,'2023-03-24 13:38:07','标题8','消息内容8','2023-03-24 21:38:07','学号8','教师工号8','教师姓名8');
/*!40000 ALTER TABLE `yujingxiaoxi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-24 21:41:16
