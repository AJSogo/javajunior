package lesson12;



public abstract class Hen {
    private String country;

    public Hen(String country) {
        this.country = country;
    }

    public abstract int getCountOfEggsPerMonth();

    public String getDescription(){
        return "Я курица!";
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
