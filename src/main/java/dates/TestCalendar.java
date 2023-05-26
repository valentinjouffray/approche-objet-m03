package dates;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2016, 4, 19, 23, 59, 30);
        Date date = cal.getTime();

        SimpleDateFormat formateurJMA = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(formateurJMA.format(date));

        Calendar calJour = Calendar.getInstance();
        calJour.set(2023, 4, 26);
        Date dateJour = calJour.getTime();

        SimpleDateFormat formateurJMAHMS = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(formateurJMAHMS.format(dateJour));

        SimpleDateFormat formateurFR = new SimpleDateFormat("EEEE dd MMMM yyyy 'à' HH:mm:ss");
        SimpleDateFormat formateurRU = new SimpleDateFormat("EEEE dd MMMM yyyy 'à' HH:mm:ss", new Locale("ru", "RU"));
        SimpleDateFormat formateurCH = new SimpleDateFormat("EEEE dd MMMM yyyy 'à' HH:mm:ss", Locale.CHINA);
        SimpleDateFormat formateurGE = new SimpleDateFormat("EEEE dd MMMM yyyy 'à' HH:mm:ss", Locale.GERMANY);

        System.out.println(formateurFR.format(dateJour));
        System.out.println(formateurRU.format(dateJour));
        System.out.println(formateurCH.format(dateJour));
        System.out.println(formateurGE.format(dateJour));

        System.out.println(LocalDate.now());


    }
}
