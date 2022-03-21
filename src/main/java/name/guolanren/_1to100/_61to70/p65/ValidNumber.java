package name.guolanren._1to100._61to70.p65;

/**
 * @link https://leetcode.com/problems/valid-number/
 * @author guolanren
 */
public class ValidNumber {

    // ["2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1", "53.5e93", "-123.456e789"]
    // ["abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53"]

    private static final int STATE_INVALID = 0;

    // at +,-
    private static final int STATE_1 = 1;

    // after +,- before dot
    private static final int STATE_2 = 2;

    // at dot with digit
    private static final int STATE_3 = 3;

    // at dot without digit
    private static final int STATE_4 = 4;

    // after dot before e
    private static final int STATE_5 = 5;

    // at e
    private static final int STATE_6 = 6;

    // after e at +,-
    private static final int STATE_7 = 7;

    // after +,- with digit
    private static final int STATE_8 = 8;

    private static final int[] VALID_STATE = new int[9];

    private static final int[][] STATE_TRANSITION = new int[9][256];

    static {
        VALID_STATE[2] = VALID_STATE[3] = VALID_STATE[5] = VALID_STATE[8] = 1;

        STATE_TRANSITION[0]['+'] = 1;
        STATE_TRANSITION[0]['-'] = 1;
        STATE_TRANSITION[0]['0'] = 2;
        STATE_TRANSITION[0]['1'] = 2;
        STATE_TRANSITION[0]['2'] = 2;
        STATE_TRANSITION[0]['3'] = 2;
        STATE_TRANSITION[0]['4'] = 2;
        STATE_TRANSITION[0]['5'] = 2;
        STATE_TRANSITION[0]['6'] = 2;
        STATE_TRANSITION[0]['7'] = 2;
        STATE_TRANSITION[0]['8'] = 2;
        STATE_TRANSITION[0]['9'] = 2;
        STATE_TRANSITION[0]['.'] = 4;

        STATE_TRANSITION[1]['0'] = 2;
        STATE_TRANSITION[1]['1'] = 2;
        STATE_TRANSITION[1]['2'] = 2;
        STATE_TRANSITION[1]['3'] = 2;
        STATE_TRANSITION[1]['4'] = 2;
        STATE_TRANSITION[1]['5'] = 2;
        STATE_TRANSITION[1]['6'] = 2;
        STATE_TRANSITION[1]['7'] = 2;
        STATE_TRANSITION[1]['8'] = 2;
        STATE_TRANSITION[1]['9'] = 2;
        STATE_TRANSITION[1]['.'] = 4;

        STATE_TRANSITION[2]['0'] = 2;
        STATE_TRANSITION[2]['1'] = 2;
        STATE_TRANSITION[2]['2'] = 2;
        STATE_TRANSITION[2]['3'] = 2;
        STATE_TRANSITION[2]['4'] = 2;
        STATE_TRANSITION[2]['5'] = 2;
        STATE_TRANSITION[2]['6'] = 2;
        STATE_TRANSITION[2]['7'] = 2;
        STATE_TRANSITION[2]['8'] = 2;
        STATE_TRANSITION[2]['9'] = 2;
        STATE_TRANSITION[2]['.'] = 3;
        STATE_TRANSITION[2]['e'] = 6;
        STATE_TRANSITION[2]['E'] = 6;

        STATE_TRANSITION[3]['0'] = 5;
        STATE_TRANSITION[3]['1'] = 5;
        STATE_TRANSITION[3]['2'] = 5;
        STATE_TRANSITION[3]['3'] = 5;
        STATE_TRANSITION[3]['4'] = 5;
        STATE_TRANSITION[3]['5'] = 5;
        STATE_TRANSITION[3]['6'] = 5;
        STATE_TRANSITION[3]['7'] = 5;
        STATE_TRANSITION[3]['8'] = 5;
        STATE_TRANSITION[3]['9'] = 5;
        STATE_TRANSITION[3]['e'] = 6;
        STATE_TRANSITION[3]['E'] = 6;
        
        STATE_TRANSITION[4]['0'] = 5;
        STATE_TRANSITION[4]['1'] = 5;
        STATE_TRANSITION[4]['2'] = 5;
        STATE_TRANSITION[4]['3'] = 5;
        STATE_TRANSITION[4]['4'] = 5;
        STATE_TRANSITION[4]['5'] = 5;
        STATE_TRANSITION[4]['6'] = 5;
        STATE_TRANSITION[4]['7'] = 5;
        STATE_TRANSITION[4]['8'] = 5;
        STATE_TRANSITION[4]['9'] = 5;

        STATE_TRANSITION[5]['0'] = 5;
        STATE_TRANSITION[5]['1'] = 5;
        STATE_TRANSITION[5]['2'] = 5;
        STATE_TRANSITION[5]['3'] = 5;
        STATE_TRANSITION[5]['4'] = 5;
        STATE_TRANSITION[5]['5'] = 5;
        STATE_TRANSITION[5]['6'] = 5;
        STATE_TRANSITION[5]['7'] = 5;
        STATE_TRANSITION[5]['8'] = 5;
        STATE_TRANSITION[5]['9'] = 5;
        STATE_TRANSITION[5]['e'] = 6;
        STATE_TRANSITION[5]['E'] = 6;

        STATE_TRANSITION[6]['+'] = 7;
        STATE_TRANSITION[6]['-'] = 7;
        STATE_TRANSITION[6]['0'] = 8;
        STATE_TRANSITION[6]['1'] = 8;
        STATE_TRANSITION[6]['2'] = 8;
        STATE_TRANSITION[6]['3'] = 8;
        STATE_TRANSITION[6]['4'] = 8;
        STATE_TRANSITION[6]['5'] = 8;
        STATE_TRANSITION[6]['6'] = 8;
        STATE_TRANSITION[6]['7'] = 8;
        STATE_TRANSITION[6]['8'] = 8;
        STATE_TRANSITION[6]['9'] = 8;
        
        STATE_TRANSITION[7]['0'] = 8;
        STATE_TRANSITION[7]['1'] = 8;
        STATE_TRANSITION[7]['2'] = 8;
        STATE_TRANSITION[7]['3'] = 8;
        STATE_TRANSITION[7]['4'] = 8;
        STATE_TRANSITION[7]['5'] = 8;
        STATE_TRANSITION[7]['6'] = 8;
        STATE_TRANSITION[7]['7'] = 8;
        STATE_TRANSITION[7]['8'] = 8;
        STATE_TRANSITION[7]['9'] = 8;

        STATE_TRANSITION[8]['0'] = 8;
        STATE_TRANSITION[8]['1'] = 8;
        STATE_TRANSITION[8]['2'] = 8;
        STATE_TRANSITION[8]['3'] = 8;
        STATE_TRANSITION[8]['4'] = 8;
        STATE_TRANSITION[8]['5'] = 8;
        STATE_TRANSITION[8]['6'] = 8;
        STATE_TRANSITION[8]['7'] = 8;
        STATE_TRANSITION[8]['8'] = 8;
        STATE_TRANSITION[8]['9'] = 8;
    }
    
    public boolean isNumber(String s) {
        int curState = 0;
        for (int i = 0; i < s.length(); i++) {
            curState = STATE_TRANSITION[curState][s.charAt(i)];
            if (curState == 0) {
                return false;
            }
        }
        return VALID_STATE[curState] == 1;
    }

}
