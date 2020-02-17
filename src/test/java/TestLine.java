import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class TestLine {
    @Test
    public void testConstruct() {
        Line a = new Line();
        Assert.assertEquals(a.getLength(), 0);

        Party p1 = new Party(2);
        Party p2 = new Party(4);
        List<Party> list1 = new LinkedList<>();
        List<Party> list2 = new LinkedList<>();
        list1.add(p1);  //has only one party
        list2.add(p1);  //has both parties
        list2.add(p2);


        Line b = new Line(list1);
        Assert.assertEquals(b.getLength(), 2);

        Line c = new Line(list2);
        Assert.assertEquals(c.getLength(), 6);
    }

}
