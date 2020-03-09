package com.company.designPatterns.abstractFactoryPattern;

public abstract class AbstractFactory
{
  abstract Shape getShapeInstance(ShapeType shapeType);
}
