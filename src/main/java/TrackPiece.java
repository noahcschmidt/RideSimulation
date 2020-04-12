import javax.sound.midi.Track;

public class TrackPiece {
    private double length;
    private double difficulty;
    private TrackPiece nextTrack;
    private Car car;
    private int timeLeft;

    public TrackPiece(double length, double difficulty, TrackPiece nextTrack){
        if(length <=0 ){
            throw new IllegalArgumentException("Length must be greater than zero");
        }
        this.length = length;
        this.difficulty = difficulty;
        this.nextTrack = nextTrack;
        this.car = null;
        this.timeLeft = 0;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getDifficulty(){
        return difficulty;
    }

    public void setDifficulty(double difficulty){
        this.difficulty = difficulty;
    }

    public TrackPiece getNextTrack() {
        return nextTrack;
    }

    public void setNextTrack(TrackPiece nextTrack){
        this.nextTrack = nextTrack;
    }

    public Car getCar(){
        return car;
    }
    public void setCar(Car car){
        this.car = car;
    }
}
