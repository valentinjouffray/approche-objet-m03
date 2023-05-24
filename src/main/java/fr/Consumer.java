package fr;

import listes.Ville;

@FunctionalInterface
public interface Consumer {

    void exec(Ville v);
}
