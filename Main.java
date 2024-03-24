import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            var scan = new Scanner(System.in);
            System.out.println("Second lab on it's way! Let's find frequency of latin alphabet symbols in both registers. Work completed by M. Shkuleva, SE-1 (it is hard to not move opening brace to next line(");
            System.out.println("Input full file path: ");
            var inp = scan.nextLine();
            System.out.println("Output full file path: ");
            var outp = scan.nextLine();

            Path outPath = Paths.get(outp);
            if (Files.exists(outPath)) {
                System.err.println("File shares name with existing file in destination folder!");
                return;
            }

            var charList = new FileManage(inp);
            String result = charList.countChars();
            if (result.isEmpty()) {
                System.out.println("File is empty!");
                return;
            }
            charList.writeFile(outp, result);
            System.out.println("Result was written to a file and could be found at this path: " + outp);
        } catch (IOException err) {
            System.err.println("Unexpected error! " + err.getMessage());
        }
    }
}
