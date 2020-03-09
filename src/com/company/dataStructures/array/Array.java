package com.company.dataStructures.array;

import java.util.Arrays;

public class Array
{

  private int[] array;

  private int index = 0;

  Array(int length)
  {
    this.array = new int[length];
  }

  void insert(int value)
  {
    if (index == array.length)
    {
      int[] newIntArray = new int[array.length + 1];
      copyArray(newIntArray, array);
      this.array = newIntArray;
    }

    this.array[index++] = value;
  }

  void print()
  {
    for(int i = 0 ; i < index ;i++){
      System.out.println(array[i]);
    }
  }

  void removeAt(int count)
  {
    for (int i = count; i < this.index-1; i++)
    {
      array[i] = array[i+1];
    }
    this.index--;
  }

  int indexOf(int value)
  {
    for(int i = 0 ; i < array.length ;i++)
    {
      if(array[i] == value)
        return i;
    }
    return -1;
  }

  private void copyArray(int[] newArray, int[] oldArray)
  {
    for (int i = 0; i < oldArray.length; i++)
    {
      newArray[i] = oldArray[i];
    }
  }
}
