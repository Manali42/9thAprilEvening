package MyPrograms;

public class CS2 {

	// example of user define constructor

	String city = "pune";
	
	// use of constructor --> to initialized variable
	
	String name;// variable declaration

	public CS2() {
		name = "Velocity";
	}

	public static void main(String[] args) {
		CS2 c = new CS2();
		c.display();
		display1();

	}

	public void display() {
		System.out.println("I am not static display method");
		System.out.println("My city name is " + city);
		System.out.println("My name is " + name);
	}

	public static void display1() {
		System.out.println("I am static display1 method");

	}
}
