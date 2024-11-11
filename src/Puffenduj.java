public class Puffenduj extends Hogwarts {

    private int dilidence;//трудолюбие
    private int loyalty;//верность
    private int honesty;//честность


    public Puffenduj(String NAME, int powerOfMagic, int transgresDistance, int dilidence, int loyalty, int honesty) {
        super(NAME, powerOfMagic, transgresDistance);
        this.dilidence = dilidence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public static void comparingStudentsPuffenduj(Puffenduj studentOne, Puffenduj studentTwo) {
        if (studentOne.getTotalPointsPuffenduj() > studentTwo.getTotalPointsPuffenduj()) {
            System.out.println(studentOne + " имеет свойства сильнее, чем " + studentTwo);
        } else if (studentOne.getTotalPointsPuffenduj() < studentTwo.getTotalPointsPuffenduj()) {
            System.out.println(studentTwo + " имеет свойства сильнее, чем " + studentOne);
        } else {
            System.out.println(" Ученики равны в свойствах силы характеристик.");
        }
    }

    public int getDilidence() {
        return dilidence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return "Ученик Puffenduj" + ", NAME='" + NAME + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgresDistance=" + transgresDistance +
                "dilidence=" + dilidence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +

                '.';
    }

    private int getTotalPointsPuffenduj() {
        return getDilidence() + getLoyalty() + getHonesty() + getTransgresDistance() + getTransgresDistance();
    }
}
