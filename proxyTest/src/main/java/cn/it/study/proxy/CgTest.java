package cn.it.study.proxy;

public class CgTest {

	public static void main(String[] args) {
		CglibProxy cglibProxy = new CglibProxy();
		// UserDao userDao = new UserDaoImpl();
		UserDao userDao = (UserDao) cglibProxy.getProxy(UserDaoImpl.class);
		userDao.add();
	}
}
