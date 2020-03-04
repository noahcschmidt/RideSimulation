public class TrackPiece {
    private double length;
    private int  difficulty;
    private TrackPiece nextTrack;
    private int car;

    public TrackPiece(double length, int difficulty, TrackPiece nextTrack, int car){
        if(length <=0 ){
            throw new IllegalArgumentException("The length must be greater than 0!");
        }
        if(difficulty <= 0){
            throw new IllegalArgumentException("The difficulty must be greater than 0!");
        }
        if(nextTrack == null){
            throw new IllegalArgumentException("The nextTrack must be greater than 0!");
        }
        if(car <= 0){
            throw new IllegalArgumentException("The car must be greater than 0!");
        }
        this.length = length;
        this.difficulty = difficulty;
        this.nextTrack = nextTrack;
        this.car = car;
    }

    public double getLength(){return length;}
    public void setLength(double length){
        this.length = length;
    }

    public int getDifficulty(){return difficulty;}
    public void setDifficulty(int difficulty){
        this.difficulty = difficulty;
    }

    public TrackPiece getNextTrack(){return nextTrack;}
    public void setNextTrack(TrackPiece nextTrack){
        this.nextTrack = nextTrack;
    }

    public int getCar(){ return car;}
    public void setCar(int car){
        this.car = car;
    }
}
