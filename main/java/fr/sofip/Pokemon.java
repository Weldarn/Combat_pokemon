package fr.sofip;

import java.util.Random;

public class Pokemon {
    private String nom;
    private int pv;
    private int attaque;
    private int niveau;
    private String type;
    
    
    public Pokemon(String nom, int pv, int attaque, int niveau, String type) {
        this.nom = nom;
        this.pv = pv;
        this.attaque = attaque;
        this.niveau = niveau;
        this.type = type;
    }
    
    public String getNom() {
        return nom;
    }

    public int getPv() {
        return pv;
    }

    public int getAttaque() {
        return attaque;
    }

    public int getNiveau() {
        return niveau;
    }
    
    public String getType() {
        return type;
    }

    public void attaquer(Pokemon pokemon){
        Random random = new Random();
        int degats = random.nextInt(attaque)+ 1;
        pokemon.pv -= degats;
        System.out.println(nom + " inflige " + degats + " dégats à "+ pokemon.nom + " !");

    }
}
