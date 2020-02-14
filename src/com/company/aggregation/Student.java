package com.company.aggregation;

public class Student
{
  public int getAge()
  {
    return 10;
  }
}

class Nimal extends Student
{
  /*private int getAge()
  {
    return 12;
  }*/

  public static void main(String[] args)
  {
    Nimal nimal = new Nimal();
    System.out.println(nimal.getAge());
  }
}