public class Slizerin extends Hogwarts {
    private int trick;//хитрость
    private int determination;//решительность
    private int lustForPower;// жажда власти.
    private int ambition;// амбициозность
    private int ingenuity;// находчивость

    public Slizerin(String NAME, int powerOfMagic, int transgresDistance,
                    int trick, int determination, int lustForPower,
                    int ambition, int ingenuity) {
        super(NAME, powerOfMagic, transgresDistance);
        this.trick = trick;
        this.determination = determination;
        this.lustForPower = lustForPower;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
    }

    public static void comparingStudentsSlizerin(Slizerin studentOne, Slizerin studentTwo) {
        if (studentOne.getTotalPointsSlizerin() > studentTwo.getTotalPointsSlizerin()) {
            System.out.println(studentOne + " имеет свойства сильнее, чем " + studentTwo);
        } else if (studentOne.getTotalPointsSlizerin() < studentTwo.getTotalPointsSlizerin()) {
            System.out.println(studentTwo + " имеет свойства сильнее, чем " + studentOne);
        } else {
            System.out.println(" Ученики равны в свойствах силы характеристик.");
        }
    }

    public int getTrick() {
        return trick;
    }

    public int getDetermination() {
        return determination;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    @Override
    public String toString() {
        return "Ученик Slizerin" +
                ", NAME='" + NAME + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgresDistance=" + transgresDistance +
                "trick=" + trick +
                ", determination=" + determination +
                ", lustForPower=" + lustForPower +
                ", ambition=" + ambition +
                ", ingenuity=" + ingenuity +
                '.';
    }

    private int getTotalPointsSlizerin() {
        return getTrick() + getDetermination() + getLustForPower() + getAmbition()
                + getIngenuity() + getTransgresDistance() + getTransgresDistance();
    }
}
