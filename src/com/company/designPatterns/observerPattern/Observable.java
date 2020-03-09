package com.company.designPatterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Observable
{
  private List<Observer> observerList = new ArrayList<>();

  void addObserver(Observer observer)
  {
    observerList.add(observer);
  }

  void removeObserver(Observer observer)
  {
    observerList.remove(observer);
  }

  void notifyObserver(int value)
  {
    observerList.forEach(observer -> observer.update(value));
  }
}
