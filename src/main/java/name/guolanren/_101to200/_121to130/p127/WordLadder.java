package name.guolanren._101to200._121to130.p127;

import java.util.*;

/**
 * @link https://leetcode.com/problems/word-ladder/
 * @author guolanren
 */
public class WordLadder {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> beginWords = new LinkedList<>();
        beginWords.offer(beginWord);

        HashSet<String> words = new HashSet<>(wordList);
        words.remove(beginWord);

        return ladderLength(words, beginWords, endWord);
    }

    private int ladderLength(Set<String> words, Queue<String> beginWords, String endWord) {
        int length = 1;
        while (!beginWords.isEmpty()) {
            int size = beginWords.size();
            for (int i = 0; i < size; i++) {
                String beginWord = beginWords.poll();
                Iterator<String> wordIterator = words.iterator();
                while (wordIterator.hasNext()) {
                    String word = wordIterator.next();
                    if (isNeighbor(word, beginWord)) {
                        if (word.equals(endWord)) {
                            return length + 1;
                        }
                        beginWords.offer(word);
                        wordIterator.remove();
                    }
                }
            }
            length++;
        }
        return 0;
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
