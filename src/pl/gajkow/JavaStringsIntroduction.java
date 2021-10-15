package pl.gajkow;

import java.util.Locale;
import java.util.Scanner;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String stringA = scanner.next();
        String stringB = scanner.next();

        System.out.println(stringA.length() + stringB.length());
        System.out.println(stringA.compareTo(stringB) > 0 ? "Yes" : "No");
        System.out.println(
                stringA.substring(0,1).toUpperCase() + stringA.substring(1)
                        + ' ' +
                stringB.substring(0,1).toUpperCase() + stringB.substring(1)
        );

    }
}
