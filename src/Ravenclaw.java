public class Ravenclaw extends Hogwarts{
    int intellect;
    int wisdom;
    int wit;
    int creativity;

    public Ravenclaw(String fullName,int powerMagic,
                     int transgressionDistance, int intellect, int wisdom, int wit, int creativity) {
        super(fullName,powerMagic, transgressionDistance);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
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
}
