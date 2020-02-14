package com.company;

//Note: If you import a package, subpackages will not be imported.

//If you use package.* then all the classes and interfaces of this package will be accessible but not subpackages.

import com.company.aggregation.*;

//If you use package.className then only declared class of this package will be accessible.
import com.company.aggregation.employeeExample.Address;

import static com.company.basicPrograms.PrimeNumber.findProvideNumberIsPrime;
import static java.lang.System.out;

//If you use fully qualified name then only declared class of this package will be accessible.

public class TestPackage
{
  public static void main(String[] args)
  {
    Student student = new Student();
    student.getAge();

    Address address = new Address("Matara", "Southern", "Sri Lanka");

    //full qualified name must be used when two packages contain two classes with same name
    //ex:- java.util package have Date class and java.sql package have Date class
    java.util.Date date = new java.util.Date();
    java.sql.Date date1 = new java.sql.Date(1234567L);
    out.println("jayani");//java static import
    findProvideNumberIsPrime();//static import provide access the static members of class without the class qualification.
    /*
    *The import provides accessibility to classes and interface , static import provides accessibility to static members of the class.
    */
  }
}
