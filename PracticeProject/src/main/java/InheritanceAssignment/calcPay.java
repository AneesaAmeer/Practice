package InheritanceAssignment;

public class calcPay extends Employee {
    static double hra;
    static double pf;

    public static void calcPayment() {
        hra = (5 * basicPay) / 100;
        pf = (20 * basicPay) / 100;
    }
}