package pl.gajkow;

import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        System.out.println(string.substring(start, end));


    }
}
