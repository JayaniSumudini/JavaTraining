package com.company.overriding;

public class Cat extends Animal
{
  public static void callStaticMethod()
  {
    System.out.println("inside Cat class static method");
  }

  @Override
  public void callInstanceMethod()
  {
    System.out.println("Cat class Instance method");
  }

  public static void main(String[] args)
  {
    Cat cat = new Cat();
    Animal newCat = cat;
    cat.callInstanceMethod();
    newCat.callInstanceMethod();
    Animal.callStaticMethod();
    Cat.callStaticMethod();
  }
}
