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

        if (input == 'B')
            lines = new String[] {" A \n", "B B\n"};
        else if (input == 'C') {
            int dimension = ((input - 'A') *2) +1;
            lines = new String[]{"  A  \n", " B B \n", "C   C\n"};
        }
        else
            lines = new String[] {"A\n"};

        return linesToOutput(lines);
    }

    private String linesToOutput(String[] lines) {
        StringBuilder output = new StringBuilder();
        int i = 0;

        for (i = 0; i < lines.length; i++)
            output.append(lines[i]);

        i -= 2;

        for (; i >= 0; i--)
            output.append(lines[i]);

        return output.toString();
    }
}
