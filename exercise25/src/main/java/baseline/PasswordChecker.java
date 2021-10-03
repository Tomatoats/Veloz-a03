package baseline;


public class PasswordChecker {

    private int passwordValidator(String pass) {
        //initialize that int number

        int answer = 0;
        //count up the amount of letters, numbers, special characters, and string length.
        int letters= 0;
        int numbers =0;
        int specialCharacters = 0;
        int totalCharacters = pass.length();


        for (int i = 0; i < totalCharacters; i++)
        {
            if (Character.isLetter(pass.charAt(i)))
            {
                letters++;
            }
            else if (Character.isDigit(pass.charAt(i)))
            {
                numbers++;
            }
            else
            {
                specialCharacters++;
            }
        }
        //if pass has letters, numbers, special characters, and at least 8 characters, then answer = 1
        if (specialCharacters > 0 && totalCharacters > 7 && letters > 0 && numbers > 0 )
        {
            answer = 1;
        }

        //else, if pass has letters, nat least 1 number, and at least 8 characters, then answer = 2
        else if (totalCharacters > 7 && numbers > 0 && letters > 0)
        {
            answer = 2;
        }
        //else, if pass is only letters and is fewer than 8 characters,  then answer = 3
        else if (letters > 0 && numbers == 0  && specialCharacters == 0 && totalCharacters < 8)
        {
            answer = 3;
        }
        //else, if pass only have numbers and fewer than 8 characters, then answer = 4
        else if (letters == 0 && specialCharacters == 0 && totalCharacters < 8 && numbers > 0)
        {
            answer = 4;
        }
        else
        {
            answer = 5;
        }
        return answer;
    }


    private String results(int answer) {
        //set up new string
        String result = "";
        //set up a switch with the answer int.
        switch (answer){
            case 0: result = "How did you get this?";
                    break;
            case 1: result = "is a very strong password.";
                    break;
            case 2: result = "is a strong password.";
                    break;
            case 3: result = "is a weak password.";
                    break;
            case 4: result = "is a very weak password";
                    break;
            case 5: result = "is a password of unknown password";
                    break;
        }
        return result;
    }


    public PasswordChecker(String password) {
        //privatize the string
        //equalize the public string to this private one

        /*SO we need function Password Validator for the constraint,
        where it puts in a numeric value. I'm gonna add another function,
        result, where its a switch where depending on the numeric value, it prints
        out what strength the password is.
         */
        System.out.printf("The password '%s' %s\n", password, (results(passwordValidator(password))));
    }
}


