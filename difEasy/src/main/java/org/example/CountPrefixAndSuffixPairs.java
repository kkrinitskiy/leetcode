package org.example;

public class CountPrefixAndSuffixPairs {
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
}
