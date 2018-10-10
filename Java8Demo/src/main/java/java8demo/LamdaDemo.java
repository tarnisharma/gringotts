package java8demo;

interface A {
	void printHello();
}

interface B {
	void printHello(String name);
}

public class LamdaDemo {

	public static void main(String[] args) {

		A obja = new A() {

			public void printHello() {
				System.out.println("Printing Hello for A");

			}
		};
		B objb = new B() {

			public void printHello(String name) {
				System.out.println("Printing Hello for B " + name);

			}
		};
		obja.printHello();
		objb.printHello("Tarni");

//		Lambda Conversions.
//		LHS of = is the Instance of the Interface 
//		RHS of = and LHS of -> are the parameters of the function in that interface () & name
//		RHS of -> is the implementation of the function.

		A obja2 = () -> System.out.println("Printing Hellof for Lamba A");

		B objb2 = name -> System.out.println("Printing Hello for Lamda B " + name);

		obja2.printHello();
		objb2.printHello("Tarni");

	}

}
