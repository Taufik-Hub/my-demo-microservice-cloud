package com.taufik.microservice.user.main.service;

import java.util.List;

import com.taufik.microservice.user.main.entity.User;
import com.taufik.microservice.user.main.vo.UserDetailsVO;

public interface IUserService {

	User saveUser(User user);

	List<UserDetailsVO> getAllUsers();

	UserDetailsVO getUserByUserId(Long userId);

}
