package com.company.string;

public class TestImmutableString
{
  public static void main(String[] args)
  {
    String s1 = "Jayani";//create new literal "Jayani" in the pool
    s1.concat("Sumudini");//concat() method appends the string at the end. create new String "JayaniSumudini" in the String constant pool
    System.out.println(s1);
    //not change s1.because string objects are immutable. so result is Jayani.
    // and create new String "JayaniSumudini" in the String constant pool

    String s2 = "Jayani";
    System.out.println(s1 == s2);//comparing by reference

    String s3 = s1.concat("Sumudini"); // s3 pointed to literal "JayaniSumudini"in the pool
    System.out.println(s2 == s3);//comparing by reference, false

    s2 = s2.concat("Sumudini"); //now point to same literal in s3
    System.out.println(s1 == s2);//comparing by reference, false
    System.out.println(s2 == s3);//comparing by reference, false

  }
}
