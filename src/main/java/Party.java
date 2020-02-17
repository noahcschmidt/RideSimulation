

public class Party {
    private static final double AVG_WEIGHT = 137.00;


    private int numPeople;
    private double weight;
    private boolean handicapped;

    public Party(int numPeople, double weight, boolean isHandicapped) {
        if(numPeople < 0||weight < 0 ){
            throw new IllegalArgumentException();
        }
        this.numPeople = numPeople;
        this.weight = weight;
        handicapped = isHandicapped;
    }

    public Party(int numPeople) {
        if(numPeople<0) {
            throw new IllegalArgumentException();
        }
        this.numPeople = numPeople;
        weight = AVG_WEIGHT*numPeople;
    }

    public Party(int numPeople, double weight) {
        if(numPeople<0 || weight<0){
            throw new IllegalArgumentException();
        }
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



