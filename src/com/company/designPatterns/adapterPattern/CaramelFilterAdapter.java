package com.company.designPatterns.adapterPattern;

import com.company.designPatterns.adapterPattern.externalLibrary.CaramelFilter;

public class CaramelFilterAdapter implements Filter
{

  private CaramelFilter caramelFilter;

  public CaramelFilterAdapter(CaramelFilter caramelFilter)
  {
    this.caramelFilter = caramelFilter;
  }

  @Override
  public void apply(Image image)
  {
    caramelFilter.init();
    caramelFilter.done(image);
  }
}
