package lesson17.Online;

import lesson17.Online.AgeException;

public class Person {
    private int age;
    private String name;

    public void setAge(int age) throws AgeException {
        if(age < 0){
            throw new AgeException("Возраст не может быть отрицательным");
        }
        if(age > 150){
            throw new AgeException("Возраст не может быть больше 150");
        }
        this.age = age;
    }


}

