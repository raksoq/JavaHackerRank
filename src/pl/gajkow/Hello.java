package pl.gajkow;

import java.util.Scanner;

public class Hello extends Runner{


    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        System.out.println("Hello, World.");
        System.out.println(string);
    }


}
