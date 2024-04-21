package WorksOfOthers;

public class Main{
    public static void main(String[] args) {
        Hen hen = HenFactory.getHеn("Беларусь");
        hen.getCountOfEggsPerMonth();
        System.out.print(hen.getDescription());
    }
}