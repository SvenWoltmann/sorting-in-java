package eu.happycoders.sorting;

import java.util.*;

public class CustomerListCollectionsSortByNameDemo {
  public static void main(String[] args) {
    ArrayList<Customer> customers = new ArrayList<>(List.of(
          new Customer(43423, "Elizabeth", "Mann"),
          new Customer(10503, "Phil", "Gruber"),
          new Customer(61157, "Patrick", "Sonnenberg"),
          new Customer(28378, "Marina", "Metz"),
          new Customer(57299, "Caroline", "Albers")
    ));
    Collections.sort(customers, Customer.NAME_COMPARATOR);
    System.out.println(customers);
  }
}
