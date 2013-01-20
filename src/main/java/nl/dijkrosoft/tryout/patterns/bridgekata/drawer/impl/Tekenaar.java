/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.dijkrosoft.tryout.patterns.bridgekata.drawer.impl;

import java.util.List;
import nl.dijkrosoft.tryout.patterns.bridgekata.drawer.Drawer;
import nl.dijkrosoft.tryout.patterns.bridgekata.model.Canvas;
import nl.dijkrosoft.tryout.patterns.bridgekata.model.Line;
import nl.dijkrosoft.tryout.patterns.bridgekata.model.Point;
import nl.dijkrosoft.tryout.patterns.bridgekata.model.Shape;

/**
 *
 * @author dick
 */
public class Tekenaar  implements Drawer{

  public void draw(Shape s, Canvas c) {

    List<Point> points = s.getPoints();

    Point beginPunt = points.get(0);
    final int n = points.size();

    // add all lines behalve de laatste sluitlijn
    for ( int i=1 ; i< n; i++) {
      Line line = new LineImpl(points.get(i-1), points.get(i));
      c.addLine(line);
    }

    // add sluitline
    Line sluitLine = new LineImpl(points.get(n-1), beginPunt);
    c.addLine(sluitLine);
    
  }
  
}
