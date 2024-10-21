package fr.diginamic.geometrie;

import fr.diginamic.geometrie.entites.*;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        ObjetGeometrique[] tab = new ObjetGeometrique[4];
        Cercle cercle = new Cercle(5);
        Rectangle rectangle = new Rectangle(3, 4);
        Carre carre = new Carre(2);
        Sphere sphere = new Sphere(5);
        tab[0] = cercle;
        tab[1] = rectangle;
        tab[2] = carre;
        tab[3] = sphere;
        for (ObjetGeometrique objetGeometrique : tab) {
            System.out.println(objetGeometrique);
            System.out.printf("Perimetre: %.2f\n", objetGeometrique.perimetre());
            System.out.printf("Surface: %.2f\n", objetGeometrique.surface());
            System.out.println("-------------------------------");
        }
        Objet3D[] tab3D = new Objet3D[1];
        tab3D[0] = sphere;
        for (Objet3D objet3D : tab3D) {
            System.out.println(objet3D);
            System.out.printf("Surface: %.2f\n", objet3D.surface());
            System.out.printf("Volume: %.2f\n", objet3D.volume());
            System.out.println("-------------------------------");
        }
    }
}
