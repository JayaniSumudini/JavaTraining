package com.company.designPatterns.facadePattern;

public class MailService
{
  public void sendMail(String message, String target, String source)
  {
    MailServer mailServer = new MailServer();
    Connection connection = mailServer.connect(source);
    connection.connect();
    AuthToken authToken = mailServer.getAuthToken();
    mailServer.send(authToken,new Message(message),target);
    connection.disConnect();

  }
}
