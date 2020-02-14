package com.company.accessModifier.protectedAccessModifier.outsidePackage;

import com.company.accessModifier.protectedAccessModifier.A;

class Subclass extends A
{
  public static void main(String[] args)
  {
    Subclass instanceOfSubclass = new Subclass();
    System.out.println(instanceOfSubclass.age);
    instanceOfSubclass.print();
  }
}