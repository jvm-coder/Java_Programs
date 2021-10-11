/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.worksheet1;

import java.util.Scanner;

/**
 *
 * @author Shanmuga Priya M
 */
public class reversearray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[]=new int[10];
        int n,i;
        Scanner obj= new Scanner(System.in);
        System.out.println("enter sizr of array");
        n=obj.nextInt();
        System.out.println("enter elements of array");
        for(i=0;i<n;i++){
            a[i]=obj.nextInt();
        }
        for(i=n-1;i>=0;i--){
            System.out.println(a[i]); 
        }
    }
    
}
