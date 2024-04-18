package lesson9.Homework;

public class Main {
    public static void main(String[] args) {

        /*
        1) Создать класс Треугольник, Прямоугольник, Квадрат, Круг, Овал.
2) Самостоятельно подумать какие нам нужны в этих классах поля, прописать их.

3) Создать все методы гет и сет во всех классах.

4) Создать минимум 2 конструктора в каждом классе

5) Создать в каждом классе методы: площадь и периметр, которые возвращают значение площади или периметра,
по заданным полям класса.

6) Создать класс Main и показать как работают методы площадь и периметр.
Для этого конечно необходимо будет создать по 1 объекту каждой фигуры, и установить каждому значения сторон.
*/
        Circle circle = new Circle(14);
        Ellipse ellipse = new Ellipse(14, 17);
        Rectangle rectangle = new Rectangle(14, 17);
        Square square = new Square(14);
        Triangle triangle = new Triangle(14, 17, 16);


        System.out.println("Периметр круга " + circle.perimeter());
        System.out.println("Площадь круга " + circle.square());

        System.out.println("Периметр овала " + ellipse.perimeter());
        System.out.println("Площадь овала "  + ellipse.square());

        System.out.println("Периметр прямоугольника " + rectangle.perimeter());
        System.out.println("Площадь прямоугольника " + rectangle.square());

        System.out.println("Периметр квадрата " + square.perimeter());
        System.out.println("Площадь квадрата " + square.square());

        System.out.println("Периметр треугольника " + triangle.perimeter());
        System.out.println("Площадь треугольника " + triangle.square());



    }

}
