package lesson11.Homework.Part2.com.company.details;

import java.util.Objects;

public class Engine {

    //поля класса
    protected int power;
    protected String  company;


    //конструкторы
    public Engine() {
    }

    public Engine(int power, String company) {
        this.power = power;
        this.company = company;
    }

    //геттеры и сеттеры


    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    //equals hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Engine engine = (Engine) o;

        if (power != engine.power) return false;
        return Objects.equals(company, engine.company);
    }

    @Override
    public int hashCode() {
        int result = power;
        result = 31 * result + (company != null ? company.hashCode() : 0);
        return result;
    }

    //toString

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", company='" + company + '\'' +
                '}';
    }
}
