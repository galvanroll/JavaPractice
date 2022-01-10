package Practice6;

import java.util.Scanner;

public class EndWord {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter a word");
        String word = scan.next();

        String word2 = word.substring(word.length()-2);

        if (word2.equals("ly")){
            System.out.println("Really???");
        }else{
            System.out.println("Never mind");

            scan.close();
        }
    }
}
/*
2. ask the user to enter a word. if the word ends
with "ly", print "really???" ,  otherwise, print "never mind"
 */