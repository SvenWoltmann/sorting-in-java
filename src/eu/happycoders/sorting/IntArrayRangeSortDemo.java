package eu.happycoders.sorting;

import java.util.Arrays;

public class IntArrayRangeSortDemo {
  public static void main(String[] args) {
    int[] a = {4, 8, 5, 9, 2, 3, 1, 7, 6};
    Arrays.sort(a, 0, 5);
    System.out.println(Arrays.toString(a));
  }
}
