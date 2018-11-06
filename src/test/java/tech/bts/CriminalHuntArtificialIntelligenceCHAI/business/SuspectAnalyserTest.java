package tech.bts.CriminalHuntArtificialIntelligenceCHAI.business;


public class SuspectAnalyserTest {

    @Test
    public void equal_suspects() {

        SuspectAnalyser suspectAnalyser = new SuspectAnalyser();
        SuspectAnalyser criminal = new SuspectAnalyser("Ivan", 25, 170, 85, "Blond", "green", true);
        SuspectAnalyser s1 = new SuspectAnalyser("ivan", 25, 170, 85, "Blond", "green", true);

        assertEquals (criminal,s1);
    }

    private void assertEquals(SuspectAnalyser criminal, SuspectAnalyser s1) {

    }
}
