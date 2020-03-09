package com.company.dataStructures.queue;

import java.util.Queue;
import java.util.Stack;

public class QueueDemo
{
  public static void main(String[] args)
  {
 /*   Queue<Integer> queue = new ArrayDeque<>();
    queue.add(10);
    queue.add(20);
    queue.add(30);
    queue.add(40);
    System.out.println(queue);
    reverse(queue);
    System.out.println(queue);*/


   /* ArrayQueue arrayQueue = new ArrayQueue(5);

    System.out.println(arrayQueue.isEmpty());

    arrayQueue.enqueue(10);
    arrayQueue.enqueue(20);
    arrayQueue.enqueue(30);
    arrayQueue.enqueue(40);
    System.out.print(arrayQueue);

    arrayQueue.dequeue();
    System.out.print(arrayQueue);

    System.out.println(arrayQueue.peek());
    System.out.print(arrayQueue);

    System.out.println(arrayQueue.isEmpty());

    arrayQueue.dequeue();
    arrayQueue.dequeue();
    arrayQueue.dequeue();
    System.out.print(arrayQueue);

    System.out.println(arrayQueue.isEmpty());

    System.out.println(arrayQueue.isFull());

    arrayQueue.enqueue(10);
    System.out.print(arrayQueue);
    System.out.println(arrayQueue.isFull());*/

    QueueWithTwoStack queueWithTwoStack = new QueueWithTwoStack();
    queueWithTwoStack.enqueue(10);
    queueWithTwoStack.enqueue(20);
    queueWithTwoStack.enqueue(30);

    System.out.println(queueWithTwoStack.dequeue());
    System.out.println(queueWithTwoStack.dequeue());

    queueWithTwoStack.enqueue(40);
    queueWithTwoStack.enqueue(50);
    System.out.println(queueWithTwoStack.dequeue());

  }

  public static void reverse(Queue<Integer> queue)
  {
    Stack<Integer> stack = new Stack<>();

    while (!queue.isEmpty())
    {
      stack.push(queue.remove());
    }

    while (!stack.isEmpty())
    {
      queue.add(stack.pop());
    }
  }
}
