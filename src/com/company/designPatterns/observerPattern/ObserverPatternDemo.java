package com.company.designPatterns.observerPattern;

public class ObserverPatternDemo
{
  public static void main(String[] args)
  {
    DataSource dataSource = new DataSource();

    SpreadSheet spreadSheet1 = new SpreadSheet();
    SpreadSheet spreadSheet2 = new SpreadSheet();
    Chart chart = new Chart();

    dataSource.addObserver(spreadSheet1);
    dataSource.addObserver(spreadSheet2);
    dataSource.addObserver(chart);

    dataSource.setValue(10);
    dataSource.setValue(11);
  }
}
