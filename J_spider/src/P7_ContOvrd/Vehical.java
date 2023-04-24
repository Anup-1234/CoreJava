package P7_ContOvrd;

public class Vehical {

	public Vehical(String brand) {
		System.out.println("im bmw");
	}
	public Vehical(int cost,String brand) {
		System.out.println(cost+brand);
	}
	public Vehical(int speed) {
		System.out.println("speed"+speed);
	}
	public Vehical(double height) {
		System.out.println("height"+height);
	}
	
	public static void main(String[] args) {
		Vehical v =new Vehical(200);
		Vehical v1 =new Vehical(1500,"Toyota");
		Vehical v2 =new Vehical(5.7);
		Vehical v3 =new Vehical("bmw");
	}


}
