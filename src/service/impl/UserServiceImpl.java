package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import mapper.UserMapper;
import pojo.User;
import service.UserService;
@Component("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper mapper;
	@Override
	public List<User> queryAll() {
		return mapper.queryAll();
	}

	@Override
	public List<User> queryList(List<Integer> list) {
		// TODO Auto-generated method stub
		return mapper.queryList(list);
	}

	@Override
	public List<User> queryOne(int id) {
		// TODO Auto-generated method stub
		return mapper.queryOne(id);
	}

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		mapper.insert(user);
	}

}
