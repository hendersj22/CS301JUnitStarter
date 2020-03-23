package up.edu.dimcalc;

import android.graphics.Point;

import org.junit.Test;
import java.util.*;

import static org.junit.Assert.*;

public class TwoPointsTest {

    /** when created, getPoint() should show both points at the origin */
    @Test
    public void getPoint() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(0, p1.x);
        assertEquals(0, p1.y);
        assertEquals(0, p2.x);
        assertEquals(0, p2.y);
    }


    /** verify that arbitrary values are properly stored via setPoint() */
    @Test
    public void setPoint() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setPoint(0, 5, -3);
        testPoints.setPoint(1, -3, 5);
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(5, p1.x);
        assertEquals(-3, p1.y);
        assertEquals(-3, p2.x);
        assertEquals(5, p2.y);
    }

    @Test
    public void randomValue() {
        TwoPoints testPoints = new TwoPoints();
        testPoints.randomValue(0);
        testPoints.randomValue(1);
        Random rand = new Random();
        int x = rand.nextInt(20) - 10;
        int y = rand.nextInt(20) - 10;
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(x, p1.x);
        assertEquals(y, p1.y);
        assertEquals(x, p2.x);
        assertEquals(y, p2.y);
        }

    @Test
    public void setOrigin() {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setOrigin(0);
        testPoints.setOrigin(1);
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(0, p1.x);
        assertEquals(0, p1.y);
        assertEquals(0, p2.x);
        assertEquals(0, p2.y);
    }

    @Test
    public void copy() {
        TwoPoints testPoints = new TwoPoints();
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        testPoints.copy(0,1);
        assertEquals(p2.x, p1.x);
        assertEquals(p2.y, p1.y);


    }

    @Test
    public void distance() {
        TwoPoints testPoints = new TwoPoints();
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        testPoints.distance();


    }

    @Test
    public void slope() {
        TwoPoints testPoints = new TwoPoints();
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        testPoints.slope();
    }
}