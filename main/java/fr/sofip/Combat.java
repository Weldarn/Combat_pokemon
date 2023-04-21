package fr.sofip;

public class Combat {
    private Dresseur dresseur1;
    private Dresseur dresseur2;
    private Dresseur vainqueur;
    private Boolean terminer;
    
    public Combat(Dresseur dresseur1, Dresseur dresseur2, Boolean terminer) {
        this.dresseur1 = dresseur1;
        this.dresseur2 = dresseur2;
        this.terminer = false;
    }
    
    public void commencerCombat() {
        System.out.println("Le combat commence entre " + dresseur1.getNom() + " et " + dresseur2.getNom() + " !");
        int tour = 1;

        while (!terminer) {
        System.out.println("------------------------");
            System.out.println("Tour " + tour);
            tour++;
            
            for (int i = 0; i < dresseur1.getEquipe().size(); i++) {
                Pokemon pokemon1 = dresseur1.getEquipe().get(i);
                if (pokemon1.getPv() > 0) {
                    Pokemon pokemon2 = choisirPokemonAdverse(dresseur2);
                    if (pokemon2 == null) {
                        terminer = true;
                        vainqueur = dresseur1;
                        break;
                    }
                    attaquer(pokemon1, pokemon2);
                    if (pokemon2.getPv() <= 0) {
                        System.out.println(pokemon2.getNom() + " de " + dresseur2.getNom() + " est KO !");
                    }
                }
            }
            
            if (!terminer) {
                for (int i = 0; i < dresseur2.getEquipe().size(); i++) {
                    Pokemon pokemon2 = dresseur2.getEquipe().get(i);
                    if (pokemon2.getPv() > 0) {
                        Pokemon pokemon1 = choisirPokemonAdverse(dresseur1);
                        if (pokemon1 == null) {
                            terminer = true;
                            vainqueur = dresseur2;
                            break;
                        }
                        attaquer(pokemon2, pokemon1);
                        if (pokemon1.getPv() <= 0) {
                            System.out.println(pokemon1.getNom() + " de " + dresseur1.getNom() + " est KO !");
                        }
                    }
                }
            }
        } 
        System.out.println("------------------------");
        System.out.println("Le combat est terminé !");
        System.out.println("Le vainqueur est : " + vainqueur.getNom() + " " + vainqueur.getPrenom());
    }   
    
    private Pokemon choisirPokemonAdverse(Dresseur dresseur) {
        for (int i = 0; i < dresseur.getEquipe().size(); i++) {
            Pokemon pokemon = dresseur.getEquipe().get(i);
            if (pokemon.getPv() > 0) {
                return pokemon;
            }
        }
        return null;
    }       
    
    private void attaquer(Pokemon pokemonAttaquant, Pokemon pokemonCible) {
        System.out.println(pokemonAttaquant.getNom() + " de " + pokemonAttaquant.getType() + " attaque " + pokemonCible.getNom() + " !");
        pokemonAttaquant.attaquer(pokemonCible);
        System.out.println(pokemonCible.getNom() + " de " + pokemonCible.getType() + " a maintenant " + pokemonCible.getPv() + " PV");
    }
    
}
