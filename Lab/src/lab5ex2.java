
public class lab5ex2 {
	public static void main(String[] args) {
		
		Icompute ob1 = new person("Danushka", 40000, 1000, 5);
		ob1.calculate();
		ob1.display();
		
		
		//c
		
		person p;
		Box b;
		
		
		p = new person("Namal", 20000.00, 1000, 5);
		b = new Box(10, 10, 10);
		p.calculate();
		b.calculate();
		p.display();
		b.display();
	}
	
	
}
	
	interface Icompute{
		void calculate();
		void display();
	}
	
	
	class person implements Icompute{
		private String name;
		private double basicSal;
		private double otRate;
		private double otHrs;
		private double netSal;
		
		public person(String n, double b, double o, double oh) {
			this.name = n;
			this.basicSal  = b;
			this.otRate = o;
			this.otHrs = oh;
			
		}
		@Override
		public void calculate() {
			
			netSal = basicSal +( otRate * otHrs );
			
		}
		@Override
		public void display() {
			System.out.println(netSal);
			
		}
	}
	
	class Box implements Icompute{
		private int length, width, height;
		private int volume;
		
		
		public Box(int l, int w, int h) {
			this.length = l;
			this.width = w;
			this.height = h;
		}


		@Override
		public void calculate() {
			volume = length * width * height;
			
		}


		@Override
		public void display() {
			System.out.println(volume);
		}
	}


