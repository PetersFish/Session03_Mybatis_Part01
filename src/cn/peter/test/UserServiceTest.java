package cn.peter.test;


import org.junit.Before;
import org.junit.Test;

import cn.peter.pojo.User;
import cn.peter.service.UserService;

public class UserServiceTest {
	UserService service = null;
	
	@Before
	public void init() {
		service = new UserService();
	}

	@Test
	public void testSave() {
		User user = new User();
		user.setId(4);
		user.setUsername("Maya");
		user.setPassword("555");
		Integer i = service.save(user);
		System.out.println(i);
	}

	@Test
	public void testGetUserById() {
		User user = service.getUserById(1);
		System.out.println(user);
	}

	@Test
	public void testUpdate() {
		User user = new User();
		user.setId(3);
		user.setUsername("Gaga");
		user.setPassword("789");
		Integer i = service.update(user);
		System.out.println(i);
	}

	@Test
	public void testDeleteById() {
		Integer i = service.deleteById(3);
		System.out.println(i);
	}

}
