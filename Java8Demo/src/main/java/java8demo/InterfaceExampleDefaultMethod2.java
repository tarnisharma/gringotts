package java8demo;

public class InterfaceExampleDefaultMethod2 extends InterfaceExampleDefaultMethod implements X {

	public static void main(String[] args) {

		InterfaceExampleDefaultMethod2 obj = new InterfaceExampleDefaultMethod2();
		obj.x();
		obj.y();
		obj.print();
		obj.hello(); // Implemented in both InterfaceExampleDefaultMethod class and Interface X, But class takes precedence
	}

}
