package com.company.accessModifier.privateAccessModifier;

class A
{
  private int id = 10;//private modifier accessible only within the defined class

  private void print()
  {
    System.out.println("Private");
  }

  public static void main(String[] args)
  {
    A instanceOfA = new A();
    System.out.println("inside the class A :" + instanceOfA.id);
    instanceOfA.print();
  }
}

class B
{
  private B()
  {
    System.out.println("B class private constructor");
  }

  B(String value)
  {
    System.out.println("B class private constructor with values :" + value);
  }

}

//Note: A class cannot be private or protected except nested class.
class C
{

}

public class TestPrivate
{
  public static void main(String[] args)
  {
    A instanceOfA = new A();
    //instanceOfA.print();//print() has private access in class A.so we can't use print() outside the class A
    //System.out.println(instanceOfA.id); //id has private access in class A.so we can't use id outside the class A

//    B instanceOfB = new B(); //when create a private constructor in a class, we can't create instance of that class using that constructor
    B instanceOfB = new B("jayani");
  }
}
