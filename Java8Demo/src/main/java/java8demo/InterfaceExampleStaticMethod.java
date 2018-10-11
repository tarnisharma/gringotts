package java8demo;

interface C {
	static String x = "Tarni";

	static void method() {
		System.out.println("Static method");
	}

	default void defaultMethod() {
		System.out.println("Default method");
	}
}

public class InterfaceExampleStaticMethod implements C {

	public static void main(String args[]) {
		InterfaceExampleStaticMethod obj = new InterfaceExampleStaticMethod();

		System.out.println(C.x);
		C.method();
		obj.defaultMethod();

	}

}
