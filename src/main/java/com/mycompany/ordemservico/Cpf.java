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
public final class Cpf {

    /**
     * Classe contendo apenas operações "static". Evita que instância seja
     * criada desnecessariamente.
     */
    private Cpf() {
    }
    /**
     * valor fixo da formula.
     */
    public static final int TAM_CPF = 11;
    /**
     * valor fixo da formula.
     */
    public static final int NOVE = 9;
    /**
     * valor fixo da formula.
     */
    public static final int DEZ = 10;

    /**
     *
     * @param d entrada de um vetor que representa o numero do CPF
     * @return j == d[9] && k == d[10] retorna true or false sobre o CPF
     */
    public static boolean cpfvalido(final int d[]) {

        if (d.length > TAM_CPF) {
            return false;
        }

        int sj = 0, sk = 0, j = 0, k = 0, soma = 1;
        
        for (int i = 0; i <= (NOVE - 1); i++) {
            sj = sj + (d[i] * soma);
            soma++;
        }

        for (int i = 1; i <= NOVE; i++) {
            sj = sj + (d[i] * soma);
            soma++;
        }

        j = (sk % TAM_CPF) % DEZ;
        k = (sk % TAM_CPF) % DEZ;
        return j == d[NOVE] && k == d[DEZ];
    }

}
