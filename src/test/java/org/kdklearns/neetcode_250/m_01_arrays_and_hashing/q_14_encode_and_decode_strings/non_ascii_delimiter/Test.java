package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_14_encode_and_decode_strings.non_ascii_delimiter;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // Building
        /*String[] arr = {"hello", "world", "i", "am", "keshav!"};
        List<String> strs = new ArrayList<>(Arrays.asList(arr));

        // encoding
        StringBuilder encoded = new StringBuilder();
        for (int i = 0; i < strs.size(); i++) {
            encoded.append(strs.get(i));
            encoded.append(i != strs.size() - 1 ? "🔥" : "");
        }
        System.out.println("encoded: " + encoded);

        // decoding
        String input = encoded.toString();
        String[] decoded = input.split("🔥");
        System.out.println("decoded: " + Arrays.toString(decoded));*/




        // testing submission
        Codec codec = new Codec();
        String[] strs = {"hello", "", "world", "", "", "i", "am", ""};
        System.out.println(codec.decode(codec.encode(new ArrayList<String>(Arrays.asList(strs)))));
    }
}
