package com.company.designPatterns.adapterPattern;

public class ImageViewer
{
  private Image image;

  ImageViewer(Image image)
  {
    this.image = image;
  }

  void apply(Filter filter)
  {
    filter.apply(image);
  }
}
