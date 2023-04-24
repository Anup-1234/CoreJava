package P6_Constructor;

public class Pen {
	 Pen(int cost) {
		   System.out.println("cost of pen is:"+cost);
		}
		
		public static void main(String args[]) {
			Pen p = new Pen(10);
		}
}
