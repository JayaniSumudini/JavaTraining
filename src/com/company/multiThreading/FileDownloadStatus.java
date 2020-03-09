package com.company.multiThreading;

public class FileDownloadStatus
{
  private int noOfDownloadedBytes;

  public void setNoOfDownloadedBytes()
  {
    synchronized (this)
    {
      this.noOfDownloadedBytes++;
    }
  }

  public int getNoOfDownloadedBytes()
  {
    return this.noOfDownloadedBytes;
  }
}
