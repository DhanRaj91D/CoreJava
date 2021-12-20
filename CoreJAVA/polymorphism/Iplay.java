package study.polymorphism;

public interface Iplay {

	public void play();

	default void dayoff() {

		System.out.println("Take  Iplay dayoffunpaid  paid ");
	}

}

interface Iwork {

	public void work();

	default void dayoff() {

		System.out.println("Take  Iwork dayoff paid ");
	}

}

class Me implements Iplay,Iwork {

	

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dayoff() {
		System.out.println("Inside Me");
	}

}
