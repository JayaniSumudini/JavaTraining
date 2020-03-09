package com.company.dataStructures.hashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapDemo
{
  public static void main(String[] args)
  {
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "jayani");
    map.put(2, "sumudini");
    map.put(3, "dileepa");
    map.put(3, "chandima");
    map.put(null, "manusha");
    map.put(null, "manusha1");
    map.put(4, null);
    map.put(5, null);

    System.out.println(map);

    map.forEach((key, value) -> System.out.println(key + ", " + value));

    for (String element : map.values())
    {
      System.out.println(element);
    }

    String word = "a green apple";
    System.out.println(findFirstNonRepeatedCharacter(word));
    System.out.println(findFirstRepeatedCharacter(word));


    //hashtable demo
    HashTable hashTable = new HashTable();
    hashTable.put(10,"jayani");
    hashTable.put(20,"sumudi");
    hashTable.put(6,"dileepa");
    hashTable.put(4,"chandima");
    hashTable.put(3,"matin");
    System.out.println(hashTable);

    System.out.println(hashTable.get(20));

    hashTable.remove(10);
    System.out.println(hashTable);

  }

  static char findFirstNonRepeatedCharacter(String string)
  {
    Map<Character, Integer> map = new HashMap<>();

    char[] characterArray = string.toCharArray();
    for (char character : characterArray)
    {
      int count = map.containsKey(character) ? map.get(character) : 0;
      map.put(character, (count + 1));
    }

    for (char character : characterArray)
    {
      if (map.get(character) == 1)
      {
        return character;
      }
    }

    return Character.MIN_VALUE;

  }

  static char findFirstRepeatedCharacter(String string)
  {
    char[] characterArray = string.toCharArray();
    Set<Character> set = new HashSet<>();

    for (char character : characterArray)
    {
      if (set.contains(character))
      {
        return character;
      }

      set.add(character);

    }

    return Character.MIN_VALUE;
  }
}
