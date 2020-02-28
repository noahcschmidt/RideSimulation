public class TrackPiece {
    private double length;
    private int  difficulty;
    private int nextTrack;
    private int car;

    public TrackPiece(double length, int difficulty, int nextTrack, int car){
        if(length <=0 || difficulty <=0 || nextTrack <=0){
            throw new IllegalArgumentException();
        }
        this.length = length;
        this.difficulty = difficulty;
        this.nextTrack = nextTrack;
        this.car = car;
    }

    public TrackPiece(double length, int difficulty, int nextTrack){
        if(length <=0 || difficulty <=0 || nextTrack<=0){
            throw new IllegalArgumentException();
        }
        this.length=length;
        this.difficulty = difficulty;
        this.nextTrack = nextTrack;
    }

    public TrackPiece(double length, int difficulty){
        if(length <=0 || difficulty<=0){
           throw new IllegalArgumentException();
        }
        this.length = length;
        this.difficulty = difficulty;
    }

    public TrackPiece(double length){
        if(length <=0){
            throw new IllegalArgumentException();
        }
        this.length = length;
    }

    public double getLength(){return length;}
    public void setLength(double length){
        this.length = length;
    }

    public int getDifficulty(){return difficulty;}
    public void setDifficulty(int difficulty){
        this.difficulty = difficulty;
    }

    public int getNextTrack(){return nextTrack;}
    public void setNextTrack(int nextTrack){
        this.nextTrack = nextTrack;
    }

    public int getCar(){ return car;}
    public void setCar(int car){
        this.car = car;
    }
}
