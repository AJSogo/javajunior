package lesson7.Online;

public class Student {
/*
* */
    private int age;
    private String fullName;
    private String address;
    private String phoneNumber;

    //конструктор



    public Student(){

    }
    public Student(int age, String fullName, String address,
                   String phoneNumber){
        this.age = age;
        this.address = address;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;

    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){

        return age;
    }

}
