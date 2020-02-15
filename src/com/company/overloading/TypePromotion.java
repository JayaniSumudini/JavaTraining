package com.company.overloading;

public class TypePromotion
{
  /**
  * this is also call type casting
   * Widening casting happened automatically
   * narrowing casting happened manually
   * <img src="../../image/typeCasting.PNG" width="500" alt="description of MyImage"/>
   *
   */
  private static double add(int a, float b)
  {
    System.out.println("In float float");
    return a + b;
  }

  private static int add(int a, int b, int c)
  {
    System.out.println("In int int int");
    return a + b + c;
  }

  public static void main(String[] args)
  {
    System.out.println(add(12, 13));
    System.out.println(add(12, 13, 14));
  }
}
