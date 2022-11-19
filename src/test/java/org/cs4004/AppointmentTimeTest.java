package org.cs4004;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentTimeTest {
    private AppointmentTime appointmentTime;

    @BeforeEach
    void setUp() {
        appointmentTime = new AppointmentTime("10:00");
    }

    @Test
    void testToString() {
        assertEquals(appointmentTime.toString(), "10:00");
    }
}