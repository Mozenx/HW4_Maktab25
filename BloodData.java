package Q4;

public class BloodData {
    private String bloodType;
    private char rhFactor;

    //constructor
    BloodData() {
        this.bloodType = "O";
        this.rhFactor = '+';
    }

    // constructor
    BloodData(String bloodType, char rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    
}// end class BloodData
