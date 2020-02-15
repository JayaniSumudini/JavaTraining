package com.company.abstraction;

/**
 * interface is a blueprint of class
 * interface can have static constance data members and abstract methods
 * compiler added public abstract keyword into methods by defaults
 * compiler added public static final keywords into data member by default
 * interface is 100% abstract
 * can not create objects using interface; interface is not instantiated.
 * Since Java 8, we can have default and static methods in an interface.
 * Since Java 9, we can have private methods in an interface.
 * using interface we can support multiple inheritance
 * <p>
 * Since Java 8, we can have method body in interface.But we need to make it default method.
 * An interface which has no member is known as a marker or tagged interface, for example, Serializable, Cloneable, Remote
 * An interface can have another interface which is known as a nested interface
 */

interface Printable1
{
  int PRINTER_ID = 123;//compiler added public static private keywords by default

  void print(); // method not have method body. compiler added public abstract keywords by default

  //interface can have default method after java 8
  default void design()
  {
    System.out.println("Designing..");
  }

  //interface can have static methods after java 9
  static void clour()
  {
    System.out.println("Coloring..");
  }
}

interface Printable2
{
  //when interface with no member it's called tagged interface
}

interface Printable3
    extends Printable1, Printable2 // interface can extends another interface, and can support multiple inheritance
{
  void cutting();

  interface Printable4 //interface can have another interface called nexted interface
  {
    void read();
  }
}

public class TestInterface implements Printable1, Printable2 //class can implements multiple interfaces
{
  public void print()
  {

  }
}
