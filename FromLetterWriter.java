package Q2;

public class FromLetterWriter {

    //displaySalutation method
    public static void displaySalutation (String lastName){
        System.out.println("Dear Mr. " + lastName);
    }

    // overloaded displaySalutation method
    public static void displaySalutation (String firstName, String lastName){
        System.out.println("Dear " + firstName + " " +lastName);
    }

    // businessLetter method
    public static void businessLetter (){
        System.out.println("Thank you for your recent order.\n");
    }
    
}// end class FromLetterWriter
