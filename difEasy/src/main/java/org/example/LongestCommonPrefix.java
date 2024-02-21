package org.example;

public class LongestCommonPrefix {
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
}
