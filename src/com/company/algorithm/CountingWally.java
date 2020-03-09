package com.company.algorithm;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingWally
{

  // Complete the countingValleys function below.
  static int countingValleys(int n, String s)
  {
    int height = 0;
    int count = 0;
    for (char character : s.toCharArray())
    {
      if (character == 'U')
      {
        if (height == -1)
        {
          count++;
        }
        height++;
      }
      else if (character == 'D')
      {
        height--;
      }
    }
    return count;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException
  {
   /* BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    String s = scanner.nextLine();*/

    int n = 8;
    String s = "UDDDUDUU";

    int result = countingValleys(n, s);

    /*bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedWriter.close();

    scanner.close();*/
    System.out.println(countingValleys(n,s));
  }
}
