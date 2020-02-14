package com.company.overriding;

class Human
{
  void eat(String value)
  {
    System.out.println("Human can eat!!!" + value);
  }

  Human get()
  {
    System.out.println("Inside Human");
    return this;
  }
}

class Student extends Human
{
  @Override
  void eat(String value)
  {
    System.out.println("Student can eat!!!");
    System.out.println(value);
  }

  @Override
  Student get()
  {
    System.out.println("Inside Human");
    return this;
  }
}

public class Print
{
  public static void main(String[] args)
  {
    Student student = new Student();
    student.eat("daily");
  }
}