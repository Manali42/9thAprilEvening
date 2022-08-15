package ClassLessons;

public class DemoConstructor {
	int a, b, sum;

	// public DemoConstructor()
	// {
	// constructor name same as class name,not return any type
	// default constructor create by compiler time of compilation
	// }

	public DemoConstructor() // This is user define constructor with zero parameter
	{
		System.out.println("This is constructor");

		a = 20;
		b = 30;
		sum = a + b;
		System.out.println("20+30=" + sum);
	}

	public static void main(String[] args) {

		DemoConstructor dc = new DemoConstructor();// constructor is called when object is created

	}

}
