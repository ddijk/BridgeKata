/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.dijkrosoft.tryout.patterns.bridgekata.canvas;

import java.util.ArrayList;
import java.util.List;
import nl.dijkrosoft.tryout.patterns.bridgekata.drawer.impl.LineImpl;
import nl.dijkrosoft.tryout.patterns.bridgekata.model.Canvas;
import nl.dijkrosoft.tryout.patterns.bridgekata.model.Line;

/**
 *
 * @author dick
 */
public class Paper implements Canvas{

  List<Line> lines = new ArrayList<Line>();

  public List<Line> getLines() {
    return lines;
  }

  public void addLine(Line line) {
    lines.add(line);
  }
  
}
