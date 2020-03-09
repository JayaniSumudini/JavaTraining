package com.company.dataStructures.hashMap;

import java.util.Arrays;
import java.util.LinkedList;

public class HashTable
{
  class Entry
  {
    private int key;

    private String value;

    Entry(int key, String value)
    {
      this.key = key;
      this.value = value;
    }

    public String getValue()
    {
      return this.value;
    }

    public int getKey()
    {
      return this.key;
    }

    @Override
    public String toString()
    {
      return this.key + " :" + this.value;
    }
  }

  private LinkedList[] linkedListArray;

  private int count = 0;

  private int tableSize = 10;

  HashTable()
  {
    this.linkedListArray = new LinkedList[tableSize];
  }

  void put(int key, String value)
  {
    int hash1 = getHash1(key, tableSize);
    if (linkedListArray[hash1] == null)
    {
      LinkedList linkedList = new LinkedList();
      linkedListArray[hash1] = linkedList;
    }
    linkedListArray[hash1].addLast(new Entry(key, value));
  }

  String get(int key)
  {
    int hash1 = getHash1(key, tableSize);
    LinkedList linkedList = linkedListArray[hash1];

    if (linkedList == null)
    {
      return null;
    }

    for (int i = 0; i < linkedList.size(); i++)
    {
      if (((Entry) linkedList.get(i)).getKey() == key)
      {
        return ((Entry) linkedList.get(i)).getValue();
      }
    }

    return null;

  }

  void remove(int key)
  {
    int hash1 = getHash1(key, tableSize);
    LinkedList linkedList = linkedListArray[hash1];

    if (linkedList == null)
    {
      return;
    }

    for (int i = 0; i < linkedList.size(); i++)
    {
      if (((Entry) linkedList.get(i)).getKey() == key)
      {
        linkedList.remove(linkedList.get(i));
      }
    }

  }

  @Override
  public String toString()
  {
    return Arrays.toString(linkedListArray);
  }

  private int getHash1(int key, int tableSize)
  {
    return key % tableSize;
  }
}
