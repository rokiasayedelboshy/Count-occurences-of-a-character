import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class countChar {
    public static void main(String[] args) throws IOException {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a character");
        char c = myObj.next().charAt(0);
        InputStream is = new FileInputStream(".\\temp\\assTest.txt");
        int size = is.available();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (is.read() == c) {
                count += 1;

            }
        }
        System.out.println("this character is found " +count +" times");
        is.close();
    }
    }

