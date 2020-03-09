
package com.company.multiThreading;

import java.util.ArrayList;
import java.util.List;

public class Test1
{
  public static void main(String[] args)
  {
    FileDownloadStatus fileDownloadStatus1 = new FileDownloadStatus();

    List<Thread> threads = new ArrayList<>();

    for(int i=0;i<10;i++)
    {
      Thread thread = new Thread(new DownloadFile(fileDownloadStatus1));
      thread.start();
      threads.add(thread);
    }

    /*try
    {
      thread.sleep(1000);//otherwise interrupt() run immediately and can't show the closing state
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }

    thread.interrupt();*/
    for (Thread thread:
        threads)
    {
      try
      {
        thread.join();
      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }

    System.out.println(fileDownloadStatus1.getNoOfDownloadedBytes());
  }

}
