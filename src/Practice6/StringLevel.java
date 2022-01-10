package Practice6;

public class StringLevel {

    public static void main(String[] args) {
        String str = "level";
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(4);

        if(ch1 == ch2) {
            System.out.println("same");
        }
    }
}
/*
1. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
 */