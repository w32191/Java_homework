package com.samwang.hw5._3;

public class Stack {

  private int[] num = new int[3];
  private static int top = 0;
  private static boolean isPushed = false;

  public void push(int input) throws StackFullException {
    if (top >= num.length) {
      top--;
      throw new StackFullException();
    } else if (top < 0) {
      top++;
    }
    num[top] = input;
    top++;
    isPushed = true;

  }

  public int pop() throws StackEmptyException {
    if (top >= num.length || isPushed) {
      top--;
    } else if (top < 0) {
      top++;
      throw new StackEmptyException();
    }
    int resultPop = num[top];
    num[top] = 0;
    top--;
    isPushed = false;

    return resultPop;
  }


  public void printNum() {
    if (top >= num.length) {
      top--;
    } else if (top < 0) {
      top++;
    }
    System.out.println("現在top位於: " + top);
    for (int i = 0; i < num.length; i++) {
      System.out.printf("第%d個 , valur: %d \n", i + 1, num[i]);
    }

  }


}
