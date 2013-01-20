/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.dijkrosoft.tryout.patterns.bridgekata.drawer.impl;

import java.util.List;
import nl.dijkrosoft.tryout.patterns.bridgekata.canvas.Paper;
import nl.dijkrosoft.tryout.patterns.bridgekata.model.Canvas;
import nl.dijkrosoft.tryout.patterns.bridgekata.model.Line;
import nl.dijkrosoft.tryout.patterns.bridgekata.model.Point;
import nl.dijkrosoft.tryout.patterns.bridgekata.model.Shape;
import nl.dijkrosoft.tryout.patterns.bridgekata.shapes.Driehoek;
import nl.dijkrosoft.tryout.patterns.bridgekata.shapes.PointImpl;
import nl.dijkrosoft.tryout.patterns.bridgekata.shapes.Vierkant;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dick
 */
public class TekenaarTest {
  
  public TekenaarTest() {
  }

  @Test
  public void testDrawVierkant() {
    final PointImpl linksBoven = new PointImpl(2,13);
    Shape s = new Vierkant(linksBoven, 5);
    Tekenaar instance = new Tekenaar();

    Canvas c  = new Paper();
    instance.draw(s,c);

  // 4 hoekpunten van het vierkant
    Point rechtsBoven = new PointImpl(7, 13);
    Point rechtsOnder = new PointImpl(7, 8);
    Point linksOnder = new PointImpl(2, 8);

    // 4 ribben
    Line bovenKant = new LineImpl(linksBoven, rechtsBoven);
    Line rechterKant = new LineImpl(rechtsBoven, rechtsOnder);
    Line onderKant = new LineImpl(linksOnder, rechtsOnder);
    Line linkerKant = new LineImpl(linksOnder, linksBoven);
    
    // test slaagt als Canvas de 4 lijnen bevat, volgorde is niet belangrijk
    List<Line> canvasLines = c.getLines();
    assertEquals( 4, canvasLines.size());

    assertTrue(canvasLines.contains(bovenKant));
    assertTrue(canvasLines.contains(rechterKant));
    assertTrue(canvasLines.contains(onderKant));
    assertTrue(canvasLines.contains(linkerKant));
    
  }

  @Test
  public void drawDriehoek() {
    final PointImpl punt1 = new PointImpl(1,2);
    final PointImpl punt2 = new PointImpl(3,3);
    final PointImpl punt3 = new PointImpl(4,4);
    
    Shape driehoek = new Driehoek(punt1, punt2, punt3);

    Canvas c  = new Paper();
    Tekenaar t = new Tekenaar();
    t.draw(driehoek,c);

    Line zijde1 = new LineImpl(punt1, punt2);
    Line zijde2 = new LineImpl(punt3, punt2);
    Line zijde3 = new LineImpl(punt1, punt3);

    List<Line> canvasLines = c.getLines();
    assertEquals( 3, canvasLines.size());

    assertTrue(canvasLines.contains(zijde1));
    assertTrue(canvasLines.contains(zijde2));
    assertTrue(canvasLines.contains(zijde3));
  }
}
