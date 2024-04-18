package lesson6.Online;

public class Main {
    public static void main(String[] args) {

        String [] [] tours = new String[100][8];

                ToursUtils.addTours("Италия", "Рим", "Самолет",
                        "6 дней", "140000 руб", "5 звезд", "Завтрак", tours);

                ToursUtils.addTours("Италия", "Флоренция", "Самолет",
                        "5 дней", "140000 руб", "4 звезды", "Всё включено", tours);

                ToursUtils.addTours("Франция", "Париж", "Самолет",
                        "6 дней", "140000 руб", "4 звезды", "Всё включено", tours);

                ToursUtils.addTours("Ливан", "Бейрут", "Автобус",
                        "6 дней", "50000 руб", "4 звезды", "Завтрак + Ужин", tours);

                ToursUtils.addTours("Франция", "Париж", "Самолет",
                        "6 дней", "120000 руб", "3 звезды", "Завтрак", tours);

                ToursUtils.addTours("Германия", "Мюнхен", "Автобус",
                        "6 дней", "210000 руб", "4 звезды", "Завтрак + Ужин", tours);

                ToursUtils.addTours("Германия", "Берлин", "Самолет",
                        "6 дней", "180000 руб", "5 звезд", "Всё включено", tours);



                ScannerUtils.searchByCountry(tours);
                ScannerUtils.searchByBudget(tours);
            }
        }






