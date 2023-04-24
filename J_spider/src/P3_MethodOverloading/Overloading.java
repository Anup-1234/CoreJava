package P3_MethodOverloading;

public class Overloading {
	void display() {
		System.out.println("hello");
	}
	void display(int x) {
		System.out.println(x);
	}
	void display(int x,int y) {
		System.out.println(x+y);
	}
	void display(String x,int y) {
		System.out.println(x+y);
	}
	double display(double x,double y) {
		return x+y;
	}

}
