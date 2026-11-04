package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_14_encode_and_decode_strings.escaping;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String[] strs2 = { "Hello", "Wor/:ld", "Nice/:", "To", "Me/et", "You" };
        Codec codec = new Codec();
        String encoded = codec.encode(Arrays.asList(strs2));
        System.out.println("encoded: " + encoded);
        List<String> decoded = codec.decode(encoded);
        System.out.println("decoded: " + decoded);
    }
}
