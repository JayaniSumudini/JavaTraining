package com.company.aggregation.circleExample;

class Circle
{
  private final double PI = 3.14;

  private Operator operator;

  Circle(){
    operator = new Operator();
  }

  double area(int radius)
  {
    return PI * operator.square(radius);
  }
}
