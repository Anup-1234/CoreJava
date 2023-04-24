package P1_Loops;

import java.util.Scanner;

public class L7_pattern {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		
		for(int i=0; i<n;i++) {
			for(int j=0; j<n; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
