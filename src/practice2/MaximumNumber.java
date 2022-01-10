package practice2;

public class MaximumNumber {

    public static void main(String[] args) {
        int n1 = 100, n2 = 200;

        boolean isMin = (n1 >= n2);
        boolean isMax = (n2 >= n1);
        boolean isEqual = (n1 == n2);

        if(isMin){
            System.out.println(n1 + " is the maximum number");
        }if(isMax){
            System.out.println(n2 + " is the maximum number");
        }if(isEqual){
            System.out.println("equal");
        }
    }
}

/*3. Write a program that can print the maximum number between two numbers, if both are equal then print Equal

            Ex:
                n1 = 100, n2 = 200;

            output:
                200 is the maximum number

 */
