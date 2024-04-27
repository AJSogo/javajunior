package lesson16;

public class Main1 {
    public static void main(String[] args) {

        Fridge fridge = new Fridge();

        fridge.addProducts("Яблоко", 200);
        fridge.addProducts("Яблоко", 400);
        fridge.addProducts("Груша", 800);
        fridge.addProducts("Слива", 1000);

        fridge.printAllProducts();
        fridge.printAllProducts2();
    }
}
