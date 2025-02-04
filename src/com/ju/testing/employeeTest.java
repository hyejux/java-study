package com.ju.testing;

import com.ju.simpleprograms.employeeManage.Employee;
import com.ju.simpleprograms.employeeManage.EmployeeManagementSystem;
import com.ju.simpleprograms.employeeManage.EmployeeManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class employeeTest {

    private EmployeeManager employeeManager;

    @BeforeEach
    void setUp() {
        employeeManager = new EmployeeManager();
    }

    @Test
    void employeeAdd() {
        Employee e = new Employee();
        e.setName("미옹");
        employeeManager.employeeAdd(e);
        assertEquals(1, employeeManager.getEmployeeCount());  // assertEquals(예상값, 실제값);

    }


}
