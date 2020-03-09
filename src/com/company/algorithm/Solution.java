// Efficient C++ program to count number
// of elements with values in given range.
import java.io.*;
import java.util.Arrays;

class GFG
{
  // function to find first index >= x
  static int lowerIndex(int arr[], int n, int x)
  {
    int l = 0, h = n - 1;
    while (l <= h)
    {
      int mid = (l + h) / 2;
      if (arr[mid] >= x)
        h = mid - 1;
      else
        l = mid + 1;
    }
    return l;
  }

  // function to find last index <= y
  static int upperIndex(int arr[], int n, int y)
  {
    int l = 0, h = n - 1;
    while (l <= h)
    {
      int mid = (l + h) / 2;
      if (arr[mid] <= y)
        l = mid + 1;
      else
        h = mid - 1;
    }
    return h;
  }

  // function to count elements within given range
  static int countInRange(int arr[], int n, int lowerValue, int upperValue)
  {
    // initialize result
    int count = 0;
    count = upperIndex(arr, n, upperValue) -
        lowerIndex(arr, n, lowerValue) + 1;
    return count;
  }

  // Driver function
  public static void main (String[] args)
  {
    int arr[] = { 1, 4, 4, 9, 10, 3 };
    int n = arr.length;

    // Preprocess array
    Arrays.sort(arr);

    // Answer queries
    int[] lowerRange = {1,9};
    int[] upperRange = {4,12};
    for(int i = 0; i< lowerRange.length; i++){
      System.out.println( countInRange(arr, n, lowerRange[i], upperRange[i]));
    }

  }
}

// This article is contributed by vt_m.
