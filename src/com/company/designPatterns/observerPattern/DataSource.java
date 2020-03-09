package com.company.designPatterns.observerPattern;

public class DataSource extends Observable
{
  private int value;

  void setValue(int value)
  {
    this.value = value;
    notifyObserver(value);
  }

  int getValue()
  {
    return value;
  }


}
