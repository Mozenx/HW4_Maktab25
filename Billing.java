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
    
}// end class Billing
