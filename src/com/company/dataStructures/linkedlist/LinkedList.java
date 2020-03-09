package com.company.dataStructures.linkedlist;

public class LinkedList
{
  private class Node
  {
    private int value;

    private Node next;

    Node(int value, Node next)
    {
      this.value = value;
      this.next = next;
    }
  }

  private Node first;

  private Node last;

  private int size;

  void addFirst(int value)
  {
    Node newNode = new Node(value, first);
    this.first = newNode;
    if (this.last == null)
    {
      this.last = newNode;
    }
    size++;
  }

  void addLast(int value)
  {
    Node newNode = new Node(value, null);
    if (this.last == null)
    {
      this.first = newNode;
    }
    else
    {
      this.last.next = newNode;
    }
    this.last = newNode;
    size++;
  }

  void deleteFirst()
  {
    if (first == last)
    {
      first = last = null;
      size--;
      return;
    }
    Node head = this.first.next;
    this.first.next = null;
    this.first = head;
    size--;
  }

  void deleteLast()
  {
    if (first == last)
    {
      first = last = null;
      size--;
      return;
    }

    Node point = first;
    while (point.next != last)
    {
      point = point.next;
    }
    point.next = null;
    last = point;
    size--;
  }

  boolean contains(int value)
  {
    return indexOf(value) != -1;
  }

  int indexOf(int value)
  {
    Node point = first;
    int count = 0;
    while (point != null)
    {
      if (point.value == value)
      {
        return count++;
      }
      point = point.next;
      count++;
    }
    return -1;
  }

  int getSize()
  {
    return size;
  }

  int[] toArray()
  {
    int[] array = new int[size];
    Node current = first;
    int count = 0;

    while (current != null)
    {
      array[count] = current.value;
      current = current.next;
      count++;
    }
    return array;
  }

  void reverse()
  {
    /*Node current = first;
    Node previous = first;
    while (current != null)
    {
      Node newNode;
      if (current == first)
      {
        newNode = new Node(current.value, null);
        last = newNode;
      }
      else
      {
        newNode = new Node(current.value, previous);
      }
      previous = newNode;
      current = current.next;
    }

    first = previous;*/

    //efficient method
    Node previous = first;
    Node current;
    if (first != null)
    {
      current = first.next;
    }
    else
    {
      return;
    }

    while (current != null)
    {
      Node next = current.next;

      current.next = previous;

      previous = current;
      current = next;
    }

    last = first;
    last.next = null;
    first = previous;
  }

  void findKthNodeFromEnd(int k)
  {
    int count = 0;
    Node first = this.first;
    Node second = first;

    while (count < k - 1)
    {
      second = second.next;
      count++;
    }

    while (second != last)
    {
      second = second.next;
      first = first.next;
    }
    System.out.println(first.value);
  }

  void getMiddle()
  {
    Node first = this.first;
    Node second = this.first;

    while (second != last)
    {
      second = second.next.next;
      if (second == null)
      {
        System.out.println(first.value + "," + first.next.value);
        return;
      }
      first = first.next;

    }

    System.out.println(first.value);
  }

  boolean hasLoop()
  {
    Node slow = first;
    Node fast = first;
    while (fast != null && fast.next != null)
    {
      fast = fast.next.next;
      slow = slow.next;
      if (fast == slow)
      {
        return true;
      }
    }
    return false;
  }

  void getLoop()
  {
    Node five = new Node(50, null);
    Node four = new Node(40, five);
    Node three = new Node(30, four);
    Node two = new Node(20, three);
    Node one = new Node(10, two);

    three.next = one;
    first = one;
    last = five;
  }
}
