package lesson11.Homework.Part2.com.company.vehicles;

import lesson11.Homework.Part2.com.company.details.Engine;
import lesson11.Homework.Part2.com.company.profession.Driver;

public class SportCar extends Car{
    protected int topSpeed;

    //constructor
    public SportCar(){}

    public SportCar(String carClass, Engine engine, Driver driver, String marka, int topSpeed) {
        super(carClass, engine, driver, marka);
        this.topSpeed = topSpeed;
    }

    //getter setter

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    //equals hashcode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SportCar sportCar = (SportCar) o;

        return topSpeed == sportCar.topSpeed;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + topSpeed;
        return result;
    }

    //toString

    @Override
    public String toString() {
        return "SportCar{" +
                "topSpeed=" + topSpeed +
                ", carClass='" + carClass + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                ", marka='" + marka + '\'' +
                '}';
    }
}
