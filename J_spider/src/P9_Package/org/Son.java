package P9_Package.org;
//default class cannot import public class can import

import  P9_Package.com.Father;

    public class Son extends Father {
	public static void main(String[] args) {
	Father f= new Father();
	System.out.println(f.cost);
	f.bike();
	
	Son s = new Son();
    System.out.println(s.cost);

	}

}
