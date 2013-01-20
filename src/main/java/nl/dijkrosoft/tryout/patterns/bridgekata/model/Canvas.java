/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.dijkrosoft.tryout.patterns.bridgekata.model;

import java.util.List;

/**
 *
 * @author dick
 */
public interface Canvas {

  List<Line> getLines();

  void addLine(Line l);
  
}
