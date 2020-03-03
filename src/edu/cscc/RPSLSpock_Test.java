package edu.cscc;

import org.junit.Test;

import static org.junit.Assert.*;

public class RPSLSpock_Test {

    @Test
    public void isValidPick() {
        assertTrue(RPSLSpock.isValidPick("ROCK"));
        assertTrue(RPSLSpock.isValidPick("PAPER"));
        assertTrue(RPSLSpock.isValidPick("SCISSORS"));
        assertTrue(RPSLSpock.isValidPick("LIZARD"));
        assertTrue(RPSLSpock.isValidPick("SPOCK"));
        assertFalse(RPSLSpock.isValidPick("SCI"));
    }

    @Test
    public void generatePick() {
        assertTrue(!RPSLSpock.generatePick().equals(null));
        for(int i = 0; i<1000000; i++)
            assertTrue(RPSLSpock.isValidPick(RPSLSpock.generatePick()));
    }

    @Test
    public void isComputerWin() {
    assertTrue(RPSLSpock.isComputerWin("rock","scissors"));
    assertTrue(RPSLSpock.isComputerWin("rock","lizard"));
    assertTrue(RPSLSpock.isComputerWin("scissors","paper"));
    assertTrue(RPSLSpock.isComputerWin("scissors","lizard"));
    assertTrue(RPSLSpock.isComputerWin("paper","rock"));
    assertTrue(RPSLSpock.isComputerWin("paper","spock"));
    assertTrue(RPSLSpock.isComputerWin("lizard","paper"));
    assertTrue(RPSLSpock.isComputerWin("lizard","spock"));
    assertTrue(RPSLSpock.isComputerWin("spock","rock"));
    assertTrue(RPSLSpock.isComputerWin("spock","scissors"));
    assertFalse(RPSLSpock.isComputerWin("rock","paper"));
    }
}