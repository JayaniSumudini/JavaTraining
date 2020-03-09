package com.company.designPatterns.abstractFactoryPattern;

public class AbstractFactoryPatternDemo
{
  public static void main(String[] args)
  {

    FactoryProducer.getFactory(false).getShapeInstance(ShapeType.Circle).drawShape();
    FactoryProducer.getFactory(false).getShapeInstance(ShapeType.Rectangle).drawShape();

    FactoryProducer.getFactory(true).getShapeInstance(ShapeType.Circle).drawShape();
    FactoryProducer.getFactory(true).getShapeInstance(ShapeType.Rectangle).drawShape();
  }
}
