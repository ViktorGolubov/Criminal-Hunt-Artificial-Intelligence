package tech.bts.CriminalHuntArtificialIntelligenceCHAI.business;

import org.junit.Test;
import tech.bts.CriminalHuntArtificialIntelligenceCHAI.model.Suspect;

import static org.junit.Assert.*;

public class SuspectAnalyserTest {

    @Test
    public void no_match_if_different_sex() {

        Suspect s1 = new Suspect.Builder()
                .name("Alex").eyeColor("brown").hairColor("black").age(31)
                .height(175.0).weight(69.7).male(true)
                .build();

        Suspect s2 = new Suspect.Builder()
                .name("Alex").eyeColor("brown").hairColor("black")
                .age(31).height(175.0).weight(69.7)
                .male(false)
                .build();

        SuspectAnalyser analyser = new SuspectAnalyser();
        boolean result = analyser.match(s1,s2);

        // These are equivalent
        assertFalse(result);
        assertEquals(false, result);
    }

    @Test
    public void suspect_change_hair_or_eye() {
        Suspect s3 = new Suspect.Builder()
                .name("Peter").eyeColor("brown").hairColor("black").age(31)
                .height(175.0).weight(69.7).male(true)
                .build();

        Suspect s4 = new Suspect.Builder()
                .name("Peter").eyeColor("blue").hairColor("white")
                .age(31).height(175.0).weight(69.7)
                .male(true)
                .build();

        SuspectAnalyser analyser = new SuspectAnalyser();
        boolean result = analyser.match(s3,s4);

        // These are equivalent
        assertTrue(result);
        assertEquals(true, result);

    }

    @Test
    public void quite_similar_suspect() {
        Suspect s5 = new Suspect.Builder()
                .name("Mary").eyeColor("brown").hairColor("black").age(31)
                .height(175.0).weight(69.7).male(false)
                .build();

        Suspect s6 = new Suspect.Builder()
                .name("mary").eyeColor("brown").hairColor("brown")
                .age(31).height(175.0).weight(77.0)
                .male(false)
                .build();

        SuspectAnalyser analyser = new SuspectAnalyser();
        boolean result = analyser.match(s5,s6);

        // These are equivalent
        assertFalse(result);
        assertEquals(false, result);

    }

    @Test
    public void quite_similar_suspect1() {
        Suspect s7 = new Suspect.Builder()
                .name("Mary").eyeColor("brown").hairColor("black").age(31)
                .height(175.0).weight(69.7).male(false)
                .build();

        Suspect s8 = new Suspect.Builder()
                .name("Daria").eyeColor("brown").hairColor("black")
                .age(32).height(177.0).weight(73.0)
                .male(false)
                .build();

        SuspectAnalyser analyser = new SuspectAnalyser();
        boolean result = analyser.match(s7,s8);

        // These are equivalent
        assertTrue(result);
        assertEquals(true, result);

    }

    @Test
    public void very_similar() {
        Suspect s9 = new Suspect.Builder()
                .name("Mary").eyeColor("brown").hairColor("black").age(31)
                .height(175.0).weight(69.7).male(false)
                .build();

        Suspect s10 = new Suspect.Builder()
                .name("Monica").eyeColor("brown").hairColor("black")
                .age(32).height(177.0).weight(73.0)
                .male(false)
                .build();

        SuspectAnalyser analyser = new SuspectAnalyser();
        boolean result = analyser.match(s9,s10);

        // These are equivalent
        assertTrue(result);
        assertEquals(true, result);

    }

    @Test
    public void equal_suspects() {
        Suspect s11 = new Suspect.Builder()
                .name("Bob").eyeColor("brown").hairColor("black").age(31)
                .height(175.0).weight(69.7).male(true)
                .build();

        Suspect s12 = new Suspect.Builder()
                .name("bob").eyeColor("brown").hairColor("black")
                .age(30).height(173.0).weight(63.0)
                .male(true)
                .build();

        SuspectAnalyser analyser = new SuspectAnalyser();
        boolean result = analyser.match(s11,s12);

        // These are equivalent
        assertTrue(result);
        assertEquals(true, result);

    }






}