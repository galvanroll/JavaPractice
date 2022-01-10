package practice5;

import java.util.Scanner;

public class HowManyPeople {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result = "";
        System.out.println("How many people do you live with?");
        int people = input.nextInt();

        result = (people <= 3)? "Live less than 3 people"
                :(people >= 3 && people < 6)? "Live with 3 - 6 people"
                : "Live with more than 6 people";

        System.out.println(result);
        input.close();
    }
}
/*
 Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user liv 1 es with more than 6 people: print "Live with "more than 6 people"
 */
