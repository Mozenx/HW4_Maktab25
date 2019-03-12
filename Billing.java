package Q3;

public class Billing {
    private static int tax;
    private static int off;
    private static int totalDue;

    // computeBill method by one parameter
    public static int computeBill(int price){
        // calculate tax
        tax = price * 8 / 100;
        // added tax
        totalDue = price + tax;
        return totalDue;
    }

    // computeBill method by two parameter
    public static int computeBill(int price, int quantity){
        //calculate tax
        tax = price * quantity * 8 / 100;
        // added tax
        totalDue = price * quantity + tax;
        return totalDue;
    }

    // computeBill method by three parameter
    public static int computeBill (int price, int quantity, int coupon){
        // calculate off
        off = price * quantity * coupon / 100;
        // subtracted off(coupon)
        totalDue = price * quantity - off;
        // calculate tax
        tax = totalDue * 8 / 100;
        // added tax
        totalDue += tax;
        return totalDue;
    }
    
}// end class Billing
