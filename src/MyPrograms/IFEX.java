package MyPrograms;

public class IFEX {

	public static void main(String[] args) {
		int math,sci,phy,chem,comp;
		math=65;
		sci=18;
		phy=78;
		chem=74;
		comp=47;
		 int per=math+sci+phy+chem+comp/5;
		 
		 if(per>45) {
			 System.out.println(" fist class Pass");
		 }
		 else if(per>35) {
			 System.out.println(" class");
		 }
		 else {
			 System.out.println("Fail");
		 }

	}

}
