package com.company.javaCopy;

/**
 * unlike a shallow copy a deep copy is a fully independent copy of a object
 */
public class DeepCopy
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
    Person son = new Person(mother, true);

    System.out.println(son.name.firstName);
    System.out.println(son.name.lastName);
    System.out.println(son.address.number);
    System.out.println(son.address.street);

    System.out.println("\n" + mother.equals(son));
    System.out.println(mother);//two Person object reference,but contains is shared
    System.out.println(son);

    //when update the name of sun, mother's name not updated
    son.name.firstName = "Martin";
    System.out.println(mother.name.firstName);
    System.out.println(son.name.firstName);
  }
}
