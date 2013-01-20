/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.dijkrosoft.tryout.patterns.bridgekata.canvas;

import nl.dijkrosoft.tryout.patterns.bridgekata.drawer.impl.LineImpl;
import nl.dijkrosoft.tryout.patterns.bridgekata.model.Point;
import nl.dijkrosoft.tryout.patterns.bridgekata.shapes.PointImpl;
import org.junit.Test;

/**
 *
 * @author dick
 */
public class PaperTest {
  
  public PaperTest() {
  }

  @Test
  public void testLines() {
    Paper p = new Paper();

    Point start = new PointImpl(1,3);
    Point end = new PointImpl(2,5);
    p.addLine(new LineImpl(start, end));
  }
}
