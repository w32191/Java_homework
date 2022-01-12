package com.samwang.hw4;


import java.util.HashMap;
import java.util.Map;

public class IDGenerator {

  private final Map<String, String> map = new HashMap<>();
  private String male;

  // 建構子設定英文開頭
  IDGenerator() {
    map.put("台北市", "A");
    map.put("台中市", "B");
    map.put("基隆市", "C");
    map.put("台南市", "D");
    map.put("高雄市", "E");
    map.put("台北縣", "F");
    map.put("宜蘭縣", "G");
    map.put("桃園縣", "H");
    map.put("嘉義市", "I");
    map.put("新竹縣", "J");
    map.put("苗栗縣", "K");
    map.put("台中縣", "L");
    map.put("南投縣", "M");
    map.put("彰化縣", "N");
    map.put("新竹市", "O");
    map.put("雲林縣", "P");
    map.put("嘉義縣", "Q");
    map.put("台南縣", "R");
    map.put("高雄縣", "S");
    map.put("屏東縣", "T");
    map.put("花蓮縣", "U");
    map.put("台東縣", "V");
    map.put("金門縣", "W");
    map.put("澎湖縣", "X");
    map.put("陽明山", "Y");
    map.put("連江縣", "Z");
  }


  public void idGenerator(String city, String male) {

    if (male.equals("男")) {
      this.male = "1";
    } else if (male.equals("女")) {
      this.male = "2";
    }

    String result;
    do {
      result = map.get(city) + this.male;
      for (int i = 0; i < 8; i++) {
        result += Integer.toString((int) (Math.random() * 10));
      } //end of for()
    } while (!CheckID.isID(result));

    System.out.println(result);

  }


}
