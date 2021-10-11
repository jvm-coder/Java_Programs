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
public class breakdigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,r,i,j;
        i=0;
        int a[]=new int[10];
        Scanner obj= new Scanner(System.in);
        n=obj.nextInt();
        while(n>0){
            r=n%10;
            a[i]=r;
            n=n/10;
            i++;
        }
        for(j=i-1;j>=0 ;j--){
        System.out.println(a[j]);
        }
        
    }
    
}
