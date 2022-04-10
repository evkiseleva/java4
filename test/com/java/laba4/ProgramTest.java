package com.java.laba4;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    @Test
    void people() throws IOException {
        assertNotEquals(null, Program.people());
    }
}