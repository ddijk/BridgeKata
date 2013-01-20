/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.dijkrosoft.tryout.patterns.bridgekata.drawer.impl;

import nl.dijkrosoft.tryout.patterns.bridgekata.model.Line;
import nl.dijkrosoft.tryout.patterns.bridgekata.model.Point;

/**
 *
 * @author dick
 */
public class LineImpl implements Line {

  Point start;
  Point eind;

  public LineImpl(Point start, Point end) {
    this.start = start;
    this.eind = end;
  }

  public Point getStart() {
    return start;
  }


  public Point getEnd() {
    return eind;
  }


  // lines are equals als beide punten overeenkomen, volgorde is niet belangrijk

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public boolean equals(Object obj) {

    if ( obj instanceof Line) {
      Line other = (Line) obj;

      // tekenrichting maakt niet uit ( van-startpunt-naar-eindpunt geeft dezelfde lijn als van-eindpunt-naar-startpunt)
      return (start.equals(other.getStart()) && eind.equals(other.getEnd())) || ( start.equals(other.getEnd()) && eind.equals(other.getStart()));
    }
    return false;
  }

  
  
  
}
