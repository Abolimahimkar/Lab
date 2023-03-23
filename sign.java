//Write a java program to generate a following @'s triangle.//
  

import java.util.Scanner;
public class sign
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
 
    System.out.println("Enter the number of rows: "); 
    int rows = 5;
 
    for (int i= rows-1; i>=0 ; i--)
    {
    for (int j=0; j<=i; j++)
    {
    System.out.print("@" + " ");
    }
    System.out.println();
    }
    
    }
    }
 


