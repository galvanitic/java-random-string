import com.mixcoatl.randomString.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        RandomString aString = new RandomString();

        System.out.println("Length of random string: ");
        int str_len = sc.nextInt();
        System.out.println(">> "+aString.generateRandomString(str_len));
    }
}