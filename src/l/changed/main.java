package l.changed;

public class main {
    public static void main(String[] args) {
        Manager accountingVP = new Manager();

        accountingVP.firstName = "William";
        accountingVP.lastName = "Ardianto";
        accountingVP.calculatePerHourRate(4);

        Employee employee = new Employee();

        employee.firstName = "Wilson";
        employee.lastName = "Lim";
        employee.assignManager(accountingVP);
        employee.calculatePerHourRate(2);

        System.out.printf("%s salary is %s/hour%n", employee.firstName, employee.salary);
    }
}