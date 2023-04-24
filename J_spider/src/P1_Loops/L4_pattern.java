package P1_Loops;
import java.util.*;
public class L4_pattern {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int count = n*n;
		
		for(int i=0; i<=n; i++) {
			
				System.out.print(count+" ");
				count= count-n;
				
			
		}
		
	}

}
