package com.samwang.hw5._1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeFile {

  private List<String> readList = new ArrayList<>();

  //讀檔後放進ArrayList
  public void readFile() throws IOException {
    BufferedReader in = new BufferedReader(new FileReader("/Users/samwang/employee.txt"));
    String str;
    while ((str = in.readLine()) != null) {
      readList.add(str);
    }
    in.close();
  }//end of readFile();

  //將每個人的基本資料String 拆開
  public String[] tokens(int index) {
    return readList.get(index).split(",");
  }

  //個人資料ArrayList
  public ArrayList<String> insEmployee(String[] tokens) {
    return new ArrayList<>(Arrays.asList(tokens));
  }

  public List<String> getReadList() {
    return readList;
  }

}
