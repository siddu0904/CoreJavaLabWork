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
public class VariableArguments {
    
    static String[] numbers = {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
    
    
    public static void main(String[] args) {
        
        
        addUp(3.2, 2.2,3.5,4.5);
        addUp(1, 4,4,3);
        addUp("one", "three","four","five");
        addUp(2, 3.5,1,5.5);
        addUp(1,"three");
    
    }
    public static void addUp(int... list){
        int result = 0;
         for(int number: list){
             result += number;
         }  
        
        System.out.print("integer method invoked ");
        System.out.println(result);
            
        }
        
        public static void addUp(double... list){
            double result = 0;
         for(double number: list){
             result += number;
         }  
                            
     System.out.print("double method invoked ");
     System.out.println(result);

        }
        
        public static void addUp(String... list){
            
            int result = 0;
            for(String number: list){
                result += toNumber(number);
            }
            
            System.out.print("String method invoked ");
            System.out.println(result);
                    }
        
        public static int toNumber(String a){
            if(Arrays.asList(numbers).contains(a))
            {
                return Arrays.asList(numbers).indexOf(a);
            }
            return -1;
        }
    
}
