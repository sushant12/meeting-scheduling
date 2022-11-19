package org.cs4004;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentDateTest {
    private AppointmentDate date;
    @BeforeEach
    void setUp() {
        date = new AppointmentDate("2022/12/12");
    }

    @Test
    void getyear() {
        assertEquals(date.getyear(), 2022);
    }

    @Test
    void getmonth() {
        assert date.getmonth() == 12;
    }

    @Test
    void getday() {
        assert date.getday() == 12;
    }

    @Test
    void testToString() {
        assertEquals(date.toString(), "2022/12/12");
    }
}