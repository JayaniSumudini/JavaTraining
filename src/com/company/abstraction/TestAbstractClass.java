package com.company.abstraction;
//java abstraction is hiding the implementation details and showing the functionality to the user

//abstract class must needs to declared with abstract keyword
//abstract class is a mixture of interface and full OOP class.so it's abstraction can vary with 0-100%
//therefore it can contains abstract methods and non abstract method
//and can have constructors, static methods, final methods
//abstract class must need to extended and it's abstract methods implemented.

abstract class Animal
{//Animal is a abstract class declared with abstract keyword

  abstract void eat(String value);//abstract method declared with abstract keyword and without method body

  Animal()
  {// abstract class can have constructor
    System.out.println("Animal is created");
  }

  void run()
  {//abstract class can have non-abstract methods
    System.out.println("Animal running..");
  }
}

class Dog extends Animal
{
  void eat(String value)//abstract method implementation must need to provide in first non abstract (concrete )class
  {
    System.out.println("Dog is eating " + value);
  }
}

class TestAbstractClass
{

  public static void main(String[] args)
  {
    Animal animal = new Dog();
    animal.eat("meat");
    animal.run();
  }
}


/*
out put:
Animal is created
Dog is eating meat
Animal running..
*/

interface A
{
  void a();

  void b();

  void c();

  void d();
}

abstract class B implements A
{
  public void a()
  {
    System.out.println("a");
  }
}

class C extends B
{
  public void b()
  {
    System.out.println("b");
  }

  public void c()
  {
    System.out.println("c");
  }

  public void d()
  {
    System.out.println("d");
  }
}

class Test
{
  public static void main(String[] args)
  {
    C C_class = new C();

//    B B_class = new B();//can not create instance of abstract class,can not be instantiated

    C_class.a();
    C_class.b();
    C_class.c();
    C_class.d();
  }
}