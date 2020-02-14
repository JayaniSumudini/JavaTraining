package com.company.inheritance;

class Animal
{
  void run()
  {
    System.out.println("Run");
  }
}

class Dog extends Animal
{
  void brak()
  {
    System.out.println("Barking...");
  }
}

public class Single
{
  public static void main(String[] args)
  {
    Dog dog = new Dog();
    dog.run();
    dog.brak();
  }
}
