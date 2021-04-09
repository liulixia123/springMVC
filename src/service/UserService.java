package service;

import java.util.List;

import pojo.User;

public interface UserService {
	List<User> queryAll();
	List<User> queryList(List<Integer> list);
	List<User> queryOne(int id);
	void insert(User user);
}
