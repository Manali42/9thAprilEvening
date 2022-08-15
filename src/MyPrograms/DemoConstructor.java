package MyPrograms;

public class DemoConstructor {
	int a, b, sum;

	public void Demo() {

		System.out.println("This is Demo  method");
	}

	public DemoConstructor() {

		System.out.println("This is user define constructor");
		a = 50;
		b = 62;
		sum = a + b;
		System.out.println("a+b= " + sum);
	}

	public static void main(String[] args) {

		DemoConstructor dc = new DemoConstructor();

		dc.Demo();

	}

}
