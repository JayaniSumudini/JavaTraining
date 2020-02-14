package com.company.javaArrays;

import java.util.Arrays;

public class MultidimensionalArray
{
  //Syntax to Declare Multidimensional Array in Java
  /*
   dataType[][] arrayRefVar
   dataType [][]arrayRefVar
   dataType   []arrayRefVar[]
   dataType     arrayRefVar[][]
   */

  //Instantiate multi dimensional array in java
  /*
  dataType[][] arrayRefVar = new dataType[numberOFRows][NumberOfColumns]
  */

  //initialized multi dimensional array
  /*
  arrayRefVar[0][0] = 30;
  arrayRefVar[0][2] = 50;
  arrayRefVar[3][2] = 70;
  */

  public static void main(String[] args)
  {
    //addition of two multi dimensional array
    //first two arrays must have same rows and columns

    int[][] array1 = {
        { 1, 5, 7, 8, 9 },
        { 3, 5, 2, 7, 3 }
    };

    int[][] array2 = {
        { 2, 4, 7, 2, 1 },
        { 7, 4, 9, 0, 2 }
    };

    MultidimensionalArray multidimensionalArray = new MultidimensionalArray();
    int[][] result = multidimensionalArray.addition(array1, array2);

    for (int[] array : result)
    {
      for (int element : array)
      {
        System.out.print(element + " ");
      }
      System.out.println();
    }

    System.out.println(array1.getClass());
    System.out.println(array1.getClass().getName());

    //array cloning
    //when cloning multi dimensional array it used shallow copy
    // (copy main object only..not copied inner objects.when changed values in duplicate array inner object then original object value is also changed)
    int[][] array3 = array2.clone();
    System.out.println(array2.equals(array3));

    System.out.println();
    System.out.println(array2[0][0]);
    array3[0][0] = 10;
    System.out.println(array2[0][0]);//changed the original value also

    int[][] array4 = {
        { 1, 4, -2 },
        { 3, 5, -6 }
    };

    int[][] array5 = {
        { 5, 2, 8, -1 },
        { 3, 6, 4, 5 },
        { -2, 9, 7, -3 }
    };

    int[][] multiplicationResult = multidimensionalArray.multiplication(array4, array5);
    System.out.println(Arrays.toString(multiplicationResult[0]));
    System.out.println(Arrays.toString(multiplicationResult[1]));
  }

  private int[][] addition(int[][] array1, int[][] array2)
  {
    int[][] result = new int[array1.length][array1[0].length];
    for (int i = 0; i < result.length; i++)
    {
      for (int j = 0; j < result[i].length; j++)
      {
        result[i][j] = array1[i][j] + array2[i][j];
      }
    }
    return result;
  }

  private int[][] multiplication(int[][] array1, int[][] array2)
  {
    int r1,r2,c1,c2;
    r1 = array1.length;
    c1 = array1[0].length;

    r2 = array2.length;
    c2 = array2[0].length;

    int[][] result;
    if (c1 != r2)
    {
      System.out.println("Error!");
      result = new int[0][0];
    }
    else
    {
      result = new int[r1][c2];

      for (int i = 0; i < r1; i++)//2
      {
        for (int j = 0; j < c2; j++)//4
        {
          for(int k =0; k< c1;k++)
          {
            result[i][j] += array1[i][k]*array2[k][j];
          }
        }
      }
    }

    return result;
  }

}
