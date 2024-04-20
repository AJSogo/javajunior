package lesson15.Online;

import java.util.Objects;

public class Coin implements Comparable<Coin> {
    private int nominal;
    private int year;
    private String metal;
    private double diameter;

    public Coin() {
    }

    public Coin(int nominal, int year, String metal, double diameter) {
        this.nominal = nominal;
        this.year = year;
        this.metal = metal;
        this.diameter = diameter;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominal=" + nominal +
                ", year=" + year +
                ", metal='" + metal + '\'' +
                ", diameter=" + diameter +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;

        if (nominal != coin.nominal) return false;
        if (year != coin.year) return false;
        if (Double.compare(coin.diameter, diameter) != 0) return false;
        return Objects.equals(metal, coin.metal);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nominal;
        result = 31 * result + year;
        result = 31 * result + (metal != null ? metal.hashCode() : 0);
        temp = Double.doubleToLongBits(diameter);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public int compareTo(Coin o) {
        // любое положительное число 0 или -
        //this 0 кого вызывается метод
        // o - то, что входит в метод

        if (this.nominal != o.nominal) {
            return this.nominal - o.nominal; // 5 - 10 = -5
        }

        if (this.year != o.year) {
            return this.year - o.year; // 5 - 10 = -5
        }
        if (!this.metal.equals(o.metal)) {
            return this.metal.compareTo(o.metal);
        }
        return Double.compare(this.diameter, o.diameter);
    }
}
