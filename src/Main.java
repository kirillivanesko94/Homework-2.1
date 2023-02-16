public class Main {
    public static void main(String[] args) {

        Gryffindor gryffindor1 = new Gryffindor("Гарри Поттер",
                100,100,100,100,100);
        Gryffindor gryffindor2 = new Gryffindor("Гермиона Грейнджер",
                95,100,100,90,100);
        Gryffindor gryffindor3 = new Gryffindor("Рон Уизли",
                90,90,100,100,80);


        Slytherin slytherin1 = new Slytherin("Драко Малфой",
                95,100,90,90,100,90,100);
        Slytherin slytherin2 = new Slytherin("Грэхэм Монтегрю",
                90,90,90,90,90,80,80);
        Slytherin slytherin3 = new Slytherin("Грегори Гойл",
                80,80,80,80,80,70,60);


        Hufflepuff  hufflepuff1 = new Hufflepuff("Захария Смит",
                90,90,95,90,90);
        Hufflepuff hufflepuff2 = new Hufflepuff("Седрик Диггори",
                100,100,100,90,90);
        Hufflepuff hufflepuff3 = new Hufflepuff("Джастин Финч-Флетчи",
                80,80,80,80,80);


        Ravenclaw ravenclaw1 = new Ravenclaw("Чжоу Чанг",
                85,90,90,90,90,90);
        Ravenclaw ravenclaw2 = new Ravenclaw("Падма Патил",
                90,80,80,80,80,80);
        Ravenclaw ravenclaw3 = new Ravenclaw("Маркус Белби",
                80,80,80,80,80,90);


        PrintService printService = new PrintService();
        printService.print(gryffindor1);
        printService.print(slytherin1);
        printService.print(hufflepuff1);
        printService.print(ravenclaw1);
        CompareStudentService compareStudentService = new CompareStudentService();
        compareStudentService.compareTwoStudent(gryffindor1,gryffindor3);
        compareStudentService.compareTwoStudent(slytherin1,slytherin2);
        compareStudentService.compareTwoStudent(hufflepuff1,hufflepuff2);
        compareStudentService.compareTwoStudent(ravenclaw1,ravenclaw2);
        compareStudentService.compareTwoStudent(gryffindor1,slytherin1);
    }
}