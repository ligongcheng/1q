package cn.it.jedis.proxy;

import org.junit.Test;

public class JdkTest {

	public static void main(String[] args) {
		UserDao proxy = (UserDao) new JdkProxy2().getProxy(new UserDaoImpl());
		proxy.add();

	}
	
	@Test
	public void testName() throws Exception {
		int i = 5/3;
		System.out.println(i);
	}
	
}
