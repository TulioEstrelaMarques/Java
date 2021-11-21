/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author tulio
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.print("Digite a primeira nota: ");
        float n1 = sc.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float n2 = sc.nextFloat();
        float media = (n1+n2)/2;
        if (media>9) {
            System.out.println("Parabéns!!! Pequeno Gafanhoto...");
        }
        System.out.println("Sua média foi "+media);
         */
        
        
        System.out.print("Em que ano você nasceu? ");
        int nasc = sc.nextInt();
        int idd = 2021 - nasc;
        System.out.println("Sua idade é "+idd);
        if (idd >= 18) {
            System.out.println("Maior de Idade");
        } else {
            System.out.println("Menor de Idade");
        }
    }

}
