package by.itacademy.filenkovvladislav.taf.sites.utils;

import com.github.javafaker.Faker;

public class Util {

    public static String randomCorrectEmail() {
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }

    public static String randomIncorrectEmail() {
        Faker faker = new Faker();
        return faker.toString();
    }

    public static String randomPassword() {
        Faker faker = new Faker();
        return faker.internet().password();
    }



}
