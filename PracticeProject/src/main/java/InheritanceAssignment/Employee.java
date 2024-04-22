package InheritanceAssignment;
import java.util.Scanner;


public class Employee {
	 
		    static double basicPay;
		    static double deduction;
		    static double bonus;

		    public static void getPay() {
		        Scanner scn = new Scanner(System.in);
		        System.out.println("Enter Basic Pay: ");
		        basicPay = scn.nextDouble();
		        System.out.println("Enter Deduction: ");
		        deduction = scn.nextDouble();
		        System.out.println("Enter Bonus: ");
		        bonus = scn.nextDouble();
		    }

		    public static void main(String args[]) {
		        totalPay obj = new totalPay();
		        obj.getPay();
		        obj.calcPayment();
		        obj.totalPayment();
		    }
}

	


