package com.company.basicPrograms;

import java.util.Scanner;

public class Palindrome
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input: ");
    String input = scanner.next();
    System.out.println(isPalindrome(input) ? "palindrome" : "not a palindrome");
    System.out.println(isPalindromeUsingStringBuffer(input) ? "palindrome" : "not a palindrome");
  }

  private static boolean isPalindrome(String input)
  {
    String temp = "";
    for (int i = input.length() - 1; i >= 0; i--)
    {
      temp += input.charAt(i);
    }
    return input.equalsIgnoreCase(temp);
  }

  private static boolean isPalindromeUsingStringBuffer(String input)
  {
    String reverse = new StringBuffer(input).reverse().toString();
    return input.equalsIgnoreCase(reverse);
  }
}
