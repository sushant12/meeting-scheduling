package org.cs4004;

import java.util.StringTokenizer;

/**
 * An appointment time.
 */
public class AppointmentTime {
   private int hours;
   private int minutes;

   /*
    * Add additional code here
    */
   AppointmentTime(String time) {
      StringTokenizer str = new StringTokenizer(time, ":");
      hours = Integer.parseInt(str.nextToken());
      minutes = Integer.parseInt(str.nextToken());
   }

   public String toString() {
      String hour = (hours < 10) ? "0" + hours : "" + hours;
      String minute = (minutes < 10) ? "0" + minutes : "" + minutes;
      return hour + ":" + minute;
   }
}