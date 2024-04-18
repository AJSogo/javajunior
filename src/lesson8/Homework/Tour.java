package lesson8.Homework;


public class Tour {

    private String country;
    private int day;
    private String transport;
    private int cost;

    // конструкторы
    public Tour(String country){
        this.country = country;
    }

    public Tour(String country, int day, String transport){
        this.country = country;
        this.day = day;
        this.transport = transport;
    }

    public Tour(String country, int day, String transport, int cost){
        this.country = country;
        this.day = day;
        this.transport = transport;
        this.cost = cost;
    }


    //методы


    public static void printingTour(Tour tour){
        System.out.printf("Информация о туре: страна - %s, количество дней - %d, транспорт - %s, цена - %d\n", tour.getCountry(), tour.getCost(),
                tour.getTransport(), tour.getCost() );

    }




    //геттеры и сэттеры

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDay() {
        return day;
    }

    public String getTransport() {
        return transport;
    }

    public int getCost() {
        return cost;
    }




}
