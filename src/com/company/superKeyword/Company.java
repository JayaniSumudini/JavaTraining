package com.company.superKeyword;

class Person
{
  String name;

  String id;

  int age;

  Person(String name, String id, int age)
  {
    this.name = name;
    this.id = id;
    this.age = age;
  }
}

class Employee extends Person
{
  int salary;

  Employee(int salary, String name, String id, int age)
  {
    super(name, id, age);
    this.salary = salary;
  }

  void displayDetails()
  {
    System.out.println(this.name);
    System.out.println(this.id);
    System.out.println(this.age);
    System.out.println(this.salary);
  }
}

public class Company
{
  public static void main(String[] args)
  {
    Employee employee = new Employee(10000, "jayani", "1243", 27);
    employee.displayDetails();
  }
}
