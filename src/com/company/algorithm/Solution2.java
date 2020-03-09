package com.company.algorithm;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result
{

  /*
   * Complete the 'findNumber' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts following parameters:
   *  1. INTEGER_ARRAY arr
   *  2. INTEGER k
   */

  public static String findNumber(List<Integer> arr, int k)
  {
    // Write your code here
    if(arr.size()==0)
    {
      return "Wrong Answer";
    }
    return (BinarySearch(arr, 0, arr.size()-1, k) == -1) ? "NO" : "YES";

  }

  private static int BinarySearch(List<Integer> array, int start, int end, int value)
  {
    int middelIndex = (start + end) / 2;
    if (start > end)
    {
      return -1;
    }
    if (array.get(middelIndex) == value)
    {
      return middelIndex;
    }
    else if (value < array.get(middelIndex))
    {
      return BinarySearch(array, start, middelIndex - 1, value);
    }
    else
    {
      return BinarySearch(array, middelIndex + 1, end, value);
    }
  }
}

public class Solution2
{
  public static void main(String[] args) throws IOException
  {
/*    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
      try
      {
        return bufferedReader.readLine().replaceAll("\\s+$", "");
      }
      catch (IOException ex)
      {
        throw new RuntimeException(ex);
      }
    })
        .map(String::trim)
        .map(Integer::parseInt)
        .collect(toList());

    int k = Integer.parseInt(bufferedReader.readLine().trim());*/
Integer[] array = {2,3,1};
List<Integer> arr = new ArrayList<>();
    String result = Result.findNumber(arr, 5);
    System.out.println(result);
/*    bufferedWriter.write(result);
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();*/
  }
}
