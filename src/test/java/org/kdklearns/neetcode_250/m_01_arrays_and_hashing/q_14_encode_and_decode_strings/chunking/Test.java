package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_14_encode_and_decode_strings.chunking;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        String[] strs2 = { "Hello", "Wor/:ld", "Nice/:", "To", "Me/et", "You" };
        String[] strs2 = { "63/Rc","h","BmI3FS~J9#vmk","7uBZ?7*/","24h+X","O " };
        Codec codec = new Codec();
        String encoded = codec.encode(Arrays.asList(strs2));
        System.out.println("encoded: " + encoded);
        System.out.println("decoded: " + codec.decode(encoded));
    }
}
