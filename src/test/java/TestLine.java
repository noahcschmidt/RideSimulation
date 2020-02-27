import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class TestLine {
    @Test
    public void testConstruct() {
        Line a = new Line();
        Assert.assertEquals(a.length(), 0);

        Party p1 = new Party(2);
        Party p2 = new Party(4);
        List<Party> list1 = new LinkedList<>();
        List<Party> list2 = new LinkedList<>();
        list1.add(p1);  //has only one party
        list2.add(p1);  //has both parties
        list2.add(p2);


        Line b = new Line(list1);
        Assert.assertEquals(b.length(), 2);

        Line c = new Line(list2);
        Assert.assertEquals(c.length(), 6);
    }

    @Test
    public void testLength() {
        Party p1 = new Party(5);
        Party p2 = new Party(1);
        Party p3 = new Party(3);

        Line a = new Line();
        Assert.assertEquals(a.length(), 0);
        a.addTo(p1);
        Assert.assertEquals(a.length(), 5);
        a.addTo(p2);
        Assert.assertEquals(a.length(), 6);
        a.addTo(p3);
        Assert.assertEquals(a.length(), 9);
    }

    @Test
    public void testAddError() {
        Party p1 = new Party(0);
        Party p2 = new Party(3);
        Party p3 = null;

        Line line = new Line();
        try {
            line.add(p1);
            Assert.fail("Expected IllegalArgumentException.");
        } catch (IllegalArgumentException e) {
            //Error caught, success
        }
        Assert.assertEquals(line.length(), 0);

        line.add(p2);
        Assert.assertEquals(line.length(), 3);

        try {
            line.add(p3);
            Assert.fail("Tried to insert null party.");
        } catch (NullPointerException e) {
            //Error caught, success
        }
    }
}
