public abstract class Creature {

    String name;
    int weight;

    // every method inside abstract need not be abstract method

    public abstract String getName();
    public abstract void setName(String name);

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
