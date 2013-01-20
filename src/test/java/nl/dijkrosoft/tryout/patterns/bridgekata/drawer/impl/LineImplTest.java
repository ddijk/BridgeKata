/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.dijkrosoft.tryout.patterns.bridgekata.drawer.impl;

import nl.dijkrosoft.tryout.patterns.bridgekata.model.Point;
import nl.dijkrosoft.tryout.patterns.bridgekata.shapes.PointImpl;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dick
 */
public class LineImplTest {
  
  public LineImplTest() {
  }

  @Test
  public void testGetStart() {
    LineImpl instance = new LineImpl(new PointImpl(2,3), new PointImpl(4,3));
    Point expResult = new PointImpl(2,3);
    Point result = instance.getStart();
    assertEquals(expResult, result);
  }

  @Test
  public void testGetEnd() {
    LineImpl instance = new LineImpl(new PointImpl(2,3), new PointImpl(4,3));
    Point expResult = new PointImpl(4,3);
    Point result = instance.getEnd();
    assertEquals(expResult, result);
  }


  @Test
  public void testEquals() {
    LineImpl instance = new LineImpl(new PointImpl(2,3), new PointImpl(4,3));
    LineImpl instance2 = new LineImpl(new PointImpl(2,3), new PointImpl(4,3));
    assertEquals(instance, instance2);

  }

  @Test
  public void testHash() {
    LineImpl instance2 = new LineImpl(new PointImpl(2,3), new PointImpl(4,3));
    assertEquals(0, instance2.hashCode());

  }

  @Test
  public void testEqualsWithOtherType()  {
    // comparing with another type should never pass
    LineImpl instance2 = new LineImpl(new PointImpl(2,3), new PointImpl(4,3));
    assertFalse(instance2.equals(new String("other type")));
    
  }

}
