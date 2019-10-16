/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathpractice;

import java.util.Scanner;

/**
 *
 * @author esmeralda.iyescas001
 */
public class MathPractice {
    //Write a method that takes in three sides of a triangle 
     int a;
     int b; 
     int c;
    
    public static boolean Triangle(int a, int b, int c){
        if(a + b > c && b + c > a && a + c > b){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Random Number >.<");
        System.out.println((int)(Math.random() * 500));
        //called "casting" (int) 
        //take double and turn into integer
        int side1 = 0;
        int side2 = 0; 
        int side3 = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's determine whether its a triangle!");
        System.out.println("Enter the first triangle length: ");
        side1 = scan.nextInt();
        System.out.println("Enter the second triangle length: ");
        side2 = scan.nextInt();
        System.out.println("Enter the third triangle length: ");
        side3 = scan.nextInt();
        
             if(!Triangle(side1, side2, side3)){
                 System.out.println("Your triangle is not valid! :(");
             }else{
                 System.out.println("Your triangle is valid! :)");
             }
       // System.out.println("True or False whether triangle is valid: " + Triangle(side1, side2, side3));
        
        //if(!Triangle(scan.nextInt(),scan.nextInt(),scan.nextInt()))
        //System.out.println("Those are not valid lengths! ");
        
    }
    
}
