package com.example.pattern.structuralDesignPatterns.flyweightDesignPattern;

import java.awt.*;

/**
 * @author gao peng
 * @date 2019/8/5 17:40
 */
public interface Shape {

  public void draw(Graphics g, int x, int y, int width, int height, Color color);
}
