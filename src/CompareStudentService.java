public class CompareStudentService {
    public void compareTwoStudent(Gryffindor gryffindor1, Gryffindor gryffindor2) {
        System.out.println("***********************************");
        int totalScores1 = 0;
        int totalScores2 = 0;
        totalScores1 = gryffindor1.getBravery() + gryffindor1.getHonor() + gryffindor1.getNobility();
        totalScores2 = gryffindor2.getBravery() + gryffindor2.getHonor() + gryffindor2.getNobility();
        if (totalScores1 > totalScores2) {
            System.out.println(gryffindor1.getFullName() + " лучший Грифиндорец, чем " + gryffindor2.getFullName());
        } else if (totalScores1 == totalScores2) {
            System.out.println("Силы равны");
        } else {
            System.out.println(gryffindor2.getFullName() + " лучший Грифиндорец, чем " + gryffindor1.getFullName());
        }
    }
    public void compareTwoStudent(Slytherin slytherin1, Slytherin slytherin2) {
        System.out.println("***********************************");
        int totalScores1 = 0;
        int totalScores2 = 0;
        totalScores1 = slytherin1.getCunning() + slytherin1.getAmbition() + slytherin1.getDetermination()
        + slytherin1.getResourcefulness() + slytherin1.getLustForPower();
        totalScores2 = slytherin2.getCunning() + slytherin2.getAmbition() + slytherin2.getDetermination()
                + slytherin2.getResourcefulness() + slytherin2.getLustForPower();
        if (totalScores1 > totalScores2) {
            System.out.println(slytherin1.getFullName() + " лучший Слизеринец, чем " + slytherin2.getFullName());
        } else if (totalScores1 == totalScores2) {
            System.out.println("Силы равны");
        } else {
            System.out.println(slytherin2.getFullName() + " лучший Слизеринец, чем " + slytherin1.getFullName());
        }
    }
    public void compareTwoStudent(Hufflepuff hufflepuff1, Hufflepuff hufflepuff2) {
        System.out.println("***********************************");
        int totalScores1 = 0;
        int totalScores2 = 0;
        totalScores1 = hufflepuff1.getIndustriousness() + hufflepuff1.getLoyalty() + hufflepuff1.getHonesty();
        totalScores2 = hufflepuff2.getIndustriousness() + hufflepuff2.getLoyalty() + hufflepuff2.getHonesty();
        if (totalScores1 > totalScores2) {
            System.out.println(hufflepuff1.getFullName() + " лучший Пуффендуец, чем " + hufflepuff2.getFullName());
        } else if (totalScores1 == totalScores2) {
            System.out.println("Силы равны");
        } else {
            System.out.println(hufflepuff2.getFullName() + " лучший Пуффендуец, чем " + hufflepuff1.getFullName());
        }
    }
    public void compareTwoStudent(Ravenclaw ravenclaw1, Ravenclaw ravenclaw2) {
        System.out.println("***********************************");
        int totalScores1 = 0;
        int totalScores2 = 0;
        totalScores1 = ravenclaw1.getIntellect() + ravenclaw1.getWit() + ravenclaw1.getCreativity()
                + ravenclaw1.getWisdom();
        totalScores2 = ravenclaw2.getIntellect() + ravenclaw2.getWit() + ravenclaw2.getCreativity()
                + ravenclaw2.getWisdom();
        if (totalScores1 > totalScores2) {
            System.out.println(ravenclaw1.getFullName() + " лучший Когтевранец, чем " + ravenclaw2.getFullName());
        } else if (totalScores1 == totalScores2) {
            System.out.println("Силы равны");
        } else {
            System.out.println(ravenclaw2.getFullName() + " лучший Когтевранец, чем " + ravenclaw1.getFullName());
        }
    }
    public void compareTwoStudent(Hogwarts hogwarts1, Hogwarts hogwarts2){
        System.out.println("***********************************");
        int totalScores1 = 0;
        int totalScores2 = 0;
        totalScores1 = hogwarts1.getPowerMagic() + hogwarts1.getTransgressionDistance();
        totalScores2 = hogwarts2.getPowerMagic() + hogwarts2.getTransgressionDistance();
        if (totalScores1 > totalScores2) {
            System.out.println(hogwarts1.getFullName() + " обладает большей силой магии, чем "
                    + hogwarts2.getFullName());
        } else if (totalScores1 == totalScores2) {
            System.out.println("Силы равны");
        } else {
            System.out.println(hogwarts2.getFullName() + " обладает большей силой магии, чем "
                    + hogwarts1.getFullName());;
        }
    }
}
