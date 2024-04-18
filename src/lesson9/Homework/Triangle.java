package lesson9.Homework;

public class Triangle {

    //поля класса
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    //конструкторы
    public Triangle() {
    }

    public Triangle(double firstSide) {
        this.firstSide = firstSide;
    }

    public Triangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    //методы

    public double perimeter() {
        return firstSide + secondSide + thirdSide;
    }

    public double halfOfPerimeter(){
        return perimeter()/2;
    }

    public double square() {
        return Math.sqrt( halfOfPerimeter() * (halfOfPerimeter() - firstSide) * (halfOfPerimeter() - secondSide) *
                (halfOfPerimeter() - thirdSide));
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

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }
}
