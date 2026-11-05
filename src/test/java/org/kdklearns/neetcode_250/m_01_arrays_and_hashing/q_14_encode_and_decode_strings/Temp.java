package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_14_encode_and_decode_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Temp {
    public static void main(String[] args) {
        // Just for revision
        String[] arr = { "hello\\:", "wor\\:ld", "\\:nice", "\\:cat\\:ch\\:" };
        List<String> strs = Arrays.asList(arr);

        System.out.println("\nInput: " + strs +"\n");

        // 1. Escaping
        String encoded = encode(strs);
        System.out.println("| Escaping using '\\:' delimiter |");
        System.out.println("encoded string: " + encoded);
        System.out.println("decoded list: " + decode(encoded));

        // 2. Chunking
        System.out.println("\n| Chunked into packets |");
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

    private static String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String str: strs) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '\\') {
                    encoded.append('\\');
                }
                encoded.append(str.charAt(i));
            }
            encoded.append(strs.getLast().equals(str) ? "" : "\\:");
        }
        return encoded.toString();
    }

    private static List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '\\') {
                if (i + 1 < str.length() - 1 && str.charAt(i + 1) == ':') {
                    // add word till here to list
                    decoded.add(word.toString());
                    word.setLength(0);
                } else {
                    word.append("\\");
                }
                i++;
            } else {
                word.append(c);
            }
        }
        decoded.add(word.toString());
        return decoded;
    }
}
