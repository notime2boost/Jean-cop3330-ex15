package Ex15;


import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Jean
 */
public class App 
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);
        String password = "abc123";
        System.out.println("What is the username?");
        String userN = input.next();
        System.out.println("What is the password?");
        String userP = input.next();

        if(userP.equals(password)){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you.");
        }
    }
}
