package com.company.string;

public class MethodsInString
{
  public static void main(String[] args)
  {
    String value = "New String Value";

    //char charAt(int index) -> return the character at the particular index
    System.out.println(value.charAt(5));//t

    //int length() ->	returns string length
    System.out.println(value.length());//15 count from 1

    //static String format(String format, Object... args)	returns a formatted string by given format and arguments.
    String formatValue  = String.format("value is %s :", value);
    System.out.println(formatValue);
    System.out.println(String.format("value is %f :", 12.456));

    //String substring(int beginIndex) ->	returns substring for given begin index.
    System.out.println(value.substring(5));//"tring Value"

    //String substring(int beginIndex, int endIndex) -> returns substring for given begin index and end index.
    System.out.println(value.substring(6,12));

    //boolean contains(CharSequence s) -> returns true or false after matching the sequence of char value.
    System.out.println(value.contains("tr"));
  }
}
