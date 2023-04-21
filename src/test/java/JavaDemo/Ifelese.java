package JavaDemo;

import java.util.Scanner;

public class Ifelese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    
	    int rollno;
	    String name;
	    String lname;
	    float percent;
	    boolean placed;
	    
	    System.out.println("Please enter the roll number : ");
	    rollno = sc.nextInt();
	    
	    System.out.println("Please enter the first name : ");
	    name = sc.next();
	    
	    
	    System.out.println("Please enter the last name: ");
	    lname = sc.next();
	    
	    System.out.println("Please enter the percentile : ");
	    percent = sc.nextFloat();
	    
	    System.out.println("Please enter if you are place or not: ");
	    placed = sc.nextBoolean();
	    
	    System.out.println(rollno);
	    System.out.println(name);
	    System.out.println(lname);
	    System.out.println(percent);
	    System.out.println(placed);
	}

}
