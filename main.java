// Practicum 13 (while and for loops)
// (TO COMPLETE)


import java.util.Scanner;

public class practicumnum13 {

    public static void main(String[] args) {

        // var declarations
        int n;
        int sum1, 
        int sum2;
        int count = 0;
     
        Scanner user_input = new Scanner(System.in);

        // prompt user for value of n to sum up to
        // if then enter 5, should add up 1 to 5 (equal to 15)
       System.out.println("Enter a the max value: ");
        n = user_input.nextInt();

        // use a for loop to sum up the values and assign to sum1
                for (int i = 1; i<= n; i++) {
                    sum1 = sum1 + i;
                }

        // use a while loop to sum up the values and assign to sum2
                while( count <= n) {
                    sum2 = sum2 + count;
                    count++;
                }

        // display results
        System.out.println("Sum of 1.." + n + " by use of for loop is " + sum1);

        System.out.println(
          "Sum of 1.." + n + " by use of while loop is " + sum2);
    }
}
