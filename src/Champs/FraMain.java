package Champs;
// here, I have the colours changing, and the labels changing from one event listener - each. No hard code.

import javax.swing.JFrame;

public class FraMain extends JFrame {

    FraMain() {
        PanIcons panIcons = new PanIcons();
        setSize(400, 400);
        setTitle("Champion Info");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panIcons);
        setVisible(true);

    }
}