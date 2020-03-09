package com.company.designPatterns.adapterPattern;

import com.company.designPatterns.adapterPattern.externalLibrary.CaramelFilterImpl;

public class AdapterPatternDemo
{
  public static void main(String[] args)
  {
    ImageViewer imageViewer = new ImageViewer(new Image());
    imageViewer.apply(new CaramelFilterAdapter(new CaramelFilterImpl()));

    imageViewer.apply(new CaramelFilterAdapter2());

    //how we apply caramel filter
    //imageViewer.apply needs Filter type
    //and inside imageView.apply it calls Filter.apply method..but caramelFilter doesn't have apply method
    //we have to create adapter for convert caramelFilter to Filter
  }
}
