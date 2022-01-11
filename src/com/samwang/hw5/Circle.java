package com.samwang.hw5;

public class Circle implements Shape {

  private static final double PI = 3.14;
  private double radius;

  Circle(int radius) {
    this.radius = radius;
  }

  Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double computeArea() {
    return radius * radius * PI;
  }

  @Override
  public double computeCircumference() {
    return radius * 2 * PI;
  }
}
