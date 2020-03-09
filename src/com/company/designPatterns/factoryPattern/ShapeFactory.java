package com.company.designPatterns.factoryPattern;

class ShapeFactory
{
  public Shape getShapeInstance(ShapeType shapeType) throws IllegalArgumentException
  {
    switch (shapeType)
    {
      case Circle:
        return new Circle();
      case Rectangle:
        return new Rectangle();
      default:
        throw new IllegalArgumentException();
    }
  }
}
