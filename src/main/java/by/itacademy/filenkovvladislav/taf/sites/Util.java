package by.itacademy.filenkovvladislav.taf.sites;

import com.github.javafaker.Faker;

public class Util {
    Faker faker = new Faker();
    String randomCorrectEmail = faker.internet().emailAddress();
    String randomIncorrectEmail = faker.toString();
    String randomPassword = faker.internet().password();
}
