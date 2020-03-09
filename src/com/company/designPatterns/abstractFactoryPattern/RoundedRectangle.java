package com.company.designPatterns.abstractFactoryPattern;

public class RoundedRectangle implements Shape
{
  @Override
  public void drawShape()
  {
    System.out.println("Draw rounded rectangle");
  }
}