package Practice6;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your email");
        String email = scan.nextLine();
        String name = email.substring(0,email.indexOf('_'));
        String surName = email.substring(email.indexOf('_')+1 ,email.indexOf('@'));
        String domainName = email.substring(email.indexOf('@'));
        String email2 = surName+"_"+name+domainName;
        System.out.println(email2);

        scan.close();
    }
}
/*
 7. Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Separated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com

 */