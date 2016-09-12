/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CoreJavaLab;

import java.util.Scanner;

/**
 *
 * @author srchinth
 */
public class Day1Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fahrenheit Temperature");
        String temp = sc.nextLine();
        double fTemp = Double.valueOf(temp);
        
        double cTemp = 5*(fTemp - 32)/9;
        System.out.print(cTemp);
        
    }
    
}
