package com.samwang.hw4;

public class Verifier {

  private static final int lengthOfVerifier = 4;


  //(1)產生四個數字的驗證碼
  public static String fourRandomVerifier() {
    //Math.random()會產生0.0~1.0之間的亂數 (無限接近於1，但不包含1)
    String result = "";
    for (int i = 0; i < lengthOfVerifier; i++) {
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
      if (resultStr.length() != 0) {
        //檢查resultStr中，有沒有包含這次產生的亂數addStr
        if (!resultStr.contains(addStr)) {
          resultStr += addStr;
        } //end of inner if()
      } //end of outer if()
      else {
        resultStr += addStr;
      }
    } while (resultStr.length() < lengthOfVerifier); //長度到4就停

    return resultStr;
  }

  //(3)產生六個包含英文字母和數字的驗證碼
  public static String sixRandomUniqueVerifier() {
    String resultStr = "";
    int engNumController;

    do {
      engNumController = (int) (Math.random() * 2 + 1); //亂數取得1或2

      String addStr;
      if (engNumController == 1) {
        //亂數數字
        addStr = Integer.toString((int) (Math.random() * 10));
      } else {
        //亂數英文
        addStr = Character.toString((char) ((int) (Math.random() * 26 + 65)));
      }

      //如果字串長度不等於0表示有內容,才搜尋有沒有重複
      if (resultStr.length() != 0) {
        //檢查resultStr中，有沒有包含這次產生的亂數addStr
        if (!resultStr.contains(addStr)) {
          resultStr += addStr;
        } //end of inner if()
      } //end of outer if()
      else {
        resultStr += addStr;
      }
    } while (resultStr.length() < lengthOfVerifier + 2);

    return resultStr;
  }

}
