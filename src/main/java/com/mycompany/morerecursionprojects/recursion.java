/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.morerecursionprojects;

/**
 *
 * @author mike
 */
public class recursion {
    public static int twoToThePowerOf(int x) {
        if (x == 0) {
            return 1;
//        } else if (x == 1) {
//            return 2;
        } else {
            return 2 * twoToThePowerOf(x -1);
        }
    }
    
    public static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else if (exp == 1) {
            return base;
        } else {
            return base * (power(base, exp-1));
        }
    }
    
    
    public static boolean palindrome(String word) {
        // normalize
        word = word.toLowerCase();
        word = word.replaceAll("[^a-zA-Z0-9]", "");
    
        int lastPos = word.length()-1;
        // System.out.println(word);
        
        if (word.charAt(0) != word.charAt(lastPos)) {
            return false;
        } else if (word.length() == 1 || word.length() == 2) {
            return true;
        } else {
            return palindrome(word.substring(1, lastPos));
        }
    }
    
    public static void reverseString(String string) {
        int len = string.length();
        
        // base case
        if (len == 1) {
            System.out.print(string);
        } else {
            System.out.print(string.charAt(len-1));
            reverseString(string.substring(0, len-1));
        }
    }
    
    public static void main(String[] args) {
        int exponent = 5;
        int tttp = twoToThePowerOf(exponent);
        System.out.println("2^" + exponent + "=" + tttp);
        
        int base = 3;
        int exp = 4;
        int pw = power(base, exp);
        System.out.println(base + "^" + exp + "=" + pw);
        
        String word = "Mr. Owl ate my metal worm";
        if (palindrome(word)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
        
        word = "Some string";
        System.out.print("The string \"" + word + "\" backwards is : \"");
        reverseString(word);
        System.out.print("\"");
    }
    
}
