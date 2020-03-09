package com.company.designPatterns.observerPattern;

public class SpreadSheet implements Observer
{
  @Override
  public void update(int value)
  {
    System.out.println("value in spread sheet = " + value);
  }
}
