package P8_ConChaning;

public class Student {

	 Student(int age) {
		 this("anuuu");
		System.out.println("age:"+age);
	}
	
	Student(double height){
		this(25);
		System.out.println("height:"+height);
	}
	Student(String name){
		System.out.println("name:"+name);
	}
	
	public static void main(String[] args) {
		Student s = new Student(5.9);
	}

}
