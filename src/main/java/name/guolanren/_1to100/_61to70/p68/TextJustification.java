package name.guolanren._1to100._61to70.p68;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @link https://leetcode.com/problems/text-justification/
 * @author guolanren
 */
public class TextJustification {

    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> format = new ArrayList<>();

        int lineLen = 0;
        List<String> line = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (lineLen > maxWidth - words[i].length() - line.size()) {
                format.add(formatLine(line, lineLen, maxWidth));
                lineLen = 0;
                line.clear();
            }

            lineLen += words[i].length();
            line.add(words[i]);
        }

        if (!line.isEmpty()) {
            String lastLine = String.join(" ", line);
            char[] spaceFill = new char[maxWidth - lastLine.length()];
            Arrays.fill(spaceFill, ' ');
            lastLine = lastLine + String.valueOf(spaceFill);
            format.add(lastLine);
        }

        return format;
    }

    private String formatLine(List<String> line, int lineLen, int maxWidth) {
        StringBuilder lineBuilder = new StringBuilder("");
        if (line.size() == 1) {
            char[] spaceFill = new char[maxWidth - line.get(0).length()];
            Arrays.fill(spaceFill, ' ');
            lineBuilder.append(line.get(0));
            lineBuilder.append(String.valueOf(spaceFill));
            return lineBuilder.toString();
        }

        int remainSpace = maxWidth - lineLen;
        int baseSpace = remainSpace / (line.size() - 1);
        int modSpace = remainSpace - baseSpace * (line.size() - 1);
        for (int i = 0; i < line.size(); i++) {
            int more = modSpace-- > 0 ? 1 : 0;
            int spaceNum = Math.min(remainSpace, baseSpace + more);
            remainSpace -= spaceNum;

            char[] spaceFill = new char[spaceNum];
            Arrays.fill(spaceFill, ' ');
            lineBuilder.append(line.get(i));
            lineBuilder.append(String.valueOf(spaceFill));
        }
        return lineBuilder.toString();
    }

}
