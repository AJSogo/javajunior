package lesson12;

public class BelarusianHen extends Hen{

    public BelarusianHen() {
        super("Беларусь");
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 90;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + "Моя страна - "  + getCountry()
                + ". Я несу " + Integer.toString(getCountOfEggsPerMonth()) +
                " яиц в месяц";
    }
}
