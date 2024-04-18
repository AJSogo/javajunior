package lesson10.Homework;

public class Main {
    public static void main(String[] args) {

        //создаем массив печатных изданий
        Printery[] printeryMassive = new Printery[20];

        //создаем две книги
        printeryMassive[0] = new Book("Артур Конан Дойл", "Приключения Шерлока Холмса", 2002, 550, "АСТ");
        printeryMassive[1] = new Book("Джейн Остен", "Гордость и предубеждение", 2004, 360, "ПокетБук");

        //

        //создаем два журнала
        printeryMassive[3] = new Journal(1, "Дары Природы", 2014, 55, "Нэшнал Джиографик");
        printeryMassive[4] = new Journal(2, "Испанский футбол", 2018, 39, "Марка");

        //присваеваем ячейке массива издание
        /*printeryMassive[0] = book1;
        printeryMassive[1] = book2;
        printeryMassive[2] = journal1;
        printeryMassive[3] = journal2;*/

        //1. печатаем содержимое массива
        System.out.println("Все наши товары");

        for (int i = 0; i < printeryMassive.length; i++) {
            if (printeryMassive[i] != null) {
                System.out.println(printeryMassive[i]);
            }
        }
        for (Printery printeryEdition: printeryMassive)
            System.out.println(printeryEdition);

        System.out.println("Самое толстое издание");
        Printery.theSmallestPrintery(printeryMassive);


    }
}
