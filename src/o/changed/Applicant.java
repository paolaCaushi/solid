package o.changed;

public class Applicant extends Staff_Class {
    EmployeeType typeOfEmployee;


    public Applicant(String firstName, String lastName, EmployeeType typeOfEmployee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.typeOfEmployee = typeOfEmployee;
    }
}