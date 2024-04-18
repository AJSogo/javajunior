package lesson11.Homework.Part1;

public class Aspirant extends Student {
    boolean work;

    //конструкторы
    public Aspirant() {
    }

    public Aspirant(String firstName, String lastName, String group, double averageMark, boolean work) {
        super(firstName, lastName, group, averageMark);
        this.work = work;
    }


    @Override
    public int getScholarship (){
        if(getAverageMark() == 5){
            return 2500;
        }
        else return 2200;
    }


    public String aviabilityOfPaper(boolean work) {
        if (work == true) {
            return "есть";
        }
        else return "нет";
    }


    //геттеры и сеттеры

    public boolean isWork() {
        return work;
    }

    public void setWork(boolean work) {
        this.work = work;
    }

    //equals hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Aspirant aspirant = (Aspirant) o;

        return work == aspirant.work;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (work ? 1 : 0);
        return result;
    }

    //toString

    @Override
    public String toString() {
        return "Аспирант " + super.toString() +
                " Наличие работы - " + aviabilityOfPaper(work);
    }
}
