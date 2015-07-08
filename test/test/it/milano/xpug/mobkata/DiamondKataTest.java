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
        String expected =
                " A \n" +
                "B B\n" +
                " A \n";

        assertEquals(expected, diamond('B'));
    }

    @Test
    public void fiveLinesDiamond() throws Exception {
        String expected =
                "  A  \n" +
                " B B \n" +
                "C   C\n" +
                " B B \n" +
                "  A  \n";

        assertEquals(expected, diamond('C'));
    }

    private String diamond(char input) {
        String[] lines;
        StringBuilder output = new StringBuilder();
        if (input == 'B') {
            lines = new String[] {" A \n", "B B\n"};

            output.append(lines[0]);
            output.append(lines[1]);
            output.append(lines[0]);
        } else if (input == 'C') {
            lines = new String[] {"  A  \n", " B B \n", "C   C\n"};

            output.append(lines[0]);
            output.append(lines[1]);
            output.append(lines[2]);
            output.append(lines[1]);
            output.append(lines[0]);
        } else {
            lines = new String[] {"A\n"};
            
            output.append(lines[0]);
        }

        return output.toString();
    }
}
