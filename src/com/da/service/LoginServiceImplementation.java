package com.da.service;

import com.da.beans.LoginBean;
import com.da.dao.LoginDaoImplementation;

public class LoginServiceImplementation implements LoginService{
	private LoginDaoImplementation loginDao;

	@Override
	public String validateCustomer(LoginBean login) {
		
		System.out.println("insertCustomer method of LoginServiceImpl method!!!");
        return loginDao.validateCustomer(login);
	}
	
	public void setLoginDao(LoginDaoImplementation loginDao) {
        this.loginDao = loginDao;
    }
}
