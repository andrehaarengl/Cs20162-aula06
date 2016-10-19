/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ordemservico;

import java.time.DayOfWeek;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class DataOrdemServicoDois/*Calendario*/ {

    public static int diaSemana(int data, int bissexto, int diaConhecido, int nvData) {
        int dias;

        //Separa data
        int dia, mes, ano, saida = 0;
        ano = (data / 10000);
        mes = (data / 100) % 100;
        dia = data % 100;

        //Separa Nova Data
        int anoNovo, mesNovo, diaNovo;
        anoNovo = (nvData / 10000);
        mesNovo = (nvData / 100) % 100;
        diaNovo = (nvData % 100);

        // condiconais de erro ano 
        //Testando o tamanho do ano
        if (ano > 10000 || ano < 999) {
            saida = -1;
        }
        //Testando se o dia de segunda a domingo segue a regra exigida
        if ((diaConhecido > 0 && diaConhecido > 5)) {
            saida = -1;
        }
        //Testando se o mes é maior que 12 ou menor que 0
        if (mes < 0 || mes > 12) {
            saida = -1;
        }
        //Testando o dia 
        if (dia < 0) {
            saida = -1;
        }

        //Testando o ano bissexto quando o mes de fevereiro tem 31 dias ou menor que 0
        if (bissexto > 0) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                dias = 31;

            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                dias = 30;

            } else if (mes == 2) {
                dias = 29;
            }

        } else {
            saida = -1;
        }

        int diasDif, anoDif, mesDif, diasTotal;
        anoDif = ano - anoNovo;
        mesDif = mes - mesNovo;
        diasDif = dia - diaNovo;

        if (anoDif > 0) {
            int diasAnoTotal = 366 * ano;
        }
        if (bissexto == 0) {
            if (mes == 2) {
                dias = 28;
            }
        } else {

        }
        //Verificando a segunda entrada que é maior que zero
        if (bissexto < 0) {
            saida = -1;
        }

        //Vefificando o dia da semana
        if (diaConhecido > 6 || diaConhecido < 0) {
            saida = -1;
        }

        //DayOfWeek meuDia = null;
        //System.out.println(meuDia);
        System.out.println(ano);
        System.out.println(mes);
        System.out.println(dia);
        System.out.println(anoNovo);
        System.out.println(mesNovo);
        System.out.println(diaNovo);
        System.out.println(diaConhecido);
        System.out.println(anoDif);
        System.out.println(mesDif);
        System.out.println(diasDif);
        return saida;

    }

    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        int primeiraEntrada = 20161225;
        int segundaEntrada = 1;
        int terceriaEntrada = 5;
        int quartaEntrada = 20161226;

        //diaSemana(primeiraEntrada, segundaEntrada, terceriaEntrada, quartaEntrada);
        System.out.println(diaSemana(primeiraEntrada, segundaEntrada, terceriaEntrada, quartaEntrada));

    }

}
