package com.java.assignment;

import java.math.BigInteger;
import java.util.Scanner;

public class Employee {

    void details()
    {

    }
    @Deprecated
    void test()
    {
        System.out.println("Testing...");
    }
}
class Details extends Employee
{
    @Override
    void details()
    {
        super.details();


        Scanner inp = new Scanner(System.in);
        String name, address, email;

        System.out.println("Enter the Name :");
        name = inp.nextLine();

        System.out.println("Enter the Address :");
        address = inp.nextLine();

        System.out.println("Enter the email :");
        email = inp.nextLine();



        int age;
        BigInteger phone;   // Biginteger is used for getting a phone number by the 10 numbers are stored in one variable !!!

        System.out.println("Enter the Age :");
        age = inp.nextInt();

        System.out.println("Enter the Phone :");
        phone = inp.nextBigInteger();



        System.out.println("The Name is : " + name);
        System.out.println("The Age is : " + age);
        System.out.println("The Address is : " + address);
        System.out.println("The email is : " + email);
        System.out.println("The Phone is : " + phone);
    }



    public @interface Myannotation     //creating our own annotation
    {

    }
    @Myannotation()    // We get an input from the user !!! So, we dont use the inside of the braces !!!
    public static void main(String[] args)
    {
        Details obj = new Details();
        obj.test();
        obj.details();
    }
}
