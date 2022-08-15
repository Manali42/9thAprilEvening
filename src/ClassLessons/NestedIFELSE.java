package ClassLessons;

public class NestedIFELSE {

	public static void main(String[] args) {
		/*
		 * if USNAME is correct then enter PWD
		 * if PWD is correct then LOgin Succ
		 * else PWD is wrong -->plase eneter valid PWD
		 * else UN is worng -->please enter valid UN
		 */
		
		String un="Velocity";
		String pwd="V@12345";
		if(un=="Velocity") {//outer loop
			System.out.println("Coreect UN,plase entr pw");
			
			if(pwd=="V@12345") {//inner loop
				System.out.println("Correct Login");
			}else {
				System.out.println("Enter valid password");
			}
		}else{
			System.out.println("Invalid USer name");
			
		}
		
	}

}
