package d.changed;

public class Chore {
    public String choreName;
    public Person owner;
    public double hoursWorked;
    public boolean isComplete;
    public void performedWork(double hours){
        hoursWorked += hours;
        Logger log = new Logger();
        log.log(String.format("Performed work on %s", choreName));
    }
    public void completeChore(){
        isComplete = true;

        Logger log = new Logger();
        log.log(String.format("Completed %s", choreName));

        Email email = new Email();
        email.sendMessage(owner, String.format("The chore %s is complete", choreName));
    }
}