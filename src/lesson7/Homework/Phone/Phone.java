package lesson7.Homework.Phone;

public class Phone {


    private int number;
    private String model;
    private int weight;

    public Phone() {
    }
    public Phone(int number, int weight) {
    }

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void display(){
        System.out.print(number+ " ");
        System.out.print(model+ " ");
        System.out.print(weight+ " ");
        System.out.println();

    }

}
