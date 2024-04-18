package lesson12;

public class HenFactory {


    public static Hen getHen(String country){

        if (country.equalsIgnoreCase("Беларусь")){
            return new BelarusianHen();
        }
        if (country.equalsIgnoreCase("Россия")){
            return new RussianHen();
        }
        if (country.equalsIgnoreCase("Молдова")||
                country.equalsIgnoreCase("Молдавия") ){
            return new MoldovianHen();
        }
        if (country.equalsIgnoreCase("Украина")){
            return new UkrainianHen();
        }
        return new RussianHen();
    }
}
