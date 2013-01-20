/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.dijkrosoft.tryout.patterns.bridgekata.shapes;

import nl.dijkrosoft.tryout.patterns.bridgekata.model.Point;

/**
 *
 * @author dick
 */
public class PointImpl implements Point {

  int x;
  int y;

  public PointImpl(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Point) {
      Point other = (Point) obj;
      return x==other.getX() && y==other.getY();
    }
    return false;
  }
}
