package tech.bts.CriminalHuntArtificialIntelligenceCHAI;

import tech.bts.CriminalHuntArtificialIntelligenceCHAI.model.Suspect;

public class Example {

    public static void main(String[] args) {

        // You can't call the Suspect constructor from outside (it's private)
        // Suspect s1 = new Suspect("Peter",0, 0, 0, "brown", "black", false);

        Suspect s = new Suspect.Builder()
                .name("Peter")
                .eyeColor("brown")
                .hairColor("black")
                .age(31)
                .height(175.0)
                .weight(69.7)
                .male(true)
                .build();

    }
}
