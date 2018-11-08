package tech.bts.CriminalHuntArtificialIntelligenceCHAI.business;

import tech.bts.CriminalHuntArtificialIntelligenceCHAI.model.Suspect;

public class SuspectAnalyser {

    public boolean match (Suspect s1, Suspect s2) {

        if (s1.isMale() != s2.isMale()){
            return false;
        }

        int points = 0;

        if (s1.getName().equalsIgnoreCase(s2.getName())) {
            points++;
        }

        if (s1.getEyeColor().equals(s2.getEyeColor())) {
            points++;
        }

        if (s1.getHairColor().equals(s2.getHairColor())) {
            points++;
        }

        if (Math.abs(s1.getAge() - s2.getAge())<= 1) {
            points++;
        }

        if (Math.abs(s1.getHeight() - s2.getHeight())<= 2) {
            points++;
        }
        if (Math.abs(s1.getWeight() - s2.getWeight())<= 5) {
            points++;
        }

        if (points >= 5) {
            return true;
        }

        if (points == 4
                && s1.getName().equalsIgnoreCase(s2.getName())
                && s1.getAge()== s2.getAge()
                && s1.getWeight() == s2.getWeight()
                && s1.getHeight() == s2.getHeight()) {
            return true;
        } else {
            return false;
        }
    }

}

