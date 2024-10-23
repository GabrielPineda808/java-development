package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchOut() {
        Employee employee = new Employee();
        double punchIn = employee.punchIn(10);

        employee.punchOut(punchIn, 11);

        assertEquals(employee.getHoursWorked(),1);
    }
}