package lesson11.Homework.Part2.com.company.profession;

public class Driver extends Person {

    protected int experience;

    public Driver(){}

    public Driver(int age, String fullName, int experience) {
        super(age, fullName);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Driver driver = (Driver) o;

        return experience == driver.experience;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + experience;
        return result;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience=" + experience +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
