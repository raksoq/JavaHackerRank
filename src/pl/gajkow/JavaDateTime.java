package pl.gajkow;



//2017-08-14 Monday

import java.time.LocalDate;

public class JavaDateTime {
    public static void main(String[] args) {
        String day = getDay(8, 14, 2017);
        System.out.println(day);

//        Calendar newDate = Calendar.getInstance();
//        newDate.set(2017,14,8);
//        System.out.println(newDate.get(Calendar.DAY_OF_WEEK));
//
//        LocalDate localDate = LocalDate.of(2017, 8, 14);
//        System.out.println(localDate.getDayOfWeek());
//
//        Date date = new Date();
//        String dayWeekText = new SimpleDateFormat("EEEE").format(new Date());
//        System.out.println("Day of week in text:"+ dayWeekText.toUpperCase(Locale.ROOT));
//
//        Calendar myCalendar = new GregorianCalendar(2017, 8, 14);
//        Date myDate = myCalendar.getTime();
//        System.out.println(myDate);

    }
    public static String getDay(int month, int day, int year){


        LocalDate localDate = LocalDate.of(year, month, day);
        return localDate.getDayOfWeek().toString();



    }
}
