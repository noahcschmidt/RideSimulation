
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class Line extends Party{


    //get number of people form Party
    @Override
    public int getNumPeople() {
        return super.getNumPeople();
    }

    //put the party number into a queue
    public Line(int numPeople){
        super(numPeople);
    }

    public int length(Queue<Integer> line) {

        int size = line.size();
        return size;
    }

    public void add(Party p1) {
        Queue<Integer> line = new LinkedList<>();
        line.add(getNumPeople());


    }
}

