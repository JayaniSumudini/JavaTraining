package com.company.designPatterns.observerPattern;

public class Chart implements Observer
{
  @Override
  public void update(int value)
  {
    System.out.println("value in chart = " + value);
  }
}
