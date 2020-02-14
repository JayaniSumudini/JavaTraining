package com.company.searchingPrograms;

public class LinearSearch
{
  public static void main(String[] args)
  {
    int[] array = new int[] { 5, 2, 9, 1, 7, 6, 3, 8, 4 };

    //find the place of 3
    for (int i = 0; i < array.length; i++)
    {
      if(array[i] == 3){
        System.out.println("place is :" + i+1);
        return;
      }
    }
    System.out.println("not found");
  }
}
