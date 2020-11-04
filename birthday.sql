/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : birthday

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 22/07/2019 09:55:56
*/

SET NAMES utf8mb4;
#SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for count
-- ----------------------------
DROP TABLE IF EXISTS `count`;
CREATE TABLE `count`  (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `message` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of count
-- ----------------------------
INSERT INTO `count` VALUES (0, '不动脑筋，还想要礼物？');
INSERT INTO `count` VALUES (1, '点点点，一直点！');
INSERT INTO `count` VALUES (2, '不用点了，没有正确按钮。');
INSERT INTO `count` VALUES (3, '你看你还不死心！');
INSERT INTO `count` VALUES (4, '给我主人200元我就告诉你应该点哪个？');
INSERT INTO `count` VALUES (5, '小仙女笨笨 ~ 略~！略~！略~！略~！');
INSERT INTO `count` VALUES (7, '试呀试呀试到天荒地老');
INSERT INTO `count` VALUES (8, '正确按钮似乎和数字有关');
INSERT INTO `count` VALUES (9, '我是一个~！小小的确定。深深的藏在页面之中');
INSERT INTO `count` VALUES (10, '据说程序员都是按F12打开控制台的');
INSERT INTO `count` VALUES (11, '你打吧~打死我都不会说的。');
INSERT INTO `count` VALUES (12, '点坏鼠标自己买，千万不要气得砸电脑哦^v^');
INSERT INTO `count` VALUES (13, '生活如此艰苦，小仙女却如此暴躁。这样不好，不好·！');
INSERT INTO `count` VALUES (14, '听说控制台里有个id叫submit的家伙，那家伙欠我钱。因此我要出卖他');
INSERT INTO `count` VALUES (15, '我要这鼠标有何用？这么多确定点也点不过来');
INSERT INTO `count` VALUES (16, '听说一个确定点很多下说不定会有奇迹出现哦~！');
INSERT INTO `count` VALUES (17, NULL);

-- ----------------------------
-- Table structure for coupon
-- ----------------------------
DROP TABLE IF EXISTS `coupon`;
CREATE TABLE `coupon`  (
  `uuid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0',
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `state` int(255) NULL DEFAULT NULL,
  `brief` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ispass` int(255) NULL DEFAULT NULL,
  PRIMARY KEY (`uuid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of coupon
-- ----------------------------
INSERT INTO `coupon` VALUES ('02303049-2b8c-43f7-9', '小仙女搓澡券', 1, '进行全身服务搓澡一次', 1);
INSERT INTO `coupon` VALUES ('3a14d5ed-95ff-42b0-9', '小仙女贪吃券', 0, '该券可在一起吃饭时未满200元的情况下令老公全额支付', 0);
INSERT INTO `coupon` VALUES ('5207ce85-b457-43e9-a', '可爱老公刷完券', 0, '该券可在休息日令老公洗碗一次', 1);
INSERT INTO `coupon` VALUES ('afcf55a1-b22c-4d31-b', '小仙女整洁券', 0, '家里脏乱差，全不怕！该券可令老公在休息日，进行全家性质整理', 0);

-- ----------------------------
-- Table structure for lipstick
-- ----------------------------
DROP TABLE IF EXISTS `lipstick`;
CREATE TABLE `lipstick`  (
  `brand` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `picture_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `color` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `brief` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`brand`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of lipstick
-- ----------------------------
INSERT INTO `lipstick` VALUES ('chili', './picture/chili.jpg', '小辣椒色', '超级火的小辣椒色，不挑人，很复古。');
INSERT INTO `lipstick` VALUES ('cockney', './picture/cockney.jpg', '草莓红色', '质地水润， 涂起来原地秒变小仙女。');
INSERT INTO `lipstick` VALUES ('ruby-woo', './picture/ruby-woo.jpg', '复古红色', '复古红色 ，哑光质地 ，显白显气色不挑皮 。');

#SET FOREIGN_KEY_CHECKS = 1;
