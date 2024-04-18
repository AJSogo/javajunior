package lesson5;

public class MathUtiles {
    //создать метод, который посчитает площадь треугольника по трем сторонам
    /*System.out.println("Напишите, площадь или периметр какой фигуры Вы бы хотели вычислить?");
        System.out.println(" 1 - треугольник");
        System.out.println(" 2 - квадрат");
        System.out.println(" 3 - круг");
        System.out.println(" 4 - овал");
        System.out.println(" 5 - трапеция");*/
    public static void squareOfTriangle(int a, int b, int c) {
        int p = (a + b + c);
        System.out.println("Площадь равна " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    public static int perimeterOfTriangle(int a, int b, int c) {
        return a + b + c;
    }

    public static double squareOfSquare(double a) {
        return Math.pow(a, 2);
    }

    public static double perimeterOfSquare(double a) {
        return a * 4;
    }

    public static double squareOfCircle(double a) {
        return Math.pow(a, 2) * Math.PI;
    }
    public static double perimeterOfCircle(double a) {
        return 2 * a * Math.PI;
    }
    public static double squareOfEllipse(double a, double b) {
        return a * b * Math.PI;
    }
    public static double perimeterOfEllipse(double a, double b) {
        return Math.PI * Math.pow(((Math.pow(a, 2) + Math.pow(b,2)) / 2), 0.5);
    }
    public static double squareOfTrapezoid(double a, double b, double h) {
        return ((a + b)/2) * h;
    }
    public static double perimeterOfTrapezoid(double a, double b, double h) {
        return a+b + h*2;
    }



}
