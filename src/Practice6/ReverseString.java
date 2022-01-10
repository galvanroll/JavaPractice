package Practice6;

public class ReverseString {

    public static void main(String[] args) {

        String word = "Cydeo";

        System.out.println( word.charAt(word.length() - 1)+""+ word.charAt(word.length() - 2)+""+ word.charAt(word.length() - 3)
                +""+ word.charAt(word.length() - 4) +""+ word.charAt(word.length() - 5));


    }
}
/*
1.  Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long. If word is shorter,
display message: "Too short!". If word is longer, display message: "Too long!".
Otherwise, reverse this word and print out result into the console.
 */