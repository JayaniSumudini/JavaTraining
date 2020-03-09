package com.company.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestSet
{
  public static void main(String[] args)
  {
    Set<String> set1 = new HashSet<>();
    set1.addAll(Arrays.asList("b", "a", "c", "d"));

    Set<String> set2 = new HashSet<>();
    set2.addAll(Arrays.asList("e", "f", "a", "c"));

    set1.removeAll(set2);
    System.out.println(set1);
  }
}
