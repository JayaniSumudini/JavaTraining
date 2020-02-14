package com.company.superKeyword;

class Animal
{
  String color = "white";

  Animal()
  {//noparameter constructor in Animal class
    System.out.println("animal constructor");
  }

  void print()
  {
    System.out.println("\ncall animal class method");
    System.out.println(color);
    System.out.println(this.color);
  }
}

class Dog extends Animal
{
  String color = "Black";

  Dog(String name)
  {//parameterized constructor in Dog class
    this();//here we have this(). then java compiler doesn't add a super()
    //one constructor can not have both super() and this()
    //if have super() or this(), it's must be the first argument of the method
    System.out.println("dog constructor " + name + '\n');
  }

  Dog()
  {//noparameter constructor in Dog class
    //if there is no any super() or this() in constructor ,java compiler automatically add the super()
    System.out.println("dog constructor\n");
  }

  @Override
  void print()
  {
    System.out.println("call dog class method");
    System.out.println(color);
    System.out.println(this.color);
    System.out.println(super.color);//super can be used to refer parent class variable
    super.print();//super can be used to call parent class method
  }
}

public class TestSuperKeyword
{
  public static void main(String[] args)
  {
    System.out.println("start here..");
    Dog dog = new Dog("dog name");
    dog.print();
  }
}
