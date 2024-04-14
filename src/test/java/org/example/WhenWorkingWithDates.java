package org.example;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import static org.assertj.core.api.Assertions.assertThat;

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
    @Test
    public void yesterday(){
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);
        System.out.println(today);
        System.out.println(yesterday);
        //if type is LocalDate,ChronoUnit. shouldn't be HOURS
        //and first parameter * cHRONOuNIT....
        //BELOW example, 1 centry back
        LocalDate givenDate = LocalDate.now().minus(1, ChronoUnit.CENTURIES);
        System.out.println(givenDate);
        //below, it gives 2 centries back
        LocalDate givenDate2 = LocalDate.now().minus(2, ChronoUnit.CENTURIES);
        System.out.println(givenDate2);
        //if we'll go back as hours, the object type should be LocalTimeChronoUnit.HOURS
        LocalTime givenTime = LocalTime.now().minus(1, ChronoUnit.HOURS);
        System.out.println(givenTime);
    }
    @Test
    public void checkingTheMonth(){
        LocalDate today = LocalDate.now();
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getYear());
    }
    @Test
    public void comparingDates(){
        LocalDate today = LocalDate.now();
        LocalDate fifthOfJuly2024 = LocalDate.of(2024, 7, 5);
        LocalDate tenthOfJuly2024 = LocalDate.of(2024, 7, 10);
        LocalDate firstOfJuly2024 = LocalDate.of(2024, 7, 01);

        assertThat(fifthOfJuly2024.isAfter(today)).isTrue();
        assertThat(fifthOfJuly2024).isEqualTo("2024-07-05");
        //assertThat(fifthOfJuly2024).isEqualTo("2024-04-15");
        assertThat(fifthOfJuly2024).isBetween(firstOfJuly2024, tenthOfJuly2024);
    }
    @Test
    public  void usingTimes(){
        LocalTime now = LocalTime.now();
        System.out.println("LocalTime: " + now);

        LocalDate today = LocalDate.now();
        System.out.println("LocalDate: " + today);

        LocalTime fiveHoursAgo = LocalTime.now().minusHours(5);
        System.out.println("5 hours ago: " + fiveHoursAgo);

        LocalTime tenMinutesAgo = LocalTime.now().minus(10, ChronoUnit.MINUTES);
        System.out.println("10 minutes ago: " + tenMinutesAgo);
    }
}
