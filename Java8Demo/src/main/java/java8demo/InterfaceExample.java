package java8demo;

interface Y {
	void print();
	void y();
}

interface X {
	void print();
	void x();
}



public class InterfaceExample implements X,Y{

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

}
