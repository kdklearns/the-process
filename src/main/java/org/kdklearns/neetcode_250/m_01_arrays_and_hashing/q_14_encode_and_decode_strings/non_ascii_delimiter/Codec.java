package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_14_encode_and_decode_strings.non_ascii_delimiter;

import java.util.ArrayList;
import java.util.List;

public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (int i = 0; i < strs.size(); i++) {
            if (strs.get(i).equals("")) {
                encoded.append("☕️");
            } else {
                encoded.append(strs.get(i));
            }
            encoded.append(i != strs.size() - 1 ? "🔥" : "");
        }

        return encoded.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> answer = new ArrayList<>();
        String[] split = s.split("🔥");
        for (int i = 0; i < split.length; i++) {
            String str = split[i];
            answer.add(str.equals("☕️") ? "" : str);
        }
        return answer;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));