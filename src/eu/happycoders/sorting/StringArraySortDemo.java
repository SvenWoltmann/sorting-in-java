package eu.happycoders.sorting;

import java.util.Arrays;

public class StringArraySortDemo {
  public static void main(String[] args) {
    String[] names = {"Susan", "Thomas", "Judith", "Daniel", "Eva", "Ben",
          "Antonia", "Paul"};
    Arrays.sort(names);
    System.out.println(Arrays.toString(names));
  }
}
