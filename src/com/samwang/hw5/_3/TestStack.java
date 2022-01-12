package com.samwang.hw5._3;

public class TestStack {

  public static void main(String[] args) {
    Stack stack = new Stack();

    try {
      stack.push(10);
      System.out.println(stack.pop());
      stack.push(20);
      System.out.println(stack.pop());
      stack.push(30);
      stack.push(40);
      stack.push(50);
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());


    } catch (StackFullException stackFullException) {
      System.out.println("滿了！");
    } catch (StackEmptyException stackEmptyException) {
      System.out.println("已經空了沒東西拿！");
    } finally {
      System.out.println("===================");
      stack.printNum();
    }


  }
}
