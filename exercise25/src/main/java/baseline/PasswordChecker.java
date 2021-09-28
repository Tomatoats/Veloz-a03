package baseline;

public class PasswordChecker {
    //privatize the string
    private String pass;

    private int PasswordValidator(String pass) {
        //initialize that int number
        int answer = 0;
        //count up the amount of letters, numbers, special characters, and string length.
        int letters, numbers, special_characters, total_characters;

        //if pass has letters, numbers, special characters, and at least 8 characters, then answer = 1;
        //else, if pass has letters, nat least 1 number, and at least 8 characters, then answer = 2;
        //else, if pass is only letters and is fewer than 8 characters,  then answer = 3;
        //else, if pass only have numbers and fewer than 8 characters, then answer = 4;
        return answer;
    }


    private String results(int answer) {
        //set up new string
        String result = "";
        //set up a switch with the answer int.
        switch (answer){
            default: result =  "this is psuedocode rn don't look at this";
                break;
        }
        return result;
    }


    public PasswordChecker(String password) {
        pass = password;
        //equalize the public string to this private one

        /*SO we need function Password Validator for the constraint,
        where it puts in a numeric value. I'm gonna add another function,
        result, where its a switch where depending on the numeric value, it prints
        out what strength the password is.
         */
        System.out.println((results(PasswordValidator(pass))));
    }
}


