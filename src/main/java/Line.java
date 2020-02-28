import java.util.*;

public class Line {

    private Queue<Party> line;
    private int current;

    public Line(List<Party> list1) {

    }

    public Line() {

    }

    //get the length
    public int length(){
        if (line.isEmpty()) {
            return 0;
        }
        return length();
    }

    //add to the line
    public Party addTo(Party p1){
        line.add(p1);
        return addTo(p1);
    }

    //remove complete line
    public Party emptyLine() {
        line.removeAll(line);
        return emptyLine();
    }

    //only to check if there is a next party
    public boolean hasNext() {
        if (line.size() != 0) {
            return true;
        }
        return false;
    }

    //next party but not removing
    public Party peek() {
        if (line.isEmpty()) {
            return null;
        } else {
             line.peek();
        }
        return peek();
    }

    //remove current party and make next party the current
    public void remove(){
        if(!line.isEmpty()){
            current = 0;
            line.remove(current);
            current++;
        }
    }

}
