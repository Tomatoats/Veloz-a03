package baseline;

public class Verifier {


    private String validateInput(String firstName, String lastName, int ZIPcode, String employeeID) {
        ////initialize a string to use later for the result
        String result =  "";
        //send each input to check for the validation rule

        //check to make sure first name is ok
        boolean firstNameAtLeast2Characters = atLeast2Characters(firstName);
        boolean firstNameFilledIn = filledIn(firstName);
        //check to make sure last name is okay
        boolean lastNameAtLeast2Characters = atLeast2Characters(lastName);
        boolean lastNameFilledIn = filledIn(lastName);

        //check to make sure EmployeeID is proper format
        boolean isProperFormat = idChecker(employeeID);

        //check to make sure zip code is 5 digits long
        boolean isZip5digits = onlyFiveDigits(ZIPcode);

        return result;
    }

    private boolean onlyFiveDigits(int ziPcode) {
        //if it isn't between 10000 and 99999, return false;
        return true;
    }

    private boolean idChecker(String employeeID) {
        //make a for loop for element 0 and 1,  check element 2 itself,
        // then a for loop for element 3-6 to make sure they are the proper characters
        //if any of them dont check out, return false
        return true;
    }

    private boolean filledIn(String Name) {
        //if name is equal to blank, return false. otherwise return true
        return true;
    }

    private boolean atLeast2Characters(String Name) {
        //if the string length isn't above 1, return false
        //otherwise return true
        return true;
    }

    public Verifier (String firstName, String lastName, int ZIPcode, String EmployeeID){
        //put em into the validateInput function
        //and output the result.
        String result = validateInput(firstName,lastName,ZIPcode,EmployeeID);

        System.out.println(result);
    }

}
