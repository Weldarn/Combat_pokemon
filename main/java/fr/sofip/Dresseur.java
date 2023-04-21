package fr.sofip;

import java.util.List;

public class Dresseur {
    private String nom;
    private String prenom;
    private List<Pokemon> equipe;
    
    public Dresseur(String nom, String prenom, List<Pokemon> equipe) {
        this.nom = nom;
        this.prenom = prenom;
        this.equipe = equipe;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public List<Pokemon> getEquipe() {
        return equipe;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public void recruterPokemons(Pokemon pokemon) {
        this.equipe.add(pokemon);
        System.out.println(prenom + " a recruté " + pokemon.getNom() + " !");
    } 

}
