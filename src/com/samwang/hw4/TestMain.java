package com.samwang.hw4;

public class TestMain {

  public static void main(String[] args) {
    //test CheckID
    String id = "A123456789";
    System.out.println("ID:" + id + " is " + CheckID.isID(id));

    //test Verifier
    System.out.println("(1)產生四個數字的驗證碼：" + Verifier.fourRandomVerifier());
    System.out.println("(2)產生四個數字且不重複的驗證碼：" + Verifier.fourRandomUniqueVerifier());
  }
}
