/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80011
Source Host           : localhost:3306
Source Database       : shop

Target Server Type    : MYSQL
Target Server Version : 80011
File Encoding         : 65001

Date: 2019-06-19 13:12:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for classify
-- ----------------------------
DROP TABLE IF EXISTS `classify`;
CREATE TABLE `classify` (
  `id` int(11) NOT NULL,
  `name` char(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of classify
-- ----------------------------
INSERT INTO `classify` VALUES ('1', '计算机类');
INSERT INTO `classify` VALUES ('2', '社会科学类');
INSERT INTO `classify` VALUES ('3', '小说类');

-- ----------------------------
-- Table structure for cosmeticform
-- ----------------------------
DROP TABLE IF EXISTS `cosmeticform`;
CREATE TABLE `cosmeticform` (
  `cosmetic_number` char(255) NOT NULL,
  `cosmetic_name` char(255) DEFAULT NULL,
  `cosmetic_made` char(255) DEFAULT NULL,
  `cosmetic_price` float DEFAULT NULL,
  `cosmetic_mess` char(255) DEFAULT NULL,
  `cosmetic_pic` char(255) DEFAULT NULL,
  `id` int(11) DEFAULT NULL,
  PRIMARY KEY (`cosmetic_number`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of cosmeticform
-- ----------------------------
INSERT INTO `cosmeticform` VALUES ('Estee001', '三生三世十里桃花', '湖南文艺出版社', '38', '仙侠魔幻系列热销产品', 'est1.jpg', '3');
INSERT INTO `cosmeticform` VALUES ('lan001', 'Java实战指南', '电子工业出版社', '25', 'Java多线程设计模式', 'lan1.jpg', '1');
INSERT INTO `cosmeticform` VALUES ('lan002', '明解C语言', '人民邮电出版社', '38', 'C语言基础', 'lan2.jpg', '1');
INSERT INTO `cosmeticform` VALUES ('science001', '人与自然', '东华大学出版社', '33', '揭秘人与自然相处的秘密', 'ziran1.jpg', '2');

-- ----------------------------
-- Table structure for orderform
-- ----------------------------
DROP TABLE IF EXISTS `orderform`;
CREATE TABLE `orderform` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `logname` char(255) DEFAULT NULL,
  `mess` char(255) DEFAULT NULL,
  `sum` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of orderform
-- ----------------------------
INSERT INTO `orderform` VALUES ('1', 'zhang', '1:(lan001,Java实战指南,电子科技出版社,25.0)2:(lan002,明解C语言,人民邮电出版社,38)', '63');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `logname` char(255) NOT NULL,
  `password` char(255) DEFAULT NULL,
  `phone` char(255) DEFAULT NULL,
  `address` char(255) DEFAULT NULL,
  `realname` char(255) DEFAULT NULL,
  PRIMARY KEY (`logname`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('an', '456', '44444', 'dd', null);
INSERT INTO `user` VALUES ('hu', '234', '22222', 'bb', '');
INSERT INTO `user` VALUES ('ma', '345', '33333', 'cc', null);
INSERT INTO `user` VALUES ('wang', '123', '11111', 'aa', null);
