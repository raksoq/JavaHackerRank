package pl.gajkow;

import java.util.Scanner;

public class DataTypes extends Runner{

    @Override
    public void execute() {

        Scanner scanner = new Scanner(System.in);
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        int numberInt = scanner.nextInt();
        double numberDouble = scanner.nextDouble();
        scanner.nextLine();
        String string = scanner.nextLine();
        scanner.close();

        System.out.println( (numberInt + i));
        System.out.println( numberDouble + d);
        System.out.println(s + string);
//        System.out.println(numberDouble);
    }
}
