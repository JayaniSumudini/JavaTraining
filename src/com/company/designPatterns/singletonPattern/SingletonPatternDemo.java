package com.company.designPatterns.singletonPattern;

public class SingletonPatternDemo
{
  public static void main(String[] args)
  {
    SingletonClass singletonClass1 = SingletonClass.getInstance();
    singletonClass1.increment();
    System.out.println(singletonClass1.getCount());

/*    SingletonClass singletonClass2 = SingletonClass.getInstance(); //same instance of singletonClass1
    singletonClass2.increment();
    System.out.println(singletonClass2.getCount());*/
  }
}
