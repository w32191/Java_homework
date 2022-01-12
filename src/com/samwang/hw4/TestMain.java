package com.samwang.hw4;

import java.util.Scanner;

public class TestMain {

  public static void main(String[] args) {

    //test CheckID
    System.out.println("==========第一題==========");
    String id = "A123456789";
    System.out.println("ID:" + id + " is " + CheckID.isID(id));
    System.out.println();


    //test Verifier
    System.out.println("==========第二題==========");
    System.out.println("(1)產生四個數字的驗證碼：" + Verifier.fourRandomVerifier());
    System.out.println("(2)產生四個數字且不重複的驗證碼：" + Verifier.fourRandomUniqueVerifier());
    System.out.println("(3)產生六個數字與英文且不重複的驗證碼：" + Verifier.sixRandomUniqueVerifier());
    System.out.println();


    //test Poker
    System.out.println("==========第三題==========");
    Poker poker = new Poker();
    poker.randomCard();
    System.out.println();


    //test IDGenerator
    System.out.println("==========第四題==========");
    String city = "台中縣";
    String male = "男";
    IDGenerator idGenerator = new IDGenerator();
    idGenerator.idGenerator(city, male);
    System.out.println();



  }
}
