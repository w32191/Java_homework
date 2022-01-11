package com.samwang.hw5;

public class TestShape {

  public static void main(String[] args) {
    Shape[] shapes = new Shape[2];
    shapes[0] = new Circle(123);
    shapes[1] = new Rectangle(123);
    for (Shape shape : shapes) {
      if (shape instanceof Circle) {
        System.out.print("圓的");
      } else if (shape instanceof Rectangle) {
        System.out.print("正方形");
      }
      System.out.println("面積：" + shape.computeArea());
      System.out.println("周長：" + shape.computeCircumference());
    }


  }
}
