
public class Calculator {

	public Calculator() {
		System.out.println("Calling Costructor");
	}
	public void add() {
		System.out.println("Adding some numbers");
	}

	public void sub() {
		System.out.println("Subtract some numbers");
	}

	public void div() {
		System.out.println("Divide some numbers");
	}

	public void mult() {
		System.out.println("Multiply some numbers");
	}


	public static void main(String[] args) {

	 Calculator calc = new Calculator();
     calc.add();
     calc.div();
     calc.mult();
     calc.sub();
	}
}
