package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) throws IOException {

                try (Scanner scanner = new Scanner(new File("test.txt"))) {
                        while (scanner.hasNext()) {
                                System.out.println(scanner.nextLine());
                        }
                } catch (FileNotFoundException e) {
                        e.printStackTrace();
                }
        }

        public static void something() throws Exception {

                int b = 0;
                int r = 5/b;
        }
}
