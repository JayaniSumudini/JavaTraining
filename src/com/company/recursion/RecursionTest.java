package com.company.recursion;

public class RecursionTest
{
  //recursion is a process of method called it self continuously

  //Factorial Number

  public static void main(String[] args)
  {
    int value = 5;
    System.out.println("Factorial of " + value + " is :" + getFactorial(value));

    System.out.print(0 + " " + 1 + " ");
    int number = 15;
    getFibonacciSeries(0, 1, number-2);
  }

  private static int getFactorial(int value)
  {
    if (value == 1)
    {
      return 1;
    }
    return value * getFactorial(value - 1);
  }

  private static void getFibonacciSeries(int number1, int number2, int count)
  {
    count--;
    if (count < 0)
    {
      return;
    }
    int number3 = number1 + number2;
    System.out.print(number3 + " ");
    getFibonacciSeries(number2, number3, count);

  }
}
