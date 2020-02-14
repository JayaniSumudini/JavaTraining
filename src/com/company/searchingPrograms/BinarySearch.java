package com.company.searchingPrograms;

public class BinarySearch
{
  public static void main(String[] args)
  {
    int[] sortedArray = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
    System.out.println(BinarySearch(sortedArray, 0, sortedArray.length-1, 60));
  }

  private static int BinarySearch(int[] array, int start, int end, int value)
  {
    int middelIndex = (start + end) / 2;
    if (start > end)
    {
      return -1;
    }
    if (array[middelIndex] == value)
    {
      return middelIndex;
    }
    else if (value < array[middelIndex])
    {
      return BinarySearch(array, start, middelIndex - 1, value);
    }
    else
    {
      return BinarySearch(array, middelIndex + 1, end, value);
    }
  }

}
