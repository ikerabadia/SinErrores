/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entornosdesarrollo;

/**
 *
 * @author Iker
 */
public class PracticaExamen {

    public static int paraProbar(int x) {
        if (x > 4) {
            return x - 4;
        } else {
            if (x % 2 == 0) {
                return x + 2;
            } else {
                return x - 1;
            }
        }
    }
}
