package lesson12;

public class UkrainianHen extends Hen{

    public UkrainianHen() {
        super("Украина");
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 80;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + "Моя страна - " + getCountry()
                + ". Я несу " + Integer.toString(getCountOfEggsPerMonth()) +
                " яиц в месяц";
    }
}
