import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String username = "admin";
        String enteredName = "";
        String password = "Password";
        String enteredPass = "";
        boolean accountMatch = false;
        //boolean validUser = false;
        //boolean validPass = false;

        // Loop program until correct login entered
        while(!accountMatch)
        {
            // Loop until a valid username is entered
            //while(!validUser)
            {
                //validUser = true;
                System.out.print("Please enter username: ");
                // protect against invalid string entry
                try
                {
                    enteredName = reader.nextLine();
                }
                catch(Exception e1)
                {
                    System.out.println("Invalid username, try again.");
                    //validUser = false;
                    reader.next();
                }
                // check for non-entry
                /*if(enteredName.equals(""))
                {
                    System.out.println("Username not entered");
                    validUser = false;
                }*/


            }

            // Loop until a valid password is entered
            //while(!validPass)
            {
                //validPass = true;
                System.out.print("Please enter password: ");
                // protect against invalid string entry
                try
                {
                    enteredPass = reader.nextLine();
                }
                catch(Exception e2)
                {
                    System.out.println("Invalid password, try again.");
                    //validPass = false;
                    reader.next();
                }
                // check for non-entry
                /*if(enteredPass.equals(""))
                {
                    System.out.println("Password not entered");
                    validPass = false;
                }*/
            }

            // check for either username or password not matching
            if(!username.equals(enteredName.toLowerCase()) || !password.equals(enteredPass))
            {
                System.out.println("Incorrect login, please try again");
                //validUser = false;
                //validPass = false;
            }
            else
            {
                // If correct login exit loop print welcome message
                accountMatch = true;
                System.out.printf("Welcome %s!", username);
            }

        }

    }
}