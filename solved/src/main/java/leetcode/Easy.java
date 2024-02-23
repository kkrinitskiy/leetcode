package leetcode;

import java.util.Stack;

public class Easy {

    public static int countPrefixSuffixPairs(String[] words) {
        int counter = 0;

        for (int i = 0; i < words.length; i++) {
            if(i == words.length-1){
                break;
            }
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].startsWith(words[i]) && words[j].endsWith(words[i])){
                    counter++;
                }
            }
        }
        return counter;
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

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (char c : stones.toCharArray()) {
            if (jewels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            System.out.println("longest common prefix is: \"\"");
            return;
        }

        StringBuilder stringBuilder = new StringBuilder();
        char[] ch = strs[0].toCharArray();


        for (int i = 0; i < ch.length; i++) {
            boolean equality = true;

            stringBuilder.append(ch[i]);
            for (String str : strs) {
                if(!str.startsWith(stringBuilder.toString())){
                    equality = false;
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                    break;
                }
            }
        }

        System.out.println("longest common prefix is: \"" + stringBuilder + "\"");
    }

    public static int maxOperations(int[] nums) {

        int count = 1;
        int sum = nums[0] + nums[1];
        for(int i = 2; i<nums.length-1; i++){
            if(nums[i] + nums[i+1] == sum){
                count++;
                i++;
            }else {
                break;
            }
        }
        return count;

    }

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

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (char c : chars) {
            switch (c){
                case '(' -> stack.push(')');
                case '{' -> stack.push('}');
                case '[' -> stack.push(']');
                case ')', '}', ']' -> {
                    if (stack.isEmpty() || stack.pop() != c)
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static class ParkingSystem {
        int big, medium, small;

        public ParkingSystem(int big, int medium, int small) {
            this.big = big;
            this.medium = medium;
            this.small = small;
        }

        public boolean addCar(int carType) {
            if(carType == 1 && big > 0){
                big -= 1;
                return true;
            }
            if(carType == 2 && medium > 0){
                medium -= 1;
                return true;
            }
            if(carType == 3 && small > 0){
                small -= 1;
                return true;
            }
            return false;
        }
    }
}
