package lesson9.Homework;

public class Square {

    //поля класса
    private double side;

    //конструкторы
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    //методы
    public double perimeter(){
        return 4*side;
    }
    public double square(){
        return side*side;
    }


    //геттеры и сеттеры

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}




