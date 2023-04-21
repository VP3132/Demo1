package JavaDemo;

public class Calculator {

	static void sum(int X,int Y) {
		
		int sum=X+Y;
		System.out.println("Sum of two numbers" + sum);
	}
	static void multiplication(int X,int Y) {
		int multiplication=X*Y;
		System.out.println("multiplication of two numbers"+ multiplication);
	}
	
	public static void main(String[] args) {
		sum(10,20);
		multiplication(10,20);

	}

}
