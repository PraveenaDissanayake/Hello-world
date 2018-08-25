
public class lab3ex8 {

	public static void main(String[] args) {
		
		
		Pet p = new Pet("ABC", "DEF", 5);
		p.showDetails();
		Cat c = new Cat("gHI", "JKL", 4, 4);
		c.showDetails();
		Dog d = new Dog("MNO", "PQR", 6, 1);
		d.showDetails();
		
		
		
		Cat newBornCat = new Cat("STU", "WXY");
		newBornCat.showDetails();
		Dog newBornDog =  new Dog("Z", "D");
		newBornDog.showDetails();
	}
}


class Pet{
	
	String name;
	String owner;
	int age;
	
	public Pet(String n, String o, int a) {
		this.name = n;
		this.owner = o;
		this.age = a;
	}
	
	public Pet(String n, String o) {
		this.name = n;
		this.owner = o;
		this.age = 0;
		
	}
	
	public void showDetails() {
		System.out.println("I am a pet . My name is " + name + "My owner is " + owner + "My age is  " + age);
	}
}

class Cat extends Pet{
	int liveLeft;
	
	public Cat (String n, String o, int a, int l) {
		super(n, o, a);
		this.liveLeft = l;
	}
	
	
	public Cat (String n, String o) {
		super(n, o);
		this.liveLeft = 7;
		
	}
	
	
	public void showDetails() {
		super.showDetails();
		System.out.println("I have " + liveLeft + "years left");
	}
}

class Dog extends Pet{
	
	int masters ;
	
	
	public Dog(String n, String o, int a, int m) {
		super(n, o, a);
		masters = m;
	}
	
	public Dog (String n, String o) {
		super(n, o);
		this.masters = 1;
		
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("I have " + masters + " master");
	}
}


























