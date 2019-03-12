package Q4;

public class Patient {
    private int idNumber;
    private int age;
    private BloodData bloodData;

    //default constructor
    Patient() {
        this.idNumber = 0;
        this.age = 0;
        this.bloodData = new BloodData();
    }

    // constructor provides values for each fields
    Patient(int idNumber, int age, String bloodType, char rhFactor) {
        this.idNumber = idNumber;
        this.age = age;
        this.bloodData = new BloodData(bloodType, rhFactor);
    }

}// end Patient class
