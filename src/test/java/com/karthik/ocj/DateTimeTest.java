package com.karthik.ocj;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeTest {

    @Test
    public void testSimpleCreateDateTime(){
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
    }

    @Test
    public void testCreateDateTime() {
        LocalDate dtJan = LocalDate.of(2001, Month.JANUARY, 31);
        System.out.println(dtJan);
        LocalTime time = LocalTime.of(12, 12, 12, 12);
        System.out.println(time);
        LocalDateTime localDateTime = LocalDateTime.of(dtJan, time);
        System.out.println(localDateTime);

    }
}
