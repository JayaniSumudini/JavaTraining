package com.company.accessModifier.defaultAccessModifier;

/**
 * if not use any access modifier it consider as a default access modifier by default
 * default access modifier is accessible within the package only
 */

public class A
{
  int age = 12;

  void printDafault()
  {
    System.out.println("inside class A");
  }

  public A()
  {

  }

  A(String value)
  {
    System.out.println("inside class A constructor: " + value);
  }
}
