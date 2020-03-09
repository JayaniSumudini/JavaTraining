package com.company.string;

public class ConcatPerformanceTest
{
  public static void main(String[] args)
  {
    long startTime = System.currentTimeMillis();
    concatWithString();
    System.out.println("String class consume time is : " + (System.currentTimeMillis() - startTime));

    startTime = System.currentTimeMillis();
    concatWithStringBuffer();
    System.out.println("StringBuffer class consume time is : " + (System.currentTimeMillis() - startTime));

    startTime = System.currentTimeMillis();
    concatWithStringBuilder();
    System.out.println("StringBuilder class consume time is : " + (System.currentTimeMillis() - startTime));
  }

  private static void concatWithString()
  {
    String t = "Java";
    for (int i = 0; i < 70000; i++)
    {
      t = t + "Language";
    }
  }

  private static void concatWithStringBuffer()
  {
    StringBuffer t = new StringBuffer("Java");
    for (int i = 0; i < 70000; i++)
    {
      t.append("Language");
    }
  }

  private static void concatWithStringBuilder()
  {
    StringBuilder t = new StringBuilder("Java");
    for (int i = 0; i < 70000; i++)
    {
      t.append("Language");
    }
  }
}
