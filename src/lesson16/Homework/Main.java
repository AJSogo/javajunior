package lesson16.Homework;


public class Main {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();

        fridge.addProducts("Яблоко", 200);
        fridge.addProducts("Яблоко", 400);
        fridge.addProducts("Груша", 800);
        fridge.addProducts("Слива", 1000);

        fridge.printAllProducts();
        fridge.printAllProducts2();

        System.out.println();
        System.out.println("1 Метод достать продукт");
        fridge.takeProduct("груша", 200 );
        fridge.takeProduct("груша", 800);
        fridge.takeProduct("груша", 600);
        fridge.takeProduct("груша", 100);

        System.out.println();
        System.out.println("2 Метод меньше всего продукта или какой продукт закончится первым");
        fridge.theSmallestNumberOfProduct();

        System.out.println();
        System.out.println("3 вывести вес всех продуктов в холодильнике");
        fridge.printTheWeightOfAllProducts();

        System.out.println();
        System.out.println("4 вывести отсортированные продукты");
        fridge.sortKeys();

        System.out.println();
        System.out.println("5 вывести отсортированный вeс");
        fridge.sortKeys();
    }
}
