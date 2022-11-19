package org.cs4004;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentCalendarTest {
    private AppointmentCalendar calendar;
    private Appointment appointment;
    private AppointmentDate date;
    @BeforeEach
    void setUp() {
        calendar = new AppointmentCalendar();
        appointment = new Appointment("2022/12/12 10:00 11:00 Meeting");
        date = new AppointmentDate("2022/12/12");
    }

    @Test
    void add() {
        calendar.add(appointment);
        assertNotNull(calendar.getAppointmentsForDay(date));
    }

    @Test
    void getAppointmentsForDay() {
        calendar.add(appointment);
        assertNotNull(calendar.getAppointmentsForDay(date));
    }

    @Test
    void cancel() {
        calendar.add(appointment);
        calendar.cancel(appointment);
        assertEquals(calendar.getAppointmentsForDay(date).isEmpty(), true);
    }
}