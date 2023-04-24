package P1_Loops;
import java.util.*;

//check given number is even or odd 
public class M15_practice {
	
	void check(int n) {
		if(n % 2 == 0) {
			System.out.println("number is even");
		}else {
			System.out.println("number is odd");
		}
	}
	
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		M15_practice m = new M15_practice();
		
		for(int i=0; i<10;i++) {
			System.out.println("enter the number");
			int num=sc.nextInt();
			m.check(num);
		}
	sc.close();
	}

}
