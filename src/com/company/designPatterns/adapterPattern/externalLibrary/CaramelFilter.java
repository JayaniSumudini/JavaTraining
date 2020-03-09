package com.company.designPatterns.adapterPattern.externalLibrary;

import com.company.designPatterns.adapterPattern.Image;

//we have only this 3rd party API
public interface CaramelFilter
{
  void init();
  void done(Image image);
}
