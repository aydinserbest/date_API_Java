package org.example;

import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WhenWorkingWithDates {
    @Test
    public void creatingATimeStampForToday() {
        LocalDate today = LocalDate.now();
        System.out.println("Today is " + today);
    }
    @Test
    public void creatingAGivenDate() {
        LocalDate fourthOfJuly2024 = LocalDate.of(2024, 7, 4);
        System.out.println(fourthOfJuly2024);
    }
    @Test
    public void parsingADateFromString() {
        String date = "2024-04-01";
        LocalDate firstOfApril = LocalDate.parse(date);
        System.out.println(firstOfApril);
    }
    @Test
    public void parsingADateWithAGivenFormat(){
        //first parameter should be the same format with the second parameter
        LocalDate firstOfApril = LocalDate.parse("01/04/2020", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(firstOfApril);
    }
}
