package it.milano.xpug.mobkata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiamondKataTest {

    @Test
    public void singleLine() throws Exception {
        assertEquals("A\n", diamond('A'));
    }

    @Test
    public void threeLinesDiamond() throws Exception {
        String expected = " A \n" +
                          "B B\n" +
                          " A \n";

        assertEquals(expected, diamond('B'));
    }

    private String diamond(char input) {
        if (input == 'B') {
            return " A \n" +
                   "B B\n" +
                   " A \n";
        }

        return input + "\n";
    }
}
