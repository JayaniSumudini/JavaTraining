package com.company.sortingPrograms;

import java.util.Arrays;

public class SelectionSort
{
  /*
  * The smallest element is selected from the unsorted array and swapped with the leftmost element,
   * and that element becomes a part of the sorted array.
   * This process continues moving unsorted array boundary from one element to the right.

    Algorithm:-
      1)  Set MIN to location 0
      2)  Search the minimum element in the list
      3)  Swap with value at location MIN
      4)  Increment MIN to point to next element
      5)  Repeat until the list is sorted

      */

  public static void main(String[] args)
  {
    int[] array = new int[] { 5, 2, 9, 1, 7, 6, 3, 8, 4 };

    for (int i = 0; i < array.length; i++)
    {
      int min = i;
      for (int j = i; j < array.length; j++)
      {
        if (array[j] < array[min])
        {
          min = j;
        }
      }
      swap(array, i, min);
    }
    System.out.println(Arrays.toString(array));
  }

  private static void swap(int[] array, int i, int min)
  {
    int temp = array[i];
    array[i] = array[min];
    array[min] = temp;
  }
}
