package name.guolanren._101to200._121to130.p126;

import java.util.*;

/**
 * @link https://leetcode.com/problems/word-ladder-ii/
 * @author guolanren
 */
public class WordLadder2 {

    List<List<String>> ladders = new ArrayList<>();

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Queue<LinkedList<String>> subLadders = new LinkedList<>();
        LinkedList<String> subLadder = new LinkedList<>();
        subLadder.add(beginWord);
        subLadders.offer(subLadder);

        HashSet<String> used = new HashSet<>();
        used.add(beginWord);

        findLadders(subLadders, used, endWord, wordList);
        return ladders;
    }

    private void findLadders(Queue<LinkedList<String>> subLadders, Set<String> used, String endWord, List<String> wordList) {
        boolean endFlag = false;
        while (!subLadders.isEmpty()) {
            Set<String> allNeighbors = new HashSet<>();
            int size = subLadders.size();
            for (int i = 0; i < size; i++) {
                LinkedList<String> subLadder = subLadders.poll();
                String last = subLadder.getLast();
                for (String word : wordList) {
                    if (!used.contains(word) && isNeighbor(word, last)) {
                        LinkedList<String> newSub = new LinkedList<>(subLadder);
                        newSub.add(word);
                        if (word.equals(endWord)) {
                            ladders.add(newSub);
                            endFlag = true;
                        } else {
                            allNeighbors.add(word);
                            subLadders.offer(newSub);
                        }
                    }
                }
            }
            if (endFlag) {
                break;
            }
            used.addAll(allNeighbors);
        }
    }

    private Boolean isNeighbor(String s1, String s2) {
        int diff = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diff++;
            }
            if (diff > 1) {
                return false;
            }
        }
        return diff == 1;
    }

}
