package cn.it.study.deadlock;

public class DieLock extends Thread {

	private static int i = 0;
	private Boolean flag = null;

	public DieLock(Boolean flag) {
		this.flag = flag;
	}

	@Override
	public void run() {
		for (i = 0; i < 50; i++) {
			if (flag) {
				synchronized (Mylock.objA) {
					System.out.println("objA");
					synchronized (Mylock.objB) {
						System.out.println("objB");
					}
				}
			} else {
				synchronized (Mylock.objB) {
					System.out.println("objB");
					synchronized (Mylock.objA) {
						System.out.println("objA");
					}
				}

			}
		}
	}

}
