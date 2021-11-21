/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author tulio
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int n[] = {3,2,8,7,5,4};
        for (int i = 0; i < n.length; i++) {
            System.out.println("Na posição "+i+" temos o valor "+n[i]);
        }*/
 /* String meses[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int totDias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int ano = 2024;
        if (ano % 4 == 0) {
            totDias[1] = 29;

        }
        for (int i = 0; i < meses.length; i++) {
            System.out.println("O mês " + meses[i] + " tem " + totDias[i] + " dias ao todo");
        }*/

 /*double v[] = {2.5,3.75,8,0.86,-12.5};
       Arrays.sort(v);
        for (double d : v) {
            System.out.print(d+" ");
        }
        System.out.println("");*/
 /*int vet[] = {3, 7, 6, 1, 9, 4, 2};
        for (int i : vet) {
            System.out.print("[" + i + "] ");
        }
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.print("Escolha um número acima para ver em qual posição ele se encontra: ");
        int key = sc.nextInt();
        int p = Arrays.binarySearch(vet, key);
        System.out.println("o valor " + key + " foi encontrado na posição " + p);*/
        int v[] = new int[20];
        Arrays.fill(v, 0);
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

}
