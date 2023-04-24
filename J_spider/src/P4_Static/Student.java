package P4_Static;

public class Student {
   static int age = 20;
   static void Study() {
	   System.out.println("Student is Student");
   }
   
	public static void main(String[] args) {
		System.out.println(Student.age);
		Study();

	}

}
