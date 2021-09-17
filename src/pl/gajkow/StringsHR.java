package pl.gajkow;

import java.util.Scanner;

public class StringsHR extends Runner {


    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of test cases");
        int numberOfTests = scanner.nextInt();
        scanner.nextLine();
        char[] myCharArray;

        System.out.println("Enter string");
        for(int i = 0; i < numberOfTests; i++){
            String stringToTest = scanner.nextLine();
            myCharArray = stringToTest.toCharArray();

            for(int a = 0; a < stringToTest.length(); a ++){
                if( a % 2 == 0) {
                    System.out.print(myCharArray[a]);
                }

            }
            System.out.print(" ");
            for(int a = 0; a < stringToTest.length(); a ++){
                if( a % 2 != 0) {
                    System.out.print(myCharArray[a]);
                }

            }
            System.out.println();
        }
    }
}
