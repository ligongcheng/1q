package cn.it.study.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy {

	public static void main(String[] args) {
		final UserDao userdao = new UserDaoImpl();
		// userdao.add();
		UserDao proxyInstance = (UserDao) Proxy.newProxyInstance(userdao.getClass().getClassLoader(),
				userdao.getClass().getInterfaces(),
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("proxy代理");
						Object invoke = method.invoke(userdao, args);
						return invoke;
					}
				});

		proxyInstance.add();
	}
}
