package com.company.instanceInitializerBlock;

class Human
{
  Human()
  {
    //compiler add instance initializer block
    System.out.println("Human constructor");
  }

  {
    System.out.println("Human Instance Initializer Block");
  }
}

class Student extends Human
{
  Student()//no parameter constructor
  {
    //compiler add super();
    //compiler add instance intializer block
    System.out.println("Student Constructor");
  }

  Student(String value)//parameterized constructor
  {
    //compiler add super();
    //compiler add instance intializer block
    System.out.println("Student Constructor " + value);
  }

  {
    System.out.println("Student Instance Initializer Block");
  }

  void print()
  {
    System.out.println("Student print method");
  }
}

public class InitializerBlockTest
{
  public static void main(String[] args)
  {
    Student student1 = new Student();
    student1.print();

    Student student2 = new Student("Jayani");

  }
}

//output
/*
Human Instance Initializer Block
Human constructor
Student Instance Initializer Block
Student Constructor
Student print method
Human Instance Initializer Block
Human constructor
Student Instance Initializer Block
Student Constructor Jayani
* */
