/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author tulio
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int n1 = 14, n2 = 18, r;
        r = (n1 > n2) ? n1 + n2 : n1 - n2;
        System.out.println(r);*/

        //comparaçao de String
        /*String nome1 = "Túlio";
        String nome2 = "Túlio";
        String nome3 = new String("Túlio");
        String res;
        res=(nome1.equals(nome3))?"igual" : "diferente";
        System.out.println(res);*/
        //comparadores logicos
        int x = 4, y = 7, z = 12;
        boolean r;
        r = (x < y ^ y <= z) ? true : false;
        System.out.println(r);
    }

}
