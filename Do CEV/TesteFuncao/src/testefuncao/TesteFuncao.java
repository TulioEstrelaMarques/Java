/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao;

/**
 *
 * @author tulio
 */
public class TesteFuncao {

    /**
     * @param args the command line arguments
     */
    static int soma(int a, int b) {
        int s = a + b;
        return s;
    }

    public static void main(String[] args) {
        /*int sm = soma(5, 2);
        System.out.println("A soma dos parametros é igual a: " + sm);*/
        System.out.println("Vai começar a contagem");
        System.out.println(Operacoes.contador(1, 5));
    }

}
