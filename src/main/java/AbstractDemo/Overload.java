package AbstractDemo;

public class Overload  {

	public static void main(String[]args) {
		System.out.println("Tu Ruturaj Aahes....");
		Overload obj=new Overload();
		int Value=obj.Display(4, 5);
		System.out.println(Value);
	}
	public  int Display(int num1,int num2) {
		return num1+num2;
	}
	
	
}
