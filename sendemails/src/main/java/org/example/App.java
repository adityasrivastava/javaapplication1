package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sender email address :");
        String sender = sc.next();
        System.out.println("Enter the email message");
        String message = sc.next();
        System.out.println("Enter the recipients address [m]x[n]: ");

        // enter row and column for array.
        System.out.print("Enter row for the array (max 10) : ");
        int row = sc.nextInt();
        System.out.print("Enter column for the array (max 10) : ");
        int col = sc.nextInt();
        String[][] friendsArray = new String[row][col];

        // enter array elements.
        System.out.println("Enter " +(row*col)+ " Array Elements : ");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                friendsArray[i][j] = sc.next();
            }
        }

        // the 2D array is here.
        System.out.print("The Array is :\n");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(friendsArray[i][j]+ "  ");
            }
            System.out.println();
        }


    }

    void sendMail(String emailAddress, String message, String[][] friendsArray){

    }
}
