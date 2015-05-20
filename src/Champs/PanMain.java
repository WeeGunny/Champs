package Champs;

import javax.swing.*;
import java.awt.*;

public class PanMain extends JPanel // panel definition
{
    PanIcons panIcons = new PanIcons();
    

    public PanMain() {
        // this next line tells PanMain that it has a border layout.
        setLayout(new BorderLayout());
        
         add(panIcons, BorderLayout.CENTER);
       
        
    }
}