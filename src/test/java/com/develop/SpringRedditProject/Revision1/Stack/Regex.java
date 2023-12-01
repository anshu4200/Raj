package com.develop.SpringRedditProject.Revision1.Stack;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Regex {
        public static List<LocalDate> generateDates(LocalDate startDate, LocalDate endDate) {
            List<LocalDate> dateList = new ArrayList<>();
            LocalDate current = startDate;

            while (!current.isAfter(endDate)) {
                dateList.add(current);
                current = current.plus(1, ChronoUnit.DAYS);
            }

            return dateList;
        }

    public static void main(String[] args) {
        long startTimeInMillis = 1700719500000L;
        long endTimeInMillis = getNearestAfterHour(startTimeInMillis);

        long durationInMillis = endTimeInMillis - startTimeInMillis;

        // Convert milliseconds to minutes using TimeUnit
        long minutes = TimeUnit.MILLISECONDS.toMinutes(durationInMillis);

        System.out.println("Minutes between two milliseconds: " + minutes);
    }

    public static long getNearestAfterHour(long timeInMillis) {
        Duration duration = Duration.ofHours(5).plusMinutes(30);
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(timeInMillis), ZoneOffset.UTC).plus(duration);
        LocalDateTime nearestAfterHour = dateTime.withHour(dateTime.getHour() + 1).withMinute(0).withSecond(0);
        return nearestAfterHour.toInstant(ZoneOffset.UTC).minus(duration).toEpochMilli();
    }
}
