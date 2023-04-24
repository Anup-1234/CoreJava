package P5_SataticBlocks;

public class NonStaticBlock {
      int age ;
      {
    	  age=40;
      }
	public static void main(String[] args) {
		NonStaticBlock sc= new NonStaticBlock();
		System.out.println(sc.age);

	}

	{
		age=55;
	}
}

