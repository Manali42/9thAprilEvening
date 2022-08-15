package ClassLessons;

public class ELSEIFEX {

	public static void main(String[] args) {
		// if you have multiple condition to check
		//then use if else
		//if i got >90 i am dis
		//else i got >=66 and <90 i got fist class
		//esle if i got >=50 and <66 i am in 2nd class
		//eslsef i got >40= and <50 pass
		//else fail
		
		int marks=87;
		
		
		if (marks>90) {
			System.out.println(" Distinction");
			
		} else if (marks>=66 & marks<90) {
			System.out.println("First Class ");
			
		}else if (marks>=50 & marks<66) {
			System.out.println("Second class");
			
		}
		else if (marks>=40 & marks<50) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
