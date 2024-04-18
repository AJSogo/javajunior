package lesson11.Homework.Part1;

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[4];

        students[0] = new Student("Лилия", "Наумова", "Лингвистика 15", 5);
        students[1] = new Student("Дарья", "Простолюдинова", "Лингвистика 16", 4.8);

        students[2] = new Aspirant("Дарья", "Простолюдинова", "Медицина 16", 5, true);
        students[3] = new Aspirant("Никита", "Баринов", "Медицина 16", 4.6, false);

        System.out.println("Все наши студенты");
        for (Student student: students
             ) {
            System.out.println(student);
        }

        System.out.println();

        System.out.println("Стипендия студентов");
        System.out.println(students[0].getScholarship());
        System.out.println(students[1].getScholarship());
        System.out.println(students[2].getScholarship());
        System.out.println(students[3].getScholarship());



    }
}
