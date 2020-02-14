package com.company.callingMethod;

public class CallByValue
{
  //when in call by value passing the values as a parameters.
  //but the changes done to the parameters inside the called method are not reflected to the calling method

  public static void main(String[] args)
  {
    int a = 10;
    int b = 20;
    System.out.println("Before call swap method, a = " + a + " ,b = " + b);
    swap(a, b);
    System.out.println("After call swap method, a = " + a + " ,b = " + b); //changes done to the parameters inside the called method not reflected to the calling method

  }

  public static void swap(int a, int b)
  {
    System.out.println("Before swap, a = " + a + " ,b = " + b);
    int c = a;
    a = b;
    b = c;
    System.out.println("After swap, a = " + a + " ,b = " + b);

  }
}
