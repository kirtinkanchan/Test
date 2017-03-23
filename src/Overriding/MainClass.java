package Overriding;

public class MainClass {
	public static void main(String args[]){
		Parent p = new Parent();
		Child c1 = new Child();
		
		Parent p1 = c1;		
					
		
		p.main();
		p1.main();		

		c1.main();
	}
}
