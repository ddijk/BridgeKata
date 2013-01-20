/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.dijkrosoft.tryout.patterns.bridgekata.shapes;

import java.util.List;
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
    System.out.println("getName");
    Driehoek instance = new Driehoek();
    String expResult = "";
    String result = instance.getName();
    assertEquals(expResult, result);
    fail("The test case is a prototype.");
  }

  @Test
  public void testGetPoints() {
    System.out.println("getPoints");
    Driehoek instance = new Driehoek();
    List expResult = null;
    List result = instance.getPoints();
    assertEquals(expResult, result);
    fail("The test case is a prototype.");
  }
}
