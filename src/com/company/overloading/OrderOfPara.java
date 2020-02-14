package com.company.overloading;

public class OrderOfPara
{
  public static double add(int a, double b)
  {
    System.out.println("In int double");
    return a + b;
  }

  public static double add(double a, int b)
  {
    System.out.println("In double int");
    return a + b;
  }

  public static int add(int a, int b)
  {
    System.out.println("In int int");
    return a + b;
  }

  public static void main(String[] args)
  {
    System.out.println(add(10, 11.25));
    System.out.println(add(11.35, 11));
    System.out.println(add(11, 11));
  }
}
