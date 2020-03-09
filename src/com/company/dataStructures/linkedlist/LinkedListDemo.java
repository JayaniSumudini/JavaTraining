package com.company.dataStructures.linkedlist;

import com.company.dataStructures.array.Array;

import java.util.Arrays;

public class LinkedListDemo
{
  public static void main(String[] args)
  {
/*    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.addFirst(10);
    linkedList.addFirst(20);
    linkedList.addFirst(30);
    linkedList.addFirst(40);
    linkedList.addFirst(50);
    linkedList.addFirst(60);

    System.out.println(linkedList);

    linkedList.removeLast();
    System.out.println(linkedList);

    linkedList.removeFirst();
    System.out.println(linkedList);*/


    //manual implementation
    LinkedList linkedList = new LinkedList();
    linkedList.addLast(10);
    linkedList.addLast(20);
    linkedList.addLast(30);
    linkedList.addLast(40);
    linkedList.addLast(50);
    linkedList.addLast(60);
    linkedList.addLast(70);
    linkedList.addLast(80);
    System.out.println(linkedList.hasLoop());

    linkedList.getLoop();
    System.out.println(linkedList.hasLoop());
    linkedList.getMiddle();
  }
}
