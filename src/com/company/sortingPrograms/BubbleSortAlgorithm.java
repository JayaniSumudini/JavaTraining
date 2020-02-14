package com.company.sortingPrograms;

import java.util.Arrays;

public class BubbleSortAlgorithm
{
  /*
   * algorithm in which each pair of adjacent elements is compared
   * and the elements are swapped if they are not in order.
   * this process continue equal times to the array length.
   * */

  public static void main(String[] args)
  {
    int[] array = new int[] { 5, 2, 9, 1, 7, 6, 3, 8, 4 };

    for (int i = 0; i < array.length; i++)
    {
      for (int j = 1; j < array.length - i; j++)
      {
        if (array[j - 1] > array[j])
        {
          swap(array, j, j - 1);
        }
      }
    }

    System.out.println(Arrays.toString(array));
  }

  private static void swap(int[] array, int i, int k)
  {
    int temp = array[i];
    array[i] = array[k];
    array[k] = temp;
  }
}
