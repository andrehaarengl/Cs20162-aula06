/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ordemservico;

import org.junit.Test;

/**
 *
 * @author andre
 */
public class CpfTest {

    @Test(expected = IllegalArgumentException.class)
    public void numeroInvalido() {
        int Vet[] = new int[12];
        for (int i = 0; i < 10; i++) {
            Vet[i] = 0;
        }
        Cpf.Cpfvalido(Vet);
    }

}
