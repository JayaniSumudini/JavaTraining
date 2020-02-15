package com.company.string;

/**
 * when create a strng using literal is called interning string
 * it saved memory storage and improved comparison speed
 */
public class InterningString
{
  public static void main(String[] args)
  {
    String apple1 = "Welcome";
    String apple2 = "Welcome";
    String apple3 = new String("Welcome");

    System.out.println(apple1.equals(apple2));//true and comparision is fast -> literal & literal comparision
    System.out.println(
        apple1.equals(apple3));//true and comparison get some time -> literal & object(value of the object) comparison

/**    for get the literal from the pool which is equals to the String object value ,we used intern() method
 if equal literal is exists in the pool intern() return it's reference. other wise create the literal in the pool and return it's reference.*/

    System.out.println(apple1 == apple3);//false
    String internOfApple3 = apple3.intern();
    System.out.println(apple1 == internOfApple3);//true
  }
}
