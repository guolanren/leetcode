package name.guolanren._101to200._141to150.p149;

import java.util.HashMap;
import java.util.Map;

/**
 * @link https://leetcode.com/problems/max-points-on-a-line/
 * @author guolanren
 */
public class MaxPointsOnALine {

    public int maxPoints(int[][] points) {
        if (points == null) {
            return 0;
        }
        if (points.length <= 2) {
            return points.length;
        }

        Map<Integer, Map<Integer,Integer>> map = new HashMap<>();
        int result = 0;
        for (int i = 0; i<points.length; i++){
            map.clear();
            int overlap = 0, max = 0;
            for (int j = i + 1; j < points.length; j++){
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];
                if (dx == 0 && dy == 0){
                    overlap++;
                    continue;
                }
                int gcd=generateGCD(dx, dy);
                if (gcd!=0){
                    dx /= gcd;
                    dy /= gcd;
                }

                if (map.containsKey(dx)){
                    if (map.get(dx).containsKey(dy)){
                        map.get(dx).put(dy, map.get(dx).get(dy) + 1);
                    }else{
                        map.get(dx).put(dy, 1);
                    }
                }else{
                    Map<Integer, Integer> m = new HashMap<>();
                    m.put(dy, 1);
                    map.put(dx, m);
                }
                max = Math.max(max, map.get(dx).get(dy));
            }
            result = Math.max(result, max + overlap + 1);
        }
        return result;
    }

    private int generateGCD(int a,int b){
        if (b == 0) {
            return a;
        } else {
            return generateGCD(b,a % b);
        }
    }

}
