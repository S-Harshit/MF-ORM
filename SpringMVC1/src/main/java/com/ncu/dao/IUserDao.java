package com.ncu.dao;

import java.util.List;

import com.ncu.model.User;

public interface IUserDao {

	public void saveOrUpdate(User user);

	public void delete(String email);

	public User get(String email);

	public List<User> list();

}