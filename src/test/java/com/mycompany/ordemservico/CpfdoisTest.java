/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ordemservico;

import static org.junit.Assert.*;

/**
 *
 * @author andre
 */
public class CpfdoisTest {

    @org.junit.Test
    public void test2Cpf2() {
        int d[] = new int[11];
        d[0] = 0;
        d[1] = 0;
        d[2] = 0;
        d[3] = 0;
        d[4] = 0;
        d[5] = 0;
        d[6] = 0;
        d[7] = 0;
        d[8] = 0;
        d[9] = 0;
        d[10] = 1;

        assertEquals(false, Cpfdois.cpfDois(d));
    }

    @org.junit.Test
    public void test2Cpf3() {
        int d[] = new int[12];
        d[0] = 0;
        d[1] = 0;
        d[2] = 0;
        d[3] = 0;
        d[4] = 0;
        d[5] = 0;
        d[6] = 0;
        d[7] = 0;
        d[8] = 0;
        d[9] = 0;
        d[10] = 0;
        d[11] = 0;

        assertEquals(false, Cpfdois.cpfDois(d));
    }

}
