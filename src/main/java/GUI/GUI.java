package GUI;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class GUI {

    private static final int NUMBER_OF_TRACK_PIECES = 5;

    private JFrame window;
    private Container linePane;     //right side, holds line info
    private Container stationPane;  //middle, holds empty cars, buttons
    private Container ridePane;     //left side, holds ride info and track

    private ArrayList<Container> track;     //List stores the pieces of the track as containers for now
    private JButton eStop;          //Emergency Stop Button
    private JButton evac;           //Evacuation Button

    public GUI() {
        window = new JFrame();
        window.setLocation(100,100);
        window.setSize(800, 500);
        makeLeftSide();

        window.add(ridePane);
        linePane = new Container();
        stationPane = new Container();

        window.setVisible(true);
    }

    public void makeLeftSide() {
        ridePane = new Container();
        //create containers for track pieces
        track = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_TRACK_PIECES; i++) {
            Container temp = new Container();
            track.add(new Container());
        }

        eStop = new JButton("Emergency Stop");
        evac = new JButton("Evacuate Riders");

        //Setup layout of pane
        ridePane.setLayout(new BoxLayout(ridePane, BoxLayout.Y_AXIS));
        for (int i = 0; i < track.size(); i++) {
            ridePane.add(track.get(i));
        }
        ridePane.add(eStop);
        ridePane.add(evac);
    }

}
