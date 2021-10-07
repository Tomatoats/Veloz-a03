package baseline;

public class restOfEmployees {
    //not gonna privatize anymore since sonarlint hates it for some reason

    public restOfEmployees(String[] employeeNames, String toRemove) {
        //print out the total amount of employees.
        for(int i = 0; i< 5; i++) {
            //if toRemove equals employeeNames,  continue;
            if (toRemove.equals(employeeNames[i])) {
                System.out.printf("There are 4 employees: %n");
            }
        }

        //make a for loop from 0-4.
        for(int i = 0; i< 5; i++){
            //if toRemove equals employeeNames,  continue;
            if (toRemove.equals(employeeNames[i]))
            {
                continue;
            }
            else
            {
                //else, print out employeeNames
                System.out.printf("%s%n",employeeNames[i]);
            }
        }
    }
}
