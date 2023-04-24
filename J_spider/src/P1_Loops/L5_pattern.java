package P1_Loops;
import java.util.*;
public class L5_pattern {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		
		for(int i=0; i<n;i++) {
			for(int j=0; j<n; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
