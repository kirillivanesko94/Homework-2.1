public class Gryffindor extends Hogwarts {
    int nobility;
    int honor;
    int bravery;

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
}