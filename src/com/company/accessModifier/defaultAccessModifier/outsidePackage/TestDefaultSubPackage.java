package com.company.accessModifier.defaultAccessModifier.outsidePackage;

    import com.company.accessModifier.defaultAccessModifier.A;

public class TestDefaultSubPackage
{
  public static void main(String[] args)
  {
    A instanceOfA = new A();
    // System.out.println(instanceOfA.age); // age has default access and can't access from out side the package
    // sub package can't access default method in parent package

    //A instanceOfA1 = new A("Jayani");//can't create instance outside the package using default keyword constructor

    B instanceOfB = new B();
    System.out.println(instanceOfB.age);//can access default data member from within the package
    instanceOfB.printDafault();//can access default method from within the package
  }
}
