package com.samwang.hw4;

public class Verifier {


  //(1)產生四個數字的驗證碼
  public static String fourRandomVerifier() {
    //Math.random()會產生0.0~1.0之間的亂數 (無限接近於1，但不包含1)
    String result = "";
    for (int i = 0; i < 4; i++) {
      result += (int) (Math.random() * 10);
    }
    return result;
  }

  //(2)產生四個數字且不重複的驗證碼
  public static String fourRandomUniqueVerifier() {

    String resultStr = "";

    do {
      String addStr = Integer.toString((int) (Math.random() * 10));
      //如果字串長度不等於0表示有內容,才搜尋有沒有重複
      if (resultStr.length() != 0 ) {
        //檢查resultStr中，有沒有包含這次產生的亂數addStr
        if (!resultStr.contains(addStr)) {
          resultStr += addStr;
        }
      } else {
        resultStr += addStr;
      }

    } while (resultStr.length() < 4); //長度到4就停

    return resultStr;
  }


  public static void main(String[] args) {
    System.out.println("(1)產生四個數字的驗證碼：" + fourRandomVerifier());
    System.out.println("(2)產生四個數字且不重複的驗證碼：" + fourRandomUniqueVerifier());

  }

}
