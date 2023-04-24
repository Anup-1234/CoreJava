package P2_Methods;

public class Demo {
	//without return type and no arg
	void display() {
		System.out.println("hello");
	}
	
	//add two number (with arg)
	void add(int a,int b){
		System.out.println("sum of "+a+" and"+b+" is: "+(a+b));
	}
	
	//return type 
	int display1() {
		return 10;
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.display();
		d.add(10,20);
		int rus= d.display1();
		System.out.println(rus);

	}

}
