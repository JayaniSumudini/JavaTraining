package com.company.inheritance;

class BabyDog extends Dog
{
  void play()
  {
    System.out.println("Play");
  }
}

public class Multilevel
{
  public static void main(String[] args)
  {
    BabyDog babyDog = new BabyDog();
    babyDog.play();
    babyDog.brak();
    babyDog.run();
  }
}
