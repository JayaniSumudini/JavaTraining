package com.company.sortingPrograms;

import java.util.Arrays;

public class InsertionSort
{
  public static void main(String[] args)
  {
    int[] array = new int[] { 5, 2, 9, 1, 7, 6, 3, 8, 4 };

    for (int i = 1; i < array.length; i++)
    {
      int value = array[i];
      for (int j = i-1; j >=0; j--)
      {
        if (array[j] > value)
        {
          array[j+1] = array[j];
          array[j] = value;
        }
      }
    }
    System.out.println(Arrays.toString(array));
  }
}
