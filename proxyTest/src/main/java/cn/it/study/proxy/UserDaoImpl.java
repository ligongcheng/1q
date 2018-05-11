package cn.it.study.proxy;

public class UserDaoImpl implements UserDao {

	@Override
	public void add() {
		System.out.println("add");
	}

	@Override
	public void delete() {
		System.out.println("del");
	}

	@Override
	public void update() {
		System.out.println("upd");
	}

	@Override
	public void find() {
		System.out.println("find");
	}

}
