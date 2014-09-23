/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50524
Source Host           : localhost:3306
Source Database       : calendar

Target Server Type    : MYSQL
Target Server Version : 50524
File Encoding         : 65001

Date: 2014-08-14 15:41:10
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `calendar_users`
-- ----------------------------
DROP TABLE IF EXISTS `calendar_users`;
CREATE TABLE `calendar_users` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of calendar_users
-- ----------------------------
INSERT INTO `calendar_users` VALUES ('0', 'user2@example.com', 'user2', 'User', '2');
INSERT INTO `calendar_users` VALUES ('1', 'admin1@example.com', 'admin1', 'Admin', '1');
INSERT INTO `calendar_users` VALUES ('2', 'user1@example.com', 'user1', 'User', '1');

-- ----------------------------
-- Table structure for `events`
-- ----------------------------
DROP TABLE IF EXISTS `events`;
CREATE TABLE `events` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `when` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `summary` varchar(255) NOT NULL,
  `description` varchar(500) NOT NULL,
  `owner` int(10) NOT NULL,
  `attendee` int(10) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `owner` (`owner`),
  KEY `attendee` (`attendee`),
  CONSTRAINT `events_ibfk_1` FOREIGN KEY (`owner`) REFERENCES `calendar_users` (`id`),
  CONSTRAINT `events_ibfk_2` FOREIGN KEY (`attendee`) REFERENCES `calendar_users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of events
-- ----------------------------
INSERT INTO `events` VALUES ('100', '2014-08-14 15:28:23', 'Birthday Party', 'This is going to be a great birthday', '0', '1');
INSERT INTO `events` VALUES ('101', '2014-08-14 15:28:29', 'Conference Call', 'Call with the client', '2', '0');
INSERT INTO `events` VALUES ('102', '2014-08-14 15:28:41', 'Lunch', 'Eating lunch together', '1', '2');
