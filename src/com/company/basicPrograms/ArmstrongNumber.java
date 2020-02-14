package com.company.basicPrograms;

import java.util.Scanner;

public class ArmstrongNumber
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input: ");
    String input = scanner.next();
    int total = 0;
    for (int i = 0; i < input.length(); i++)
    {
      int digit = Integer.parseInt("" + input.charAt(i));
      total += Math.pow(digit,3);
    }
    System.out.println((total == Integer.parseInt(input)) ? "Armstrong number" : "not Armstrong number");
  }
}
