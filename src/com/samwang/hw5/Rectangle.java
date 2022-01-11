package com.samwang.hw5;

public class Rectangle implements Shape {

  private double length;

  public Rectangle(int length) {
    this.length = length;
  }

  public Rectangle(double length) {
    this.length = length;
  }

  @Override
  public double computeArea() {
    return length * length;
  }

  @Override
  public double computeCircumference() {
    return length * 4;
  }
}
