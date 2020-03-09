package com.company.designPatterns.abstractFactoryPattern;

public class FactoryProducer
{
  static AbstractFactory getFactory(boolean isRounded)
  {
    return isRounded ? new RoundedShapeFactory() : new ShapeFactory();
  }
}
