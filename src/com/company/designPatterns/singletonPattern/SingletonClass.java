package com.company.designPatterns.singletonPattern;

public class SingletonClass
{

  private static SingletonClass instance = new SingletonClass();
  private int count =0;
  private SingletonClass(){}

  public static SingletonClass getInstance()
  {
    return instance;
  }

  public void increment()
  {
    count++;
  }

  public int getCount()
  {
    return count;
  }
}
