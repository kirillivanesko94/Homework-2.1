public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String fullName,int powerMagic, int transgressionDistance, int cunning,
                     int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullName,powerMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
    private int calculatePower(){
        return cunning + resourcefulness + lustForPower + ambition + determination;
    }
    public void compare(Slytherin slytherin){
        System.out.println("***********************************");
        if (this.calculatePower() > slytherin.calculatePower()){
            System.out.println(this.getFullName() + " лучший Слизеринец, чем " + slytherin.getFullName());
        } else {
            System.out.println(slytherin.getFullName() + " лучший Слизеринец, чем " + this.getFullName());
        }
        if (this.calculatePower() == slytherin.calculatePower()){
            System.out.println("Силы равны");
        }
    }
}

