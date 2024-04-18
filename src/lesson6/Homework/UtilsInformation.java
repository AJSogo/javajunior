package lesson6.Homework;

public class UtilsInformation {

    public static void insertingInformationInMassive(String[][] tours, /*[0] порядковый номер тура*/ String country,
                                                     String city, String transport, String days, String cost,
                                                     String stars, String food) {
        for (int i = 0; i <= tours.length; i++) {
            if (tours[i][0] == null) {
                tours[i][0] = i + 1 + "";
                tours[i][1] = country;
                tours[i][2] = city;
                tours[i][3] = transport;
                tours[i][4] = days;
                tours[i][5] = cost;
                tours[i][6] = stars;
                tours[i][7] = food;
                break;
            }

        }

    }

    public static void Information(String[][] tours) {
        UtilsInformation.insertingInformationInMassive(tours, "Италия", "Рим", "Самолет",
                "6 дней", "140000 руб.", "5 звезд", "Завтрак");

        UtilsInformation.insertingInformationInMassive(tours, "Италия", "Флоренция", "Самолет",
                "5 дней", "140000 руб.", "4 звезды", "Всё включено");

        UtilsInformation.insertingInformationInMassive(tours, "Франция", "Париж", "Поезд",
                "6 дней", "140000 руб.", "4 звезды", "Всё включено");

        UtilsInformation.insertingInformationInMassive(tours, "Ливан", "Бейрут", "Автобус",
                "4 дней", "50000 руб.", "4 звезды", "Завтрак + Ужин");

        UtilsInformation.insertingInformationInMassive(tours, "Франция", "Париж", "Самолет",
                "4 дней", "120000 руб.", "3 звезды", "Завтрак");

        UtilsInformation.insertingInformationInMassive(tours, "Германия", "Мюнхен", "Автобус",
                "5 дней", "210000 руб.", "4 звезды", "Завтрак + Ужин");

        UtilsInformation.insertingInformationInMassive(tours, "Германия", "Берлин", "Самолет",
                "6 дней", "180000 руб.", "5 звезд", "Всё включено");

    }

    public static void PrintingInformation(String[][] tours) {
        System.out.println("ВСЕ НАШИ ТУРЫ:");
        for (int i = 0; i < tours.length; i++) {
            if (tours[i][0] != null) {

                System.out.printf("Тур №%s, страна %s, город %s, транспорт %s, на %s, цена %s, %s \n",
                        tours[i][0], tours[i][1], tours[i][2], tours[i][3], tours[i][4], tours[i][5], tours[i][6],
                        tours[i][7]);
            }
        }
        System.out.println("-------------------");
    }
}
