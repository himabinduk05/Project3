package com.da.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.da.beans.LoginBean;


public class LoginDaoImplementation implements LoginDao{
	private HibernateTemplate ht;
	@Override
	public String validateCustomer(LoginBean login) {
		
		System.out.println("insertCustomer of LoginDAOImpl class.....");
		List cuslist=new ArrayList();
		
			
			String query="select role from LoginBean where userName=? and password=?";
			
			cuslist=ht.find(query,new Object[]{login.getUserName(),login.getPassword()});	
			System.out.println(cuslist);
			
			
			if(!(cuslist.isEmpty())){
				String id=(String)cuslist.get(0);
			return id;
			}
			return "";
	}
	
	public void setHt(HibernateTemplate ht) {
        this.ht = ht;
    }
}
