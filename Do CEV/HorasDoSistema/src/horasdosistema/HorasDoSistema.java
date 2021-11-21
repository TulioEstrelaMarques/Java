/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horasdosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;
/**
 *
 * @author tulio
 */
public class HorasDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println("A hora do sistema é\n"+data.toString());
        Locale linguagem = Locale.getDefault();
        System.out.println("Seu sistema está em "+linguagem.getDisplayLanguage());
        Toolkit resolucao = Toolkit.getDefaultToolkit();
        Dimension d = resolucao.getScreenSize();
        System.out.println("Sua tela tem resolução "+d.width+" X "+d.height);
    }
    
}
