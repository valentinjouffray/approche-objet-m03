package dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) {

        Date dateJour = new Date(123, 4, 26);
        SimpleDateFormat formateurJMA = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(formateurJMA.format(dateJour));

        Date date2 = new Date(116, 4, 19, 23, 59, 30);
        SimpleDateFormat formateurJMAHMS = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(formateurJMAHMS.format(date2));

        Date dateSys = new Date();
        System.out.println(formateurJMAHMS.format(dateSys));

    }

}
