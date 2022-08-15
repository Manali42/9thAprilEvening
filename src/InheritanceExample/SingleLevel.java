package InheritanceExample;

public class SingleLevel {

	public static void main(String[] args) {
		
Mother m = new Mother();//created object of mother class
ChildC c = new ChildC();//created object of childc class
m.nature();
c.mobile();
c.nature();
Mother.look();//Mother static method calling
ChildC.laptop();//child static method calling
ChildC.look();//child calling mothers static method
	}

}
