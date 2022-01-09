package com.samwang.hw4;

public class Verifier {
  //目前只完成第一小題


  //(1)產生四個數字的驗證碼
  public static int fourRandomVerifier() {
    //Math.random()會產生0.0~1.0之間的亂數 (無限接近於1，但不包含1)
    //假設產生0.99999999999999＊10000後，再轉為int也只會取到9999
    int result;

    //因為隨機數會是1~9999，所以給他一個迴圈，直到產生的數超過999才停下來，這樣就會有四位數
    do {
      result = (int) (Math.random() * 10000);
    } while (result <= 999);

    return result;
  }

  //(2)未完成
  public static int fourRandomUniqueVerifier() {
    int result;
    int[] verifier = new int[4];
    boolean unique = true;
    do {
      result = (int) (Math.random() * 10000);
      verifier[0] = result / 1000;
      verifier[1] = (result % 1000) / 100;
      verifier[2] = (result % 100) / 10;
      verifier[3] = result % 10;
      int temp = verifier[0];
      for (int i = 1; i < verifier.length; i++) {
        if (temp == verifier[i]) {
          unique = false;
          break;
        }
      }
      temp = verifier[1];
      for (int i = 2; i < verifier.length; i++) {
        if (temp == verifier[i]) {
          unique = false;
          break;
        }
      }

    } while (!unique);

    return result;
  }


  public static void main(String[] args) {
    System.out.println("(1)產生四個數字的驗證碼：" + fourRandomVerifier());

  }

}
