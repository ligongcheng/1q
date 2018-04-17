package cn.it.jedis.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy2 implements InvocationHandler {

	private Object target;

	/**
	 * 获取代理类
	 * 
	 * @param target
	 *            传入需要被代理的代理类实例
	 * @return Object
	 */
	public Object getProxy(Object target) {
		this.target = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before");
		return method.invoke(target, args);
	}

}
