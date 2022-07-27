/*Write a Java program to create an ArrayList, add all the months of a year and print the same.*/

import java.util.ArrayList;
import java.util.List;

public class Question9 {
  public static void main(String a[]) {
    List al = new ArrayList();
    al.add("January"); 
    al.add("February");
    al.add("March");
    al.add("April");
    al.add("May");
    al.add("June");
    al.add("July");
    al.add("August");
    al.add("September");
    al.add("October");
    al.add("November");
    al.add("December");

    System.out.println(al);

    for(int i=0; i<al.size(); i++) {
      System.out.println(al.get(i));
    }
  }
}