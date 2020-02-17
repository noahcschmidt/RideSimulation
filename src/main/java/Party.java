

public class Party {
    private static final double AVG_WEIGHT = 137.00;

    private int numPeople;
    private double weight;
    private boolean handicapped;

    public Party(int numPeople, double weight, boolean isHandicapped) {
        this.numPeople = numPeople;
        this.weight = weight;
        handicapped = isHandicapped;
    }

    public Party(int numPeople) {
        this.numPeople = numPeople;
    }

    public Party(int numPeople, double weight) {
        this.numPeople = numPeople;
        this.weight = weight;
    }

    public int getNumPeople() {
        return numPeople;
    }

    public void setNumPeople(int numPeople) {
        this.numPeople = numPeople;
    }

    //Write other getters / setters
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public boolean isHandicapped(){
        return handicapped;
    }
    public void setHandicapped(boolean isHandicapped){
        handicapped = isHandicapped;
    }
}



