import java.io.*;

public class FileManage {
    private final String inFileName;
    public FileManage(String inFileName) {
        this.inFileName = inFileName;
    }

    public String readFile() throws IOException {
        StringBuilder freqList = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(inFileName))) {
            String str;
            while ((str = reader.readLine()) != null)
                freqList.append(str).append("\n");
        }
        return freqList.toString();
    }

    public void writeFile(String outFileName, String freqList) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outFileName))) {
            writer.write(freqList);
        }
    }

    public String countChars() throws IOException {
        String freqList = readFile();
        LetterCount count = new LetterCount();
        return count.countChars(freqList);
    }
}
