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
        StringBuilder output = new StringBuilder();
        if (input == 'B') {
            String[] lines = {" A \n", "B B\n"};

            output.append(lines[0]);
            output.append(lines[1]);
            output.append(lines[0]);
        } else {
            String[] lines = { "A\n" };
            output.append(lines[0]);
        }

        return output.toString();
    }
}
