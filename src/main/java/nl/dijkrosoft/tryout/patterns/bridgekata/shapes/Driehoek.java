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
public class Driehoek implements Shape{

  List<Point> points = new ArrayList<Point>();

  public Driehoek(PointImpl x, PointImpl y, PointImpl z) {
    points.add(x);
    points.add(y);
    points.add(z);
  }

  public String getName() {
    return "driehoek";
  }

  public List<Point> getPoints() {
    return points;
  }
  
}
