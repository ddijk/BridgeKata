/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.dijkrosoft.tryout.patterns.bridgekata.shapes;

import java.util.ArrayList;
import java.util.List;
import nl.dijkrosoft.tryout.patterns.bridgekata.model.Point;
import nl.dijkrosoft.tryout.patterns.bridgekata.model.Shape;

/**
 *
 * @author dick
 */
public class Vierkant implements Shape {

  int width;
  Point topLeft;
  List<Point> points = new ArrayList<Point>();

  public Vierkant(Point topLeft, int width) {

    this.topLeft = topLeft;
    this.width = width;
    points.add(topLeft);
    points.add(new PointImpl(topLeft.getX() + width, topLeft.getY()));
    points.add(new PointImpl(topLeft.getX() + width, topLeft.getY() - width));
    points.add(new PointImpl(topLeft.getX(), topLeft.getY() - width));

  }

  public String getName() {
    return "vierkant";
  }

  public List<Point> getPoints() {

    return points;
  }

  @Override
  public String toString() {
    String s = "(";
    for (Point p : points) {

      s += p.getX();
      s += ",";
      s += p.getY();
      s += ") ";
    }
    return s;
  }
}
