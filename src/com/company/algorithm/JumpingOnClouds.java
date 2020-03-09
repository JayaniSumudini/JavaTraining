package com.company.algorithm;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingOnClouds
{
  // Complete the jumpingOnClouds function below.
  static int jumpingOnClouds(int[] c)
  {
    int count = 0;
    int index = 0;
    while (index < c.length-2)
    {
      if (c[index+2] == 0)
      {
        count++;
        index+=2;
      }else if(c[index+1] == 0){
        count++;
        index++;
      }
    }
    return count;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException
  {
/*    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    int[] c = new int[n];

    String[] cItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < n; i++) {
      int cItem = Integer.parseInt(cItems[i]);
      c[i] = cItem;
    }*/
    int[] c = {0 ,0, 0, 1, 0 ,0 };

    int result = jumpingOnClouds(c);

    System.out.println(result);
    /*bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedWriter.close();

    scanner.close();*/
  }
}