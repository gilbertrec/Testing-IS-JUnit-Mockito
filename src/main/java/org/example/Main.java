package org.example;

import modelexamples.Stipendio;
import modelexamples.MetodoDiPagamento;
import modelexamples.Utente;

public class Main {
    public static void main(String[] args) {

        Stipendio d = new Stipendio(3000);
        MetodoDiPagamento p = new MetodoDiPagamento("Visa","Italy","000400343");
        Utente u = new Utente("Gilberto","Recupito",d,p);

    }
}