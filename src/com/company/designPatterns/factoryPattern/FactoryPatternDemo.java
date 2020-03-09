package com.company.designPatterns.factoryPattern;

class FactoryPatternDemo
{
  public static void main(String[] args)
  {
    ShapeFactory shapeFactory = new ShapeFactory();

    shapeFactory.getShapeInstance(ShapeType.Circle).drawShape();
    shapeFactory.getShapeInstance(ShapeType.Rectangle).drawShape();
  }
}
