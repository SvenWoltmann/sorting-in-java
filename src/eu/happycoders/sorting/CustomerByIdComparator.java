package eu.happycoders.sorting;

import java.util.Comparator;

public class CustomerByIdComparator implements Comparator<Customer> {
  private final boolean ascending;

  public CustomerByIdComparator(boolean ascending) {
    this.ascending = ascending;
  }

  @Override
  public int compare(Customer o1, Customer o2) {
    int result = Integer.compare(o1.getId(), o2.getId());
    return ascending ? result : -result;
  }
}
