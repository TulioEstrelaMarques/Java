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
public class Operacoes {

    static String contador(int ini, int fim) {
        String s = "";
        for (int i = ini; i <= fim; i++) {
            s += i + " ";
        }
        return s;
    }
}
