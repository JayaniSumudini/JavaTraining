package com.company.designPatterns.facadePattern;

public class MailServer
{
  public Connection connect(String ipAddress)
  {
    return new Connection(ipAddress);
  }

  public AuthToken getAuthToken()
  {
    return new AuthToken();
  }

  public void send(AuthToken authToken, Message message, String target)
  {
    System.out.println("send message " + message.getContent() + " to target " + target);
  }
}
