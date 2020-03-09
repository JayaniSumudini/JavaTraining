package com.company.dataStructures.queue;

public class ArrayQueue
{
  int[] queue;

  int head;

  int tail;

  ArrayQueue(int size)
  {
    this.queue = new int[size];
    this.head = 0;
    this.tail = -1;
  }

  void enqueue(int value)
  {
    if(isFull())
      throw new QueueOverflowException();

    queue[++tail] = value;

  }

  int dequeue()
  {
    if(isEmpty())
      throw new QueueOverflowException();

    int value = queue[head];
    queue[head++] = 0;
    return value;
  }

  int peek()
  {
    return queue[head];
  }

  boolean isEmpty()
  {
    return head > tail;
  }

  boolean isFull()
  {
    return (tail == queue.length - 1);
  }

  @Override
  public String toString()
  {
    if(isEmpty())
      return "[]";

    StringBuffer returnValue = new StringBuffer();

    for(int i = head; i<=tail ; i++)
    {
      returnValue.append(queue[i]).append(" ");
    }
    returnValue.append("\n");

    return returnValue.toString();
  }

  class QueueOverflowException extends RuntimeException
  {

  }
}
