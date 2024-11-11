public class Kogtevran extends Hogwarts {
    private int mind;//ум
    private int wisdom;//мудрость
    private int wit;//остроумие
    private int creativity;//творчество

    public Kogtevran(String NAME, int powerOfMagic, int transgresDistance, int mind, int wisdom, int wit, int creativity) {
        super(NAME, powerOfMagic, transgresDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public static void comparingStudentsKogtevran(Kogtevran studentOne, Kogtevran studentTwo) {
        if (studentOne.getTotalPointsKogtevran() > studentTwo.getTotalPointsKogtevran()) {
            System.out.println(studentOne + " имеет свойства сильнее, чем " + studentTwo);
        } else if (studentOne.getTotalPointsKogtevran() < studentTwo.getTotalPointsKogtevran()) {
            System.out.println(studentTwo + " имеет свойства сильнее, чем " + studentOne);
        } else {
            System.out.println(" Ученики равны в свойствах силы характеристик.");
        }
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ученик Kogtevran{" + ", NAME='" + NAME + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgresDistance=" + transgresDistance +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '.';
    }

    private int getTotalPointsKogtevran() {
        return getMind() + getWisdom() + getCreativity() + getTransgresDistance() + getTransgresDistance();
    }
}
