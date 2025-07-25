package Day10;

import java.util.Scanner;

public class MethodEx {
	
	public void add(int num1 ,int  num2) {
		System.out.println("Addition:"+(num1+num2));
	}
	public void sub(int num1 ,int  num2) {
		System.out.println("Subtraction:"+(num1-num2));
	}
	public void multi(int num1 ,int  num2) {
		System.out.println("Multiplication:"+(num1*num2));
	}
	public void div(int num1 ,int  num2) {
		System.out.println("Division:"+(num1/num2));
	}
	public void mod(int num1 ,int  num2) {
		System.out.println("Modular:"+(num1%num2));
	}
	 public static void main(String[] args) {
		 
		 Scanner scan = new Scanner(System.in);
	     MethodEx calc = new MethodEx();
	     System.out.println("Enter the num1 :");
	     int num1 = scan.nextInt();
	     System.out.println("Enter the num2 :");
	     int num2 = scan.nextInt();
	     
	     calc.add(num1, num2);
	     calc.sub(num1, num2);
	     calc.multi(num1, num2);
	     calc.div(num1, num2);
	     calc.mod(num1, num2);
	     
	}
}
