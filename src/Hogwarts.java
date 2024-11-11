import java.util.Objects;

public class Hogwarts {

    protected final String NAME;
    protected int powerOfMagic;
    protected int transgresDistance;

    public Hogwarts(String name, int powerOfMagic, int transgresDistance) {
        this.NAME = name;
        this.powerOfMagic = powerOfMagic;
        this.transgresDistance = transgresDistance;
    }

    public static void comparingStudentsAndPrint(Hogwarts studentOne, Hogwarts studentTwo) {
        if (studentOne.getTotalCommonPoints() > studentTwo.getTotalCommonPoints()) {
            System.out.println(studentOne + " имеет свойства сильнее, чем " + studentTwo);
        } else if (studentOne.getTotalCommonPoints() < studentTwo.getTotalCommonPoints()) {
            System.out.println(studentTwo + " имеет свойства сильнее, чем " + studentOne);
        } else {
            System.out.println(" Ученики равны в свойствах силы характеристик.");
        }
    }

    public String getNAME() {
        return NAME;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgresDistance() {
        return transgresDistance;
    }

    public void setTransgresDistance(int transgresDistance) {
        this.transgresDistance = transgresDistance;
    }


    int getTotalCommonPoints() {
        return powerOfMagic + transgresDistance;
    }

    @Override
    public String toString() {
        return "Ученик Hogwarts{" +
                "name='" + NAME + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgresDistance=" + transgresDistance +
                '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return getPowerOfMagic() == hogwarts.getPowerOfMagic() && getTransgresDistance() == hogwarts.getTransgresDistance() && Objects.equals(getNAME(), hogwarts.getNAME());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNAME(), getPowerOfMagic(), getTransgresDistance());
    }
}
