package com.company.basicPrograms;

import java.util.Scanner;

public class FibbonacciNumberWithoutRecursion
{
  public static void main(String[] args)
  {
    //without using recursion
    Scanner scanner = new Scanner(System.in);
    System.out.print("please enter end number: ");
    int input = scanner.nextInt();
    int F0 = 0, F1 = 1, count = 2;//count need to start from 2.because 0 and 1 positions are already provide.
    System.out.print(F0 + " " + F1);
    while (count++ < input)
    {
      int F2 = F1 + F0;
      System.out.print(" " + F2);
      F0 = F1;
      F1 = F2;
    }
  }
}
