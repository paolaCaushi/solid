package s.changed;

public class Person {
    String firstName;
    String lastName;
    public void printUsername() {
        System.out.printf("Your username is %s %s%n", getFirstName(), getLastName());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}