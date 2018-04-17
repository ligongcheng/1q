package cn.it.jedis.proxy;

import org.junit.Test;

public class JdkTest {

	public static void main(String[] args) {
		JdkProxy2 jdkProxy2 = new JdkProxy2();
		UserDao userDao = new UserDaoImpl();
		UserDao proxy = (UserDao) jdkProxy2.getProxy(userDao);
		System.out.println(proxy);
		proxy.add();

	}
	
	@Test
	public void testName() throws Exception {
		int i = 5/3;
		System.out.println(i);
	}
	
}
