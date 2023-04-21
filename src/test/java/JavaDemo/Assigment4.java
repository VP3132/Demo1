package JavaDemo;

 class Student {

	String name;
	String BloodGrp;
	int RollNo;
	int std;
	}
	public class Assigment4 {
		
	public static void main(String[] args) {
		Student Std=new Student();
		Student Std1=new Student();
	    Student Std2= new Student();
		
		Std.name="Vishal";
		Std.RollNo=10;
		Std.BloodGrp="B+ve";
		Std.std=2;
		
		System.out.println("Details of Student:" );
		System.out.println( "Student Name:" + Std.name);
		System.out.println(" Student BloodGrp:" + Std.BloodGrp);
		System.out.println(" Student RollNo:" + Std.RollNo);
		System.out.println(" Student std:"+ Std.std);
		
		Std1.name="Sager";
		Std1.RollNo=11;
		Std1.BloodGrp="B+ve";
		Std1.std=2;
		
		System.out.println("Details of Student:" );
		System.out.println( "Student Name:" + Std1.name);
		System.out.println(" Student BloodGrp:" + Std1.BloodGrp);
		System.out.println(" Student RollNo:" + Std1.RollNo);
		System.out.println(" Student std:"+ Std1.std);
		
		Std2.name="Abhijeet";
		Std2.RollNo=13;
		Std2.BloodGrp="B-ve";
		Std2.std=2;
		
		System.out.println("Details of Student:" );
		System.out.println( "Student Name:" +Std2.name);
		System.out.println(" Student BloodGrp:" +Std2.BloodGrp);
		System.out.println(" Student RollNo:" +Std2.RollNo);
		System.out.println(" Student std:"+Std2.std);
		
		
	}

}
