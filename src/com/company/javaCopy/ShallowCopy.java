package com.company.javaCopy;

/**
 * in shallow copy it's copy the main object and doesn't the inner objects
 */
public class ShallowCopy
{
  public static void main(String[] args)
  {
    Name motherName = new Name("Anna", "katharic");
    Address motherAddress = new Address(321, "Matara");

    System.out.println("Mother\n");
    Person mother = new Person(motherName, motherAddress);
    System.out.println(mother.name.firstName);
    System.out.println(mother.name.lastName);
    System.out.println(mother.address.number);
    System.out.println(mother.address.street);

    System.out.println("\n\nSon\n");
    //shallow copy of mother object
    Person son = new Person(mother);
    System.out.println(son.name.firstName);
    System.out.println(son.name.lastName);
    System.out.println(son.address.number);
    System.out.println(son.address.street);

    System.out.println("\n" + mother.equals(son));
    System.out.println(mother);//two Person object reference,but contains is shared
    System.out.println(son);

    //when update the name of sun, then mother's name also updated
    son.name.firstName = "Martin";
    System.out.println(mother.name.firstName);
    System.out.println(son.name.firstName);

  }
}
