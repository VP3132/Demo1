package AbstractDemo;

public class AccesToAll {

	public static void main(String[] args) {
      Cat obj=new Cat();
      System.out.println("I am Cat ");
      obj.sleep();
      obj.AnimalColur();
      obj.AnimalSound();
      obj.CityName();
      
      Dog obj1=new Dog();
      System.out.println("I am Dog");
      obj1.sleep();
      obj1.AnimalColur();
      obj1.AnimalSound();
      obj1.CityName();
		
	}

}
