package eu.happycoders.sorting;

import java.util.Arrays;

public class CustomerArraySortByNameLambdaDemo {

  public static void main(String[] args) {
    Customer[] customers = {
          new Customer(43423, "Elizabeth", "Mann"),
          new Customer(10503, "Phil", "Gruber"),
          new Customer(61157, "Patrick", "Sonnenberg"),
          new Customer(28378, "Marina", "Metz"),
          new Customer(57299, "Caroline", "Albers")
    };
    Arrays.sort(customers,
          (o1, o2) -> {
            int result = o1.getLastName().compareTo(o2.getLastName());
            if (result != 0) return result;

            result = o1.getFirstName().compareTo(o2.getFirstName());
            if (result != 0) return result;

            return Integer.compare(o1.getId(), o2.getId());
          });
    System.out.println(Arrays.toString(customers));
  }
}
