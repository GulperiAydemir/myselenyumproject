package com.myfirstproject;

import com.github.javafaker.Faker;
import org.junit.Test;

public class Day05_JavaFaker {
    /*
    data:username,password,phone Number,test Environment,city, ssn,url,job title

    Where do you get your test data in your company?
    --BA -Business Analyst :create or writes Acceptance criteria or requirement
    ----Test Lead
    ----Manual Tester
    ----- Tech Lead
    ------PO  -maintains product backlog
     */

    @Test
    public void javaFaker(){

        //1.create a faker object

        Faker faker=new Faker();

        //user faker object or generate fake test data
        String firstName=faker.name().firstName();
        System.out.println("firstName = " + firstName);

        //last name

        System.out.println(faker.name().lastName());
        //title
        System.out.println(faker.name().title());
        //city
        System.out.println(faker.address().city());

        //state
        System.out.println(faker.address().state());
        //country
        System.out.println(faker.address().country());
        //address
        System.out.println("faker adres" + faker.address().fullAddress());

        //zip code
        System.out.println("Zip Code" + faker.address().zipCode());

        //random number
        System.out.println(faker.number().digits(10));

        //cell phoneNumber
        System.out.println(faker.phoneNumber().cellPhone());
        //ssn
        System.out.println("ssn" +faker.idNumber().ssnValid());
        //email
        System.out.println("email"+faker.internet().emailAddress());
        //BIRTHDAY
        System.out.println("birthday"+faker.date().birthday());



    }
}
