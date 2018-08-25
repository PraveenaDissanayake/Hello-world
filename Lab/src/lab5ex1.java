abstract class Animal{
	private String name;
	
	public Animal() {
		System.out.println("Animal constructor call");
	}
	
	
	public Animal(String name) {
		
		this.name = name;
	}
	
	
	abstract public String speak();
	
	
	public void display() {
		System.out.println("My name is " + this.name + ".   " );
	}
}



class ToyCat extends Catv{
	
	public ToyCat() {
		System.out.println("ToyCat constructor call");
	}
	
	public ToyCat(String name) {
		super(name);
	}
	
	public String speak() {
		return super.speak();
	}
	
}




class Dogv extends Animal{
	
	public Dogv() {
		System.out.println("Dog constructor call");
	}
	
	
	public Dogv(String name) {
		super(name);
	}
	
	 public String speak() {
		return "Bow Bow ";
		 
		 
		
	}
}

class Catv extends Animal{
	
	
	public Catv() {
		System.out.println("Cat constructor call");
	}
	
	public Catv(String name) {
		super(name);
	}
	
	
	public String  speak() {
		return "Meow Meow";
		
	}
	
}




public class lab5ex1 {

	public static void main(String[] args) {
	
		
		ToyCat t = new ToyCat();
		System.out.println(t.speak());
		

	}

}