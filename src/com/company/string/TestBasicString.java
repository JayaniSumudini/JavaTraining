package com.company.string;

import java.util.Arrays;

/**
 * in Java, string is an object that represents a sequence of characters
 * String class implements Serializable, Comparable and CharSequence interfaces
 * charSequence interface represent the sequence of character.
 * String,StringBuffer and StringBuilder classes implements this charSequence interface.so we can creat a string using String,StringBuffer and StringBuilder classes
 * String is immutable.it's mean once created can't be changed it..when we change the string it creates a new instance and old reference is refer to that new instance
 * for mutable strings we can use StringBuffer and StringBuilder classes
 */

public class TestBasicString
{
  public static void main(String[] args)
  {
    char[] characterArray = { 'J', 'a', 'v', 'a', ' ', 'a', 'r', 'r', 'a', 'y' };
    String stingValue = new String(characterArray);//string is a object of character array

    String stingValue1 = "Java array";

    System.out.println(Arrays.toString(characterArray));
    System.out.println(stingValue);
    System.out.println(stingValue.equals(stingValue1));
  }
}
