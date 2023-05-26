package dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestSimpleDateFormat {
    public static void main(String[] args) throws Exception {
        
        Calendar cal = Calendar.getInstance(); // Calendrier initialisé à la date heure courante
        cal.set(2023, 3, 26, 9, 30, 0);
        Date dcal = cal.getTime();

        System.out.println(dcal.getMonth());

        SimpleDateFormat formateur = new SimpleDateFormat("EEEE dd/MMMM/yyyy HH:mm:ss", Locale.GERMAN);
        String chaine = formateur.format(dcal);

        System.out.println(chaine);

        /*String chaineAParser = "22/10/2023 04:27:36";
        Date dateResultat = formateur.parse(chaineAParser);

        System.out.println(dateResultat);*/
    }

}
