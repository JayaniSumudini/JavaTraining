package com.company.designPatterns.facadePattern;

public class Message
{
  private String content;

  Message(String content)
  {
    this.content = content;
  }

  String getContent()
  {
    return content;
  }
}
