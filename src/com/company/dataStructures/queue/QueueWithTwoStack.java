package com.company.dataStructures.queue;

import java.util.Stack;

public class QueueWithTwoStack
{
  private Stack<Integer> stack1 = new Stack<>();
  private Stack<Integer> stack2 = new Stack<>();

  void enqueue(int value)
  {
    stack1.push(value);
  }

  int dequeue()
  {
    if(isEmpty())
      throw new IllegalStateException();

    moveStack1ToStack2();

    return stack2.pop();
  }

  boolean isEmpty()
  {
    return (stack1.isEmpty() && stack2.isEmpty());
  }

  int peek()
  {
    if(isEmpty())
      throw new IllegalStateException();

    moveStack1ToStack2();

    return stack2.peek();
  }

  private void moveStack1ToStack2()
  {
    if (stack2.isEmpty())
    {
      while (!stack1.isEmpty())
      {
        stack2.push(stack1.pop());
      }
    }
  }

  @Override
  public String toString()
  {
    StringBuffer stringBuffer = new StringBuffer();
    for (int value:stack1)
    {
      stringBuffer.append(value).append(" ");
    }

    return stringBuffer.toString();
  }
}
