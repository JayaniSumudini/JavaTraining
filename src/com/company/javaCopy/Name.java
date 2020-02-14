package com.company.javaCopy;

public class Name
{
  String firstName;

  String lastName;

  Name(String firstName, String lastName)
  {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  //copy constructor
  Name(Name name)
  {
    this.firstName = name.firstName;
    this.lastName = name.lastName;
  }
}
