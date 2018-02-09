package com.company.Question_3;

public class Main {

    public static void main(String[] args) {
        /*
        1. Create a switch statement in its own method in the Switch class in this package.
        This switch statement should take a string and have 4 cases it could match.
        The default class should inform the user they have not selected an option that is valid and ask them to try again.
        2. Recursion should be used if they hit the default.
        3. Instantiate the switch class in this main method and run the method you created.
         */


        /*I could not get my switch statement to take a string. I got the following error: Error:(13, 16) java: strings in switch are not supported in -source 1.6
        use -source 7 or higher to enable strings in switch) */
        Switch q = new Switch();
        q.platform();
    }
}
