package s.changed;
public class main {
    public static void main(String[] args) {
        MethodCalling m_app = new MethodCalling();

        try {
            Person user = m_app.createUser();
            user.printUsername();
        } catch (Exception err) {
            System.out.println(err);
        }
    }
}

