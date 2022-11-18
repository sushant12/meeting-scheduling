package org.cs4004;

import java.util.ArrayList;

/**
 * An appointment calendar.
 */
public class AppointmentCalendar {
   private ArrayList<Appointment> appointments;

   /*
    * Add additional code here.
    */

   AppointmentCalendar() {
      appointments = new ArrayList<Appointment>();
   }

   public void add(Appointment appointment) {
      appointments.add(appointment);
   }

   public ArrayList<Appointment> getAppointmentsForDay(AppointmentDate day) {
      ArrayList<Appointment> foundAppointments = new ArrayList<Appointment>();
      for (Appointment appointment : appointments) {
         if (appointment.dateCompare(day)) {
            foundAppointments.add(appointment);
         }
      }
      return foundAppointments;
   }

   public void cancel(Appointment appointment) {
      appointments.remove(appointment);
   }
}
