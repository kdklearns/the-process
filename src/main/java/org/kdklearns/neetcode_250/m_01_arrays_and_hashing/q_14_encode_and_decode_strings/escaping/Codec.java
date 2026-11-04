package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_14_encode_and_decode_strings.escaping;

import java.util.ArrayList;
import java.util.List;

public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String str: strs) {
            char[] split = str.toCharArray();
            for (int i = 0; i < split.length; i++) {
                if (split[i] == '/') {
                    encoded.append("/");
                }
                encoded.append(split[i]);
            }
            encoded.append("/:");
        }
        return encoded.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        char[] letters = s.toCharArray();

        int i = 0;
        while (i < letters.length) {
            char c = letters[i];
            if (c == '/') {
                if (i + 1 < letters.length && letters[i + 1] == '/') {
                    sb.append('/');
                } else if (i + 1 < letters.length && letters[i + 1] == ':') {
                    answer.add(sb.toString());
                    sb.setLength(0);
                }
                i += 2;
            } else {
                sb.append(c);
                i++;
            }
        }

        return answer;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));