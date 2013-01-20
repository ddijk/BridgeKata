/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.dijkrosoft.tryout.patterns.bridgekata.drawer;

import nl.dijkrosoft.tryout.patterns.bridgekata.model.Canvas;
import nl.dijkrosoft.tryout.patterns.bridgekata.model.Shape;

/**
 *
 * @author dick
 */
public interface Drawer {
  
  void draw(Shape s, Canvas c);
}
