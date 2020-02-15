package com.company.javaArrays;

import java.util.Arrays;

public class TestArray
{
  public static void main(String[] args)
  {
    /*Single Dimension Array
    * Syntax to Declare an Array in Java

      array declaration
      dataType[] arr; (or)
      dataType []arr; (or)
      dataType arr[];

      array instantiation
      arr = new datatype[size];

      array initialization
      arr[0] = 3;
      arr[1] = 5;
    */

    //array declaration
    int[] marks;
    int[] patientCount;
    int distance[];

    //array instantiation
    /*creating a new instance(object) of that class is instantiation*/
    marks = new int[4];
    patientCount = new int[10];
    distance = new int[5];

    System.out.println(marks.length);
    System.out.println(patientCount.length);
    System.out.println(distance.length);

    //array initialization
    marks[0] = 23;
    marks[1] = 45;
    marks[2] = 52;
    marks[3] = 67;

    // print array elements using util.Arrays class toString() method
    System.out.println(Arrays.toString(marks));

    //print an array using for loop
    for (int i = 0; i < marks.length; i++)
    {
      System.out.print(marks[i] + " ");
    }
    System.out.println("\n");

    //print array using for-each loop
    for (int mark : marks)
    {
      System.out.print(mark + " ");
    }
    System.out.println("\n");

    //we can declaration , instantiation and initialization java array together
    int[] source = { 11, 12, 13, 14, 15 };

    System.out.println(Arrays.toString(source));
    System.out.println(source.getClass());
    System.out.println(source.getClass().getName());

    //Copy an array
    System.out.println();
    int[] destination = new int[4];//destination
    //System.arraycopy(sourceArray,startIndexOfSource,destinationArray,startIndexOfDestination,length);
    System.arraycopy(source, 3, destination, 2, 2);
    System.out.println(Arrays.toString(destination));
    System.out.println(destination.equals(source));
    System.out.println();

    int[] destination2 = new int[5];
    System.arraycopy(source, 0, destination2, 0, 5);
    System.out.println(Arrays.toString(destination2));
    System.out.println(destination2.equals(source));

    //Cloning an Array
    //cloning purpose we used cloneable interface
    //when cloning single dimension array it used deep copy(copy all elements)
    System.out.println();
    int[] cloningArray = source.clone();
    System.out.println(source.equals(cloningArray));
  }
}
