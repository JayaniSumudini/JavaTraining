package com.company.designPatterns.abstractFactoryPattern;

public class RoundedShapeFactory extends AbstractFactory
{
  @Override
  Shape getShapeInstance(ShapeType shapeType)
  {
    switch (shapeType)
    {
      case Circle:
        return new RoundedCircle();
      case Rectangle:
        return new RoundedRectangle();
      default:
        return null;
    }
  }
}
