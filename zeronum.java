//Write a Java program that reads an integer and check whether it is negative, zero, or positive.//
 
import java.util.Scanner;

public class zeronum  {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = -7;
         if (n > 0)
        {
            System.out.println("Number is positive");
        }
        else if (n < 0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }
    }
}
