package fr.diginamic.geometrie.entites;

public interface ObjetGeometrique {

    /**
     * Retourne le périmètre d'une forme géométrique
     * @return double
     */
    double perimetre();

    /**
     * Retourne la surface d'une forme géométrique
     * @return double
     */
    double surface();
}
