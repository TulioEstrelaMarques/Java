/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

/**
 *
 * @author tulio
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);
         */
        String valor = "30";
        int idade = Integer.parseInt(valor);
        System.out.println(idade);

        /* meu jeito
        String valor = String.valueOf(idade);
        System.out.println(valor.equals(Integer.toString(idade)));
         */
    }

}
