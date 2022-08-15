package ClassLessons;

public class ParameterisedMethod {

	public static void main(String[] args) {
		ParameterisedMethod pm = new ParameterisedMethod();
		pm.addition(526, 789);
		substraction(60, 45, 41);
		// static method call with class name or without class name or without object
		// name.

	}

	public void studentInfo() {

	}

	public void addition(int a, int b) {
		int add = a + b;
		System.out.println("Addition is " + add);

	}

	public static void substraction(int a, int b, int c) {

		int sub = a - b - c;
		System.out.println("Substraction is " + sub);
	}
}
