import javax.swing.*;
import javax.swing.BorderFactory;
import java.awt.*;
import java.util.ArrayList;

public class GUI {

    private Simulation sim;

    private static final int NUMBER_OF_TRACK_PIECES = 7;

    private JFrame window;
    private Container linePane;     //right side, holds line info
    private Container stationPane;  //middle, holds empty cars, buttons
    private Container ridePane;     //left side, holds ride info and track

    private ArrayList<Container> track;     //List stores the pieces of the track as containers for now
    private JButton eStopButton;          //Emergency Stop Button
    private JButton evacButton;           //Evacuation Button

    private JButton addButton;
    private JTextField partyNumberField;
    private JTextField weightField;
    private JCheckBox isHandicappedCheck;


    public GUI() {


        makeWindow();
        makeLeftSide();
        makeCenter();
        makeRight();


        window.setVisible(true);
    }

    /**
     * Sets up the JFrame object holding all GUI components
     */
    private void makeWindow() {
        window = new JFrame();
        window.setLocation(100,100);
        window.setSize(800, 500);
        window.setLayout(new BorderLayout());
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     * Creates the Left side of the GUI.
     */
    public void makeLeftSide() {
        ridePane = new Container();


        //create containers for track pieces
        track = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_TRACK_PIECES; i++) {
            JPanel temp = new JPanel();
            temp.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            temp.setSize(100, 10);
            track.add(temp);
        }

        //setup buttons
        eStopButton = new JButton("Emergency Stop");
        evacButton = new JButton("Evacuate Riders");

        //Setup layout of pane
        ridePane.setLayout(new BoxLayout(ridePane, BoxLayout.Y_AXIS));
        for (int i = 0; i < track.size(); i++) {
            ridePane.add(track.get(i));
        }
        ridePane.add(eStopButton);
        ridePane.add(evacButton);

        window.add(ridePane, BorderLayout.WEST);
    }

    /**
     * Creates the Station Area
     */
    private void makeCenter() {
        stationPane = new Container();



        window.add(stationPane, BorderLayout.CENTER);
    }

    private void makeRight() {
        linePane = new Container();
        linePane.setLayout(new BoxLayout(linePane, BoxLayout.Y_AXIS));

        Container nextRiders = new Container();             //holds six boxes for next riders
        nextRiders.setLayout(new BoxLayout(nextRiders, BoxLayout.Y_AXIS));
        Container riderMiddleSection = new Container();     //holds nextRiders and estimated time
        riderMiddleSection.setLayout(new BoxLayout(riderMiddleSection, BoxLayout.X_AXIS));
        Container buttonSection = new Container();          //holds bottom buttons and boxes
        buttonSection.setLayout(new BoxLayout(buttonSection, BoxLayout.X_AXIS));

        //MIDDLE SECTION
        //Left boxes

        //Bottom Buttons
        isHandicappedCheck = new JCheckBox("Handicapped");
        partyNumberField = new JTextField("Num in Party");
        weightField = new JTextField("Weight");
        addButton = new JButton("ADD");
        buttonSection.add(isHandicappedCheck);
        buttonSection.add(partyNumberField);
        buttonSection.add(weightField);
        buttonSection.add(addButton);

        linePane.add(nextRiders);
        linePane.add(riderMiddleSection);
        linePane.add(buttonSection);

        window.add(linePane, BorderLayout.EAST);

    }

}
