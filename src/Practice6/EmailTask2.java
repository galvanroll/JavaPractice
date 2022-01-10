package Practice6;

import java.util.Scanner;

public class EmailTask2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your email");
        String email = scan.nextLine();

        String name = email.substring(0, email.indexOf('_'));
        String last = email.substring(email.indexOf('_') + 1, email.indexOf('@'));
        String domain = email.substring(email.indexOf('@') + 1, email.indexOf('.'));

        String firstName = name.substring(0, 1).toUpperCase() + name.substring(1);
        String lastName = last.substring(0, 1).toUpperCase() + last.substring(1);

        System.out.println("First Name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);

        scan.close();

    }
}

/*
 8. Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple
 */