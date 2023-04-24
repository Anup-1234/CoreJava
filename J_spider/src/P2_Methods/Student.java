package P2_Methods;

//default value
public class Student {
	int marks;  
	String name;

	public static void main(String[] args) {
		Student s = new Student();
		Student s1 = new Student();
		
		System.out.println(s.marks+" "+s.name);
		
		s1.name = "anup";
		s1.marks = 122;
		System.out.println(s1.name+" "+ s1.marks);
		

	}

}
