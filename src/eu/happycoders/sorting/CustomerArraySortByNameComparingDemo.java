package eu.happycoders.sorting;

import java.util.*;

public class CustomerArraySortByNameComparingDemo {

  public static void main(String[] args) {
    Customer[] customers = {
          new Customer(43423, "Elizabeth", "Mann"),
          new Customer(10503, "Phil", "Gruber"),
          new Customer(61157, "Patrick", "Sonnenberg"),
          new Customer(28378, "Marina", "Metz"),
          new Customer(57299, "Caroline", "Albers")
    };
    Arrays.sort(customers,
          Comparator.comparing(Customer::getLastName)
                .thenComparing(Customer::getFirstName)
                .thenComparingInt(Customer::getId));
    System.out.println(Arrays.toString(customers));
  }
}
