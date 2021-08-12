package name.guolanren._1to100._41to50.p49;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class GroupAnagramsTest {

    private GroupAnagrams groupAnagrams;

    @Before
    public void before() {
        groupAnagrams = new GroupAnagrams();
    }

    @Test
    public void test() {
        System.out.println(groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        System.out.println(groupAnagrams.groupAnagrams(new String[]{""}));
        System.out.println(groupAnagrams.groupAnagrams(new String[]{"a"}));
    }
}