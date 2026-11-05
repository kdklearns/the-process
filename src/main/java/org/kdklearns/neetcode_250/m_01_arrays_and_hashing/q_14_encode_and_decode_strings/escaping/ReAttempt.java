package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_14_encode_and_decode_strings.escaping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReAttempt {
    public static void main(String[] args) {
        // // Revising while drafting notes, lol
        String[] arr = { "hello\\:", "wor\\:ld", "\\:nice", "\\:cat\\:ch\\:" };
        List<String> strs = Arrays.asList(arr);

        System.out.println("\nInput: " + strs + "\n");

        // Escaping: Used the actual escape character '\'
        String encoded = encode(strs);
        System.out.println("encoded string: " + encoded);
        System.out.println("decoded list: " + decode(encoded));
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
