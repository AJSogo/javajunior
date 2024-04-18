package lesson11.Homework.Part2.com.company.vehicles;

import lesson11.Homework.Part2.com.company.details.Engine;
import lesson11.Homework.Part2.com.company.profession.Driver;

import java.util.Objects;

public class Car {
    protected String carClass ;
    protected Engine engine;
    protected Driver driver;
    protected String marka;

    /*private double weight;*/

    //конструкторы


    public Car() {
    }

    public Car(String carClass, Engine engine, Driver driver, String marka) {
        this.carClass = carClass;
        this.engine = engine;
        this.driver = driver;
        this.marka = marka;
    }

    //методы
    public String start() {
        return "Поехали";
    }

    public String stop() {
        return "Останавливаемся";
    }

    public String turnRight() {
        return "Поворот направо";
    }

    public String turnLeft() {
        return "Поворот налево";
    }

    //геттеры и сеттеры


    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    //equals hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (!Objects.equals(carClass, car.carClass)) return false;
        if (!Objects.equals(engine, car.engine)) return false;
        if (!Objects.equals(driver, car.driver)) return false;
        return Objects.equals(marka, car.marka);
    }

    @Override
    public int hashCode() {
        int result = carClass != null ? carClass.hashCode() : 0;
        result = 31 * result + (engine != null ? engine.hashCode() : 0);
        result = 31 * result + (driver != null ? driver.hashCode() : 0);
        result = 31 * result + (marka != null ? marka.hashCode() : 0);
        return result;
    }

    //toString

    @Override
    public String toString() {
        return "Car{" +
                "carClass='" + carClass + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                ", marka='" + marka + '\'' +
                '}';
    }
}
