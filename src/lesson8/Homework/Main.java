package lesson8.Homework;

public class Main {

    public static void main(String[] args) {
        Tour tour1 = new Tour("Италия", 39, "Самолет", 5000);
        Tour tour2 = new Tour("Германия", 40, "Самолет", 7000);
        Tour tour3 = new Tour("Франция", 24, "Поезд", 5500);
        Tour tour4 = new Tour("Британия", 35, "Самолет", 8500);

        TourAgency best = new TourAgency();

        best.addTourToMassive(tour1);
        best.addTourToMassive(tour2);
        best.addTourToMassive(tour3);
        best.addTourToMassive(tour4);


        System.out.println("Задание 1. Печать одного тура через метод из класса Тур");
        Tour.printingTour(tour1);

        System.out.println("Задание 2. Печать всех туров");

        best.printingTours();

        System.out.println("Задание 3. Печать самого дешевого тура");
        best.printingTheCheapestTour();




    }
}
