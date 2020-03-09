package com.company.designPatterns.abstractFactoryPattern;

public class ShapeFactory extends AbstractFactory
{
  @Override
  Shape getShapeInstance(ShapeType shapeType)
  {
    switch (shapeType)
    {
      case Circle:
        return new Circle();
      case Rectangle:
        return new Rectangle();
      default:
        return null;
    }
  }
}
