package InheritanceAssignment;

public class totalPay extends calcPay {
    public static void totalPayment() {
        double totalSalary = basicPay + hra - pf - deduction + bonus;
        System.out.println("Basic pay of the employee is : " + basicPay);
        System.out.println("Deduction of the employee is : " + deduction);
        System.out.println("Bonus of the employee is : " + bonus);
        System.out.println("HRA of the employee is : " + hra);
        System.out.println("PF of the employee is : " + pf);
        System.out.println("Total salary of the employee is : " + totalSalary);
    }
}
