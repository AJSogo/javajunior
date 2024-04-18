package lesson10.Homework;

public class Journal extends Printery {

    private int number;

    //конструкторы

    
    public Journal() {
    }

    public Journal(int number) {
        this.number = number;
    }

    public Journal(int number, String name, int year, int pages,
                   String publishingHouse) {
        this.number = number;
        setName(name);
        setYear(year);
        setPages(pages);
        setPublishingHouse(publishingHouse);
    }




    //геттеры и сеттеры


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    //equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Journal journal = (Journal) o;

        return number == journal.number;
    }

    @Override
    public int hashCode() {
        return number;
    }

    //toString


    @Override
    public String toString() {
        return "Журнал " +
                "номер " + number + "," + super.toString();
    }
}
