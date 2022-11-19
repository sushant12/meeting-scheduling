package org.cs4004;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentTest {
    private Appointment appointment;
    private AppointmentDate date;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        appointment = new Appointment("2022/12/12 10:00 11:00 Meeting");
        date = new AppointmentDate("2022/12/12");
    }

    @org.junit.jupiter.api.Test
    void dateCompare() {
        assertEquals(appointment.dateCompare(date), true);
    }

    @org.junit.jupiter.api.Test
    void format() {
        assertEquals(appointment.format(), "Description: Meeting \nDay: 2022/12/12\nFrom: 10:00\nTo: 11:00");
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        assertEquals(appointment.toString(), "Description: Meeting \nDay: 2022/12/12\nFrom: 10:00\nTo: 11:00");
    }
}