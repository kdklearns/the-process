package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_06_group_anagrams;

import java.util.*;

class Solution {

    // Most Optimal Solution
    // T.C. O(N * K), S.C. O(N * K)
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> bucket = new HashMap<>();
        for (String str: strs) {
            String key = markFrequencyAndGetKey(str);
            bucket.putIfAbsent(key, new ArrayList<String>());
            bucket.get(key).add(str);
        }
        return new ArrayList<>(bucket.values());
    }

    private String markFrequencyAndGetKey(String str) {
        char[] letters = str.toCharArray();
        int[] arr = new int[26];
        for (char c: letters) {
            arr[c - 'a']++;
        }
        return Arrays.toString(arr);
    }

    // T.C. O(N * K * logK), S.C. O(N * K), where 'K' is length of longest string
    public List<List<String>> betterThanBruteForce(String[] strs) {
        List<List<String>> anagrams = new ArrayList<>();
        String[] strings = Arrays.copyOf(strs, strs.length);

        // sorting individual strings characters
        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
            char[] letters = string.toCharArray();
            Arrays.sort(letters);
            strings[i] = new String(letters);
        }

        // use hashmap bucket to store anagram strings
        Map<String, List<String>> bucket = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
            if (bucket.containsKey(string)) {
                List<String> group = bucket.get(string);
                group.add(strs[i]);
            } else {
                List<String> group = new ArrayList<>();
                group.add(strs[i]);
                bucket.put(string, group);
            }
        }

        // iterate bucket and add individual groups
        for (List<String> group: bucket.values()) {
            anagrams.add(group);
        }

        return anagrams;
    }

    // T.C. O(N * K), S.C. O(N^2 * K), where 'K' is length of longest string
    public List<List<String>> bruteForce(String[] strs) {
        List<String> copy = new ArrayList<>(Arrays.asList(strs));
        List<List<String>> anagrams = new ArrayList<>();

        while (!copy.isEmpty()) {
            Iterator<String> iterator = copy.iterator();
            String current = iterator.next();
            iterator.remove();
            int[] frequency = new int[26];

            markCharacters(frequency, current);
            int[] frequencyCopy = Arrays.copyOf(frequency, frequency.length);
            List<String> group = new ArrayList<>();
            group.add(current);

            while (iterator.hasNext()) {
                String next = iterator.next();
                // no need to check if the length's itself are unequal
                if (current.length() != next.length()) {
                    continue;
                }
                char[] letters = next.toCharArray();
                boolean isAnagram = true;
                for (char letter: letters) {
                    if (frequencyCopy[letter - 'a'] == 0) {
                        // character mismatch
                        isAnagram = false;
                        break;
                    }
                    frequencyCopy[letter - 'a']--;
                }
                if (isAnagram) {
                    group.add(next);
                    iterator.remove();
                }
                frequencyCopy = Arrays.copyOf(frequency, frequency.length);
            }

            anagrams.add(group);
        }

        return anagrams;
    }

    private void markCharacters(int[] arr, String str) {
        char[] letters = str.toCharArray();
        for (char letter: letters) {
            arr[letter - 'a']++;
        }
    }
}
