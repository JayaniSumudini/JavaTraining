package com.company.multiThreading;

class DownloadFile implements Runnable
{
  private FileDownloadStatus fileDownloadStatus2;

  DownloadFile(FileDownloadStatus fileDownloadStatus)
  {
    this.fileDownloadStatus2 = fileDownloadStatus;
  }

  @Override
  public void run()
  {
    for(int i=0; i<10_000 ; i++)
    {
      if(Thread.currentThread().isInterrupted()) return;
      fileDownloadStatus2.setNoOfDownloadedBytes();
    }
    System.out.println("Download completed..");
  }

  public FileDownloadStatus getFileDownloadStatus2()
  {
    return fileDownloadStatus2;
  }
}
