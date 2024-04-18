package lesson10.Online;

import java.util.Objects;

public class Student extends Object {

    private String fullname;
    private int age;
    private int scholarship;


    //конструкторы
    public Student() {
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }



    //геттеры и сеттеры
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    public Student(String fullname, int age, int scholarship) {
        this.fullname = fullname;
        this.age = age;
        this.scholarship = scholarship;

    }

    @Override
    public boolean equals(Object o) {
        //olya --- o --- Student
        // dasha --- this

        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (this.age != student.age) return false;
        if (this.scholarship != student.scholarship) return false;
        return Objects.equals(fullname, student.fullname);
    }

    @Override
    public int hashCode() {
        int result = fullname != null ? fullname.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + scholarship;
        return result;
    }
}
