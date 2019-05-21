package com.planificateur.eventplanner.util;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class DateUtils {

    private static final DateTimeFormatter formatter = new DateTimeFormatterBuilder()
            .append(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
            .toFormatter();

    public static Timestamp toTimestamp(String time){
        Instant i = Instant.from(formatter.parse(time));
        return new Timestamp(i.toEpochMilli());
    }
}
