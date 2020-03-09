package com.company.dataStructures.stack;

import java.util.HashMap;
import java.util.Stack;

public class StackDemo
{
  public static void main(String[] args)
  {
    System.out.println(toReverse("jayani"));
    System.out.println(isBalancedExpression("([2] + {3} *({[3]abd&(4)}))"));
  }

  static String toReverse(String value)
  {

    if (value == null)
      throw new IllegalArgumentException();

    Stack<Character> stack = new Stack();

    for (char character : value.toCharArray())
    {
      stack.push(character);
    }

    StringBuffer reverse = new StringBuffer();
    while (!stack.empty())
    {
      reverse = reverse.append(stack.pop().toString());
    }

    return reverse.toString();
  }

  static boolean isBalancedExpression(String expression)
  {
    HashMap<Character, Character> bracketMap = new HashMap<>();
    bracketMap.put(')', '(');
    bracketMap.put(']', '[');
    bracketMap.put('}', '{');

    Stack<Character> stack = new Stack<>();
    for (char value : expression.toCharArray())
    {
      if (bracketMap.containsValue(value))
      {
        stack.push(value);
      }
      else if(bracketMap.containsKey(value))
      {
        if(stack.isEmpty())
          return false;

        char key = stack.pop();
        if(key!= bracketMap.get(value))
          return false;
      }
    }

    return stack.isEmpty();
  }
}
