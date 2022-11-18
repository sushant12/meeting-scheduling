package org.cs4004;

import java.util.StringTokenizer;

/**
 * An appointment.
 *
 */
public class Appointment {
   private String description;
   private AppointmentDate day;
   private AppointmentTime from;
   private AppointmentTime to;

   /*
    * Add additional code here
    */

   Appointment(String line) {
      String des = "";
      StringTokenizer str = new StringTokenizer(line, " ");
      day = new AppointmentDate(str.nextToken());
      from = new AppointmentTime(str.nextToken());
      to = new AppointmentTime(str.nextToken());
      while (str.hasMoreTokens()) {
         des += str.nextToken() + " ";
      }
      description = des;
   }

   public boolean dateCompare(AppointmentDate date) {
      if (date.getday() == day.getday() && date.getmonth() == day.getmonth() && date.getyear() == day.getyear()) {
         return true;
      }
      return false;
   }

   public String format() {
      return "Description: " + description + "\nDay: " + day + "\nFrom: " + from + "\nTo: " + to;
   }

   public String toString() {
      return "Description: " + description + "\nDay: " + day + "\nFrom: " + from + "\nTo: " + to;
   }
}
