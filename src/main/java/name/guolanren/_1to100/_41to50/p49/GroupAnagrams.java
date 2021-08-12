package name.guolanren._1to100._41to50.p49;

import java.util.*;

/**
 * @link https://leetcode.com/problems/group-anagrams/
 * @author guolanren
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>(strs.length);
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            List<String> group = groups.computeIfAbsent(String.valueOf(chars), (t) -> new ArrayList<>());
            group.add(str);
        }
        return new ArrayList<>(groups.values());
    }

}
