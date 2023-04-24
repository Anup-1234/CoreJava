package P8_ConChaning;

public class Son extends Father{

	public Son(int age) {
	  super(60);
	  System.out.println("son");
	}
	
	public Son() {
		//super();   ///internally this extends not req to initialized
		  System.out.println("son of father");
		}

}
