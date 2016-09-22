/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodarguments;

import java.util.Arrays;

/**
 *
 * @author srchinth
 */
public class Main {
    
       static String[] numbers = {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
    public static void main(String[] args) {
        
          
        addUp(3.2, 2.2);
        addUp(1, 4);
        addUp("one", "three");
        addUp(2, 3.5);
        //addUp(1,"three");
    
    }
    public static void addUp(int a, int b){
            System.out.print("integer method invoked ");
            System.out.println(a+b);
        }
        
        public static void addUp(double a, double b){
            System.out.print("double method invoked ");
            System.out.println(a+b);
        }
        
        public static void addUp(String a, String b){
            System.out.print("String method invoked ");
            System.out.println(toNumber(a)+toNumber(b));
        }
        
        public static int toNumber(String a){
            if(Arrays.asList(numbers).contains(a))
            {
                return Arrays.asList(numbers).indexOf(a);
            }
            return -1;
        }

}
