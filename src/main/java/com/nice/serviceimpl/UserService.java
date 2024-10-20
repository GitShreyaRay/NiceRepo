package com.nice.serviceimpl;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
	
	public Boolean checkUser(Long userId, String password);

}
