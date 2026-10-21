package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_06_group_anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        // Iterator's next and hasNext revision
        String[] temp = new String[] { "act","pots","tops","cat","stop","hat" };
        List<String> list = new ArrayList<>(Arrays.asList(temp));
        Iterator iterator = list.iterator();
        // print
        /*while (iterator.hasNext()) {
             System.out.println(iterator.next());
        }*/

        // does iterator modify original list? yes
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            String current = itr.next();
            itr.remove();
        }
        // System.out.println(list);

        String[] strs = new String[] { "act","pots","tops","cat","stop","hat" };
        // String[] strs = new String[] { "ac","c" };
        Solution solution = new Solution();
        // System.out.println(solution.bruteForce(strs));
        // System.out.println(solution.betterThanBruteForce(strs));
        System.out.println(solution.groupAnagrams(strs));
    }
}
