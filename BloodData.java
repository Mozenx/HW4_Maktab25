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

    //setter for bloodType
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    //getter for bloodType
    public String getBloodType() {
        return bloodType;
    }

    
}// end class BloodData
