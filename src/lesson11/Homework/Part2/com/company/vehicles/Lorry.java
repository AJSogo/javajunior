package lesson11.Homework.Part2.com.company.vehicles;

import lesson11.Homework.Part2.com.company.details.Engine;
import lesson11.Homework.Part2.com.company.profession.Driver;

public class Lorry extends Car{
    protected double carrying;

    //конструкторы
    public Lorry(){}

    public Lorry(double carrying) {
        this.carrying = carrying;
    }

    public Lorry(String carClass, Engine engine, Driver driver, String marka, double carrying) {
        super(carClass, engine, driver, marka);
        this.carrying = carrying;
    }

    //геттеры сеттеры


    public double getCarrying() {
        return carrying;
    }

    public void setCarrying(double carrying) {
        this.carrying = carrying;
    }

    //equals hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Lorry lorry = (Lorry) o;

        return Double.compare(lorry.carrying, carrying) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(carrying);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    //toString

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                ", carClass='" + carClass + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                ", marka='" + marka + '\'' +
                '}';
    }
}
