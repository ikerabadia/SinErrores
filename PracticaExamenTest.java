/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entornosdesarrollo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Iker
 */
public class PracticaExamenTest {
    
    public PracticaExamenTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of paraProbar method, of class PracticaExamen.
     */
    @Test
    public void testParaProbar() {
        System.out.println("paraProbar");
        int x = 5;
        int expResult = 1;
        int result = PracticaExamen.paraProbar(x);
        assertEquals(expResult, result);
        
        
        
       
        
    }
    
    public void testParaProbar2() {
        int x = 3;
        int expResult = 2;
        int result = PracticaExamen.paraProbar(x);
        assertEquals(expResult, result);
    }  
    
    public void testParaProbar3() {
        int x = 4;
        int expResult = 6;
        int result = PracticaExamen.paraProbar(x);
        assertEquals(expResult, result);
    }
}
