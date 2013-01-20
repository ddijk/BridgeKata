/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.dijkrosoft.tryout.patterns.bridgekata.shapes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import nl.dijkrosoft.tryout.patterns.bridgekata.drawer.impl.LineImpl;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author dick
 */
public class PointImplTest {
  
  public PointImplTest() {
  }

  @Test
  public void testGetX() {
    PointImpl instance = new PointImpl(3,  4);
    int expResult = 3;
    int result = instance.getX();
    assertEquals(expResult, result);
  }

  @Test
  public void testGetY() {
    PointImpl instance = new PointImpl(3,  4);
    int expResult = 4;
    int result = instance.getY();
    assertEquals(expResult, result);
  }


  @Test
  public void testEquals() {
    PointImpl instance = new PointImpl(3,  4);
    PointImpl instance2 = new PointImpl(3,  4);
    PointImpl instance3 = new PointImpl(4,  3);
    assertEquals(instance, instance2);
    assertFalse(instance.equals(instance3));

    // equal in list
    List<PointImpl> l1 = new ArrayList<PointImpl>();
    l1.add(instance);
    List<PointImpl> l2 = new ArrayList<PointImpl>();
    l2.add(instance);
    assertEquals(l1,l2);

    l1.add(instance3);
    assertFalse(l1.equals(l2));

    l2.add(instance3);
    assertEquals(l1,l2);

  }

   @Test
  public void testHash() {
    PointImpl instance2 = new PointImpl(3,  4);
    assertEquals(0, instance2.hashCode());

  }

  @Test
  public void testEqualsWithOtherType()  {
    // comparing with another type should never pass
    PointImpl instance2 = new PointImpl(3,  4);
    assertFalse(instance2.equals(new String("other type")));
    
  }

}
