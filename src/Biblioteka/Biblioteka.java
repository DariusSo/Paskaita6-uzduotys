package Biblioteka;

import java.util.ArrayList;
import java.util.List;

public class Biblioteka {
    List<Knyga> knygos = new ArrayList<>();


    public void pridetiKnyga(Knyga knyga){
        knygos.add(knyga);
    }
    public int spausdintiKnyga(){
        System.out.println("Knygu sarasas: ");

        for (Knyga knyga : knygos){
            System.out.println("Isleidimo metai: " + knyga.getIšleidimoMetai() + " | Biblioteka.Autorius: " + knyga.getAutorius() + " | Pavadinimas: " + knyga.getPavadinimas());
        }


        return 0;
    }
    }


