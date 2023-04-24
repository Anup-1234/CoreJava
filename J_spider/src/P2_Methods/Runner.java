package P2_Methods;

public class Runner {
	int m1() {
		return 10+10;
	}
	
	double m2(){
		return 10+10.0;
	}
	
	String m3() {
		return "anup"+10.34+10;
	}

	public static void main(String[] args) {
	Runner r = new Runner();
	
	r.m1();
	r.m2();
	r.m3();

	}

}
