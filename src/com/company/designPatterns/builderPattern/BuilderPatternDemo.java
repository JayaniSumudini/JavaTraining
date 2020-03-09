package com.company.designPatterns.builderPattern;

public class BuilderPatternDemo
{
  public static void main(String[] args)
  {
    Student student = new Student.Builder().setName("Jayani").setAge(27).build();

    System.out.println(student);
  }
}
