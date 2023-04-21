package JavaDemo;

public class Assigment {

	public static void main(String[] args) {
	/////Prepare a code to check the voters eligibility.
		//////Take a variable int age. if age is greater than 18 print. "eligible" else print " not eligible"//////
		
		
		{	int Age=21;
		
		
		if (Age<18) {
			
			System.out.println("Voter are eligible to voting: ");
			
		}
		else{
			
			System.out.println("Voter are not eligible to voting: ");
		}
		/////Q2.Create a code to check the length of a string = "My name is Anthony Gonsalves".  Now if the length is greater than 28 change the string to "My name is Anthony". and print "Successfully changed."
		
		String Name="My name is Anthony Gonsalves";
		
		if (Name.length()>28) {
			
			System.out.println("The lenght of this Sentence is Matched");
			
		}
		else {
			System.out.println("My Name is Anthony");
			
		}
		System.out.println("Succefully Changed");
	
       ///Q3.Write a java program which initializes a variable name and greets with "Hello <name>, have a good day"

//Name input is from user
	 System.out.println("Hello Vinod, Have a good day");

	}
       //	Q4.Concatenate two Strings
	//Example for two Strings::
	//String a= Nilkanth
	//String b= Java
	//Output- NilkanthJava
	
	 String a= "Nilkanth";
	   String b= "Java";
		String C= a.concat(b);
		   System.out.println("Out Put Is "+ C);
		

			   
			   
			   
		   }
	{
// Q 5.	Take an input from user as String, if the length of String
//	is more than 30. Print String is too long else the String length is okay
  
	int Length=35;
	
	
	if (Length>30) {
		System.out.println("Length is ok");
	}
	else {
		System.out.println("Length is not ok");
	}
	

	
	}


}
	

