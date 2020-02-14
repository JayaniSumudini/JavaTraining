package com.company.inheritance;

class Cat extends Animal
{
  void meow()
  {
    System.out.println("Meowing...");
  }
}

public class Hierarchical
{
  public static void main(String[] args)
  {
    Dog dog = new Dog();
    dog.run();
    dog.brak();

    Cat cat = new Cat();
    cat.run();
    cat.meow();
  }
}
