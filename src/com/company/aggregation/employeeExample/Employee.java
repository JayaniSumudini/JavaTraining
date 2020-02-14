package com.company.aggregation.employeeExample;

public class Employee
{
  private String name;

  private String id_no;

  private Address address;

  public Employee(String name, String id_no, Address address)
  {
    this.name = name;
    this.id_no = id_no;
    this.address = address;
  }

  void displayInfo()
  {
    System.out.println(name + ' ' + id_no);
    System.out.println(address.getCity() + ", " + address.getState() + ", " + address.getCountry());
  }

  public static void main(String[] args)
  {
    Address addressOfAmal = new Address("Matara", "Southern", "Sri Lanka");
    Employee amal = new Employee("Amal", "928460398V", addressOfAmal);
    amal.displayInfo();
  }
}
