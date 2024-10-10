package com.strings;

import java.util.Arrays;
import java.util.Optional;

class LongestSubstring {
    public Optional<Integer> lengthOfLongestSubstring(String s) {
        int[] c = new int[26];
        Arrays.fill(c, 0);
        return Optional.ofNullable(null);

       /* return Arrays.stream(c).mapToObj(i -> c[i-'a']==s[i]++)
                .filter(x -> c[x]>0).reduce(Integer::sum);*/
    }

    public static void main(String[] args) {
        LongestSubstring l = new LongestSubstring();
        System.out.println(l.lengthOfLongestSubstring("abcabcbb"));
    }
}
