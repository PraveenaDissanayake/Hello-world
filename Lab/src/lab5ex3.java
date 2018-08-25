import java.util.InputMismatchException;
import java.util.Scanner;

public class lab5ex3 {
	public static void main(String[] args) {
		
		int maxSubject;
		int [] marks = new int[5];
		int total = 0;
		double avg = 0;
	
		
		Scanner sc = new Scanner(System.in);
		
	try {
		
		System.out.println("Input value for maxSubject");
		 maxSubject = sc.nextInt();
		 for(int i = 0; i < marks.length; i++) {
			 System.out.println("enter marks");
			 marks[i] = sc.nextInt();
			 total += marks[i];
			 avg = total / marks.length;
			 
		 }
		
		 
		 
	}catch(InputMismatchException e) {
		System.out.println("YOu havent input integera");
	
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Out of bound");
	
	}catch(ArithmeticException e) {
		
		System.out.println("Devided by zero");
	}catch (Exception e){
		System.out.println(e);
		
	}
	
	finally {
		System.out.println("This code will be gurrentied to run");
	}
	
	System.out.println("The end");
	System.out.println("Avarege of subjects are " + avg);

}
}