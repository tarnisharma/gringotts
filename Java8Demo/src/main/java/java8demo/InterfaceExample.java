package java8demo;

interface Y {
	void print();
	void y();
	default void hello() {
		System.out.println("Hello Y");
	}
}

interface X {
	void print();
	void x();
	default void hello() {
		System.out.println("Hello X");
	}
}

public class InterfaceExample implements X, Y {

	@Override
	public void y() {
		System.out.println("Y");

	}

	@Override
	public void x() {
		System.out.println("X");

	}

	@Override
	public void print() {
		System.out.println("Hello but not sure if its the implementation of X or Y ");

	}

	@Override
	public void hello() { // have to override this method if both the interfaces have defined the same method
		System.out.println("Overriding  Hello");
	}

	public static void main(String args[]) {
		InterfaceExample obj = new InterfaceExample();
		obj.x();
		obj.y();
		obj.hello();
		obj.print();
	}
}
