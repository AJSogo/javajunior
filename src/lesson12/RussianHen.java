package lesson12;

public class RussianHen extends Hen {

    public RussianHen() {
        super("Россия");
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 100;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + "Моя страна - " + getCountry()
                + ". Я несу " + Integer.toString(getCountOfEggsPerMonth()) +
                " яиц в месяц";
    }
}
