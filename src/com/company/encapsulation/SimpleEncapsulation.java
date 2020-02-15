package com.company.encapsulation;

public class SimpleEncapsulation
{
  private int age;//making data members are private.. then no one can access from outside

  /**
   * provide public getter and setter
   */
  public void setAge(int age)
  {
    this.age = age;
  }

  public int getAge()
  {
    return age;
  }
}
