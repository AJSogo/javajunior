package lesson6.Homework;

import java.util.Scanner;

public class UtilsSearchingTour {

    public static void searchingTour(String[][] tours) {
        System.out.println("Давайте подберем Вам тур");
        System.out.println("Напишите 1, если хотите посмотреть все наши туры");
        System.out.println("Напишите 2, если хотите подобрать тур по стране");
        System.out.println("Напишите 3, если хотите подобрать тур по бюджету");
        System.out.println("Напишите 4, если хотите подобрать тур по количеству дней");
        System.out.println("Напишите 5, если хотите подобрать тур по количеству звезд и транспорту");
        System.out.println("Напишите 6, если хотите подобрать тур по стране и бюджету");

        Scanner scanner = new Scanner(System.in);
        int optionForSearching = scanner.nextInt();

        if (optionForSearching == 1) {

            UtilsInformation.PrintingInformation(tours);

        } else if (optionForSearching == 2) {
            UtilsSearchingTour.byCountry(tours);

        } else if (optionForSearching == 3) {
            UtilsSearchingTour.byCost(tours);

        } else if (optionForSearching == 4) {
            UtilsSearchingTour.byDays(tours);

        } else if (optionForSearching == 5) {
            UtilsSearchingTour.byStarsAndTransport(tours);

        } else if (optionForSearching == 6) {
            UtilsSearchingTour.byCountryAndCost(tours);

        } else {
            System.out.println("Вы выбрали несуществующий пункт");
        }
    }

    public static void byCountry(String[][] tours) {

        System.out.println("В какую страну Вы бы хотели поехать?");

        Scanner scanner = new Scanner(System.in);
        String countryYouWant = scanner.next();

        int flag = 0;

        for (int i = 0; i < tours.length; i++) {
            if (tours[i][0] != null) {
                if (tours[i][1].equalsIgnoreCase(countryYouWant)) {
                    flag = 1;
                    System.out.printf("Тур №%s, страна %s, город %s, транспорт %s, на %s, цена %s, %s \n",
                            tours[i][0], tours[i][1], tours[i][2], tours[i][3], tours[i][4], tours[i][5], tours[i][6],
                            tours[i][7]);
                }
            }
        }
        if (flag == 0) {
            System.out.println("К сожалению, для Вас нет подходящего тура");
        }
    }

    public static void byCost(String[][] tours) {
        System.out.println("На какой бюджет Вы рассчитываете?");

        Scanner scanner = new Scanner(System.in);
        int costYouWant = scanner.nextInt();
        int maxCostYouWant = 20000 + costYouWant;

        int flag = 0;


        for (int i = 0; i < tours.length; i++) {
            if (tours[i][0] != null) {

                int indexOfSpace = tours[i][5].indexOf(" ");
                String costStr = tours[i][5].substring(0, indexOfSpace);

                int cost = Integer.parseInt(costStr); //цена тура

                if (costYouWant <= cost && cost <= maxCostYouWant) {
                    System.out.printf("Тур №%s, страна %s, город %s, транспорт %s, на %s, цена %s, %s \n",
                            tours[i][0], tours[i][1], tours[i][2], tours[i][3], tours[i][4], tours[i][5], tours[i][6],
                            tours[i][7]);
                    flag = 1;
                }
            }
        }
        if (flag == 0) {
            System.out.println("К сожалению, для Вас нет подходящего тура");
        }


    }

    public static void byDays(String[][] tours) {
        System.out.println("На сколько дней Вы хотите поехать?");

        Scanner scanner = new Scanner(System.in);
        int dayYouWant = scanner.nextInt();

        int flag = 0;


        for (int i = 0; i < tours.length; i++) {
            if (tours[i][0] != null) {

                int indexOfSpace = tours[i][4].indexOf(" ");
                String daysStr = tours[i][4].substring(0, indexOfSpace);

                int days = Integer.parseInt(daysStr); //цена тура

                if (dayYouWant == days) {
                    System.out.printf("Тур №%s, страна %s, город %s, транспорт %s, на %s, цена %s, %s \n",
                            tours[i][0], tours[i][1], tours[i][2], tours[i][3], tours[i][4], tours[i][5], tours[i][6],
                            tours[i][7]);
                    flag = 1;
                }

            }
        }
        if (flag == 0) {
            System.out.println("К сожалению, для Вас нет подходящего тура");
        }
    }

    public static void byStarsAndTransport(String[][] tours) {
        System.out.println("Какое количество звезд у отеля Вы бы хотели?");

        Scanner scanner = new Scanner(System.in);
        int starsYouWant = scanner.nextInt();

        System.out.println("Напишите транспорт, на котором Вы бы хотели поехать: Автобус, Самолет или Поезд?");
        String transportYouWant = scanner.next();

        int flag = 0; //проверка


        for (int i = 0; i < tours.length; i++) {
            if (tours[i][0] != null) {

                int indexOfSpace = tours[i][6].indexOf(" ");
                String daysStr = tours[i][6].substring(0, indexOfSpace);

                int stars = Integer.parseInt(daysStr); //количество звезд


                if (starsYouWant == stars && transportYouWant.equalsIgnoreCase(tours[i][3])) {
                    System.out.printf("Тур №%s, страна %s, город %s, транспорт %s, на %s, цена %s, %s \n",
                            tours[i][0], tours[i][1], tours[i][2], tours[i][3], tours[i][4], tours[i][5], tours[i][6],
                            tours[i][7]);
                    flag = 1;
                }
            }

        }
        if (flag == 0) {
            System.out.println("К сожалению, для Вас нет подходящего тура");
        }
    }


    public static void byCountryAndCost(String[][] tours) {

        System.out.println("В какую страну Вы бы хотели поехать?");

        Scanner scanner = new Scanner(System.in);
        String countryYouWant = scanner.next();

        System.out.println("На какой бюджет Вы рассчитываете?");

        int costYouWant = scanner.nextInt();
        int maxCostYouWant = costYouWant + 20000;

        int flag = 0;

        for (int i = 0; i < tours.length; i++) {
            if (tours[i][0] != null) {

                //делаем число из стринга цены
                int indexOfSpace = tours[i][5].indexOf(" ");
                String costStr = tours[i][5].substring(0, indexOfSpace);

                int cost = Integer.parseInt(costStr); //цена тура

                if (tours[i][1].equalsIgnoreCase(countryYouWant) && cost <= maxCostYouWant) {
                    System.out.printf("Тур №%s, страна %s, город %s, транспорт %s, на %s, цена %s, %s \n",
                            tours[i][0], tours[i][1], tours[i][2], tours[i][3], tours[i][4], tours[i][5], tours[i][6],
                            tours[i][7]);
                    flag = 1;
                }
            }
        }

        if (flag == 0) {
            System.out.println("К сожалению, для Вас нет подходящего тура");
        }

    }

}
