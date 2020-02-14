package com.company.downCasting;

class Animal
{
}

class Dog extends Animal
{
  void eat()
  {
    System.out.println("Dog eating..");
  }
}

class Cat extends Animal
{
  void eat()
  {
    System.out.println("Cat eating..");
  }
}

public class DownCastingWithInstanceOf
{
  void getDetails(Animal animal)
  {
    if (animal instanceof Dog)
    {
      Dog dog = (Dog) animal;//Down casting safe with instanceof operator
      dog.eat();
    }
    else if (animal instanceof Cat)
    {
      Cat cat = (Cat) animal;//Downcasting safe with instanceof operator
      cat.eat();
    }
  }

  public static void main(String[] args)
  {
    DownCastingWithInstanceOf downCastingWithInstanceOf = new DownCastingWithInstanceOf();

    Animal animal = new Dog();
    downCastingWithInstanceOf.getDetails(animal);

    animal = new Cat();
    downCastingWithInstanceOf.getDetails(animal);

    animal = new Animal();
    downCastingWithInstanceOf.getDetails(animal);
  }
}
