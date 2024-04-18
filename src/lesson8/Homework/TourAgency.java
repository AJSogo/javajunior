package lesson8.Homework;

/*

2) Создать класс ТурАгенство. Полем класса объявить массив Туров.
Создать в нем метод, который будет добавлять один Тур в Массив Туров
Создать в нем метод, который будет печатать на консоль информацию про ВСЕ туры из массива
Создать в нем метод, который будет печатать на консоль Самый дешевый тур

3) Создать класс Меин в котором продемонстрировать как работают все методы класса ТурАгенство
*/

public class TourAgency {
    private Tour[] allTours = new Tour[100];

    public void addTourToMassive(Tour tour) {
        for (int i = 0; i < allTours.length; i++) {
            if (allTours[i] == null) {
                allTours[i] = tour;
                break;
            }

        }
    }

    public void printingTours() {
        for (int i = 0; i < allTours.length; i++) {
            if (allTours[i] != null) {
                Tour.printingTour(allTours[i]);
            }
        }
    }

    public void printingTheCheapestTour() {
        int cheapest = 0;

        if (allTours[0] != null) {
            cheapest = allTours[0].getCost();
        }

        for (int i = 0; i < allTours.length; i++) {

            if (allTours[i] != null) {

                if (allTours[i].getCost() < cheapest) {
                    cheapest = allTours[i].getCost();
                }
            }
        }
        for (int i = 0; i < allTours.length; i++) {
            if (allTours[i] != null) {

                if (allTours[i].getCost() == cheapest) {
                    Tour.printingTour(allTours[i]);
                }
            }
        }

    }


}

