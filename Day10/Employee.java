package Day10;

import java.util.Scanner;

public class Employee {
	int id;
	String name;
	long phoneNo;
	double salary;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Employee emp1 = new Employee();
		
		emp1.id = 10;
		emp1.name = "Vicky";
		emp1.phoneNo = 9840155760l;
		emp1.salary = 100000.00;
		
		System.out.println("Employee id :" +emp1.id);
		System.out.println("Employee name :" +emp1.name);
		System.out.println("Employee phoneNo :" +emp1.phoneNo);
		System.out.println("Employee salary :" +emp1.salary);
		
        Employee emp2 = new Employee();
		
		emp2.id = 20;
		emp2.name = "Vijay";
		emp2.phoneNo = 9840686986l;
		emp2.salary = 60000.00;
		
		System.out.println("Employee id :" +emp2.id);
		System.out.println("Employee name :" +emp2.name);
		System.out.println("Employee phoneNo :" +emp2.phoneNo);
		System.out.println("Employee salary :" +emp2.salary);
		
        Employee emp3 = new Employee();
		
		emp3.id = 30;
		emp3.name = "Vinoth";
		emp3.phoneNo = 9840768757l;
		emp3.salary = 80000.00;
		
		System.out.println("Employee id :" +emp1.id);
		System.out.println("Employee name :" +emp1.name);
		System.out.println("Employee phoneNo :" +emp1.phoneNo);
		System.out.println("Employee salary :" +emp1.salary);
		
        Employee emp4  = new Employee();
		
		emp4.id = 40;
		emp1.name = "Veera";
		emp1.phoneNo = 9840124654l;
		emp1.salary = 70000.00;
		
		System.out.println("Employee id :" +emp4.id);
		System.out.println("Employee name :" +emp4.name);
		System.out.println("Employee phoneNo :" +emp4.phoneNo);
		System.out.println("Employee salary :" +emp4.salary);
		
		Employee emp5  = new Employee();
		
		System.out.println("Enter the Employee Values");
		
		emp5.id = scan.nextInt();
		scan.nextLine();
		emp5.name = scan.nextLine();
		emp5.phoneNo = scan.nextLong();
		emp5.salary = scan.nextDouble();
		
		System.out.println("Employee id :" +emp5.id);
		System.out.println("Employee name :" +emp5.name);
		System.out.println("Employee phoneNo :" +emp5.phoneNo);
		System.out.println("Employee salary :" +emp5.salary);
		
	}
}
