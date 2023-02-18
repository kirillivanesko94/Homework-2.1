public class PrintService {
    public void print(Gryffindor gryffindors) {
        System.out.println("***********************************");
        System.out.println("Имя: " + gryffindors.getFullName() + '\n' +
                "Сила магии: " + gryffindors.getPowerMagic() + '\n' +
                "Дальность трансгрессии: " + gryffindors.getTransgressionDistance() + '\n' +
                "Благородство: " + gryffindors.getNobility() + '\n' +
                "Честь: " + gryffindors.getHonor() + '\n' +
                "Храбрость: " + gryffindors.getBravery());
    }

    public void print(Slytherin slytherin) {
        System.out.println("***********************************");
        System.out.println("Имя: " + slytherin.getFullName() + '\n' +
                "Сила магии: " + slytherin.getPowerMagic() + '\n' +
                "Дальность трансгрессии: " + slytherin.getTransgressionDistance() + '\n' +
                "Хитрость: " + slytherin.getCunning() + '\n' +
                "Решительность: " + slytherin.getDetermination() + '\n' +
                "Амбициозность: " + slytherin.getAmbition() +
                "Находчивость: " + slytherin.getResourcefulness() + '\n' +
                "Жажда власти: " + slytherin.getLustForPower());
    }

    public void print(Hufflepuff hufflepuff) {
        System.out.println("***********************************");
        System.out.println("Имя: " + hufflepuff.getFullName() + '\n' +
                "Сила магии: " + hufflepuff.getPowerMagic() + '\n' +
                "Дальность трансгрессии: " + hufflepuff.getTransgressionDistance() + '\n' +
                "Трудолюбие: " + hufflepuff.getIndustriousness() + '\n' +
                "Верность: " + hufflepuff.getLoyalty() + '\n' +
                "Честность: " + hufflepuff.getHonesty());
    }
    public void print(Ravenclaw ravenclaw) {
        System.out.println("***********************************");
        System.out.println("Имя: " + ravenclaw.getFullName() + '\n' +
                "Сила магии: " + ravenclaw.getPowerMagic() + '\n' +
                "Дальность трансгрессии: " + ravenclaw.getTransgressionDistance() + '\n' +
                "Ум: " + ravenclaw.getIntellect() + '\n' +
                "Мудрость: " + ravenclaw.getWisdom() + '\n' +
                "Остроумие: " + ravenclaw.getWit() + '\n' +
                "Творчество: " + ravenclaw.getCreativity());
    }
}
