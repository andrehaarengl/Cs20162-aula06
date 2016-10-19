/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ordemservico;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class DataOrdemServico {

    public static void main(String[] args) {

        Scanner meuLeitor = new Scanner(System.in);

        //String primeiraDataEntrada = meuLeitor.nextLine();
        //String primeiraDataEntrada = null;
        //String primeiraDataEntrada = "20161230";
        String primeiraDataEntrada = meuLeitor.nextLine();
        if (primeiraDataEntrada == null || primeiraDataEntrada.trim().isEmpty() || primeiraDataEntrada.isEmpty() ){
            int primeiraDataEntradaConver = Integer.parseInt(primeiraDataEntrada);
            int anoPrimeiraDataEntrada = primeiraDataEntradaConver / 10000;
            if (anoPrimeiraDataEntrada > 999 && anoPrimeiraDataEntrada < 10000) {

                int mesPrimeiraDataEntrada = (primeiraDataEntradaConver / 100) % 100;
                if (mesPrimeiraDataEntrada < 13) {

                    int diaPrimeiraDataEntrada = primeiraDataEntradaConver % 100;
                    if (diaPrimeiraDataEntrada > 00 && diaPrimeiraDataEntrada <= 31) {

                        //int bissexto = Integer.parseInt(meuLeitor.nextLine());
                        int bissexto = 0;
                        //int diaSemana = Integer.parseInt(meuLeitor.nextLine());
                        int diaSemana = 0;//Segunda,1:Terça,2:Quarta,3:Quinta,4:Sexta,5:Sabado,6:Domingo

                        //int segundaDataEntrada = Integer.parseInt(meuLeitor.nextLine());
                        int segundaDataEntrada = 20161228;
                        int anoSegundaDataEntrada = segundaDataEntrada / 10000;
                        int mesSegundaDataEntrada = (segundaDataEntrada / 100) % 100;
                        int diaSegundaDataEntrada = segundaDataEntrada % 100;

                        System.out.println("DIA PRIMEIRA DATA:" + diaPrimeiraDataEntrada);
                        System.out.println("MES PRIMEIRA DATA:" + mesPrimeiraDataEntrada);
                        System.out.println("ANO PRIMEIRA DATA:" + anoPrimeiraDataEntrada);
                        System.out.println();
                        System.out.println("DIA SEGUNDA DATA:" + diaSegundaDataEntrada);
                        System.out.println("MES SEGUNDA DATA:" + mesSegundaDataEntrada);
                        System.out.println("ANO SEGUNDA DATA:" + anoSegundaDataEntrada);
                    } else {

                    }
                } else {

                }

            } else {

            }

        } else {

        }

    }

}
