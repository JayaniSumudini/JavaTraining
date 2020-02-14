package com.company.basicPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber
{
  public static void main(String[] args)
  {
    findPrimeNumbersBetweenTwoNumbers();
    findProvideNumberIsPrime();
  }

  //Find prime numbers between two numbers
  static void findPrimeNumbersBetweenTwoNumbers()
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Start Number: ");
    int startNumber = scanner.nextInt();

    System.out.print("End Number: ");
    int endNumber = scanner.nextInt();

    ArrayList<Integer> primeNumbers = new ArrayList<>();

    for (int number = startNumber; number < endNumber; number++)
    {
      if (isPrimeNumber(number))
      {
        primeNumbers.add(number);
      }
    }

    System.out.println(primeNumbers.toString());
  }

  //find Provide Number Is Prime
  public static void findProvideNumberIsPrime()
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input: ");
    int input = scanner.nextInt();
    System.out.println(isPrimeNumber(input) ? "prime number" : "not prime number");
  }

  static boolean isPrimeNumber(int input)
  {
    boolean isPrimeNumber = true;
    if (input == 0 || input == 1)
    {
      isPrimeNumber = false;
    }
    else
    {
      for (int i = 2; i < input; i++)
      {
        if (input % i == 0)
        {
          isPrimeNumber = false;
          break;
        }
      }
    }

    return isPrimeNumber;
  }
}
