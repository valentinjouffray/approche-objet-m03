package fr.diginamic.geometrie.entites;

public interface Objet3D extends ObjetGeometrique {
    /**
     * Retourne le volume d'une forme géométrique
     *
     * @return double
     */
    double volume();
}
