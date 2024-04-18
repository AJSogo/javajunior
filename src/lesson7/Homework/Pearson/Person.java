package lesson7.Homework.Pearson;

public class Person {
    private String fullName;
    private int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public static void move(Person person) {
        System.out.printf("%s лет %d двигается\n", person.fullName, person.age);
    }

    public static void talk(Person person) {
        System.out.printf("%s лет %d говорит\n", person.fullName, person.age);

    }


}
