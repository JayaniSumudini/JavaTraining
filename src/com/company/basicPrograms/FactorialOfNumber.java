package com.company.basicPrograms;

import java.util.Scanner;

public class FactorialOfNumber
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input: ");
    int input = scanner.nextInt();
    System.out.println(getFactorial(input));
  }

  private static int getFactorial(int input)
  {
    return (input == 0) ? 1 : (input * getFactorial(input - 1));
  }
}
