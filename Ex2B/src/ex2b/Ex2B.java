/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2b;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex2B {
    public static void main(String[] args) {
        System.out.println("Hola");
        System.out.println("Input your string");
        String frase;
        int j=0;
        boolean exit=true;
        Scanner sc = new Scanner(System.in);
        frase=sc.next();
        char[] array = frase.toCharArray();
        j=array.length-1;
        for (int i=0;i<j/2;i++)
        {
            if (array[i]!=array[j-i] && exit) exit=false;
            else exit=true;
        }
        if (exit) System.out.println("Palindroma");
        else System.out.println("No alindroma");
    }
    
}
