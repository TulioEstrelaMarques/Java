/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author tulio
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, s = 0, cont = 0, totPar = 0, totImpar = 0, AcimadeCem = 0;
        float med;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número:<br/> <em>(valor 0 interrompe)</em></html>", "Entrada de Dados", JOptionPane.QUESTION_MESSAGE));
            cont++;
            if (n % 2 == 0) {
                totPar++;
            } else {
                totImpar++;
            }
            if (n > 100) {
                AcimadeCem++;
            }
            s += n;
        } while (n != 0);
        med = s / cont;
        JOptionPane.showMessageDialog(null, "<html>Resultado Final<hr/>"
                + "Total de valores: " + cont
                + "<br/>Total de Pares: " + totPar
                + "<br/>Toral de Ímpares: " + totImpar
                + "<br/>Acima de 100: " + AcimadeCem
                + "<br/>Somatório dos valores: " + s
                + "<br/>Média entre os valores: " + String.format("%.2f", med)
                + "</html>", "Saída de Dados", JOptionPane.WARNING_MESSAGE);
    }

}
