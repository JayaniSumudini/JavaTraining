package com.company.overloading;

public class DifferentNumOfPara
{
  public static int add(int a, int b)
  {
    return a+b;
  }
  public static int add(int a, int b, int c)
  {
    return a+b+c;
  }

  public static void main(String[] args)
  {
    System.out.println(add(10,11));
    System.out.println(add(10,11, 12));
  }
}
