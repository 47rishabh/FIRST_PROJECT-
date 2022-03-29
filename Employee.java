import java.util.Scanner;

public class Employee {
	String name;
	int age;
	float salary;
	Scanner s;
	
	void add()
	 {  
		s= new Scanner(System.in);
		System.out.println("enter name ");
		name= s.next();//take string as input from user
		System.out.println("enter age ");
		age= s.nextInt();
		System.out.println("enter salary ");
		salary= s.nextFloat();
	}
	void display()
	{
		System.out.println(name+" "+age+" "+salary);
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		   e.add();
		   e.display();
		   
		   Employee e1 = new Employee();
		   e1.add();
		   e1.display();
		    
		
	}

}
