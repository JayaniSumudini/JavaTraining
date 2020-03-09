package com.company.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestList
{
  public static void main(String[] args)
  {
    List<Customer> customers = new ArrayList<>();
    customers.add(new Customer("d", "e2"));
    customers.add(new Customer("c", "e3"));
    customers.add(new Customer("a", "e1"));
    customers.add(new Customer("b", "e4"));
    customers.add(new Customer("c", "e3"));//keep duplicate values

    Collections.sort(customers);

    System.out.println(customers);

    Collections.sort(customers, new EmailComparator());

    System.out.println(customers);//a,d,c,b

  }
}
