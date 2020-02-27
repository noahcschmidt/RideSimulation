import java.util.*;

public class Line {

    private Queue<Integer> line;
    private int current;

    //get the length
    public int length() {
        if (line.isEmpty()) {
            return 0;
        }
        return length();
    }

    //add to the line
    public void addTo(int num){
        line.add(num);
    }

    //remove complete line
    public void emptyLine() {
        line.removeAll(line);
    }

    //only to check if there is a next party
    public boolean hasNext() {
        if (line.size() != 0) {
            return true;
        }
        return false;
    }

    //next party but not removing
    public int peek() {
        if (line.isEmpty()) {
            return 0;
        } else {
            return line.peek();
        }
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
