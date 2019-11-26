-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.17-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出  表 carlearn.choosecoach 结构
CREATE TABLE IF NOT EXISTS `choosecoach` (
  `n_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `s_coachid` varchar(20) NOT NULL COMMENT '教练id',
  `s_studentid` varchar(20) NOT NULL COMMENT '学员id',
  `s_statue` int(11) NOT NULL DEFAULT '0' COMMENT '状态0可用',
  PRIMARY KEY (`n_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- 正在导出表  carlearn.choosecoach 的数据：~4 rows (大约)
DELETE FROM `choosecoach`;
/*!40000 ALTER TABLE `choosecoach` DISABLE KEYS */;
INSERT INTO `choosecoach` (`n_id`, `s_coachid`, `s_studentid`, `s_statue`) VALUES
	(1, '1', '2', 0),
	(2, '2', '2', 0),
	(3, '3', '2', 0),
	(4, '4', '2', 0),
	(5, '5', '2', 0);
/*!40000 ALTER TABLE `choosecoach` ENABLE KEYS */;


-- 导出  表 carlearn.coach 结构
CREATE TABLE IF NOT EXISTS `coach` (
  `coachid` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '教练主键',
  `coachname` varchar(50) NOT NULL COMMENT '教练名字',
  PRIMARY KEY (`coachid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- 正在导出表  carlearn.coach 的数据：~4 rows (大约)
DELETE FROM `coach`;
/*!40000 ALTER TABLE `coach` DISABLE KEYS */;
INSERT INTO `coach` (`coachid`, `coachname`) VALUES
	(1, '周一'),
	(2, '赵二'),
	(3, '王三'),
	(4, '李四'),
	(5, '孙五');
/*!40000 ALTER TABLE `coach` ENABLE KEYS */;


-- 导出  表 carlearn.exam 结构
CREATE TABLE IF NOT EXISTS `exam` (
  `n_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `s_studentid` varchar(20) NOT NULL COMMENT '考试学员id',
  `s_statue` int(11) NOT NULL DEFAULT '0' COMMENT '状态   0考试前1考试中2考试后',
  `s_data` varchar(50) NOT NULL DEFAULT '0' COMMENT '考试时间',
  PRIMARY KEY (`n_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- 正在导出表  carlearn.exam 的数据：~4 rows (大约)
DELETE FROM `exam`;
/*!40000 ALTER TABLE `exam` DISABLE KEYS */;
INSERT INTO `exam` (`n_id`, `s_studentid`, `s_statue`, `s_data`) VALUES
	(1, '2', 0, '1'),
	(2, '2', 0, '2'),
	(3, '2', 0, '3'),
	(4, '2', 0, '4'),
	(5, '2', 0, '5');
/*!40000 ALTER TABLE `exam` ENABLE KEYS */;


-- 导出  表 carlearn.permissionunionrole 结构
CREATE TABLE IF NOT EXISTS `permissionunionrole` (
  `n_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `s_roleid` varchar(20) NOT NULL COMMENT '角色id',
  `s_preid` varchar(20) NOT NULL COMMENT '权限id',
  `tcreatedate` datetime NOT NULL COMMENT '创建时间',
  `toperatedate` datetime NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`n_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  carlearn.permissionunionrole 的数据：~0 rows (大约)
DELETE FROM `permissionunionrole`;
/*!40000 ALTER TABLE `permissionunionrole` DISABLE KEYS */;
/*!40000 ALTER TABLE `permissionunionrole` ENABLE KEYS */;


-- 导出  表 carlearn.role 结构
CREATE TABLE IF NOT EXISTS `role` (
  `n_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `s_rolename` varchar(20) NOT NULL COMMENT '角色名字',
  `s_rolestatue` int(11) NOT NULL DEFAULT '0' COMMENT '角色状态0可用1不可用',
  PRIMARY KEY (`n_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- 正在导出表  carlearn.role 的数据：~3 rows (大约)
DELETE FROM `role`;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` (`n_id`, `s_rolename`, `s_rolestatue`) VALUES
	(1, '超级管理员', 0),
	(2, '管理员', 0),
	(3, '教练', 0),
	(4, '学员', 0);
/*!40000 ALTER TABLE `role` ENABLE KEYS */;


-- 导出  表 carlearn.score 结构
CREATE TABLE IF NOT EXISTS `score` (
  `n_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `s_score` varchar(10) NOT NULL COMMENT '成绩',
  `s_useridcard` varchar(20) NOT NULL COMMENT '学员idcard',
  `s_userid` int(11) NOT NULL COMMENT '学员id',
  PRIMARY KEY (`n_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- 正在导出表  carlearn.score 的数据：~1 rows (大约)
DELETE FROM `score`;
/*!40000 ALTER TABLE `score` DISABLE KEYS */;
INSERT INTO `score` (`n_id`, `s_score`, `s_useridcard`, `s_userid`) VALUES
	(1, '合格', '111', 2);
/*!40000 ALTER TABLE `score` ENABLE KEYS */;


-- 导出  表 carlearn.user 结构
CREATE TABLE IF NOT EXISTS `user` (
  `n_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `s_name` varchar(20) NOT NULL COMMENT '用户名字',
  `s_password` varchar(20) DEFAULT NULL COMMENT '用户密码初始密码身份证后六位',
  `s_sex` varchar(5) DEFAULT NULL COMMENT '用户性别',
  `s_idcard` varchar(20) NOT NULL COMMENT '用户身份证号',
  `s_telephone` varchar(20) DEFAULT NULL COMMENT '用户电话',
  `s_email` varchar(50) DEFAULT NULL COMMENT '用户邮箱',
  `s_address` varchar(50) DEFAULT NULL COMMENT '用户住址',
  `s_nativeprovince` varchar(50) DEFAULT NULL COMMENT '用户籍贯省',
  `s_nativecity` varchar(50) DEFAULT NULL COMMENT '用户籍贯市',
  `s_nativearea` varchar(50) DEFAULT NULL COMMENT '用户籍贯区',
  `s_status` int(10) DEFAULT '0' COMMENT '用户状态',
  PRIMARY KEY (`n_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- 正在导出表  carlearn.user 的数据：~7 rows (大约)
DELETE FROM `user`;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`n_id`, `s_name`, `s_password`, `s_sex`, `s_idcard`, `s_telephone`, `s_email`, `s_address`, `s_nativeprovince`, `s_nativecity`, `s_nativearea`, `s_status`) VALUES
	(2, '111', '111', NULL, '111', NULL, NULL, NULL, NULL, NULL, NULL, 0),
	(4, '222', '222', 'nv', '222', '222', '22222@qq.com', '222', NULL, NULL, NULL, 0),
	(5, 'jiaolian', 'jiaolian', 'nan', '230523199708080815', '5101110', '5784612@qq.com', '和平路', NULL, NULL, NULL, 0),
	(6, 'xueyuan', 'xueyuan', 'nv', '232313199705050519', '5124340', '86246246@qq.com', '哈平路', NULL, NULL, NULL, 0),
	(7, 'admain', 'admain', 'nan', '234050199006320112', '86390104', '86390104@qq.com', '三大动力路', NULL, NULL, NULL, 0),
	(8, '测试1', '111', 'nan', '36251519980805070712', '862147', '862147@qq.com', '三大动力路', NULL, NULL, NULL, 0),
	(9, '刘慧娟', '111', 'nv', '12345623326552', '8796122', '111656@qq.com', '你家加家', NULL, NULL, NULL, 0),
	(10, '刘海哦', '123456', 'nv', '230523199708080823', '5106654', '445566@qq.com', '靠近', NULL, NULL, NULL, 0);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;


-- 导出  表 carlearn.userunionrole 结构
CREATE TABLE IF NOT EXISTS `userunionrole` (
  `n_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `s_userid` varchar(20) NOT NULL COMMENT '用户id',
  `s_roleid` varchar(20) NOT NULL COMMENT '角色id',
  PRIMARY KEY (`n_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- 正在导出表  carlearn.userunionrole 的数据：~1 rows (大约)
DELETE FROM `userunionrole`;
/*!40000 ALTER TABLE `userunionrole` DISABLE KEYS */;
INSERT INTO `userunionrole` (`n_id`, `s_userid`, `s_roleid`) VALUES
	(3, '1', '2');
/*!40000 ALTER TABLE `userunionrole` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
