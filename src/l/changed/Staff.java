package l.changed;

public class Staff {

    public String firstName;
    public String lastName;
    public double salary;
    public Double baseAmount;
    public Double rankRate;

    Staff(Double baseAmount, Double rankRate) {
        this.baseAmount = 12.50;
        this.rankRate = 2.0;
    }

    public void calculatePerHourRate(int rank) {
        salary = baseAmount + (rank * rankRate);
    }
}
