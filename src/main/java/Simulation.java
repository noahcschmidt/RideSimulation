public class Simulation {
    private Station station;

    public Simulation() {
        this.station = new Station(1,1,null);
        TrackPiece t3 = new TrackPiece(4,5, station);
        TrackPiece t2 = new TrackPiece(4, 7, t3);
        TrackPiece t1 = new TrackPiece(3,8, t2);
        station.setNextTrack(t1);
    }
}
