public class LetterCount {
    public String countChars(String cont) {
        int[] charCol = new int[52];
        for (char c : cont.toCharArray()) {
            if (c >= 'A' && c <= 'Z')
                charCol[c - 'A']++;
            else if (c >= 'a' && c <= 'z')
                charCol[c - 'a' + 26]++;
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (charCol[i] > 0)
                res.append((char) ('A' + i)).append(": ").append(charCol[i]).append("\n");
        }
        for (int i = 0; i < 26; i++) {
            if (charCol[i + 26] > 0)
                res.append((char) ('a' + i)).append(": ").append(charCol[i + 26]).append("\n");
        }
        return res.toString();
    }
}
