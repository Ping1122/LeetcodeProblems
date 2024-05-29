package com.pingxin;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentAttendanceRecordII552Test {

    @Test
    @DisplayName("Test 552. Student Attendance Record")
    public void testTheNumberOffBeautifulSubsets2597_1() {
        StudentAttendanceRecordII552 studentAttendanceRecordII552= new StudentAttendanceRecordII552();
        int result = studentAttendanceRecordII552.checkRecord(10101);
        int expected = 183236316;
        assertEquals(expected, result);
    }
}
