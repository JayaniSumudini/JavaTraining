package com.company.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestQueue
{
  public static void main(String[] args)
  {
    Queue<String> queue = new ArrayDeque<>();
    queue.add("a");
    queue.add("b");
    queue.add("c");

    queue.offer("d");
    String peek = queue.remove();
    System.out.println(peek);
    System.out.println(queue);


  }
}
