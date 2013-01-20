/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.dijkrosoft.tryout.patterns.bridgekata.shapes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import nl.dijkrosoft.tryout.patterns.bridgekata.model.Point;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dick
 */
public class VierkantTest {
  
  public VierkantTest() {
  }

  @Test
  public void testGetName() {
    Vierkant instance = new Vierkant(new PointImpl(0,0), 1);
    String expResult = "vierkant";
    String result = instance.getName();
    assertEquals(expResult, result);
  }

  @Test
  public void testArrayListEquals() {
    List<String> l1 = Arrays.asList("aap", "noot", "mies");
    List<String> l2 = Arrays.asList("aap", "noot", "mies");

    assertEquals(l1,l2);
  }

  @Test
  public void testGetPoints() {
    Vierkant instance = new Vierkant(new PointImpl(2, 3), 1);
    System.out.println("instance:"+ instance);
    List<Point> expResult = new ArrayList<Point>();
    expResult.add(new PointImpl(2,3));
    expResult.add(new PointImpl(3,3));
    expResult.add(new PointImpl(3,2));
    expResult.add(new PointImpl(2,2));
    List<Point> result = instance.getPoints();
    assertEquals(expResult, result);
  }
}
