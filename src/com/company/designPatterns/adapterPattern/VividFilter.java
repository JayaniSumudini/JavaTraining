package com.company.designPatterns.adapterPattern;

public class VividFilter implements Filter
{
  @Override
  public void apply(Image image)
  {
    System.out.println("Apply vivid filter");
  }
}
