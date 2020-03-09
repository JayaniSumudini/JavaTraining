package com.company.designPatterns.facadePattern;

public class FacadePatternDemo
{
  public static void main(String[] args)
  {
    MailService mailService = new MailService();
    mailService.sendMail("content", "IP2", "IP1");

  }
}
