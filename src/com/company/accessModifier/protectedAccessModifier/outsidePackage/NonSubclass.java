package com.company.accessModifier.protectedAccessModifier.outsidePackage;

public class NonSubclass
{
  public static void main(String[] args)
  {
    NonSubclass instanceOfNonSubclass = new NonSubclass();
    //System.out.println(instanceOfNonSubclass.age);//protected can't accessible outside the package
  }
}
