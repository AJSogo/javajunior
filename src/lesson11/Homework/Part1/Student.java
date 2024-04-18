package lesson11.Homework.Part1;

import java.util.Objects;

public class Student extends Object {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;


    //конструкторы
    public Student() {
    }

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public int getScholarship (){
        if(averageMark == 5){
            return 2000;
        }
        else return 1900;
    }


    //геттеры и сеттеры
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    //equals hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (Double.compare(student.averageMark, averageMark) != 0) return false;
        if (!Objects.equals(firstName, student.firstName)) return false;
        if (!Objects.equals(lastName, student.lastName)) return false;
        return Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (group != null ? group.hashCode() : 0);
        temp = Double.doubleToLongBits(averageMark);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    //toString

    @Override
    public String toString() {
        return "Студент: " +
                "имя '" + firstName + '\'' +
                ", фамилия '" + lastName + '\'' +
                ", группа '" + group + '\'' +
                ", средняя оценка " + averageMark;
    }
}
