package com.company.string;

public class TestStringClass
{
  /**
   * two ways of creating string using java.lang.String
   * 1) by literal
   * 2) by new keyword
   */

  public static void main(String[] args)
  {
    testLiteralAndNewKeyword();
  }

  /**
   * using String literal,
   * <p>
   * String literalString = "literal String";
   * <p>
   * string literal is created using double quotes
   * every time when create a literal, the JVM check the "String constant pool"
   * if the literal is exists in the pool, reference variable refer to it
   * it it's not available create a new literal in the string constant pool and return it's reference
   * <p>
   * string literal is used to optimized the memory
   * for each literal JVM stored only one copy in the String constant pool.it's called "interning a string"
   * interning string provide memory optimization and speed string comparison
   * <p>
   * using new keyword,
   * String usingNewKeyword = new String("Welcome");
   * <p>
   * if create a string object using new keyword then new instance is created in heap memory.t
   * then JVM check it's literal is exists in constant pool.if yes point the new instance value to it..
   * if not create a literal and point new instance value to it.
   */
  private static void testLiteralAndNewKeyword()
  {
    String S1 = "welcome";//valueId=612
    String S2 = "Hello";//valueId=613
    String S3 = "welcome";//valueId=612

    String S4 = new String("Sri lanka");//valueId=614
    String S5 = new String("welcome");//valueId=612
    String S6 = new String("Hello");//valueId=613
    String S7 = new String("Hello");//valueId=613

    System.out.println(S1 == S3); //true
    System.out.println(S2 == S6); //false
    System.out.println(S2.equals(S6)); //true
    System.out.println(S3 == S5); //false
    System.out.println(S6 == S7); //false
  }
}
