/*
Navicat MySQL Data Transfer

Source Server         : 192.168.199.115
Source Server Version : 50722
Source Host           : 192.168.199.115:3306
Source Database       : d_admin

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2018-06-01 19:23:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_system_job
-- ----------------------------
DROP TABLE IF EXISTS `t_system_job`;
CREATE TABLE `t_system_job` (
  `id` bigint(20) unsigned NOT NULL COMMENT '主键',
  `job_name` varchar(100) DEFAULT NULL COMMENT '任务名称',
  `job_class_name` varchar(100) DEFAULT NULL COMMENT '任务类名',
  `job_status` tinyint(3) unsigned DEFAULT NULL COMMENT '任务状态',
  `cron` varchar(20) DEFAULT NULL COMMENT '任务cron表达式',
  `pre_fire_time` datetime DEFAULT NULL COMMENT '上次执行时间',
  `next_fire_time` datetime DEFAULT NULL COMMENT '下次执行时间',
  `start_time` datetime DEFAULT NULL COMMENT '任务开始时间',
  `end_time` datetime DEFAULT NULL COMMENT '任务结束时间',
  `created` datetime DEFAULT NULL COMMENT '创建时间',
  `modified` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_system_job
-- ----------------------------

-- ----------------------------
-- Table structure for t_system_log
-- ----------------------------
DROP TABLE IF EXISTS `t_system_log`;
CREATE TABLE `t_system_log` (
  `id` bigint(20) unsigned NOT NULL COMMENT '主键',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_system_log
-- ----------------------------

-- ----------------------------
-- Table structure for t_system_menu
-- ----------------------------
DROP TABLE IF EXISTS `t_system_menu`;
CREATE TABLE `t_system_menu` (
  `id` bigint(20) unsigned NOT NULL COMMENT '主键',
  `parent_id` bigint(20) unsigned DEFAULT NULL COMMENT '父菜单id',
  `menu_name` varchar(50) DEFAULT NULL COMMENT '菜单名称',
  `menu_url` varchar(50) DEFAULT NULL COMMENT '菜单地址',
  `menu_level` tinyint(3) unsigned DEFAULT NULL COMMENT '菜单等级',
  `menu_order` tinyint(3) unsigned DEFAULT NULL COMMENT '菜单排序',
  `created` datetime DEFAULT NULL COMMENT '创建时间',
  `modified` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_system_menu
-- ----------------------------

-- ----------------------------
-- Table structure for t_system_role
-- ----------------------------
DROP TABLE IF EXISTS `t_system_role`;
CREATE TABLE `t_system_role` (
  `id` bigint(20) unsigned NOT NULL COMMENT '主键',
  `role_name` varchar(50) DEFAULT NULL COMMENT '角色名称',
  `created` datetime DEFAULT NULL COMMENT '创建时间',
  `modified` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_system_role
-- ----------------------------

-- ----------------------------
-- Table structure for t_system_role_menu_relation
-- ----------------------------
DROP TABLE IF EXISTS `t_system_role_menu_relation`;
CREATE TABLE `t_system_role_menu_relation` (
  `id` bigint(20) unsigned NOT NULL COMMENT '主键',
  `role_id` bigint(20) unsigned DEFAULT NULL COMMENT '角色id',
  `menu_id` bigint(20) unsigned DEFAULT NULL COMMENT '菜单id',
  `created` datetime DEFAULT NULL COMMENT '创建时间',
  `modified` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_system_role_menu_relation
-- ----------------------------

-- ----------------------------
-- Table structure for t_system_user
-- ----------------------------
DROP TABLE IF EXISTS `t_system_user`;
CREATE TABLE `t_system_user` (
  `id` bigint(20) unsigned NOT NULL COMMENT '主键',
  `user_name` varchar(20) DEFAULT NULL COMMENT '用户名',
  `password` varchar(32) DEFAULT NULL COMMENT '密码',
  `user_status` tinyint(3) unsigned DEFAULT NULL COMMENT '用户状态',
  `nick_name` varchar(50) DEFAULT NULL COMMENT '昵称',
  `gender` tinyint(3) unsigned DEFAULT NULL COMMENT '性别',
  `age` tinyint(3) unsigned DEFAULT NULL COMMENT '年龄',
  `mobile` varchar(11) DEFAULT NULL COMMENT '手机',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `created` datetime DEFAULT NULL COMMENT '创建时间',
  `modified` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_user_name` (`user_name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_system_user
-- ----------------------------

-- ----------------------------
-- Table structure for t_system_user_role_relation
-- ----------------------------
DROP TABLE IF EXISTS `t_system_user_role_relation`;
CREATE TABLE `t_system_user_role_relation` (
  `id` bigint(20) unsigned NOT NULL COMMENT '主键',
  `user_id` bigint(20) unsigned DEFAULT NULL COMMENT '用户id',
  `role_id` bigint(20) unsigned DEFAULT NULL COMMENT '角色id',
  `created` datetime DEFAULT NULL COMMENT '创建时间',
  `modified` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_system_user_role_relation
-- ----------------------------
