package pl.gajkow;

import java.util.Scanner;

public class JavaSubstringComparisons {
    public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            int k = scan.nextInt();
            scan.close();

            System.out.println(getSmallestAndLargest(s, k));


    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = "";

        for (int i = 0; i <s.length()-k+1 ; i++) {

            if( s.substring(i, k+i).compareTo(largest) > 0){
                     largest = s.substring(i, k+i);
                 }
            if( s.substring(i, k+i).compareTo(smallest) < 0){
                smallest = s.substring(i, k+i);
            }
        }

//        SortedSet<String> sets=new TreeSet<String>();
//        for(int i=0;i<=str.length()-k;i++){
//            sets.add(str.substring(i,i+k));
//        }
//        System.out.println(sets.first());
//        System.out.println(sets.last());

        return smallest + "\n" + largest;
    }
}
