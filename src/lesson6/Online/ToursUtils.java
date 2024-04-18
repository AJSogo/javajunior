package lesson6.Online;

public class ToursUtils {

    public static void addTours(String country, String city, String transport, String day, String cost, String stars,
                                String food, String[][] tours) {
        for (int i = 0; i < tours.length; i++) {

            if (tours[i][0] == null) {
                tours[i][0] = (i + 1) + "";
                tours[i][1] = country;
                tours[i][2] = city;
                tours[i][3] = transport;
                tours[i][4] = day;
                tours[i][5] = cost;
                tours[i][6] = stars;
                tours[i][7] = food;
                break;

            }

        }
    }


    public static void printToursByCountries(String[][] tours, String country) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i][0] != null && tours[i][1].equalsIgnoreCase(country)) {
                System.out.printf("Тур №%s в страну %s в город %s на транспорте %s на %s дней " +
                                "за %s %s \n",
                        tours[i][0], tours[i][1], tours[i][2], tours[i][3], tours[i][4],
                        tours[i][5], tours[i][6], tours[i][7]);

            }
        }
    }

    public static void printToursByBudget(String[][] tours, int budget) {
        for (int i = 0; i < tours.length; i++) {
            //120 000 пятая колонка
            // int budget = 120000 руб

            if (tours[i][0] != null) {

                int spaceIndex = tours[i][5].indexOf(" "); // узнаем индекс пробела в массиве
                String priceStr = tours[i][5].substring(0, spaceIndex);

                int priceCurrentTour = Integer.parseInt(priceStr); // преобразовали текстовую цену в число
                int maxBudget = budget + 20000;
                int minBudget = budget - 20000;
                if (priceCurrentTour >= minBudget && priceCurrentTour >= minBudget) { //если мы входим
                    //в бюджет
                    System.out.printf("Тур №%s в страну %s в город %s на транспорте %s на %s дней " +
                                    "за %s %s \n",
                            tours[i][0], tours[i][1], tours[i][2], tours[i][3], tours[i][4],
                            tours[i][5], tours[i][6], tours[i][7]);
                }

            }
        }
    }
    /*public static void printToursByDay(String[][] tours, int day) {
        for (int i = 0; i < tours.length; i++) {
            //day четвертый индекс
            // int day = 5

            if (tours[i][0] != null) {


                int spaceIndex = tours[i][4].indexOf(" "); // узнаем индекс пробела в массиве
                String priceStr = tours[i][4].substring(0, spaceIndex);

                int daysOfTours = Integer.parseInt(priceStr); // преобразовали текстовую цену в число
                int maxBudget = day + 20000;
                int minBudget = budget - 20000;
                if (priceCurrentTour >= minBudget && priceCurrentTour >= minBudget) { //если мы входим
                    //в бюджет
                    System.out.printf("Тур №%s в страну %s в город %s на транспорте %s на %s дней " +
                                    "за %s %s \n",
                            tours[i][0], tours[i][1], tours[i][2], tours[i][3], tours[i][4],
                            tours[i][5], tours[i][6], tours[i][7]);
                }

            }
        }
    }*/

}
