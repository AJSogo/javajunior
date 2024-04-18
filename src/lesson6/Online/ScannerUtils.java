package lesson6.Online;

import java.util.Scanner;

public class ScannerUtils {
    public static void searchByCountry(String[][] tours) {
        System.out.println("В какую страну Вы бы хотели поехать?");

        Scanner coun = new Scanner(System.in);
        String country = coun.next();
        ToursUtils.printToursByCountries(tours, country);


    }
    //пользователь задает число и мы печатаем туры +-20 тыс от этого бюджета
    public static void searchByBudget(String [][] tours) {
        System.out.println("На какой бюджет поездки Вы рассчитываете?");

        Scanner coun = new Scanner(System.in);
        int budget = coun.nextInt();
        System.out.println("РЕЗУЛЬТАТ");
        ToursUtils.printToursByBudget(tours, budget);
        System.out.println("-------------");

    }
    /*public static void searchByDay(String [][] tours) {
        System.out.println("На  сколько дней Вы хотите поехать?");

        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        System.out.println("РЕЗУЛЬТАТ");
        ToursUtils.printToursByDay(tours, days);
        System.out.println("-------------");

    }*/

}
