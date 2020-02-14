package com.company.callingMethod;

public class CallByReference
{
  //passing reference as a parameter when calling the method is called call by reference
  //java use only call by value while passing reference variable as well(passing reference variable is passing object)
  //when what are the changes done to the parameters in the called method are reflected to the calling method
  public static void main(String[] args)
  {
    Student student1 = new Student(10);
    Student student2 = new Student(20);

    System.out.println("Before call swap method, student1.age = " + student1.age + " ,student2.age = " + student2.age);
    swap(student1, student2);
    System.out.println("After call swap method, student1.age = " + student1.age + " ,student2.age = " + student2.age);
    //in call by reference what ever the changes done to parameters in called method are reflected to the calling method

  }

  public static void swap(Student student1, Student student2)
  {
    System.out.println("Before swap, student1.age = " + student1.age + " ,student2.age = " + student2.age);
    Student student3 = new Student(student1.age);
    student1.age = student2.age;
    student2.age = student3.age;
    System.out.println("After swap, student1.age = " + student1.age + " ,student2.age = " + student2.age);
  }
}

class Student
{
  int age;

  Student(int age)
  {
    this.age = age;
  }
}

