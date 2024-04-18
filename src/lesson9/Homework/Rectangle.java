package lesson9.Homework;

public class Rectangle {

    //поля класса
    private double firstSide;
    private double secondSide;

    //конструкторы
    public Rectangle(){}

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    //методы
    public double perimeter(){
        return (firstSide + secondSide) * 2;
    }
    public double square (){
        return firstSide *secondSide;
    }



    //геттеры и сеттеры


    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }
}
