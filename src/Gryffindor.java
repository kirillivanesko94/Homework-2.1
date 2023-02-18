public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String fullName, int powerMagic,
                      int transgressionDistance, int nobility, int honor, int bravery) {
        super(fullName, powerMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    private int calculatePower(){
        return nobility + bravery + honor;
    }
    public void compare(Gryffindor gryffindor){
        System.out.println("***********************************");
        if (this.calculatePower() > gryffindor.calculatePower()){
            System.out.println(this.getFullName() + " лучший Грифиндорец, чем " + gryffindor.getFullName());
        } else {
            System.out.println(gryffindor.getFullName() + " лучший Грифиндорец, чем " + this.getFullName());
        }
        if (this.calculatePower() == gryffindor.calculatePower()){
            System.out.println("Силы равны");
        }
    }
}