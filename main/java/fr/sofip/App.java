package fr.sofip;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
        Pokemon pokemon1 = new Pokemon("Denticrisse", 68, 21, 12, "Eau");
        Pokemon pokemon2 = new Pokemon("Grodoudou", 140, 14, 12, "Fée");
        Pokemon pokemon3 = new Pokemon("Rongrigou", 120, 19, 12, "Normal");
        Pokemon pokemon4 = new Pokemon("Grotadmorv", 105, 21, 12, "Poison");
        
        List<String> typesPokemon = new ArrayList<String>();
        typesPokemon.add("Eau");
        typesPokemon.add("Poison");
        typesPokemon.add("Fée");
        typesPokemon.add("Normal");

        List<Pokemon> equipe1 = new ArrayList<Pokemon>();
        equipe1.add(pokemon1);
        equipe1.add(pokemon2);
        
        List<Pokemon> equipe2 = new ArrayList<Pokemon>();
        equipe2.add(pokemon3);
        equipe2.add(pokemon4);


        Dresseur dresseur1 = new Dresseur("King", "Marc", equipe1);
        dresseur1.recruterPokemons(pokemon1);
        dresseur1.recruterPokemons(pokemon2);

        Dresseur dresseur2 = new Dresseur("Roi","Antoine",equipe2);
        dresseur2.recruterPokemons(pokemon3);
        dresseur2.recruterPokemons(pokemon4);

        System.out.println(dresseur1.getNom() + " " + dresseur1.getPrenom());
        System.out.println(dresseur2.getNom() + " " + dresseur2.getPrenom());
        
        Combat combat = new Combat(dresseur1, dresseur2, false);
        combat.commencerCombat();

    }      
}