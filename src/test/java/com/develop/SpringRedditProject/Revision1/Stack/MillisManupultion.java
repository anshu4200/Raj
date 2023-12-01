package com.develop.SpringRedditProject.Revision1.Stack;

import java.time.*;
import java.util.concurrent.TimeUnit;

public class MillisManupultion {

/*    public static void main(String[] args) {
        long millis = 1700427600000L;

        // Here we have to add and subtract to get the local time i.e IST as PMS time is in Local
        Duration duration = Duration.ofHours(5).plusMinutes(30);
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(millis), ZoneOffset.UTC).plus(duration);
        LocalDateTime nearestPastHour = dateTime.withMinute(0);
        System.out.println("nearest: " + nearestPastHour.toInstant(ZoneOffset.UTC).minus(duration).toEpochMilli());
    }*/

/*
    public static void main(String[] args) {

        long deliveryTime = 1700255135000L;
        long currentMillis = 1700262340000L;
        Duration duration = Duration.ofHours(5).plusMinutes(30);

        long getNearestBeforeHour = nearestBeforeHour(deliveryTime, duration);
        System.out.println("getNearest before: " + getNearestBeforeHour);
        long getNearestAfterHour = nearestAfterHour(currentMillis, duration);
        System.out.println("getNearest after: " + getNearestAfterHour);
        long hour = (getNearestAfterHour - getNearestBeforeHour)/3600000;
        System.out.println(hour);
    }

    private static long nearestBeforeHour(long deliveryTime, Duration duration) {
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(deliveryTime), ZoneOffset.UTC).plus(duration);
        LocalDateTime nearestPastHour = dateTime.withMinute(0).withSecond(0);
        return nearestPastHour.toInstant(ZoneOffset.UTC).minus(duration).toEpochMilli();
    }

    private static long nearestAfterHour(long currentMillis, Duration duration) {
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(currentMillis), ZoneOffset.UTC).plus(duration);
        LocalDateTime nearestAfterHour = dateTime.withMinute(0).withHour(dateTime.getHour() + 1).withSecond(0);
        return nearestAfterHour.toInstant(ZoneOffset.UTC).minus(duration).toEpochMilli();
    }
*/

/*    public Integer extractMinutes(long deliveryTime, String res) {
        Date date = new Date(deliveryTime);
        SimpleDateFormat sdfInMin = new SimpleDateFormat("mm");
        SimpleDateFormat sdfInSec = new SimpleDateFormat("ss");

        if (res.equalsIgnoreCase("deliver")) {
            return (totalSecondInHour - ((Integer.parseInt(sdfInMin.format(date)) * totalMinutesInHour) + (Integer.parseInt(sdfInSec.format(date))))) * millis;
        }
        return ((Integer.parseInt(sdfInMin.format(date)) * totalMinutesInHour) + (Integer.parseInt(sdfInSec.format(date)))) * millis;
    }*/

    public static void main(String[] args) {
        System.out.println(getMinutesBetweenHour(1700829109000L, 1700829055000L));
    }

    public static float getMinutesBetweenHour(long startTimeInMillis, long stopTimeInMillis) {
       return (float) (stopTimeInMillis - startTimeInMillis) / 60000;

    }

}
