//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("Гарри " + "Поттер", 40, 34, 15, 22, 43);
        Griffindor hermionaGrejnder = new Griffindor("Гермиона " + "Грейнджер", 38, 22, 56, 32, 10);
        Griffindor ronUizli = new Griffindor("Рон " + "Уизли", 45, 12, 13, 14, 15);
        Slizerin drakoMalfoj = new Slizerin("Драко " + "Малфой", 13, 15, 13, 34, 11, 8, 9);
        Slizerin grehemMontegu = new Slizerin("Грэхэм " + "Монтегю", 7, 8, 13, 21, 21, 5, 7);
        Slizerin gregoryGojl = new Slizerin("Грегори " + "Гойл", 7, 4, 12, 10, 3, 9, 8);
        Puffenduj zahariaSmit = new Puffenduj("Захария " + "Смит", 7, 9, 13, 12, 11);
        Puffenduj sedrikDiggori = new Puffenduj("Седрик " + "Диггори", 6, 5, 13, 21, 12);
        Puffenduj djastinFinchFletchli = new Puffenduj("Джастин " + " Финч-Флетчли", 6, 5, 4, 7, 12);
        Kogtevran chjouChang = new Kogtevran("Чжоу " + "Чанг", 8, 6, 9, 4, 7, 9);
        Kogtevran padmaPatil = new Kogtevran("Падма " + "Патил", 9, 6, 4, 3, 8, 12);
        Kogtevran markusBelbi = new Kogtevran("Маркус " + "Белби", 9, 6, 4, 12, 7, 4);
        System.out.println(harryPotter);
        System.out.println(gregoryGojl);
        System.out.println(harryPotter.getTotalCommonPoints());
        Hogwarts.comparingStudentsAndPrint(chjouChang, sedrikDiggori);
        Griffindor.comparingStudentsGriffindor(harryPotter, hermionaGrejnder);
    }
}