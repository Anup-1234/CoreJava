package P5_SataticBlocks;

public class StaticBlocks {
	static int age;
	static {
		  age =20;
	}

	public static void main(String[] args) {
		System.out.println(StaticBlocks.age);

	}
	static {
		StaticBlocks.age=30;
	}

}
 

//staic block execute followed by constructor and then method instance