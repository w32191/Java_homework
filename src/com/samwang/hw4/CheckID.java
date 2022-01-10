package com.samwang.hw4;

public class CheckID {

  public static boolean isID(String id) {

    //取第1個英文字
    char firstChar = id.charAt(0);
    //第2個字。用Character.getNumericValue()這個API，可以將char轉為int值
    int secondNumber = Character.getNumericValue(id.charAt(1));
    //用String.substring()取第3到10碼數字字串
    String threeToTenNumber = id.substring(2, 10);


    //檢查長度是否為10碼
    if (id.length() != 10) {
      return false;
    }
    //直接用charAt()回傳的char比較,小於A或大於Ｚ,回傳false,表示不是大寫字母
    else if (firstChar < 'A' || firstChar > 'Z') {
      return false;
    }
    //檢查第2個字,同時不是1也不是2的時候，return false
    else if (secondNumber != 1 && secondNumber != 2) {
      return false;
    }
    //call 自訂方法 isNumeric()，來判斷第3~10碼是不是數字
    else if (!isNumeric(threeToTenNumber)) {
      return false;
    }
    //call 自訂方法 checkRule() 來檢查檢查碼
    else
      return checkIdRule(firstChar, secondNumber, threeToTenNumber);

  }

  private static boolean isNumeric(String str) {
    //用for控制字串charAt()取出char，再用Character.isDigit()判斷這個char是否是數字
    for (int i = 0; i < str.length(); i++) {
      if (!Character.isDigit(str.charAt(i))) {
        return false;
      }
    }
    return true;
  }


  private static boolean checkIdRule(char firstChar, int secondNumber, String threeToTenNumber) {
    String checkStr = "ABCDEFGHJKLMNPQRSTUVXYZIO";

    //英文對照字串位置從10~35後，取10位數x1 + 個位數x9
    //相加後再加上：第2碼數字x8
    int checkNumberOfEng = checkStr.indexOf(firstChar) + 10;
    int sum = 0;
    sum += checkNumberOfEng / 10 + (checkNumberOfEng % 10) * 9 + secondNumber * 8;

    //  上面加完後，再加：第3碼x7 + 第4碼x6 + ... + 第9碼x1
    //  因為第10碼不算，所以取i < threeToTenNumber.length()-1，這樣只會取到第9碼
    for (int i = 0, j = 7; i < threeToTenNumber.length() - 1; i++, j--) {
      //用Character.getNumericValue()可以將char正確轉換為數字
      sum += Character.getNumericValue(threeToTenNumber.charAt(i)) * j;
    }

    //  全部加完後，除以 10 取其餘數
    //  1 2 1 / 1 0 = 12 ‧‧‧餘數 1
    //  再用 10 減去餘數 得檢查號碼
    //  10 – 1(餘數) = 9(最後一碼檢查碼)
    //  若餘數為 0 時，則設定其檢查碼為 0，所以要在％一次
    return Character.getNumericValue(threeToTenNumber.charAt(7)) == (10 - (sum % 10)) % 10;
  }

}

