/*
SQLyog v10.2 
MySQL - 5.6.21 : Database - companyfinancialsystem
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`companyfinancialsystem` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `companyfinancialsystem`;

/*Table structure for table `contract` */

DROP TABLE IF EXISTS `contract`;

CREATE TABLE `contract` (
  `contractID` char(20) NOT NULL DEFAULT '',
  `name` char(20) DEFAULT NULL,
  `startTime` date DEFAULT NULL,
  `finishTime` date DEFAULT NULL,
  `totalPayment` decimal(8,0) DEFAULT NULL,
  `unpayment` decimal(8,0) DEFAULT NULL,
  `contractType` decimal(1,0) DEFAULT NULL,
  PRIMARY KEY (`contractID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*Table structure for table `companyinvoice` */

DROP TABLE IF EXISTS `companyinvoice`;

CREATE TABLE `companyinvoice` (
  `cInvoiceID` char(8) NOT NULL DEFAULT '',
  `contractID` char(20) DEFAULT NULL,
  `payment` decimal(8,0) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `type` decimal(1,0) DEFAULT NULL,
  PRIMARY KEY (`cInvoiceID`),
  KEY `FK_Relationship_4` (`contractID`),
  CONSTRAINT `FK_Relationship_4` FOREIGN KEY (`contractID`) REFERENCES `contract` (`contractID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `ID` char(8) NOT NULL DEFAULT '',
  `password` char(8) NOT NULL,
  `authority` decimal(1,0) NOT NULL,
  `name` char(20) DEFAULT NULL,
  `sex` char(5) DEFAULT NULL,
  `birthday` char(10) DEFAULT NULL,
  `address` char(100) DEFAULT NULL,
  `phone` char(11) DEFAULT NULL,
  `position` char(20) DEFAULT NULL,
  `IDcard` char(18) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*Table structure for table `notice` */

DROP TABLE IF EXISTS `notice`;

CREATE TABLE `notice` (
  `noticeID` char(8) NOT NULL DEFAULT '',
  `ID` char(8) NOT NULL DEFAULT '',
  `content` char(255) DEFAULT NULL,
  `Date` datetime DEFAULT NULL,
  `isread` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`noticeID`,`ID`),
  KEY `FK_Relationship_5` (`ID`),
  CONSTRAINT `FK_Relationship_5` FOREIGN KEY (`ID`) REFERENCES `user` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `personalinvoice` */

DROP TABLE IF EXISTS `personalinvoice`;

CREATE TABLE `personalinvoice` (
  `pInvoiceID` char(8) NOT NULL DEFAULT '',
  `payment` decimal(8,0) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  PRIMARY KEY (`pInvoiceID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `reim` */

DROP TABLE IF EXISTS `reim`;

CREATE TABLE `reim` (
  `ID` char(8) NOT NULL DEFAULT '',
  `pInvoiceID` char(8) NOT NULL DEFAULT '',
  `isread` tinyint(1) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `goods` char(50) DEFAULT NULL,
  `number` decimal(8,0) DEFAULT NULL,
  `unitPrice` decimal(8,0) DEFAULT NULL,
  `remark` char(255) DEFAULT NULL,
  PRIMARY KEY (`ID`,`pInvoiceID`),
  KEY `FK_Reim2` (`pInvoiceID`),
  CONSTRAINT `FK_Reim` FOREIGN KEY (`ID`) REFERENCES `user` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_Reim2` FOREIGN KEY (`pInvoiceID`) REFERENCES `personalinvoice` (`pInvoiceID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `salarycurrent` */

DROP TABLE IF EXISTS `salarycurrent`;

CREATE TABLE `salarycurrent` (
  `ID` char(8) NOT NULL DEFAULT '',
  `basicSalary` decimal(8,0) DEFAULT NULL,
  `livingAllowance` decimal(8,0) DEFAULT NULL,
  `workDay` decimal(8,0) DEFAULT NULL,
  `attendanceAward` decimal(8,0) DEFAULT NULL,
  `socialSecurity` decimal(8,0) DEFAULT NULL,
  `tax` decimal(8,0) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `FK_Relationship_7` FOREIGN KEY (`ID`) REFERENCES `user` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `salaryhistory` */

DROP TABLE IF EXISTS `salaryhistory`;

CREATE TABLE `salaryhistory` (
  `payoffDate` date NOT NULL DEFAULT '0000-00-00',
  `ID` char(8) NOT NULL DEFAULT '',
  `basicSalary` decimal(8,0) DEFAULT NULL,
  `livingAllowance` decimal(8,0) DEFAULT NULL,
  `workDay` decimal(8,0) DEFAULT NULL,
  `attendanceAward` decimal(8,0) DEFAULT NULL,
  `socialSecurity` decimal(8,0) DEFAULT NULL,
  `tax` decimal(8,0) DEFAULT NULL,
  `totalSalary` decimal(8,0) DEFAULT NULL,
  PRIMARY KEY (`payoffDate`,`ID`),
  KEY `FK_Relationship_6` (`ID`),
  CONSTRAINT `FK_Relationship_6` FOREIGN KEY (`ID`) REFERENCES `user` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
