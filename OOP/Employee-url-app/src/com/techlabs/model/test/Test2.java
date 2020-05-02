package com.techlabs.model.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;



public class Test2 {
  public static void main(String[] args) {
    HashSet output = getUrlContents("https://swabhav-tech.firebaseapp.com/emp.txt");
    System.out.println(output);
  }

  private static HashSet getUrlContents(String theUrl) {
    StringBuilder content = new StringBuilder();
    HashSet<String> list = new HashSet<String>();
    try {

      URL url = new URL(theUrl);

      URLConnection urlConnection = url.openConnection();

      BufferedReader bufferedReader = new BufferedReader(
          new InputStreamReader(urlConnection.getInputStream()));

      String line;

      while ((line = bufferedReader.readLine()) != null) {
        content.append(line + "\n");
        list.add(line);
      }
      bufferedReader.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    // return content.toString();
    return list;
  }
  
  public static <Hashset, Employee> void sortList(Hashset output) {
	  List<Employee> emp = new ArrayList(output)t<Employee>(output);
  }

}
