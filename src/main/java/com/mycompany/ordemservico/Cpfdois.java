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
public class Cpfdois {

    public static boolean cpfDois(int d[]) {

        int c = 8;
        int p = d[9];
        int s = d[9];
        int soma = 0;
        for (int i = 0; i < 12; i++) {
            soma += d[i];
        }
        if (soma <= 0) {
            throw new IllegalArgumentException("NUMERO INVALIDO");
        } else {
            p = 0;
            int j, k;
            while (c >= 0) {
                p = p + d[c];
                s = s + p;
                c = c - 1;
            }
            j = ((s % 11) % 10);
            k = ((s - p + 9 * j % 11) % 10);
            return j == d[9] && k == d[10];
        }
    }
}
