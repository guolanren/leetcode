package name.guolanren._1to100._11to20.p12;

/**
 * @link https://leetcode.com/problems/integer-to-roman/
 * @author guolanren
 */
public class IntegerToRoman {

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int thousand = num / 1000;
        int hundred = (num % 1000) / 100;
        int ten = (num % 100) / 10;
        int one = num % 10;

        sb.append(handle(thousand, "M", "", ""));
        sb.append(handle(hundred, "C", "M", "D"));
        sb.append(handle(ten, "X", "C", "L"));
        sb.append(handle(one, "I", "X", "V"));

        return sb.toString();
    }


    private String handle(int num, String currentSymbol, String lastSymbol, String middleSymbol) {
        StringBuilder sb = new StringBuilder();

        int gt8 = num - 8;
        if (gt8 > 0) {
            for (int i = 0; i < gt8; i++) {
                sb.append(currentSymbol);
            }
            return sb.append(lastSymbol).toString();
        }

        int gt5 = num - 5;
        if (gt5 >= 0) {
            sb.append(middleSymbol);
            for (int i = 0; i < gt5; i++) {
                sb.append(currentSymbol);
            }
            return sb.toString();
        }

        int eq4 = num - 4;
        if (eq4 == 0) {
            return sb.append(currentSymbol).append(middleSymbol).toString();
        }

        for (int i = 0; i < num; i++) {
            sb.append(currentSymbol);
        }
        return sb.toString();
    }

}
