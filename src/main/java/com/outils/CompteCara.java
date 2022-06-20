package com.outils;

/**
 * The type Compte cara.
 */
public class CompteCara {

    /**
     * Nb caractere long.
     *
     * @param phrase the phrase
     * @param cara   the cara
     * @return the long
     */
    static public long nbCaractere(String phrase, String cara) {
        char recherche = cara.charAt(0);
        return phrase.chars().filter(ch -> ch == recherche).count();
    }

}
