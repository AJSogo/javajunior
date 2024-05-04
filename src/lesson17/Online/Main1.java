package lesson17.Online;

public class Main1 {
    public static void main(String[] args) {
        Person person = new Person();

        try {
            person.setAge(170);

        }
        catch (AgeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("hello");
    }
}
