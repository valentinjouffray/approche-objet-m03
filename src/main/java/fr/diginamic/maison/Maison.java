package fr.diginamic.maison;

import java.util.ArrayList;
import java.util.List;

public class Maison {
    List<Piece> pieceList;

    public Maison() {
        pieceList = new ArrayList<>();
    }

    public boolean ajouterPiece(Piece piece) {
        if (piece == null) {
            throw new IllegalArgumentException("Piece cannot be null");
        }
        return this.pieceList.add(piece);
    }

    public boolean ajouterListPieces(Piece[] pieces) {
        return this.pieceList.addAll(List.of(pieces));
    }

    public boolean ajouterListPieces(List<Piece> pieceList) {
        return this.pieceList.addAll(pieceList);
    }

    public float getSuperficieTotale() {
        // Apparemment, mapToFloat n'existe pas...
        return (float) pieceList.stream().mapToDouble((piece) -> piece.superficie).sum();
    }

    public float getSuperficieEtage(int etage) {
        return (float) pieceList.stream().filter((piece -> piece.numeroEtage == etage)).mapToDouble(piece -> piece.superficie).sum();
    }

    public float getSuperficieTypePiece(String typePiece) {
        return (float) pieceList.stream().filter((piece -> piece != null && piece.getClass().getSimpleName().equals(typePiece))).mapToDouble(piece -> piece.superficie).sum();
    }
}
