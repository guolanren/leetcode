package name.guolanren._1to100._91to100.p93;

import java.util.ArrayList;
import java.util.List;

/**
 * @link https://leetcode.com/problems/restore-ip-addresses/
 * @author guolanren
 */
public class RestoreIPAddresses {

    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() > 12) {
            return res;
        }
        for (int i = 1; i <= 3 && s.length() - i >= 3; i++) {
            if (!valid(s, 0, i)) {
                break;
            }
            for (int j = i + 1; j <= i + 3 && s.length() - j >= 2; j++) {
                if (!valid(s, i, j)) {
                    break;
                }
                for (int k = j + 1; k <= j + 3 && s.length() - k >= 1; k++) {
                    if (!valid(s, j, k)) {
                        break;
                    } else if (valid(s, k, s.length())) {
                        StringBuilder ip = new StringBuilder(s);
                        ip.insert(i, '.');
                        ip.insert(j + 1, '.');
                        ip.insert(k + 2, '.');
                        res.add(ip.toString());
                    }
                }
            }
        }
        return res;
    }

    private boolean valid(String s, int from, int to) {
        int len = to - from;
        if (len >= 4) {
            return false;
        } else if (len == 3) {
            char head = s.charAt(from);
            char middle = s.charAt(from + 1);
            char tail = s.charAt(from + 2);
            return head == '1' || (head == '2' && ((middle == '5' && tail <= '5') || middle < '5'));
        } else if (len == 2) {
            return s.charAt(from) != '0';
        } else {
            return true;
        }
    }

}
