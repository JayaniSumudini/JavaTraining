package com.company.designPatterns.builderPattern;

public class Student
{
  private String name;

  private int age;

  private String school;

  private int id;

  public Student(Builder studentBuilder)
  {
    this.name = studentBuilder.name;
    this.age = studentBuilder.age;
    this.school = studentBuilder.school;
    this.id = studentBuilder.id;
  }

  @Override
  public String toString()
  {
    return "Student{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", school='" + school + '\'' +
        ", id=" + id +
        '}';
  }

  public static class Builder
  {
    private String name;

    private int age;

    private String school;

    private int id;

    public Builder setName(String name)
    {
      this.name = name;
      return this;
    }

    public Builder setAge(int age)
    {
      this.age = age;
      return this;
    }

    public Builder setSchool(String school)
    {
      this.school = school;
      return this;
    }

    public Builder setId(int id)
    {
      this.id = id;
      return this;
    }

    public Student build()
    {
      return new Student(this);
    }
  }

}
