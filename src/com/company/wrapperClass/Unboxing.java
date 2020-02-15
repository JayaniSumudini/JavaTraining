package com.company.wrapperClass;

public class Unboxing
{
/**
  the automatic conversion of object to primitive type is known as unboxing
*/
  public static void main(String[] args)
  {
    Integer a = new Integer(10);
    int b = a; //unboxing

    System.out.println(a + " " + b);

  }
}
