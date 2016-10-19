/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ordemservico;

/**
 *
 * @author andre
 */
public class Cpf {

    /**
     *
     * @param d
     * @return j == d[9] && k == d[10]
     */
    public static boolean Cpfvalido(int d[]) {

        int sj = 0, sk = 0, j = 0, k = 0, soma = 0;
        for (int i = 0; i < 12; i++) {
            soma += d[i];
        }
        if (soma <= 0) {
            throw new IllegalArgumentException("NUMERO INVALIDO");
        } else {
            sj = d[0] + 2 * d[1] + 3 * d[2] + 4 * d[3] + 5 * d[4] + 6 * d[5]
                    + 7 * d[6] + 8 * d[7] + 9 * d[8];
            sk = d[1] + 2 * d[2] + 3 * d[3] + 4 * d[4] + 5 * d[5] + 6 * d[6]
                    + 7 * d[7] + 8 * d[8] + 9 * d[9];
            j = ((sk % 10) % 9);
            k = ((sk % 10) % 9);
            return j == d[9] && k == d[10];
        }
    }
}
