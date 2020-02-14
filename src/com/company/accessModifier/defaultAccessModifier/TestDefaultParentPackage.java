package com.company.accessModifier.defaultAccessModifier;

import com.company.accessModifier.defaultAccessModifier.outsidePackage.B;

public class TestDefaultParentPackage
{
  public static void main(String[] args)
  {
    B instanceOfB = new B();
    // System.out.println(instanceOfB.age); // age has default access and can't access from out side the package
    // parent package can't access default method in sub package

    A instanceOfA = new A();
    System.out.println(instanceOfA.age);//can access default data member from within the package
    instanceOfA.printDafault();//can access default method from within the package
  }
}
