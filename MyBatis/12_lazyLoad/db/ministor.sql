/*
Navicat MySQL Data Transfer

Source Server         : MySQL123123
Source Server Version : 80015
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 80015
File Encoding         : 65001

Date: 2019-03-23 15:21:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ministor
-- ----------------------------
DROP TABLE IF EXISTS `ministor`;
CREATE TABLE `ministor` (
  `mid` int(5) NOT NULL AUTO_INCREMENT,
  `mname` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `countryId` int(5) DEFAULT NULL,
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of ministor
-- ----------------------------
INSERT INTO `ministor` VALUES ('1', 'aaa', '1');
INSERT INTO `ministor` VALUES ('2', 'bbb', '1');
INSERT INTO `ministor` VALUES ('3', 'ccc', '1');
INSERT INTO `ministor` VALUES ('4', 'ddd', '2');
INSERT INTO `ministor` VALUES ('5', 'eee', '2');
