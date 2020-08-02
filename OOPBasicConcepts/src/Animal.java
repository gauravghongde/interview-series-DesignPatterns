public class Animal {
    private int noOfLegs;
    private String name;
    private String sound;

    public int getNoOfLegs() {
        return noOfLegs;
    }

    // Reason why getters/setters needed
    // Encapsulation -
    public void setNoOfLegs(int noOfLegs) {
        if(noOfLegs > 0)
            this.noOfLegs = noOfLegs;
        else
            System.out.println("Number of legs can't be negative or zero");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
