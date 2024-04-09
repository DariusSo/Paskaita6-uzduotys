package Biblioteka;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BibliotekaMain {
    public static void main(String[] args) {
        Biblioteka biblioteka = new Biblioteka();
        Autorius autorius = new Autorius();
        autorius.setVardas("Carl");
        autorius.setPavarde("Jung");
        String vardasPavarde = autorius.getVardas() + " " + autorius.getPavarde();
        Knyga romanas = new Knyga("2002", vardasPavarde, "Raudonoji Biblioteka.Knyga" );
        Knyga darViena = new Knyga("1994", vardasPavarde, "Archetypes" );
        biblioteka.pridetiKnyga(romanas);
        biblioteka.pridetiKnyga(darViena);
        biblioteka.spausdintiKnyga();



    }
}
