package EncapsulationDemo;

public class TestEmploye {

	public static void main(String[] args) {
		Employe obj = new Employe();
		obj.setEmpage(27);
		obj.setEmpName("Vinod Potdar");
		obj.setEmpSallary(100000);

		System.out.println("EmpName  " + obj.getEmpName());
		System.out.println("EmpName  " + obj.getEmpage());
		System.out.println("EmpName  " + obj.getEmpSallary());

		String Name = "Vinod Pandurang Potdar";
		String Name1 = "Vinod Pandurang Potdar";

		System.out.println(Name.charAt(2));
       System.out.println(Name.toUpperCase());
       System.out.println(Name.equals(Name1));
       System.out.println(Name.substring(2,8));
       
       StringBuilder Name3=new StringBuilder("Selenium");
       
       System.out.println(Name3.append("Automation"));
       System.out.println(Name3.delete(2, 5));
	}

}
