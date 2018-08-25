import java.util.Scanner;

public class lab4ex1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Student s[] = new Student[2];
		
		
		for(int i = 0; i < 2; i++) {
			System.out.println("enter student name");
			String name = sc.nextLine();
			System.out.println("Enter the degree");
			String degree = sc.nextLine();
			System.out.println("enter mobile number");
			String mobile = sc.nextLine();
			
			s[i] = new Student(name, degree, mobile);
			
		}
		

		for(int i = 0; i < 2; i++) {
			s[i].display();
		}
		
		
		
		
		

	}

}

class Student{
	int studentID;
	String name;
	String degree;
	String mobile;
	static int max = 100;
	
	
	public Student(String n, String d, String m) {
		
		this.name = n;
		this.degree = d;
		this.mobile = m;
		studentID = getNectStudentID();
	}
	
	
	public void display() {
		
		System.out.println("Name of Student is" + name);
		System.out.println("Degree of student " + degree);
		System.out.println("Mobile no oof Student is " + mobile);
		System.out.println("Student ID is " +studentID);
		
	}
	
	
	public static int getNectStudentID() {
		return max++;
	}
}