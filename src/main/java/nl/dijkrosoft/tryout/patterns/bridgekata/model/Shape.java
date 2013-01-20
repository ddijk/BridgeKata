/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.dijkrosoft.tryout.patterns.bridgekata.model;

import java.util.List;

/**
 * Een Shape wordt bepaald door een aantal punten.
 * @author dick
 */
public interface Shape {


  String getName();

  List<Point> getPoints();
  
}
