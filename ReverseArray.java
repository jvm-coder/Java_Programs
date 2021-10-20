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
public static void main(String[] args) {
        int a[]=new int[10];
        int riv_a[]=new int[10];
        int n,i;
        Scanner obj= new Scanner(System.in);
        System.out.println("enter size of array : ");
        n=obj.nextInt();
        System.out.println("enter elements of array : ");
        for(i=0;i<n;i++){
            a[i]=obj.nextInt();
        }
        for(i=0;i<n;i++){
            riv_a[i]=a[n-1-i];
        }
        for(i=0;i<n;i++){
            System.out.println(riv_a[i]);
        }
    }
    
}
