package interfaces;

interface FirtsInterface {
	public void myMethod(); // interface method
}

interface SecondInterface {
	public void myOtherMethod(); // interface method
}

// DemoClass "implements" FirstInterface and SecondInterface

class DemoClass implements FirtsInterface, SecondInterface {

	public void myMethod() {
		System.out.println("Enter Some text...");
	}

	public void myOtherMethod() {
		System.out.println("Enter Some other text...");
	}

}

public class Main {

	public static void main(String[] args) {

		DemoClass myObj = new DemoClass();

		myObj.myMethod();
		myObj.myOtherMethod();

	}

}