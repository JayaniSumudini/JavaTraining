package com.company.javaCopy;

/**
 * object cloning is a mechanism of creat extract copy of object
 * clone?() method of object class is used to clone a object
 */
public class ObjectCloning
{
  public static void main(String[] args)
  {
    Student student1 = new Student("jayani", 27);
    try
    {
      Student student2 = (Student) student1.clone();
      student2.age = 22;

      System.out.println(student1.age);
      System.out.println(student2.age);

    }
    catch (CloneNotSupportedException exp)
    {
      System.out.println(exp);
    }
  }
}

class Student implements Cloneable
{
  String name;

  int age;

  Student(String name, int age)
  {
    this.name = name;
    this.age = age;
  }

  public Object clone() throws CloneNotSupportedException
  {
    return super.clone();
  }
}