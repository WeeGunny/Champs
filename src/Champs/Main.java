package Champs;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sName;
        sName = JOptionPane.showInputDialog("Gimme yer name");
        FraMain fraMain = new FraMain();
    }
}
