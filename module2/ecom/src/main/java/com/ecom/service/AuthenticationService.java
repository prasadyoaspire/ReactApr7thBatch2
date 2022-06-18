package com.ecom.service;

import com.ecom.entity.Admin;
import com.ecom.entity.Customer;

public interface AuthenticationService {

	Customer customerLogin(String username,String password);
	
	Admin adminLogin(String username,String password);
}
