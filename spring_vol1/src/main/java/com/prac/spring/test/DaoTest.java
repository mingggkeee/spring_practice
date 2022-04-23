package com.prac.spring.test;

import java.sql.SQLException;

import com.prac.spring.dto.User;
import com.prac.spring.model.dao.UserDao;

public class DaoTest {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		UserDao dao = new UserDao();
		
		User user = new User();
		user.setId("mingggkeee");
		user.setName("주민기");
		user.setPassword("1234");
		
		dao.add(user);
		
		System.out.println(user.getId() + "등록 성공");
		
		User user2 = dao.get(user.getId());
		System.out.println(user2.getName() + " " + user2.getPassword());
		System.out.println(user2.getId()+" 조회 성공");
	}

}
