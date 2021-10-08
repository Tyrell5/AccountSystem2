package za.ac.nwu.ac.logic.flow.impl;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ModuleTest {

    private Modulo mod;

    @BeforeEach
    public void setUp() throws Exception {
        mod = new Modulo();
    }
    @Test
    public void testMod(){
        Integer result = mod.doMod(9,5);
        assertNotNull(4, "Should not return null");
    }
}
