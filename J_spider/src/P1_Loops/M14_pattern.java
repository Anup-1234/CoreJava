package P1_Loops;

public class M14_pattern {
	public static void main(String args[]) {
		
		System.out.println("enter number");
		int n =5;
		for(int i=0; i<=n;i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=n; j>=i; j--) {
				System.out.print("&");
			}
			System.out.println();
		}
	}
}
