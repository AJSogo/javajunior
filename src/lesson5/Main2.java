package lesson5;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        System.out.println("Напишите, площадь или периметр какой фигуры Вы бы хотели вычислить?");
        System.out.println(" 1 - треугольник");
        System.out.println(" 2 - квадрат");
        System.out.println(" 3 - круг");
        System.out.println(" 4 - овал");
        System.out.println(" 5 - трапеция");

        Scanner sc = new Scanner(System.in);
        String input2 = sc.next();

        //треугольник
        if (input2.contains("1") || input2.contains("треугольник")) {
            System.out.println("Напишите стороны треугольника");

            System.out.println("Сторона а равна");
            int a = sc.nextInt();
            System.out.println("Сторона b равна");
            int b = sc.nextInt();
            System.out.println("Сторона c равна");
            int c = sc.nextInt();

            MathUtiles.squareOfTriangle(a, b, c); // выводим площадь
            System.out.println("Периметр треугольника равнен " + MathUtiles.perimeterOfTriangle(a, b, c)); //выводим периметр

        }
        //квадрат
        else if (input2.contains("2") || input2.contains("квадрат")) {
            System.out.println("Напишите сторону квадрата");

            double a = sc.nextDouble();
            System.out.println("Площадь квадрата равна " + MathUtiles.squareOfSquare(a));
            System.out.println("Периметр квадрата равен " + MathUtiles.perimeterOfSquare(a));
        } else if (input2.contains("3") || input2.contains("круг")) {
            System.out.println("Напишите радиус круга");

            double a = sc.nextDouble();
            System.out.println("Площадь круга равна " + MathUtiles.squareOfCircle(a));
            System.out.println("Периметр круга равен " + MathUtiles.perimeterOfCircle(a));
        } else if (input2.contains("4") || input2.contains("овал")) {
            System.out.println("Напишите больший радиус");
            double a = sc.nextDouble();
            System.out.println("Напишите меньший радиус");
            double b = sc.nextDouble();
            System.out.println("Площадь овала равна " + MathUtiles.squareOfEllipse(a, b));
            System.out.println("Периметр овала равен " + MathUtiles.perimeterOfEllipse(a, b));

        } else if (input2.contains("5") || input2.contains("трапеция")) {
            System.out.println("*Примечание: для вычисления площади и периметра Вы должны указать две " +
                    "противоположные стороны");
            System.out.println("Напишите первую сторону трапеции");
            double a = sc.nextDouble();
            System.out.println("Напишите вторую сторону трапеции");
            double b = sc.nextDouble();
            System.out.println("Напишите высоту трапеции");
            double h = sc.nextDouble();

            System.out.println("Площадь трапеции равна " + MathUtiles.squareOfTrapezoid(a, b, h));
            System.out.println("Периметр трапеции равен " + MathUtiles.perimeterOfTrapezoid(a, b, h));
        } else {
            System.out.println("Ошибка ввода");
        }


    }

}




