package pl.gajkow;

import java.util.Scanner;

public class Loops2 extends Runner{


    @Override
    public void execute() {
        int a , b , n, z = 0 ;
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();


        if ((q >= 0 && q <= 500)) {

            for(int i = 0; i < q; i++){
                 a = scanner.nextInt();
                 b = scanner.nextInt();
                 n = scanner.nextInt();

                 if((a >= 0 && b >= 0 && a <= 50 && b <= 50) && (n >= 1 && n <= 15)) {
                     for (int x = 1; x <= n; x++) {
                         z = z + a + (int)Math.pow(2, x - 1) * b;
                         System.out.print(z + (a + (int)Math.pow(2, x - 1) * b)  + " ");

                     }
                 }
            }

        }
    }
}
