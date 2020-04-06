package com.leetcode.weekone;

import java.util.*;

/*
Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.
 */

public class AnagramCollector {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagramCollection = new ArrayList<>();
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String sortedString = String.valueOf(charArray);
            if (!anagramMap.containsKey(sortedString)) {
                List<String> strList = new ArrayList<>();
                strList.add(strs[i]);
                anagramMap.put(sortedString, strList);
            } else {
                List<String> anagramList = anagramMap.get(sortedString);
                anagramList.add(strs[i]);
                anagramMap.put(sortedString, anagramList);
            }
        }

        for (String key : anagramMap.keySet()) {
            anagramCollection.add(anagramMap.get(key));
        }

        return anagramCollection;
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        AnagramCollector anagramCollector = new AnagramCollector();
        System.out.println(anagramCollector.groupAnagrams(strs));
    }
}
