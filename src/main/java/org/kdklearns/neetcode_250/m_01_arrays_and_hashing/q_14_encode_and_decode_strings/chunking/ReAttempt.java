package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_14_encode_and_decode_strings.chunking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReAttempt {
    public static void main(String[] args) {
        // Revising while drafting notes, lol
        String[] arr = { "hello\\:", "wor\\:ld", "\\:nice", "\\:cat\\:ch\\:" };
        List<String> strs = Arrays.asList(arr);

        System.out.println("\nInput: " + strs + "\n");

        // Chunking: without using substring
        String encodedChunk = encodeChunk(strs);
        System.out.println("encoded chunk: " + encodedChunk);
        System.out.println("decoded chunks: " + decodeChunk(encodedChunk));
    }

    private static String encodeChunk(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String str: strs) {
            int len = str.length();
            // init packet
            encoded.append(len);
            encoded.append("#");

            encoded.append(str);
        }
        return encoded.toString();
    }

    private static List<String> decodeChunk(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = getLength(str, i , j);
            String word = extract(str, length, j + 1);
            decoded.add(word);
            i = j + 1 + length;
        }
        return decoded;
    }

    // helper
    private static int getLength(String str, int s, int e) {
        StringBuilder sb = new StringBuilder();
        for (int i = s; i < e; i++) {
            sb.append(str.charAt(i));
        }
        return Integer.parseInt(sb.toString());
    }

    // helper
    private static String extract(String str, int length, int start) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < start + length; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
