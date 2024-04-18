package lesson9.Homework;

public class Circle {

    //поля класса
    private double radius;

    //конструкторы
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    //методы
    public double perimeter(){
        return 2* radius* Math.PI;
    }
    public double square(){
        return Math.PI * radius * radius;
    }

    //геттеры и сеттеры

    public double getRadius() {
        return radius;
    }

    public void setRadius() {
        this.radius = radius;
    }
}
