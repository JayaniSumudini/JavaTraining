package com.company.javaCopy;

public class Person
{
  Name name;
  Address address;

  Person(Name name, Address address)
  {
    this.name = name;
    this.address = address;
  }

  //Person shallow Copy constructor
  //copy the Person object(main object), but shared inner objects(Name and Address)
  Person(Person sourcePerson)
  {
    this.name = sourcePerson.name;
    this.address = sourcePerson.address;
  }

  Person(Person sourcePerson, boolean isDeepCopy)
  {
    if(isDeepCopy)
    {
      this.name = new Name(sourcePerson.name);
      this.address = new Address(sourcePerson.address);
    }
  }
}
