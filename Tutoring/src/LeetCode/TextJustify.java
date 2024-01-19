package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class TextJustify {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0, n = words.length;
        while (i < n) {
            int j = i + 1, lineLength = words[i].length();
            while (j < n && (lineLength + words[j].length() + (j - i - 1) < maxWidth)) {
                lineLength += words[j++].length();
            }
            int diff = maxWidth - lineLength, numWords = j - i;
            if (numWords == 1 || j >= n)
                result.add(leftJustify(words, diff, i, j));
            else
                result.add(middleJustify(words, diff, i, j));
            i = j;

        }
        return result;
    }

    public String leftJustify(String[] words, int diff, int i, int j) {
        int spaceOnRight = diff - (j - i - 1);
        StringBuilder result = new StringBuilder(words[i]);
        for (int k = i + 1; k < j; k++)
            result.append(" " + words[k]);
        result.append(" ".repeat(spaceOnRight));
        return result.toString();
    }

    public String middleJustify(String[] words, int diff, int i, int j) {
        int spacesNeeded = j - i - 1, spaces = diff / spacesNeeded, extraSpaces = diff % spacesNeeded;
        StringBuilder result = new StringBuilder(words[i]);
        for (int k = i + 1; k < j; k++) {
            int spacesToApply = spaces + (extraSpaces-- > 0 ? 1 : 0);
            result.append(" ".repeat(spacesToApply) + words[k]);
        }
        return result.toString();
    }
}
