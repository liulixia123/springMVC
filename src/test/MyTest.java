package test;



import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mapper.UserMapper;

import util.MybatisUtil;

import util.initLogRecord;

import pojo.User;
import service.UserService;
public class MyTest {
	@org.junit.Test
	public void testQueryAll() {
		initLogRecord.initLog();
		/*SqlSession sqlsession = MybatisUtil.getSessoon();
		UserMapper mapper = sqlsession.getMapper(UserMapper.class);
		List<User> users = mapper.queryAll();
		System.out.println(users);
		//关闭session
	    MybatisUtil.closeSession();*/
		ApplicationContext ac= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserService userService = ac.getBean("userService", UserService.class);
		System.out.println("ttt");
		List<User> users = userService.queryAll();
		for(User user:users) {
			System.out.println(user);
		}
	}
	@org.junit.Test
	public void testInsert() {
		initLogRecord.initLog();
		/*SqlSession sqlsession = MybatisUtil.getSessoon();
		UserMapper mapper = sqlsession.getMapper(UserMapper.class);
		User user = new User();
		user.setUsername("张三");
		user.setPassword("123456");
		mapper.insert(user);
		sqlsession.commit();
		//关闭session
	    MybatisUtil.closeSession();*/
	}
}
