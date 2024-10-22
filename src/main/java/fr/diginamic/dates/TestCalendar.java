package fr.diginamic.dates;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(Locale.FRANCE);
        calendar.set(2016, Calendar.MAY, 19, 23, 59, 30);
        Date date = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.printf("Date : %s\n", dateFormat.format(date));

        Date dateAjd = Calendar.getInstance().getTime();
        System.out.printf("Date du jour : %s\n", dateFormat.format(dateAjd));

        DateFormat dateFormatFr = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.FRANCE);
        DateFormat dateFormatChina = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.CHINA);
        DateFormat dateFormatRus = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, new Locale("ru", "RU"));
        DateFormat dateFormatGer = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.GERMANY);

        System.out.printf("Date du jour en Français : %s\n", dateFormatFr.format(dateAjd));
        System.out.printf("Date du jour en Chinois : %s\n", dateFormatChina.format(dateAjd));
        System.out.printf("Date du jour en Russe : %s\n", dateFormatRus.format(dateAjd));
        System.out.printf("Date du jour en Allemand : %s\n", dateFormatGer.format(dateAjd));
    }
}