package fr.diginamic.maison;

public abstract class Piece {
    // On utilise float parce que, réalistiquement, on n'a pas besoin d'une grande précision
    float superficie;
    int numeroEtage;

    public Piece(float superficie, int numeroEtage) {
        if (numeroEtage < -1) {
            throw new IllegalArgumentException("L'étage ne peut pas être en dessous de -1, l'entièreté du sous-sol compte comme -1");
        }
        if (superficie < 0) {
            throw new IllegalArgumentException("La superficie ne peut pas être négative");
        }
        this.superficie = superficie;
        this.numeroEtage = numeroEtage;
    }
}
