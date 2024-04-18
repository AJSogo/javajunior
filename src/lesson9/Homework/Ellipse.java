package lesson9.Homework;

public class Ellipse {

    //поля класса
    private double firstRadius;
    private double secondRadius;

    //конструкторы
    public Ellipse (){}

    public Ellipse(double firstRadius, double secondRadius) {
        this.firstRadius = firstRadius;
        this.secondRadius = secondRadius;
    }


    //методы
    public double perimeter(){
        return Math.PI* (firstRadius+secondRadius);
    }
    public double square(){
        return Math.PI * firstRadius * secondRadius;
    }

    //геттеры и сеттеры
    public double getFirstRadius() {
        return firstRadius;
    }

    public void setFirstRadius(double firstRadius) {
        this.firstRadius = firstRadius;
    }

    public double getSecondRadius() {
        return secondRadius;
    }

    public void setSecondRadius(double secondRadius) {
        this.secondRadius = secondRadius;
    }
}
