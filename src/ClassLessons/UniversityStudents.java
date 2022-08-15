package ClassLessons;

public class UniversityStudents {

	public static void main(String[] args) {

		UniversityStudents u = new UniversityStudents();
		u.studentInfo();// non static method should call with object name
	}

	public void studentInfo()// zero parameter method
	{
		String name, dept, PRN;
		char gender;
		int mobileno;
		float weight;

		name = "manali Sonawane";
		dept = "Computer Sci";
		PRN = "PUN40401";
		gender = 'F';
		mobileno = 73040178;
		weight = 45.5f;

		System.out.println("Student Name: " + name);
		System.out.println("Department: " + dept);
		System.out.println("PRN No: " + PRN);
		System.out.println("Gender: " + gender);
		System.out.println("Mobile No:" + mobileno);
		System.out.println("weight: " + weight);

	}

}
