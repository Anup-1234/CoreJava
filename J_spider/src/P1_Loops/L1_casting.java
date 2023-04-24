package P1_Loops;

public class L1_casting {

	public static void main(String[] args) {
		// implicit
      int a = 10;
      int b = a; // a is automatically converted into int 
      System.out.println(b);
      
      //explicitly
      short d=(short) a; // manual
      System.out.println(d);
	}

}
