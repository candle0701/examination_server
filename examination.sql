/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : examination

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 19/04/2019 16:57:48
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bank
-- ----------------------------
DROP TABLE IF EXISTS `bank`;
CREATE TABLE `bank`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `zone` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '校区',
  `title` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '试题名称',
  `opendate` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '开放时间',
  `question_type` int(11) NULL DEFAULT NULL COMMENT '试题类型:1单选 2 多选 3 判断',
  `grade` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`, `zone`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of bank
-- ----------------------------
INSERT INTO `bank` VALUES ('bank1', '魏都三中', '2019年秋季班同步练习期末冲刺', '2019-04-16', NULL, '三', 'http://img95.699pic.com/element/40093/3731.png_300.png');
INSERT INTO `bank` VALUES ('bank2', '许昌学院', '2019年春季班同步练习期末冲刺', '2019-04-20', NULL, '三', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1555578046543&di=61ef4b9df68d2ec099b1e5b627abd350&imgtype=0&src=http%3A%2F%2Fimage5.suning.cn%2Fb2c%2Fcatentries%2F000000000132650514_1_400x400.jpg');
INSERT INTO `bank` VALUES ('bank3', '时代广场', '2019年夏季班同步练习期末冲刺', '2019-04-27', NULL, '三', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1555578070307&di=d99fa02aa9a377b11882f305ac59e939&imgtype=0&src=http%3A%2F%2Fwww.kfzimg.com%2FG03%2FM00%2F99%2FB7%2FpYYBAFWm8AyAELUaAACEj-pf2CA491_n.jpg');

-- ----------------------------
-- Table structure for choice
-- ----------------------------
DROP TABLE IF EXISTS `choice`;
CREATE TABLE `choice`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `choice_title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '选择题名称',
  `choice_a` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '选择题名称',
  `choice_b` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '选择题名称',
  `choice_c` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '选择题名称',
  `choice_d` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '选择题名称',
  `choice_e` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `choice_answer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '选择题答案',
  `choice_sort` int(11) NULL DEFAULT NULL COMMENT '选择题序号',
  `choice_img_url1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `choice_img_url2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `choice_img_url3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `choice_img_url4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `examTime` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `grade` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of choice
-- ----------------------------
INSERT INTO `choice` VALUES ('11111', '大象装冰箱分几步', '打开冰箱门', '把大象塞进去', '关上冰箱门', '以上三个步骤缺一不可', NULL, 'D', 1, NULL, NULL, NULL, NULL, '2019-04-16', '三');
INSERT INTO `choice` VALUES ('22222', '下雨天怎么上学', '打伞', '父母接送', '请假在家休息', '以上都可以', NULL, 'D', 2, NULL, NULL, NULL, NULL, '2019-04-16', '三');
INSERT INTO `choice` VALUES ('33333', '昨天下雨了，一共多少滴？', '30', '60', '90', '1000', NULL, 'A', NULL, 'http://img2.imgtn.bdimg.com/it/u=3154322533,1786994993&fm=26&gp=0.jpg', NULL, NULL, NULL, '2019-04-16', '三');
INSERT INTO `choice` VALUES ('44444', '一个成年人每天喝多少水？', '一杯', '一瓶', '一碗', '一缸', NULL, 'B', NULL, NULL, NULL, NULL, NULL, '2019-04-16', '三');

-- ----------------------------
-- Table structure for completion
-- ----------------------------
DROP TABLE IF EXISTS `completion`;
CREATE TABLE `completion`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `completion_title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '填空题名称',
  `completion_answer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '填空题答案',
  `completion_sort` int(11) NOT NULL COMMENT '填空题序号',
  `completion_img1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `completion_img2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `completion_img3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `completion_img4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `completion_img5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `grade` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for csessioninfo
-- ----------------------------
DROP TABLE IF EXISTS `csessioninfo`;
CREATE TABLE `csessioninfo`  (
  `open_id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `uuid` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `skey` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_visit_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `session_key` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `user_info` varchar(2048) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`open_id`) USING BTREE,
  INDEX `openid`(`open_id`) USING BTREE,
  INDEX `skey`(`skey`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '会话管理用户信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for judge
-- ----------------------------
DROP TABLE IF EXISTS `judge`;
CREATE TABLE `judge`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `judge_title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '判断题名称',
  `judge_answer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '判断题答案',
  `judge_sort` int(11) NOT NULL COMMENT '判断题序号',
  `judge_img1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `judge_img2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `judge_img3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `judge_img4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `judge_img5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `grade` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for queans
-- ----------------------------
DROP TABLE IF EXISTS `queans`;
CREATE TABLE `queans`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `queans_answer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '问题提答案',
  `queans_title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '问答题名称',
  `queans_sort` int(11) NOT NULL COMMENT '问答题序号',
  `queans_img1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `queans_img2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `queans_img3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `queans_img4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `queans_img5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `grade` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age_index` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `province` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `city` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `area` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `telephone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `gender` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别1:男2：女',
  `nickname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `grade` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `grade_index` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('0325cc957a4b4cd0b6f8ed8ade49338d', NULL, NULL, '2', '8', '河南省', '三门峡市', '湖滨区', '八一路27', '130', '男', '李秘', NULL, '三', '2');

-- ----------------------------
-- Table structure for wrongs
-- ----------------------------
DROP TABLE IF EXISTS `wrongs`;
CREATE TABLE `wrongs`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_id` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `completion_id` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `choice_id` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `judge_id` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `queans_id` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `examtime` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `answer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `bank_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wrongs
-- ----------------------------
INSERT INTO `wrongs` VALUES ('6ddd970f56a8487fa64d585c54ff3b38', '0325cc957a4b4cd0b6f8ed8ade49338d', NULL, '44444', NULL, NULL, '2019-04-16', 'C', 'bank1');
INSERT INTO `wrongs` VALUES ('aa122e06f97645a8aa393c8945d1defc', '0325cc957a4b4cd0b6f8ed8ade49338d', NULL, '11111', NULL, NULL, '2019-04-16', 'D', 'bank1');
INSERT INTO `wrongs` VALUES ('b06ca84a61c644de86ab0e340bad54a0', '0325cc957a4b4cd0b6f8ed8ade49338d', NULL, '22222', NULL, NULL, '2019-04-16', 'D', 'bank1');
INSERT INTO `wrongs` VALUES ('cf654e84ed1c4392af9ea8ac36d61b75', '0325cc957a4b4cd0b6f8ed8ade49338d', NULL, '33333', NULL, NULL, '2019-04-16', 'C', 'bank1');

SET FOREIGN_KEY_CHECKS = 1;
