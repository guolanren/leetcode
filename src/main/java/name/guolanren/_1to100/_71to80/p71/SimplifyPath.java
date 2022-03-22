package name.guolanren._1to100._71to80.p71;

import java.util.LinkedList;

/**
 * @link https://leetcode.com/problems/simplify-path/
 * @author guolanren
 */
public class SimplifyPath {

    public String simplifyPath(String path) {
        path += "/";
        LinkedList<String> directories = new LinkedList();
        StringBuilder directory = new StringBuilder();
        for (int i = 1; i < path.length(); i++) {
            if (path.charAt(i) == '/') {
                String dir = directory.toString();
                if (dir.equals("..")) {
                    directories.pollLast();
                } else if (!dir.equals(".") && dir.length() > 0) {
                    directories.add(dir);
                }
                directory.setLength(0);
            } else {
                directory.append(path.charAt(i));
            }
        }

        StringBuilder simplifyPath = new StringBuilder();
        for (String dir : directories) {
            simplifyPath.append("/").append(dir);
        }
        return simplifyPath.length() == 0 ? "/" : simplifyPath.toString();
    }

}
