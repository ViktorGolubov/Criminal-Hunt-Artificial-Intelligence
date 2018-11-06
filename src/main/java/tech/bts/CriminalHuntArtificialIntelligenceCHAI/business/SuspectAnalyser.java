package tech.bts.CriminalHuntArtificialIntelligenceCHAI.business;

import tech.bts.CriminalHuntArtificialIntelligenceCHAI.model.Suspect;

public class SuspectAnalyser {

    public boolean match (Suspect s1, Suspect s2) {

        boolean result = false;
        int totalResult = 0;
        boolean equalName = false;
        boolean equalAge = false;
        boolean equalHeight = false;
        boolean equalWeight = false;
        boolean equalHair = false;
        boolean equalEye = false;


        if (s1.isMale() != s2.isMale()) {

            return false;

        } else if (s1.getName().toUpperCase().equals(s2.getName().toUpperCase())) {

            totalResult++;
            equalName = true;
        } else if (s1.getAge() - s2.getAge() <= 1) {

            totalResult++;
            equalAge = true;

        } else if (s1.getHeight() - s2.getHeight() <= 2) {
            totalResult++;
            equalHeight = true;

        } else if (s1.getWeight() - s2.getWeight() <=5) {
            totalResult++;
            equalWeight = true;

        } else if (s1.getHair().toUpperCase().equals(s2.getHair().toUpperCase())) {
            totalResult++;
            equalHair = true;
        } else if (s1.getEye().toUpperCase().equals(s2.getEye().toUpperCase())) {
            totalResult++;
            equalEye = true;
        }


        if (totalResult >= 5) {
           return result = true;

        }

        if (equalName && equalAge && equalHeight && equalWeight) {
            return true;

        } else {
            return false;
        }

        return result;
    }
}
