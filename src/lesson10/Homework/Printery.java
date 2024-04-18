package lesson10.Homework;

import java.util.Objects;

public class Printery extends Object {
    private String name;
    private int year;
    private int pages;
    private String publishingHouse;

    //конструкторы
    public Printery() {
    }

    public Printery(String name, int year, int pages, String publishingHouse) {
        this.name = name;
        this.year = year;
        this.pages = pages;
        this.publishingHouse = publishingHouse;
    }


    //методы
    public static void theSmallestPrintery(Printery[] printeryMassive) {
        int toughest = 0;

        //ищем самое дешевое издание
        for (int i = 0; i < printeryMassive.length; i++) {

            //чтобы код срабатывал только в полных ячейках массива
            if (printeryMassive[i] != null) {

                //для начала предписываем переменной cheapest значение первой ячейки массива, чтобы далее шло сравнение
                if(toughest == 0){
                    toughest = printeryMassive[i].pages;}

                //идет сравнение
                if (printeryMassive[i].pages > toughest) {
                    toughest = printeryMassive[i].pages;
                }
            }
        }

        //выводим самое толстое издание
        for (int i = 0; i < printeryMassive.length; i++) {
            if (printeryMassive[i] != null) {

                if (printeryMassive[i].pages == toughest) {
                    System.out.println(printeryMassive[i]);
                }
            }
        }
    }

    //геттеры и сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    //equals and hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Printery printery = (Printery) o;

        if (year != printery.year) return false;
        if (pages != printery.pages) return false;
        if (!Objects.equals(name, printery.name)) return false;
        return Objects.equals(publishingHouse, printery.publishingHouse);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + year;
        result = 31 * result + pages;
        result = 31 * result + (publishingHouse != null ? publishingHouse.hashCode() : 0);
        return result;
    }

    //toString

    @Override
    public String toString() {
        return " название '" + name + '\'' +
                ", год выпуска " + year +
                ", страницы " + pages +
                ", издательство '" + publishingHouse + '\'';
    }
}
