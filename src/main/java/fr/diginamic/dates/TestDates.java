package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {
        Date dateAjd = new Date();
        System.out.printf("Date du jour : %s\n", dateAjd);
        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
        System.out.printf("Date du jour : %s\n", formateur.format(dateAjd));
        formateur = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.printf("Date du jour : %s\n", formateur.format(dateAjd));

        Date date = new Date(2024 - 1900, 4 - 1, 19, 15, 30, 0);
        System.out.printf("Date : %s\n", formateur.format(date));
    }
}
