package lesson7.Homework.Pearson;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Ivan", 21);

        Person.move(person1);
        Person.talk(person1);

        Person.move(person2);
        Person.talk(person2);







    }
}
