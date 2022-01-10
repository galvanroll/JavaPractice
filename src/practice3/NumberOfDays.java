package practice3;

public class NumberOfDays {

    public static void main(String[] args) {

        int month = 12;

        String result = (month == 1)? "31 days" :(month == 2) ? "28 days" :(month == 3) ? "31 days" :(month == 4) ? "30 days"
                :(month == 5) ? "31 days" :(month == 6) ? "30 days" :(month == 7) ? "31 days" :(month == 8) ? "31 days"
                :(month == 9) ? "30 days" :(month == 10) ? "31 days" :(month == 11) ? "30 days" : "31days";

        System.out.println(result);
    }
}
/*
Create a class named NumberOfDays, an integer variable named month that has numbers 1 ~12 is given to you, write a program that can find the number of days in the given number of month.

            EX:
                month = 5

            output:
                31 days

            (Assume that February has 28 days)
 */
