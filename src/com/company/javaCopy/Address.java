package com.company.javaCopy;

public class Address
{
  int number;

  String street;

  Address(int number, String street)
  {
    this.number = number;
    this.street = street;
  }

//copy constructor
  Address(Address address)
  {
    this.number = address.number;
    this.street = address.street;
  }
}
