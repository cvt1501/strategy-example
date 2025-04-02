package org.strategy.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @Test
    void shouldPayWithCredit() {
        var outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{"CREDIT"});

        var output = outContent.toString();
        assertTrue(output.contains("Payed with credit card. Tax applied: 5%"));
    }

    @Test
    void shouldPayWithDebit() {
        var outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{"DEBIT"});

        var output = outContent.toString();
        assertTrue(output.contains("Payed with debit card. Tax applied: 0%"));
    }

    @Test
    void shouldPayWithTransfer() {
        var outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{"TRANSFER"});

        var output = outContent.toString();
        assertTrue(output.contains("Payed with transfer. Tax applied: 0%"));
    }

}
