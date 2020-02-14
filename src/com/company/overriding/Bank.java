package com.company.overriding;

class Bank
{
  int getRateOfInterest()
  {
    return 0;
  }
}

class SBI extends Bank
{
  @Override
  int getRateOfInterest()
  {
    return 8;
  }
}

class ICICI extends Bank
{
  @Override
  int getRateOfInterest()
  {
    return 7;
  }
}

class AXIS extends Bank
{
  @Override
  int getRateOfInterest()
  {
    return 9;
  }
}

class Calculate
{
  public static void main(String[] args)
  {
    SBI sbi = new SBI();
    ICICI icici = new ICICI();
    AXIS axis = new AXIS();

    System.out.println("SBI rate of interest: " + sbi.getRateOfInterest());
    System.out.println("ICICI rate of interest: " + icici.getRateOfInterest());
    System.out.println("AXIS rate of interest: " + axis.getRateOfInterest());
  }
}