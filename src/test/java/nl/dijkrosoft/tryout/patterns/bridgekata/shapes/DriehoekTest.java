/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.dijkrosoft.tryout.patterns.bridgekata.shapes;

import java.util.ArrayList;
import java.util.List;
import nl.dijkrosoft.tryout.patterns.bridgekata.model.Point;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dick
 */
public class DriehoekTest {
  
  public DriehoekTest() {
  }

  @Test
  public void testGetName() {
    Driehoek instance = new Driehoek(null,null,null);
    String expResult = "driehoek";
    String result = instance.getName();
    assertEquals(expResult, result);
  }

  @Test
  public void testGetPoints() {
     Driehoek instance = new Driehoek(new PointImpl(2, 3), new PointImpl(5, 7), new PointImpl(1, 1));
    System.out.println("instance:"+ instance);
    List<Point> expResult = new ArrayList<Point>();
    expResult.add(new PointImpl(2,3));
    expResult.add(new PointImpl(5,7));
    expResult.add(new PointImpl(1,1));
    List<Point> result = instance.getPoints();
    assertEquals(expResult, result);
  }
}
