package pl.gajkow;

//Java Currency Formatter
//https://www.hackerrank.com/challenges/java-currency-formatter/problem
//Sample Input
//
//12324.134
//        Sample Output
//
//        US: $12,324.13
//        India: Rs.12,324.13
//        China: ￥12,324.13
//        France: 12 324,13 €

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat currencyUS=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat currencyIN=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        NumberFormat currencyCR=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat currencyFR=NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String us=currencyUS.format(payment);
        String in=currencyIN.format(payment);
        String ch=currencyCR.format(payment) ;
        String fr=currencyFR.format(payment);

        System.out.println("US: " +us );
        System.out.println("India: " + in );
        System.out.println("China: " + ch);
        System.out.println("France: " + fr);
    }
}
