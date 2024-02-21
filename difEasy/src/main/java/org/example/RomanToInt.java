package org.example;

public class RomanToInt {
    public static void romanToInt(String s) {
        char[] roman = s.toCharArray();
        int sum = 0;

        int[] ints = new int[roman.length];

        for (int i = 0; i < roman.length; i++) {
            switch (roman[i]){
                case 'I' -> ints[i] = 1;
                case 'V' -> ints[i] = 5;
                case 'X' -> ints[i] = 10;
                case 'L' -> ints[i] = 50;
                case 'C' -> ints[i] = 100;
                case 'D' -> ints[i] = 500;
                case 'M' -> ints[i] = 1000;
            }
        }

        for (int i = 0; i < ints.length; i++) {
            if(i == ints.length - 1){
                sum += ints[i];
            } else if(ints[i] < ints[i + 1]){
                sum += ints[i + 1] - ints[i];
                i++;
            }else {
                sum += ints[i];
            }
        }

        System.out.println("Roman: \"" + s + "\" to int: " + sum);
    }
}
