package com.example.demo;
import java.util.ArrayList;
import java.util.List;

/**
 * @author gao peng
 * @date 2019/5/6 17:31
 */

public class ButtonListenerNewWay {
  public static void main(String[] args) {
    List<String> list=new ArrayList<String>();
    list.add("Rick");
    list.add("Negan");
    list.add("Daryl");
    list.add("Glenn");
    list.add("Carl");
    list.forEach(
        // lambda expression
        (names1)->System.out.println(names1)
    );
  }
}
