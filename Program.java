//import stuff here
import java.util.Scanner;

//Your code here
public class Program8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 2 integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        // calculations
        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        double average = (double)(num1 + num2) / 2.0;
        int distance = diff;
        
        if (distance < 0)
            distance = -distance;
            
        int max;
        
        // calculates the larger int
        if (num1 > num2)
            max = num1;
        else
            max = num2;
            
        int min;
        
        // calculates the smaller int
        if(max == num1)
            min = num2;
        else
            min = num1;
            
        // prints the values
        System.out.println("sum = " + sum);
        System.out.println("difference = " + diff);
        System.out.println("product = " + product);
        System.out.println("average = " + average);
        System.out.println("distance = " + distance);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}



//Paste console output below:
/*
    Enter 2 integers: 
    13
    20
    sum = 33
    difference = -7
    product = 260
    average = 16.5
    distance = 7
    max = 20
    min = 13
*/
