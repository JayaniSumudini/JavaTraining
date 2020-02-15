package com.company.finalKeyword;

/**
 * If you make any variable as final, you cannot change the value of final variable(It will be constant).once assigned value can't be change
 * If you make any class as final, you cannot extend it.
 * final method is inherited but you cannot override it
 * blank final variable, need to initialized in constructor
 * static blank final variable can be initialized inside the static block only.
 * If you declare any parameter as final, you cannot change the value of it inside the
 */
public class TestFinalKeyword
{
  final String name = "Jayani";

  final int ID_NO;//blank final variable, need to initialized in constructor

  static final int EMPLOYEE_NO; // static blank final variables.can be initialized inside the static block only

  TestFinalKeyword()
  {
    ID_NO = 12;
  }

  private void printValue(final String value)
  {
    //value = "Dileepa"; can not assign a value to final variable
  }

  public static void main(String[] args)
  {
    TestFinalKeyword testFinalKeyword = new TestFinalKeyword();
    // testFinalKeyword.name = "Dileepa"; once initialized can not assign the value to final variable
    System.out.println(testFinalKeyword.ID_NO);
  }

  static
  {
    EMPLOYEE_NO = 124;// static blank final variable can be initialized inside the static block only
  }
}

final class Human
{
  int age = 12;

  void print()
  {
    System.out.println(age);
  }
}

class Student //extends Human - can not inherits from final
{
  /*final*/ void print() //final method can't override
  {
    System.out.println("in Student class");
  }
}

class PrimaryStudent extends Student
{
  @Override
  void print() //final method can't override
  {
    System.out.println("in PrimaryStudent class");
  }
}