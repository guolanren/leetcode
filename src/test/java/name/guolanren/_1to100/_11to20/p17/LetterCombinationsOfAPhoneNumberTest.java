package name.guolanren._1to100._11to20.p17;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class LetterCombinationsOfAPhoneNumberTest {

    private LetterCombinationsOfAPhoneNumber letterCombinationsOfAPhoneNumber;

    @Before
    public void before() throws Exception {
        letterCombinationsOfAPhoneNumber = new LetterCombinationsOfAPhoneNumber();
    }

    @Test
    public void test() {
        System.out.println(letterCombinationsOfAPhoneNumber.letterCombinations("23"));
        System.out.println(letterCombinationsOfAPhoneNumber.letterCombinations(""));
        System.out.println(letterCombinationsOfAPhoneNumber.letterCombinations("2"));
    }
}