package lesson12;

public class Main {

    public static void main(String[] args) {
        Hen hen = HenFactory.getHen("Беларусь");
        hen.getCountOfEggsPerMonth();
        System.out.print(hen.getDescription());
    }

}
