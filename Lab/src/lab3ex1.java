import java.util.Scanner;

public class lab3ex1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
			 
		 
		System.out.println("enter your name");
		String name= sc.nextLine();
		System.out.println("Enter your id no");
		String itNo = sc.nextLine();
		System.out.println("enter your home address ");
		String address =  sc.nextLine();
		
		 
		
		
		student s1 = new student(name, itNo, address);
		
		System.out.println("enter your name");
		String name1 = sc.nextLine();
		System.out.println("Enter your id no");
		String itNo1 = sc.nextLine();
		System.out.println("enter your home address ");
		String address1 =  sc.nextLine();
		
		student s2 = new student(name1, itNo1, address1);
		
		
		s1.display();
		s2.display();
	
		

	}
}



class student {
	
	String name;
	String ditNo;
	String address;
	
	
	student(String name, String ditNo, String address){
		this.name = name;
		this.ditNo = ditNo;
		this.address = address;
	}
	
	public void setName(String name) {
		this.name = name;
		
		
	}
	
	public String getName() {
		return name;
		
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
		
	}
	public  void setditNo(String ditNo) {
		this.ditNo = ditNo;
		
	}
	
	public String getditNo() {
		return ditNo;
		
	}
	
	public void display() {
		System.out.println("==============================================");
		System.out.println("Name is     :" + name);
		System.out.println("IT no is    :" + ditNo);
		System.out.println("Address is  :"+ address);
		System.out.println("==============================================");
	}
	

	
}
