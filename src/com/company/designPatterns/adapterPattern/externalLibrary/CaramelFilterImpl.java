package com.company.designPatterns.adapterPattern.externalLibrary;

import com.company.designPatterns.adapterPattern.Image;

//we can't see this implementation of this class
public class CaramelFilterImpl implements CaramelFilter
{
  @Override
  public void init()
  {
    System.out.println("Caramel filter initialize");
  }

  @Override
  public void done(Image image)
  {
    System.out.println("Caramel filter apply");
  }
}
