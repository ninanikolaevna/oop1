public class Griffindor extends Hogwarts {
    private int nobility;//благородство
    private int honour;//честь
    private int bravery; //храбрость

    public Griffindor(String NAME, int powerOfMagic, int transgresDistance, int nobility, int honour, int bravery) {
        super(NAME, powerOfMagic, transgresDistance);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public static void comparingStudentsGriffindor(Griffindor studentOne, Griffindor studentTwo) {
        if (studentOne.getTotalPointsGriffindor() > studentTwo.getTotalPointsGriffindor()) {
            System.out.println(studentOne + " имеет свойства сильнее, чем " + studentTwo);
        } else if (studentOne.getTotalPointsGriffindor() < studentTwo.getTotalPointsGriffindor()) {
            System.out.println(studentTwo + " имеет свойства сильнее, чем " + studentOne);
        } else {
            System.out.println(" Ученики равны в свойствах силы характеристик.");
        }
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonour() {
        return honour;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Ученик Griffindor" + ", NAME='" + NAME + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgresDistance=" + transgresDistance +
                "nobility=" + nobility +
                ", honour=" + honour +
                ", bravery=" + bravery +
                '.';
    }

    public String toStringCommon() {
        return "Ученик Hogwarts{" +
                "name='" + NAME + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgresDistance=" + transgresDistance +
                '.';
    }

    private int getTotalPointsGriffindor() {
        return getNobility() + getHonour() + getBravery() + getTransgresDistance() + getTransgresDistance();
    }
}





