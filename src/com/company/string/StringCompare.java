package com.company.string;

public class StringCompare
{
  private static String s1 = "Apple";

  private static String s2 = "Apple";

  private static String s3 = new String("Apple");

  private static String s4 = "Orange";

  private static String s5 = "orange";

  public static void main(String[] args)
  {
    /**
     * we can compare two string by it's value and reference
     * 3ways to compare sting in java
     * 1)using equals() method
     * 2)using compareTo() method
     * 3)using == operator*/
    usingEqualsMethod();
    usingEqualOperators();
    usingCompareToMethod();
  }

  /**
   * using equals() method
   * this is compare value of string by ignoring it's reference
   */
  private static void usingEqualsMethod()
  {
    //equals() method
    System.out.println("\nusing equals() method");
    System.out.println(s1.equals(s2));//true
    System.out.println(s1.equals(s3));//true
    System.out.println(s1.equals(s4));//false
    System.out.println(s4.equals(s5));//false

    //equalsIgnoreCase() method
    System.out.println("\nusing equalsIgnoreCase() method");
    System.out.println(s4.equals(s5));//false
    System.out.println(s4.equalsIgnoreCase(s5));//true
  }

  /**
   * using == operator
   * this is compare string by it's reference
   * if two string refer to same object it return true,otherwise false
   */
  private static void usingEqualOperators()
  {
    System.out.println("\nusing == operator");
    System.out.println(s1 == s2);//true
    System.out.println(s1 == s3);//false
    System.out.println(s1 == s4);//false
    System.out.println(s4 == s5);//false
  }

  /**
   * compare string values lexicographically(same as order in dictionary)
   * compareTo is case sensitive
   * same = return 0
   * A come first in dictionary = return negative
   * B come first in dictionary = return positive value
   * upper case in come first in dictionary
   **/
  private static void usingCompareToMethod()
  {
    System.out.println("\nusing CompareTo() method");
    System.out.println(s1.compareTo(s2));//0
    System.out.println(s1.compareTo(s3));//0
    System.out.println(s1.compareTo(s4));//-
    System.out.println(s4.compareTo(s1));//-
    System.out.println(s4.compareTo(s5));//- capital came first in dictionary
    System.out.println(s5.compareTo(s4));//- capital came first in dictionary

    String s6 = "AppLe";
    System.out.println(s1.compareTo(s6));//0

  }

}
