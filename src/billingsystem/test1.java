/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billingsystem;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter mobile no.");
        String mobile= sc.next();
        mobile = mobile.trim();
        try{
         Long.parseLong(mobile);
          
         if(mobile.length()!=10)
                System.out.println("must have 10 digits");
         else
                System.out.println("yes: it is valid mobile number");
       }
        catch(Exception e){
           System.out.println("invalid mobile: only digits allowed");
       }
    }
}
