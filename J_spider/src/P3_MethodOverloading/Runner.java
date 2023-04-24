package P3_MethodOverloading;

public class Runner {
	public static void main(String[] args) {
		Overloading a =new Overloading();
		
		a.display();
		a.display(10);
		System.out.println(a.display(10.0,20.23));
		a.display("anup ",122);
		a.display(10,30);
		

	}

}
