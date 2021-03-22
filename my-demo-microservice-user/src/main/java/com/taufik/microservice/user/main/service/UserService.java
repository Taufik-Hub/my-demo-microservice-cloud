package com.taufik.microservice.user.main.service;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.taufik.microservice.user.main.entity.User;
import com.taufik.microservice.user.main.repository.IUserRepository;
import com.taufik.microservice.user.main.vo.DepartmentVO;
import com.taufik.microservice.user.main.vo.UserDetailsVO;

@Service
public class UserService implements IUserService {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private IUserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public User saveUser(User user) {
		LOGGER.info("UserService saveUser user : {} ", user);
		return userRepository.save(user);
	}

	@Override
	public List<UserDetailsVO> getAllUsers() {
		LOGGER.info("UserService getAllUsers");
		List<User> userList = userRepository.findAll();
		return userList.stream().map(this::getUserDetailsVO).collect(Collectors.toList());
	}

	@Override
	public UserDetailsVO getUserByUserId(Long userId) {
		LOGGER.info("UserService getUserByUserId userId : {} ", userId);
		User user = userRepository.findById(userId).orElse(null);
		return getUserDetailsVO(user);
	}

	private UserDetailsVO getUserDetailsVO(User user) {
		LOGGER.info("UserService getUserDetailsVO user : {} ", user);
		return new UserDetailsVO(user.getUserId(), user.getUserFirstName(), user.getUserLastName(), user.getUserEmail(), getDepartmentVO(user.getDepartmentId()));
	}
	
	private DepartmentVO getDepartmentVO(Long departmentId) {
		LOGGER.info("UserService getDepartmentVO departmentId : {} ", departmentId);
		return restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+departmentId, DepartmentVO.class);
	}
}
