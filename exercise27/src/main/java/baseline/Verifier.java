package baseline;

public class Verifier {


    public static String validateInput(String firstName, String lastName, int ZIPcode, String employeeID) {
        ////initialize a string to use later for the result
        String result =  "";
        //use these little strings to build one big string later
        String Check1 = "";
        String Check2 = "";
        String Check3 = "";
        String Check4 = "";
        String Check5 = "";
        String Check6 = "";

        //send each input to check for the validation rule

        //check to make sure first name is ok
        boolean firstNameFilledIn = filledIn(firstName);
        if (firstNameFilledIn == false)
        {
          Check1 = "The first name must be filled in.\n";
        }
        boolean firstNameAtLeast2Characters = atLeast2Characters(firstName);
        if (firstNameAtLeast2Characters == false)
        {
            Check2 = "The first name must be at least 2 characters long.\n";
        }
        //check to make sure last name is okay
        boolean lastNameFilledIn = filledIn(lastName);
        if (lastNameFilledIn == false)
        {
            Check3 = "The last name must be filled in.\n";
        }

        boolean lastNameAtLeast2Characters = atLeast2Characters(lastName);
        if (lastNameAtLeast2Characters == false)
        {
            Check4 = "The last name must be at least 2 characters long.\n";
        }

        //check to make sure EmployeeID is proper format
        boolean isProperFormat = idChecker(employeeID);
        if (isProperFormat == false)
        {
            Check5 = "The employee ID must be filled in the format of AA-1234.\n";
        }

        //check to make sure zip code is 5 digits long
        boolean isZip5digits = onlyFiveDigits(ZIPcode);
        if (isZip5digits == false)
        {
            Check6 = "The zipcode must be a 5 digit number.\n";
        }
        if (firstNameFilledIn == true && firstNameAtLeast2Characters == true && lastNameFilledIn == true && lastNameAtLeast2Characters == true && isProperFormat == true && isZip5digits == true)
        {
        result = "There were no errors found.";
        }
        else
        {
         result = Check1 + Check2 + Check3 + Check4 + Check5 + Check6;
        }

        return result;
    }

    public static boolean onlyFiveDigits(int ziPcode) {
        //if it isn't between 10000 and 99999, return false;
        if (ziPcode <= 9999 || ziPcode >=100000) {
            return false;
        }
        else {
            return true;
        }
    }

    public static boolean idChecker(String employeeID) {
        //make a counter
        int counter = 0;
        int character;
        //make string a char array
        //make a for loop for element 0 and 1,
        if (employeeID.length() >7){
            return false;
        }
        for (int i = 0; i < 7; i++)
        {
            if (i < 2)
            {
                character = (int) (employeeID.charAt(i));
                if (character > 64 && character < 91)
                {
                    counter++;
                }

            }
            //check element 2 itself,
            else if (i == 2)
            {
                character = (int) (employeeID.charAt(i));
                if (character == 45)
                {
                    counter++;
                }

            }
            else if (i > 2)
            {
                // then a for loop for element 3-6 to make sure they are the proper characters
                character = (int) (employeeID.charAt(i));
                if (character > 47 && character < 58)
                {
                    counter++;
                }
            }
        }
        //if counter != 7, return false
        if (counter != 7)
        {
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean filledIn(String Name) {
        //if name is equal to blank, return false. otherwise return true
        if (Name .isEmpty())
        {
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean atLeast2Characters(String Name) {
        //if the string length isn't above 1, return false
        if (Name.length() < 2)
        {
            return false;
        }
        else
        {
            //otherwise return true
            return true;
        }
    }

    public Verifier (String firstName, String lastName, int ZIPcode, String EmployeeID){
        //put em into the validateInput function
        //and output the result.
        String result = validateInput(firstName,lastName,ZIPcode,EmployeeID);

        System.out.println(result);
    }

}
