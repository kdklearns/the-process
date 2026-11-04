package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_14_encode_and_decode_strings.chunking;

import java.util.ArrayList;
import java.util.List;

public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String str: strs) {
            int len = str.length();
            StringBuilder sb = new StringBuilder();
            sb.append(len);
            sb.append("#");
            sb.append(str);
            encoded.append(sb);
        }
        return encoded.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> answer = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int delim = s.indexOf("#");
            int length = Integer.parseInt(s.substring(i, delim));
            String word = s.substring(delim + 1, delim + 1 + length);
            answer.add(word);
            s = s.substring(delim + 1 + length);
        }
        return answer;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));