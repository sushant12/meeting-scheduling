package org.cs4004;

import java.util.StringTokenizer;

/**
 * An appointment date.
 */
public class AppointmentDate {
   private int year;
   private int month;
   private int day;

   /*
    * Add additional code here
    */
   AppointmentDate(String date) {
      StringTokenizer str = new StringTokenizer(date, "/");
      year = Integer.parseInt(str.nextToken());
      month = Integer.parseInt(str.nextToken());
      day = Integer.parseInt(str.nextToken());
   }

   public int getyear() {
      return year;
   }

   public int getmonth() {
      return month;
   }

   public int getday() {
      return day;
   }

   public String toString() {
      return year + "/" + month + "/" + day;
   }
}