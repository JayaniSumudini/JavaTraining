package com.company.overloading;

public class DifferentDataTypes
{
  public static String concatenate(String a, String b)
  {
    return a + " " + b;
  }

  public static String concatenate(String a, int b)
  {
    return a + " " + b;
  }

  public static void main(String[] args)
  {
    System.out.println(concatenate("Hi", "Friends!"));
    System.out.println(concatenate("Hi", 10));
  }
}
