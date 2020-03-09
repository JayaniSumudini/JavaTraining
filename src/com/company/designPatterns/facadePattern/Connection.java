package com.company.designPatterns.facadePattern;

public class Connection
{
  private String ipAddress;

  public Connection(String ipAddress)
  {
    this.ipAddress = ipAddress;
  }

  public void connect()
  {
    System.out.println("Connect to.." + ipAddress);
  }

  public void disConnect()
  {
    System.out.println("Disconnect from.." + ipAddress);
  }
}
