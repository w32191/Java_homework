package com.samwang.hw4;

public class CheckID {

  public static boolean isID(String id) {

    //取第1個英文字
    char firstChar = id.charAt(0);

    //第2個字。用Character.getNumericValue()這個API，可以將char轉為int值
    int secondNumber = Character.getNumericValue(id.charAt(1));

    //用String.substring()取第3到10碼數字字串
    String threeToTenNumber = id.substring(2, 10);
    //預設3~10碼為數字
    boolean threeToTenIsNumber = true;
    //用for控制字串charAt()取出char，再用Character.isDigit()判斷這個char是否是數字
    for (int i = 0; i < threeToTenNumber.length(); i++) {
      if (!Character.isDigit(threeToTenNumber.charAt(i))) {
        threeToTenIsNumber = false;
      }
    }

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
    //在上方已有用boolean threeToTenIsNumber判斷第3~10碼是不是數字
    else if (!threeToTenIsNumber) {
      return false;
    }
    //在自訂一個method 來檢查檢查碼
    else if (!checkIdRule(firstChar, secondNumber, threeToTenNumber)) {
      return false;
    } else {
      return true;
    }

  }


  public static boolean checkIdRule(char firstChar, int secondNumber, String threeToTenNumber) {
    String checkStr = "ABCDEFGHJKLMNPQRSTUVXYZIO";
    // 10~35
    int firstEngToCheck = checkStr.indexOf(firstChar) + 10;
    int sum = 0;
    sum += firstEngToCheck / 10 + (firstEngToCheck % 10) * 9 + secondNumber * 8;

    for (int i = 0, j = 7; i < threeToTenNumber.length() - 1; i++, j--) {
      sum += Character.getNumericValue(threeToTenNumber.charAt(i)) * j;
    }
    //  加後之值除以模數 10 取其餘數
    //  1 2 1 / 1 0 = 12 ‧‧‧餘數 1
    //  由10減去餘數得檢查號碼，若餘數為 0 時，則設定其檢查碼為 0
    //  10 – 1 = 9
    return Character.getNumericValue(threeToTenNumber.charAt(7)) == (10 - (sum % 10)) % 10;
  }

  public static void main(String[] args) {

    String id = "A123456789";
    System.out.println(CheckID.isID(id));

  }
}

