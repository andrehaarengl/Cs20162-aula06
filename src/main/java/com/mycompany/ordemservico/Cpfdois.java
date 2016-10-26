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
public final class Cpfdois {

    /**
     * Classe contendo apenas operações "static". Evita que instância seja
     * criada desnecessariamente.
     */
    private Cpfdois() {
    }
    /**
     * valor fixo da formula.
     */
    public static final int TAMANHO = 11;
    /**
     * valor fixo da formula.
     */
    public static final int NOVE = 9;
    /**
     * valor fixo da formula.
     */
    public static final int SETE = 7;
    /**
     * valor fixo da formula.
     */
    public static final int DEZ = 10;

    /**
     *
     * @param d entrada de um vetor que representa o numero do CPF
     * @return se é verdadeiro ou falso o CPF
     */
    public static boolean cpfDois(int d[]) {

        if (d.length > TAMANHO) {
            return false;
        }

        int c = SETE;
        int p = d[NOVE - 1];
        int s = d[NOVE - 1];
        int j, k;
        while (c >= 0) {
            p = p + d[c];
            s = s + p;
            c = c - 1;
        }
        j = ((s % TAMANHO) % DEZ);
        k = ((s - p + (NOVE * j) % TAMANHO) % DEZ);

        return j == d[NOVE] && k == d[DEZ];
    }
}
