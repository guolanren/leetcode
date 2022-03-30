package name.guolanren._1to100._81to90.p89;

import java.util.*;

/**
 * @author guoyaozhan
 */
public class GrayCode {

    public List<Integer> grayCode(int n) {
        LinkedList<Integer> res = new LinkedList<>();
        Set<Integer> used = new HashSet<>(n);
        for (int i = 0; i < n; i++) {
            res.addLast(i);
            used.add(i);
            if (grayCode(res, used, n)) {
                break;
            }
            res.removeLast();
            used.remove(i);
        }

        return res;
    }

    private boolean grayCode(LinkedList<Integer> res, Set<Integer> used, int n) {
        if (res.size() == 1 << n){
            int tmp = res.getFirst() ^ res.getLast();
            return (tmp & (tmp - 1)) == 0;
        }

        for (int i = 0; i < n; i++) {
            int last = res.getLast();
            int candidate = last ^ (1 << i);
            if (used.contains(candidate)) {
                continue;
            }
            res.addLast(candidate);
            used.add(candidate);
            if (grayCode(res, used, n)) {
                return true;
            }
            res.removeLast();
            used.remove(candidate);
        }

        return false;
    }

}
