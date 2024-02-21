package org.example;

public class Main {
    public static void main(String[] args) {


    }

    public static void isPalindrome(int x) {
        char[] numb = String.valueOf(x).toCharArray();

        boolean isIt = true;

        for (int i = 0; i < numb.length; i++){
            if(numb[i] != numb[numb.length-1 - i]){
                isIt = false;
            }
        }

        System.out.println("number " + x + " is palindrome: " + isIt);
    }
}