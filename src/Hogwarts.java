public class Hogwarts {
    private String fullName;
    private int powerMagic;
    private int transgressionDistance;


    public Hogwarts(String fullName, int powerMagic, int transgressionDistance) {
        this.powerMagic = powerMagic;
        this.transgressionDistance = transgressionDistance;
        this.fullName = fullName;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    private int calculatePower(){
        return powerMagic + transgressionDistance;
    }
    public void compare(Hogwarts hogwarts){
        System.out.println("***********************************");
        if (this.calculatePower() > hogwarts.calculatePower()){
            System.out.println(this.getFullName() + " обладает большей магией, чем " + hogwarts.getFullName());
        } else {
            System.out.println(hogwarts.getFullName() + " обладает большей магией, чем " + this.getFullName());
        }
        if (this.calculatePower() == hogwarts.calculatePower()){
            System.out.println("Силы равны");
        }
    }
}
