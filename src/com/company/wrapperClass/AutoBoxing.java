package com.company.wrapperClass;

public class AutoBoxing
{
  /**
   * java wrapper classes wrapped the primitive data types..so why it's called wrapper class
   * Wrapper class in java provide the mechanism to convert primitive to object and object to primitive
   * the automatic conversion of primitive to object is called Autoboxing
   */
  public static void main(String[] args)
  {
    int a = 10;
    Integer i = a;//autoboxing

    System.out.println(a + " " + i);
  }
}
