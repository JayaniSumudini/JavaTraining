package com.company.encapsulation;

public class TestEncapsulation
{
  //java class for test encapsulation class
  public static void main(String[] args)
  {
    SimpleEncapsulation simpleEncapsulation = new SimpleEncapsulation();
    simpleEncapsulation.setAge(10);
    System.out.println(simpleEncapsulation.getAge());

    ReadOnly readOnly = new ReadOnly();
    System.out.println(readOnly.getName());

    WriteOnly writeOnly = new WriteOnly();
    writeOnly.setName("Dileepa");
  }
}
