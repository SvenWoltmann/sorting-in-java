package eu.happycoders.sorting;

import java.util.Comparator;

public class Customer implements Comparable<Customer> {
  public static final Comparator<Customer> NAME_COMPARATOR =
        new Comparator<>() {
          @Override
          public int compare(Customer o1, Customer o2) {
            int result = o1.getLastName().compareTo(o2.getLastName());
            if (result != 0) return result;

            result = o1.getFirstName().compareTo(o2.getFirstName());
            if (result != 0) return result;

            return Integer.compare(o1.getId(), o2.getId());
          }
        };

  private final int id;
  private final String firstName;
  private final String lastName;

  public Customer(int id, String firstName, String lastName) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public int getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  @Override
  public int compareTo(Customer o) {
    return Integer.compare(this.id, o.id);
  }

  @Override
  public String toString() {
    return "Customer{" +
          "id=" + id +
          ", firstName='" + firstName + '\'' +
          ", lastName='" + lastName + '\'' +
          '}';
  }
}
