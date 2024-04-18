package lesson12;

public class MoldovianHen extends Hen{

    public MoldovianHen() {
        super("Молдова");
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 70;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + "Моя страна - "  + getCountry()
                + ". Я несу " + Integer.toString(getCountOfEggsPerMonth()) +
                " яиц в месяц";
    }
}
