
import java.util.*;


public class Line {

    private Queue<Integer> line;
    private int current;

    public Line(List<Party> list1) {

    }


    //put the party number into a queue
    public void add(Party p1) {
        line = new LinkedList<>();
        line.add();
    }

    //get the length
    public int length() {
        if(line.isEmpty()){
            return 0;
        }
        return length();
    }

    //remove current party and make next party the current
    public void remove(Party p1){


    }

    //remove complete line
    public void emptyLine(){
        line.removeAll(line);
    }

    //only to check if there is a next party
    public  boolean hasNext(){
        if(line.size() != 0){
            return true;
        }
        return false;
    }

    //next party but not removing
    public int peek(){
        if(line.isEmpty()){
            return 0;
        } else {
            return line.peek();
        }

    }


}

