import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTakeOutTest {

    @Test
    void WhatIfAStringDoesntMAtch(){
        String toRemove = "test";


        assertEquals("John Smith", employees(toRemove));
    }
    @Test
    void WhatIfAStringDoesMAtch(){
        String toRemove = "John Smith";
        assertEquals("",employees(toRemove));
    }



    private String employees(String toRemove) {
        String employeeNames = "John Smith";

        //if toRemove equals employeeNames,  continue;
        if (toRemove.equals(employeeNames)) {
            employeeNames = "";
        }
        return employeeNames;
    }
}

