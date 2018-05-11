package cn.it.study.deadlock;

public class LockDemo {

	public static void main(String[] args) {
		Thread tr1 = new DieLock(true);
		Thread tr2 = new DieLock(false);
		tr1.start();
		tr2.start();
	}
}
