package lesson10.Homework;

import java.util.Objects;

public class Book extends Printery {

    private String author;

    //конструкторы
    public Book() {
    }


    public Book(String author) {
        this.author = author;
    }

    public Book(String author, String name, int year, int pages,
                String publishingHouse) {
        this.author = author;
        setName(name);
        setYear(year);
        setPages(pages);
        setPublishingHouse(publishingHouse);
    }

    /* ПРАВИЛЬНЫЙ ВАРИАНТ ЭТОТ
    public Book(String name, int year, int pages, String publishingHouse, String author) {
        super(name, year, pages, publishingHouse);
        this.author = author;
    }*/

    //геттеры и сеттеры
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    //equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return author != null ? author.hashCode() : 0;
    }

    //toString

    @Override
    public String toString() {
        return "Книга " +
                "автор '" + author + '\'' + "," + super.toString();
    }
}
