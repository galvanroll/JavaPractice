package Practice6;

import java.util.Scanner;

public class WordX {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.next();
        char first = word.charAt(0);
        if (first=='x'){
            System.out.println(word.substring(1));
        }else{
            System.out.println(word);

            scan.close();
        }
    }
}
/*3. Ask user to enter a word. If the work starts with x, print the word without x.
        Input:
        xcode
        Output:
        code
        */