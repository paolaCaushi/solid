package d.changed;

public class Email implements Message {
    @Override
    public void sendMessage(Person person, String message) {
        System.out.println(String.format("Simulating sending an email to %s", person.email));

    }
}