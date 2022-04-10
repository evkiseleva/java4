package com.java.laba4;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DivisionsTest {

    @org.junit.jupiter.api.Test
    void getId() {
        ArrayList<Division> divisions = new ArrayList<>();
        Divisions.getId("A");
        Divisions.getId("B");
        assertEquals(2, Divisions.getId("B"));
    }
}