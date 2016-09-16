/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CoreJavaLab;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WhatDayItIs {

      public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        //boolean timeToQuit = userInput.nextLine().equals("quit");
	while (!userInput.equals("quit")) 
        {
            try {
                           
        System.out.println("enter the year");
        int year = userInput.toString().equals("quit") ? 0 : userInput.nextInt();
        //boolean timeToQuit = userInput.nextLine().equals("quit");
        System.out.println("Enter the Month of the Year");
        int month = userInput.nextInt();
        if(month == 1 | month == 2)
	  {
                month = month+12;
                year--;
          }
        int m = (13*(month+1)/5);
        int b = year/4;
        int c = 6*(year/100);
        int d = year/400;
        System.out.println("Enter the Day of the Year");
        int day = userInput.nextInt();
        int sum = (m+b+c+d+day+year) % 7 ;
        switch(sum) {
            case 0:
                System.out.println("Saturday");
            break;
            case 1: 
                System.out.println("Sunday");
             break;
             case 2: 
                System.out.println("Monday");
             break;
             case 3: 
                System.out.println("Tuesday");
             break;
             case 4: 
                System.out.println("Wednesday");
             break;
             case 5: 
                System.out.println("Thursday");
             break;
             case 6: 
                System.out.println("Friday");
             break;
             default:
                 System.out.println("Error");
                     }
        }
        catch (InputMismatchException e) {
            System.out.println("Input error");
            userInput.next();
        }

}
}
}
