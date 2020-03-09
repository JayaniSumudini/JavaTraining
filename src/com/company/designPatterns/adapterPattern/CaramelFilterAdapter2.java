package com.company.designPatterns.adapterPattern;

import com.company.designPatterns.adapterPattern.externalLibrary.CaramelFilterImpl;

public class CaramelFilterAdapter2 extends CaramelFilterImpl implements Filter
{
  @Override
  public void apply(Image image)
  {
    init();
    done(image);
  }
}
